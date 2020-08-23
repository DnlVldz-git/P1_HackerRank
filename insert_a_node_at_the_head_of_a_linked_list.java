

    // Complete the insertNodeAtHead function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode head, int data){
        SinglyLinkedListNode nuevo =  new SinglyLinkedListNode(data);
        nuevo.next = null;
        if(head == null){ // checamos que la lista no esté vacía.
            head = nuevo; // si lo está, el dato será el inicio.
        }else{
            nuevo.next = head; // en otro caso, el siguiente del nuevo apuntará al inicio.
            head = nuevo; // y movemos el inicio a nuevo.
        }
        return head;



    }
