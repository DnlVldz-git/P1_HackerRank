

    // Complete the compareLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2){
        SinglyLinkedListNode aux1;
        SinglyLinkedListNode aux2;
        aux1 = head1;
        aux2= head2;
        int data1 = 0, data2 = 0;
        if (head1 == null && head2 == null){ //checamos las listas.
            return true;
        }
        while(aux1!=null&&aux2!=null){ //hacemos un bucle mientras llegamos al final de una u otra lista.
            if(aux1.data != aux2.data){ //checamos si las listas son iguales o no.
                return false;// retornamos falso si no son iguales.
            }
            if(aux1.next == null && aux2.next == null){  //checamos si las dos listas llegaron al último elemento de la lista.

                return true; //si sí llegaron, retornamos verdadero.
            }
            aux1 = aux1.next; // avanzamos al siguiente nodo de la lista 1.
            aux2 = aux2.next; //avanzamos al siguiente nodo de la lista 2.
        }
        return false;
    }
