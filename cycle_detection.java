// Complete the hasCycle function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static boolean hasCycle(SinglyLinkedListNode head) {
        SinglyLinkedListNode lento = head, rapido = head.next; //hacemos dos referencias una apunta al inicio y el otro apunta a uno después del inicio.
        //tenemos dos tomando como ejemplo dos corredores, uno va a cierta velocidad y el otro va dos veces más rápido, eventualmente lo alcanzará, por lo que si es un bucle, estas dos variables se encontrarán.

        if(head == null) return false; //checamos que la lista no esté vacía.

        while(rapido != null&& rapido.next != null){ //mientras que no se llegue al final de la lista seguirá el ciclo.
            if(rapido == lento){ //si se encuentran es porque es un bucle, entonces retornamos true.
                return true;
            }
            lento = lento.next;//avanzamos + 1 nodo.
            rapido = rapido.next.next;//avanzamos +2 nodos.

        }
        return false; //si ha salido del ciclo es porque tenía final la lista por lo que retornamos falso.


    }

    private static final Scanner scanner = new Scanner(System.in);
