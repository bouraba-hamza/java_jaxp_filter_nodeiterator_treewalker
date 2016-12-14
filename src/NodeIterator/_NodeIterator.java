package NodeIterator;




import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.traversal.DocumentTraversal;
import org.w3c.dom.traversal.NodeFilter;
import org.w3c.dom.traversal.NodeIterator;

import Filter.MyFilter;
import XMLLoader.XMLLoader;

public class _NodeIterator {

	XMLLoader _loader = null;

	public _NodeIterator() {

		_loader = new XMLLoader();

	}
	
	public void parseXML() {
		
		Document document = _loader.loadXML();
		
		DocumentTraversal traversal = (DocumentTraversal) document;
		
		NodeIterator iterator = traversal.createNodeIterator(document.getDocumentElement(), NodeFilter.SHOW_ELEMENT, new MyFilter(), false);
		
		
		for (Node n = iterator.nextNode(); n != null ; n = iterator.nextNode()) {
			
			System.out.println(n.getNodeName());
		}
		
	}
	
}
