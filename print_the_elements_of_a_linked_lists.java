

    // Complete the printLinkedList function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static void printLinkedList(SinglyLinkedListNode head){
        SinglyLinkedListNode aux;
        aux = head;
        if(head==null){ //checamos que la lista no esté vacía.
            return;
        }
        while(aux != null){ //imprimimos los datos con este ciclo.
            System.out.println(aux.data);
            aux=aux.next;
        }


    }
