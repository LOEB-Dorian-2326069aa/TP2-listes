package exercice1;

public class DLinkedList {

    private DNode header, trailer;
    private long size;

    public DLinkedList() {
        header = new DNode(null, null, null);
        trailer = new DNode(null, header, null);
        header.setNext(trailer);
        size = 0;
    }

    // Ajouter à la fin (CREATE)
    public void addLast(String element) {
        DNode newNode = new DNode(element, null, null);
        if (header.getNext() == trailer) {
            header.setNext(newNode);
            newNode.setPrev(header);
            newNode.setNext(trailer);
            trailer.setPrev(newNode);
        } else {
            DNode current = header;
            while (current.getNext() != trailer) {
                current = current.getNext();
            }
            current.setNext(newNode);
            newNode.setPrev(current);
            newNode.setNext(trailer);
            trailer.setPrev(newNode);
        }
        size++;
    }

    // Afficher la liste
    public void printList() {
        DNode current = header.getNext();
        while (current != trailer) {
            System.out.print(current.getElement() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    // Méthode pour échanger deux nœuds
    public void swapNodes(String element1, String element2) {
        if (element1.equals(element2)) {
            return; // Pas d'échange si les éléments sont les mêmes
        }

        DNode node1 = header.getNext();
        DNode node2 = header.getNext();

        // Trouver node1
        while (node1 != null && !node1.getElement().equals(element1)) {
            node1 = node1.getNext();
        }

        // Trouver node2
        while (node2 != null && !node2.getElement().equals(element2)) {
            node2 = node2.getNext();
        }

        // Si l'un des deux nœuds n'existe pas, on ne fait rien
        if (node1 == null || node2 == null || node1 == trailer || node2 == trailer) {
            return;
        }

        // Si node1 et node2 sont cote à cote
        if (node1.getNext() == node2) {
            DNode prev1 = node1.getPrev();
            DNode next2 = node2.getNext();

            prev1.setNext(node2);
            node2.setPrev(prev1);

            node2.setNext(node1);
            node1.setPrev(node2);

            node1.setNext(next2);
            next2.setPrev(node1);
        } else if (node2.getNext() == node1) {
            // Si node2 est juste avant node1
            DNode prev2 = node2.getPrev();
            DNode next1 = node1.getNext();

            prev2.setNext(node1);
            node1.setPrev(prev2);

            node1.setNext(node2);
            node2.setPrev(node1);

            node2.setNext(next1);
            next1.setPrev(node2);
        } else {
            // Pour les noeuds non cote à cote
            DNode prev1 = node1.getPrev();
            DNode next1 = node1.getNext();
            DNode prev2 = node2.getPrev();
            DNode next2 = node2.getNext();

            // Échanger node1 et node2
            prev1.setNext(node2);
            node2.setPrev(prev1);

            node2.setNext(next1);
            next1.setPrev(node2);

            prev2.setNext(node1);
            node1.setPrev(prev2);

            node1.setNext(next2);
            next2.setPrev(node1);
        }
    }

    //Exercice 1.8
    //C'est l'algorithmes sur liste double chainée qui est le plus rapide car il permet de parcourir la liste dans les deux sens.


}
