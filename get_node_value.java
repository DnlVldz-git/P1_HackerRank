

    // Complete the getNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static int getNode(SinglyLinkedListNode head, int positionFromTail) {
        SinglyLinkedListNode aux = head;
        int ciclos=-1;//se inicia en -1 ya que dentro de la lista también se encuentra el dato de posición de la cola

        while(head != null){ //vamos a hacer un bucle para recorrer la lista.
            head = head.next; //avanzamos al siguiente elemento de la lista.
            if(ciclos<positionFromTail){ //añadirá a ciclos 1 mientras que sea menor a posición desde la cola.
                ciclos++;
            }else{
                aux = aux.next;//una vez que sea igual o mayor vamos a avanzar la referencia aux.
                //haciendo así una especie de retardante, retardaremos aux hasta que se llegue al número desde la cola, cuando llegue, ambos avanzarán en diferentes nodos hasta que head llegue al final, cuando llegue, aux estará en la posición que deseamos.
      
            }
        }
        return aux.data;

    }
