class LinkedList {
    Node start = null;
    Node end = null;
    int size = 0;

    class Node {
        String item;
        Node next;
        Node(String item) {
            this.item = item;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }
    
    public void push(String str) {
        Node newnode = new Node(str);
        if(isEmpty()) {
            start = newnode;
            end = start;
            end.next = null;
            size++;
            return;
        }

        Node old = end;
        end = newnode;
        old.next = end;
        end.next = null;
        size++;
    }
    
    public String pop() {
        if(isEmpty()) {
            return null;
        }
        String item = start.item;
        start = start.next;
        size--;
        return item;
    }

    public void printList() {
        Node temp = start;
        while (temp != null) {
            System.out.print(temp.item + " ");
            temp = temp.next;
        }
    }
}