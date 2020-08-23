

    // Complete the reverse function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        SinglyLinkedListNode aux;
        SinglyLinkedListNode ant;
        ant = null;
        aux= null;
        if(head == null){
            return head;
        }
        while(head != null){ //se terminará el ciclo hasta que lleguemos al final de la lista.
            aux = head.next; // ponemos auxiliar en una posición después de inicio.
            head.next = ant; // el siguiente del inicio apuntará a anterior, en el primer caso es null, por lo que es el final de la nueva lista.
            ant=head; // anterior es igual al inicio, recorriendolo.
            head = aux; //recorremos el inicio a donde está auxiliar, es decir, uno enfrente.

        }
        head = ant; //lo igualamos a ant para entregar la lista inversa.

        return head;
    }
