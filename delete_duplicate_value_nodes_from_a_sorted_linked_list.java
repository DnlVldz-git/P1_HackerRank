

    // Complete the removeDuplicates function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
        if(head == null){ //evaluamos que la lista no esté vacía.
            return head;
        }
        SinglyLinkedListNode aux = head;
        while(aux.next != null){ //haremos el ciclo hasta que se apunte a null.

            if((aux != null)&&(aux.data==aux.next.data)){ //si el dato que tenemos es igual al siguiente y el nodo en el que está es diferente de null.
                aux.next=aux.next.next;//se apuntará al nodo que está después del dato repetido.
            }else{ // en caso contrario avanzará al siguiente elemento de la lista.
                aux = aux.next;
            } // esto se hace por si contamos con más de dos elementos repetidos seguidos.

        }
        return head;

    }
