package Laboratorio7;

import java.util.Vector;

public class BNodeGeneric<T> {
	
	Vector<T> keys;
	int MinDeg; // Minimum degree of B-tree node
	Vector<BNodeGeneric<T>> children;
	int num; // Number of keys of node
    boolean isLeaf; // True when leaf node
   
    //esto es comentario
    
	
 // Constructor
    BNodeGeneric(int deg,boolean isLeaf){
    	
        this.MinDeg = deg;
        this.isLeaf = isLeaf;
        this.keys = new Vector<T>(2*this.MinDeg-1); // Node has 2*MinDeg-1 keys at most
        this.children = new Vector<BNodeGeneric<T>>(2*this.MinDeg);
        //this.children = new BTreeNode[2*this.MinDeg];
        this.num = 0;
    }
	
	
}
