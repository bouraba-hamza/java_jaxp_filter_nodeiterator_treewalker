package XMLReader;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import XMLLoader.XMLLoader;

public class ReadXML {

	XMLLoader _loader = null;

	public ReadXML() {

		_loader = new XMLLoader();

	}

	public void readXML() {

		Document document = _loader.loadXML();

		NodeList item_list = document.getElementsByTagName("item");

		for (int i = 0; i < item_list.getLength(); i++) {

			Node node = item_list.item(i);

			System.out.println(node.getNodeName());

			NodeList childNodes = node.getChildNodes();

			for (int j = 0; j < childNodes.getLength(); j++) {

				if (childNodes.item(j).getNodeName().equals("enclosure")) {

				
				NamedNodeMap map =  childNodes.item(j).getAttributes();
				
				for (int k = 0; k < map.getLength(); k++) {
					
					System.out.println(map.item(k).getNodeName() + " : " + map.item(k).getNodeValue() );
					
				}
				
				
				
				} else {
					System.out.println(childNodes.item(j).getNodeName() + " : " + childNodes.item(j).getTextContent());

				}
			}

		}

	}

}
