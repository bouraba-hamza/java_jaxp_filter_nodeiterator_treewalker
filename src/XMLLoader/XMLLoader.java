package XMLLoader;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class XMLLoader {

	DocumentBuilderFactory factory = null;
	DocumentBuilder builder = null;
	Document document = null;
	String xml = "http://www.lequipe.fr/rss/actu_rss_Football.xml";
		
	public Document loadXML() {
		
		
		try {
			
			
			factory = DocumentBuilderFactory.newInstance();
			
			builder = factory.newDocumentBuilder();
			
			document = builder.parse(xml);
			
			return document;
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
	}
}
