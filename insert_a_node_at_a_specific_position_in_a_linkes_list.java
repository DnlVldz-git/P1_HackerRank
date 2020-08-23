

    // Complete the insertNodeAtPosition function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {

        SinglyLinkedListNode nuevo = new SinglyLinkedListNode(data);
        SinglyLinkedListNode aux;
        SinglyLinkedListNode ant;
        aux = head;
        ant = null;
        nuevo.next = null;
        int nums = 0;
        if(head == null){ // checamos que la lista no esté vacía
            head = nuevo;
            nums = nuevo.data;
        }
        else{
            for(int i=0; i < nums; i++){
                head.next = nuevo;
            }
            for(int i = 0; i < position; i++){ // hacemos un ciclo hasta llegar a la posición para añadir el nodo.
                ant = aux; //anterior seguirá a auxiliar.
                aux = aux.next; //auxiliar avanza.
            }
            ant.next = nuevo; // cuando salimos del ciclo significa que llegamos a la posición indicada.
            // por lo que el siguiente de anterior apuntará a nuevo, anexándolo a la lista.
            nuevo.next = aux; // y el siguiente de nuevo apuntará a auxiliar, evitando romper la lista.

        }

        return head;


    }
