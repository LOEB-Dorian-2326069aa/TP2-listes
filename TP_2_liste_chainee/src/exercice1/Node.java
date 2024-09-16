package exercice1;

public class Node {
	private int element;
	private Node next;
	
	public Node(int s, Node n) {
		element  = s;
		next = n;
	}
	
	public int getElement() { return element; }
	public Node getNext() {return next; }
	public void setElement (int newElem) {this.element = newElem; }
	public void setNext (Node newNext) { this.next = newNext; }
	
	
	public static void main(String[] args) {
    	SLinkedList list = new SLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        System.out.println("Liste avant inversion :");
        list.printList();

      //  list.inverse();

       // System.out.println("Liste après inversion :");
       // list.printList(); 
        
        
        list.echange(4, 3);
        
        System.out.println("Liste après échange :");
        list.printList(); 
        
        
        Node avantdernier = list.avantDernier();
        if(avantdernier != null) {
        	System.out.println("Avant dernier noeud : " + avantdernier.getElement());
        }
        
    }
	
}