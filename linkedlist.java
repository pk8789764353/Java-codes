
public class linkedlist {

    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

    }

    public void addmiddle(int indx, int data) {
        if (indx == 0) {
            addFirst(data);
        }
        int i = 0;
        Node newnode = new Node(data);
        size++;
        Node temp = head;
        while (i < indx - 1) {
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;

    }

    public int size() {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            temp = temp.next;
            i++;
        }
        // System.out.println("Size of linked list is :" + i);
        return i;
    }

    public void removefst() {
        if (head == null) {
            System.out.println("Linked list empty.");
        } else if (head.next == null) {
            head = null;
        } else {
            head = head.next;
        }

        System.out.println("Operation succesful.");
    }

    public void removelast() {
        if (head == null) {
            System.out.println("Linked list empty.");
        } else if (head.next == null) {
            head = null;
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;

        }

        System.out.println("Operation succesful.");

    }

    public int itrsearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            } else {
                temp = temp.next;
                i++;
            }

        }
        return -1;

    }

    public int helper(Node head, int key) {   //recursive search helper function
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int indx = helper(head.next, key);
        if (indx == -1) {
            return -1;
        }

        return indx + 1;

    }

    public int rcSearch(int key) {
        return helper(head, key);
    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;

    }

    public void deletefromend(int n) {
        Node temp = head;
        int size = size();
        if (n == size()) {
            head = head.next;

        }
        int indx = size - n;
        int i = 1;
        while (i < indx) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;

    }

    //slow fast approach tofind middle node of linked list
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindrome() {
        if (head == null) {
            return false;
        }
        if (head.next == null) {
            return true;
        }
        //1 step to find midnode
        Node midNode = findMid(head);
        //2 step to reverse half list
        Node prev = null;
        Node current = midNode;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        Node right = prev;
        Node left = head;
        //3 step to check palindrome
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static boolean isCycle()//find cycle in linked list floyds cycle finding algorithm
    {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;

    }

    public static void main(String args[]) {
        linkedlist l1 = new linkedlist();
        // l1.addFirst(1);
        // l1.addFirst(2);
        // l1.addLast(1);
        // l1.addLast(3);
        // l1.addmiddle(2, 3);
        // System.out.println(l1.size);
        // l1.print();
        // System.out.println(l1.size());
        // System.out.println(l1.itrsearch(0));
        // System.out.println(l1.rcSearch(0));
        // System.out.println(l1.rcSearch(3));
        // l1.removefst();
        // l1.print();
        // l1.size();
        // l1.removelast();
        // l1.print();
        // l1.reverse();
        // l1.print();
        // l1.deletefromend(3);
        // l1.print();
        // l1.deletefromend(2);
        // l1.print();
        // System.out.println(l1.checkPalindrome());
        head = new Node(18);
        head.next = new Node(28);
        head.next.next = new Node(38);
        head.next.next.next = new Node(48);
        head.next.next.next = head.next.next;
        System.out.println(isCycle());

    }
}
