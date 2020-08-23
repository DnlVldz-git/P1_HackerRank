

    // Complete the reverse function below.

    /*
     * For your reference:
     *
     * DoublyLinkedListNode {
     *     int data;
     *     DoublyLinkedListNode next;
     *     DoublyLinkedListNode prev;
     * }
     *
     */
    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
        DoublyLinkedListNode aux = head; //creamos el auxiliar que irá moviéndose por la lista.
        if(head == null){ //checamos que la lista no esté vacía.
            return head;
        }
        while(aux!=null){ //mientras que no lleguemos al final de la lista seguirá el ciclo.
            DoublyLinkedListNode previo = aux.prev; //creamos este nodo para que nos sirva de referencia al momento de hacer el intercambio y no perder dónde está el anterior a anterior.
            aux.prev = aux.next; // el previo de auxiliar apuntará a el siguiente de auxiliar.
            aux.next = previo; // el siguiente de auxiliar apuntará a previo, que era a lo que anteriormente apuntaba auxiliar.
            head = aux; //avanzamos la cabeza a donde está auxiliar (lo hacemos antes de que auxiliar avance para que la cabeza no llegue a ser nula).
            aux = aux.prev; //avanzamos auxiliar, que , como en este caso estamos cambiando de orden los nodos, avanzar es hacia atras.

        }

        return head;
    }
