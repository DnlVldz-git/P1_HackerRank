

    // Complete the reversePrint function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static void reversePrint(SinglyLinkedListNode head) {
        SinglyLinkedListNode aux = head, prev = null,ant = null;;
        if(head == null){
            return ;
        }
        while(aux != null){ // mientras no lleguemos al final el ciclo seguirá.
            ant = aux; //anterior es igual a auxiliar.
            aux = aux.next; //auxiliar avanza al siguiente nodo.
            ant.next = prev; //el siguiente de anterior es igual a previo, en el primer caso null, indicando el final de la nueva lista inversa.
            prev = ant; // recorremos previo a donde está anterior.
            head = ant; // y head la ponemos en anterior, ya que eventualmente auxiliar llegará al final de la lista, es decir, que será null.
        }
        aux = head;
        while(aux != null){ //imprimimos la lista invertida.
            System.out.println(aux.data);
            aux = aux.next;
        }
    }
