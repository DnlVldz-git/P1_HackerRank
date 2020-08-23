

    // Complete the sortedInsert function below.

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
    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
        DoublyLinkedListNode nuevo = new DoublyLinkedListNode(data); //creamos el nuevo nodo.
        nuevo.next = null; //apuntamos el prev y next del nodo a null.
        nuevo.prev = null;
        DoublyLinkedListNode ant = null;
        DoublyLinkedListNode aux = head;

        while(aux != null){ //el ciclo seguirá hasta que lleguemos al final de la lista.
            if(aux.data >= data ) {
              break; //si el dato en auxiliar es mayor o igual al dato proporcionado, saldremos del ciclo, indicando que el dato va antes de donde está aux.
            }

            ant = aux;
            aux = aux.next;//avanzamos al siguiente elemento de la lista con ant en el elemento anterior.
        }
        if(ant == null){ // si ant es igual a null, es decir, que nunca avanzamos , entonces el dato proporcionado va al inicio de la lista y retornamos el inicio.
            nuevo.next = head;
            head.prev = nuevo;
            head = nuevo;
            return head;
        }
        //al terminar el ciclo, significa que sabemos dónde va el dato en la lista.
        ant.next = nuevo; //apuntamos a el nuevo dato con la referencia ant.(la cual siempre va detrás de aux)
        nuevo.prev = ant; //el previo del nuevo nodo apunta a anterior.
        nuevo.next = aux; // y el siguiente del nuevo apuntará a next.

        if(aux != null ){ //si aux es diferente de null, es decir no es el final de la lista, previo de aux apuntará a nuevo, haciendo que la lista no se rompa.
          aux.prev = nuevo;
        }
        return head;
    }
