

    // Complete the mergeLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode head3; //creamos un nuevo inicio en el que pondremos la lista unida y ordenada.
        head3=null;

        if(head1 == null){ //checamos que las listas no estén vacias.
            return head2;
        }
        if(head2 == null){
            return head1;
        }
        if(head1.data<head2.data){ //si el primer dato de la lista 1 es menos al primer dato de la lista 2, ponemos el nodo en el nuevo inicio(head3) y avanzamos el inicio.
            head3 = head1;
            head1 = head1.next;
        }
        else // en caso contrario(que el dato de la lista 2 sea menor o igual ) ponemos el dato en el nuevo inicio (head3) y avanzamos el inicio.
        {
            head3 = head2;
            head2 = head2.next;
        }
        SinglyLinkedListNode aux3; //creamos un nodo que apuntará al incio 3.
        aux3 = head3;
        while(head1 != null&&head2 != null){ //con este ciclo recorreremos las dos listas.
            if(head1.data<head2.data){ //si el dato primer dato de la lista 1 es menor al primer dato de la lista 2, apuntamos el nodo aux3(de la nueva lista) a este dato menos, y avanzamos al siguiente elemento de la lista 1.
                aux3.next = head1;
                head1 = head1.next;
            }
            else{ // en el caso contrario (que el primer dato de la segunda lista sea menor) apuntamos el nodo aux3 a este dato y avanzamos al siguiente elemento de la lista 2.
                aux3.next = head2;
                head2 = head2.next;
            }

            aux3 = aux3.next; // avanzamos al siguiente elemento de la lista 3.
        } //salimos del bucle en caso de que lleguemos al final de una lista.
        if(head1 == null){ //si ya recorrimos la lista 1 vamos a apuntar el último nodo de la lista 3 a lo que queda de la lista2.
            aux3.next=head2;
        }else{ // en el otro caso vamos a apuntar el último nodo de la lista 3 a lo que queda de la lista 1
            aux3.next = head1;
        }


        return head3;

    }
