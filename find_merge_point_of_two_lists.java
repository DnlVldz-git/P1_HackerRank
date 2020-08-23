    // Complete the findMergeNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
         SinglyLinkedListNode aux1 = head1, aux2 = head2;
         //en esto vamos a tomar ambas listas y las "sumaremos" para que ambas tengan el mismo tamaño y la misma finalización, de manera que será más fácil encontrar en qué punto son iguales.
        while(aux1 != aux2){ //mientras que no sean los nodos
            if(aux1.next == null){ //si llegamos al último elemento de la lista, se apuntará al inicio de la segunda lista, sumándola a la lista 1.
                aux1 = head2;
            }else{ // en caso contrario avanzaremos al siguiente elemento de la lista 1.
                aux1 = aux1.next;
            }
            if(aux2.next == null){ //en caso de que lleguemos al último elemento de la lista, se apuntára al inicio de la lista 1, sumándola a la lista2.
                aux2 = head1;
            }else{ // en caso contrario vamos a avanzaremos al siguiente elemento de la lista 2.
                aux2 = aux2.next;
            }// de esta manera se encontrarán los dos auxiliares en el mismo nodo y se encontrará el punto en el que se unen.
        }
        return aux1.data;
    }

    private static final Scanner scanner = new Scanner(System.in);
