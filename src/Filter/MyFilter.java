package Filter;

import org.w3c.dom.Node;
import org.w3c.dom.traversal.NodeFilter;

public class MyFilter  implements NodeFilter{

	@Override
	public short acceptNode(Node n) {
	
		if (n.getNodeName().equals("title")) return FILTER_ACCEPT;
		else return FILTER_REJECT;
		
	}

}
