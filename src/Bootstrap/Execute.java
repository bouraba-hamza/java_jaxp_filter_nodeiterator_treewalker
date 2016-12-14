package Bootstrap;

import NodeIterator._NodeIterator;
import TreeWalker._TreeWalker;
import XMLReader.ReadXML;

public class Execute {

	
	
	public static void main(String[] args) {
		
//		ReadXML reader = new ReadXML();
//		reader.readXML();
		
//		_NodeIterator iterator = new _NodeIterator();
//		iterator.parseXML();
//		
		
	  _TreeWalker tree = new _TreeWalker();
	  
	  tree.parseXML();
	}
	
}
