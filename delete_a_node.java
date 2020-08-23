

    // Complete the deleteNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        SinglyLinkedListNode aux;
        SinglyLinkedListNode ant;
        ant = null;
        aux = head;
        if(head==null){ //checamos que la lista no esté vacía.
            return head;
        }
        if(position == 0){ //si la posición es 0, es decir, es el inicio de la lista.
            aux = aux.next; //avanzamos auxiliar al siguiente.
            head = aux; // recorremos el inicio a donde está auxiliar, es decir, uno adelante.
            return head; // regresamos la lista.
        }
        for(int i =0; i<position;i++){ //hacemos un ciclo hasta que se llegue a la posición que se desea borrar.
            ant = aux; // anterior seguirá a auxiliar.
            aux=aux.next; //auxiliar avanza.
        }
        ant.next = aux.next; // al finalizar el ciclo, eliminamos el nodo en el que está apuntando auxiliar.
        // por lo que el siguiente de anterior estará apuntando al siguiente de auxiliar, saltándonos el dato a eliminar.
        aux.next = null; 


        return head;
    }
