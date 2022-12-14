public class Main {
    public static void main(String[] args) {
        ForwardListInteger listArr = new ForwardListInteger();
        listArr.addLast(5);
        listArr.addLast(2);
        listArr.addFirst(1);

        listArr.displayAll();
        listArr.removeLast();
        listArr.removeFirst();
    }
}
interface MyListInt
{
    public void addFirst(int data);
    public void addLast(int data);
    public void removeFirst();
    public void removeLast();
    public void displayAll();
}

class ForwardListInteger implements MyListInt{
    private class Node {
        private int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head = null;
    private Node tail = null;

    public void addFirst(int input_data) {
        Node data = new Node(input_data);
        if (head == null) {
            head = data;
            tail = data;
        } else {
            Node temp = head;
            head = data;
            head.next = temp;
        }
    }

    public void addLast(int input_data) {
        Node data = new Node(input_data);
        if (head == null) {
            head = data;
            tail = data;
        } else {
            tail.next = data;
            tail = data;
        }
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            head = head.next;
            displayAll();
        }
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            while(temp.next.next != null) temp = temp.next;
            temp.next = null;
            displayAll();
        }
    }

    public void displayAll() {
        Node current = head;

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

/*?????????????? ?????????????????? MyListInt: add, get...
?????????????????????? ?????? ???????????? ?? ???????????? ForwardListInteger*/