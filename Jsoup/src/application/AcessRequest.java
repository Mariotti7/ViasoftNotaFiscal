package application;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class AcessRequest {
	
	public static void main (String[] args) throws IOException {
	
		Document doc = Jsoup.connect("http://www.nfe.fazenda.gov.br/portal/disponibilidade.aspx?versao=0.00&tipoConteudo=P2c98tUpxrI=").get();
		Elements elements = doc.getElementsByClass("tabelaListagemDados");
		
		getElement(elements.eq(0));
	

}

	private static void getElement(Elements elements) {

		for(Element element : elements) {
			String children = element.getElementsByTag("tbody").text();
			Elements childrens = element.getElementsByTag("tr");
			for(Element tbody : childrens) {
				String td = tbody.getElementsByTag("td").text();
				String src = tbody.getElementsByTag("img").attr("src");
				System.out.println(children + " " + td + " " + src);
			}
		}
		
	}
}
