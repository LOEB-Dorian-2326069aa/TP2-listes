package exercice1;

public class CircularLinkedList {
    private Node head;


    // compte le nombre de noeuds dans la liste
    public int countNodes() {
        if (head == null) {
            return 0;
        }
        int count = 1;
        Node current = head;

        //parcourir la liste
        while (current.getNext() != head) {
            count++;
            current = current.getNext();
        }
        return count;
    }

    //ajouter un noeud pour tester
    public void addNode(int element) {
        Node newNode = new Node(element, null);
        if (head == null) {
            head = newNode;
            newNode.setNext(head); // le noeud pointe vers lui-même
        } else {
            Node current = head;
            while (current.getNext() != head) {
                current = current.getNext();
            }
            current.setNext(newNode);
            newNode.setNext(head);
        }
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        list.addNode(6);
        list.addNode(7);

        System.out.println("Nombre de noeuds dans la liste : " + list.countNodes());
    }
}
