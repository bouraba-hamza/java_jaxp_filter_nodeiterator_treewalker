package TreeWalker;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.traversal.DocumentTraversal;
import org.w3c.dom.traversal.NodeFilter;
import org.w3c.dom.traversal.NodeIterator;
import org.w3c.dom.traversal.TreeWalker;

import XMLLoader.XMLLoader;

public class _TreeWalker {

	
	XMLLoader _loader = null;

	public _TreeWalker() {

		_loader = new XMLLoader();

	}
	
	public void parseXML() {
		
		Document document = _loader.loadXML();
		
		DocumentTraversal traversal = (DocumentTraversal) document;
		
		TreeWalker treeWalker = traversal.createTreeWalker(document.getDocumentElement(), NodeFilter.SHOW_ELEMENT, null, false);
		
		
		parseXMLTreeWalker(treeWalker,"");
		
		
	}
	
	
	public void parseXMLTreeWalker(TreeWalker tree,String indent) {
		
		
		Node node = tree.getCurrentNode();
		
        System.out.println(indent+"-"+node.getNodeName());
        
        
        for (Node n = tree.firstChild();n != null; n = tree.nextSibling()) {
			
        	parseXMLTreeWalker(tree,indent+"    ");
        	
		}
        
        tree.setCurrentNode(node);
		
	}
	
}
