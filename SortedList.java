import java.util.Iterator;

public class SortedList<E extends Comparable<? super E>> extends List<E> {
    E value = null;
    boolean condition = false;
    public void insert(E data){
        Node<E> temp = new Node<E>(data);
        if(head == null || data.compareTo(head.data) < 0){
            temp.next = head;
            head = temp;
        } else {
            insert(temp, data, head);
        }
    }

    public void insert(Node<E> temp, E data, Node<E> curr){
        if(curr.next != null && data.compareTo(curr.next.data) >= 0){
            curr = curr.next;
            insert(temp, data, curr);
        } else {
            temp.next = curr.next;
            curr.next = temp;
        }
    }

    public Iterator<E> iterator() {
        return new Iterator<E>() {
            public boolean hasNext() {
                return curr != null;
            }
            public E next() {
                E temp = curr.data;
                curr = curr.next;
                return temp;
            }
            private Node<E> curr = head;
        };
    }

    public void remove(E data){
        if (head != null){
            if(data.compareTo(head.data) == 0) {
                head = head.next;
            } else {
                remove(data, head);
            }
        }
    }

    public void remove(E data, Node<E> curr){
        if(curr.next != null){
            if(data.compareTo(curr.next.data) == 0){
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
                remove(data, curr);
            }
        }
    }

    public E retrieve(int index){
        retrieve(index, head, 0);
        return value;
    }

    public void retrieve(int index, Node<E> curr, int i){
        if(i <= index && curr != null){
            if(i == index){
                value = curr.data;
            } else {
                curr = curr.next;
                i++;
                retrieve(index, curr, i);
            }
        } else {
            value = null;
        }
    }

    public boolean search(E data){
        search(data, head);
        return condition;
    }

    public void search(E data, Node<E> curr) {
        if (curr != null) {
            if (data.compareTo(curr.data) == 0) {
                condition = true;
            } else {
                curr = curr.next;
                search(data, curr);
            }
        } else {
            condition = false;
        }
    }
}
