package exercice1;

public class DNode {

    private String element;
    private DNode next, prev;

    public DNode(String s, DNode p, DNode n) {
        element  = s;
        prev = p;
        next = n;
    }

    // Getters
    public String getElement() { return element; }
    public DNode getNext() {return next; }
    public DNode getPrev() {return prev; }

    // Setters
    public void setElement (String newElem) {this.element = newElem; }
    public void setNext (DNode newNext) { this.next = newNext; }
    public void setPrev (DNode newPrev) { this.prev = newPrev; }


    public static void main(String[] args) {
        DLinkedList list = new DLinkedList();
        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");
        list.addLast("5");
        list.addLast("6");
        list.addLast("7");

        System.out.println("Liste avant échange :");
        list.printList();

        // Échanger les nœuds contenant "2" et "4"
        list.swapNodes("6", "7");

        System.out.println("Liste après échange :");
        list.printList();


    }

}
