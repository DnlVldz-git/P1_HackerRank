

    // Complete the insertNodeAtTail function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode nuevo = new SinglyLinkedListNode(data);
        SinglyLinkedListNode aux;
        aux = head;
        if(head == null){ // checamos que la lista no esté vacía.
            head = nuevo; // en caso de que sí el nuevo será el inicio.
            return head;
        }
        while(aux.next != null){ // mientras que no lleguemos al elemento final no parará el ciclo.
            aux = aux.next; // avanzamos hasta el final con aux.
        }
        aux.next = nuevo; // al llegar al final saldrá del ciclo y sabremos dónde insertar el nuevo nodo.
        // por lo que el siguiente de auxiliar apuntará a nuevo, y se integrará a lista.
        return head;
    }
