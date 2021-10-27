package scrapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import entity.ListagemDados;

public class ScrapperMain {
	public static void main(String[] args) throws IOException {

		String url = "http://www.nfe.fazenda.gov.br/portal/disponibilidade.aspx";

		System.out.println(String.format("Conectando na URL %s", url));

		// Conectando o Jsoup na URL
		Document doc = Jsoup.connect(url).get();

		// Selecionando a listagem de dados
		Elements elements = doc.getElementsByClass("tabelaListagemDados");

		// Selecionando a tag tbody
		List<Element> tabela = elements.tagName("tbody");

		// Criando a lista de listagem de dados
		List<ListagemDados> listagemDados = new ArrayList<>();

		for (Element tb : tabela) {
			List<Element> atributos = tb.getElementsByTag("tr");
			String img = tb.getElementsByTag("img").attr("src");

			ListagemDados listagem = new ListagemDados(atributos.get(0).text() + " status: " + img,
					atributos.get(1).text() + " status: " + img, atributos.get(2).text() + " status: " + img,
					atributos.get(3).text() + " status: " + img, atributos.get(4).text() + " status: " + img,
					atributos.get(5).text() + " status: " + img, atributos.get(6).text() + " status: " + img,
					atributos.get(7).text() + " status: " + img, atributos.get(8).text() + " status: " + img,
					atributos.get(9).text() + " status: " + img, atributos.get(10).text() + " status: " + img,
					atributos.get(11).text() + " status: " + img, atributos.get(12).text() + " status: " + img,
					atributos.get(13).text() + " status: " + img, atributos.get(14).text() + " status: " + img,
					atributos.get(15).text() + " status: " + img);
			
			listagemDados.add(listagem);
		}
		
		// Convertendo os objetos para Json
		
		/* for (ListagemDados lds : listagemDados) {
			converterToJson(lds);
		}*/
		for (ListagemDados lds : listagemDados) {
			enviarNF(converterToJson(lds));
		}
	}
	
	
	// Método para converter um Objeto em um Json
	
	/*
	 public static String converterToJson(ListagemDados lds){
	 	ObjectMapper mapper = new ObjectMapper();
	 	try{
	 		String json = mapper.writeValueAsString(lds);
	 		System.out.print("Objeto em JSON: " + json);
	 	}catch(JsonProcessingException e){
	 		e.printStackTrace();
	 	}
	 }
	 * */
	
	// Méotodo atualizado 
	public static String converterToJson(ListagemDados lds) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
			return mapper.writeValueAsString(lds);
	}
	
	// Método criado para responder ao projeto NotaFiscalAPI
	public static void enviarNF(String envioJson) throws IOException {
		CloseableHttpClient client = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost("http://localhost:8080/api/nf");

		StringEntity entity = new StringEntity(envioJson);
		httpPost.setEntity(entity);
		httpPost.setHeader("Accept", "application/json");
		httpPost.setHeader("Content-type", "application/json");

		CloseableHttpResponse response = client.execute(httpPost);
		client.close();
	}

}
