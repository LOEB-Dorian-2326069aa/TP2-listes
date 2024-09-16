package exercice1;

public class SLinkedList {
    private Node head;
    
    public SLinkedList() {
        head = null; 
    }
    
    public void addFirst(int element) {
        head = new Node(element, head); 
    }
    
    
 // Ajouter à la fin (CREATE)
    public void addLast(int element) {
        Node newNode = new Node(element, null);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }
    
    
 // Chercher un élément (READ)
    public boolean contains(int element) {
        Node current = head;
        while (current != null) {
            if (current.getElement()==element) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }
    
    
    public Node avantDernier() {
		Node current = head;
		while (current.getNext().getNext() != null) {
			current = current.getNext();
		}
    	return current;
    }
    
    
    
    // Méthode pour inverser la liste chaînée
    public void inverse() {
    	Node previous = null;
    	Node current = head;
    	Node next = null;
    	
    	while(current != null) {
    		next = current.getNext();
    		current.setNext(previous);
    		previous = current;
    		current = next;
    	}
    	head = previous;
    }
    
    
    
    //échanger 2 noeuds entre eux
    public void echange(int element1, int element2) {
    	if (element1 == element2) {
    		return; // pas d'échange 
    	}
    	Node precNode1 = null, precNode2 = null;
    	Node node1 = head,	node2 = head;
    	
    	//pour trouver node1 et son precedent
    	while (node1 != null && node1.getElement() != element1) {
    		precNode1 = node1;
    		node1 = node1.getNext();
    	}
    	
    	// pour trouver node2 et son precedent
    	while(node2 != null & node2.getElement() != element2) {
    		precNode2 = node2;
    		node2 = node2.getNext();
    	}
    	
    	// Si l'un des deux nœuds n'existe pas, on fait rien
        if (node1 == null || node2 == null) {
            return;
        }
    	
        // si node1 est en tete de liste
        if (precNode1 != null) {
        	precNode1.setNext(node2);
        } else {
        	head = node2;
        }
        
        //si node2 est a la tete de la liste
        if(precNode2 != null) {
        	precNode2.setNext(node1);
        } else {
        	head = node1;
        }
        
        //échanger les 2 noeuds
        Node temporaire = node1.getNext();
        node1.setNext(node2.getNext());
        node2.setNext(temporaire);
       
    }
    
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.getElement() + " ");
            current = current.getNext(); // Passe au nœud suivant
        }
        System.out.println();
    }
}