import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Demo {

	public static void main(String[] args) throws IOException {
		
		// Parsing and traversing a Document
//		String html = "<html><head><title>First parse</title></head>"
//				+ "<body><p>Parsed HTML into a doc.</p></body></html>";
//		Document doc = Jsoup.parse(html);
//		
//		System.out.println(doc.getElementsByTag("title").get(0).text());
		
		
		// Parsing a body fragment
		String html = "<div><p>Lorem ipsum.</p>";
		Document doc = Jsoup.parseBodyFragment(html);
		Element body = doc.body();
		
		System.out.println(body.getElementsByTag("p").get(0).text());
		
//		// Load a Document from a URL
//		Document doc1 = Jsoup.connect("http://example.com/").get();
//		//String title = doc1.title();
//		
//		System.out.println(doc1);
		
		// Load a Document from a File
		File input = new File("C:\\temp\\input.html");
		Document doc2 = Jsoup.parse(input, "UTF-8", "");
		
		System.out.println(doc2);
		
		

	}

}
