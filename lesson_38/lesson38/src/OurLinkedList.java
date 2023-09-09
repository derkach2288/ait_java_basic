import java.util.Iterator;

public class OurLinkedList<E> implements OurList<E> {

    private int size;
    private Node<E> first;
    private Node<E> last;

    public OurLinkedList() {
    }

    @Override
    public void append(E value) {
        if (size > 0) {
            Node<E> newNode = new Node<>(last, value, null);
            last.next = newNode;
            last = newNode;
        } else {
            Node<E> newNode = new Node<>(null, value, null);
            first = newNode;
            last = newNode;
        }
        size++;
    }

    private Node<E> getNodeByIndex(int index) {
        if (index >= size || index < 0) {
            return null;
        } else {
            int currentIndex = 0;
            Node<E> currentNode = first;
            while (currentIndex < index) {
                currentNode = currentNode.next;
                currentIndex++;
            }
            return currentNode;
        }
    }
    public void printOurList(){
        Node<E> currentNode = first;
        for (int i = 0; i < size; i++) {
            System.out.println(currentNode.value);
            currentNode = currentNode.next;
        }
    }

    @Override
    public E get(int index) {
        if (index >= size || index < 0) {
            return null;
        }
        return getNodeByIndex(index).value;
    }

    @Override
    public void set(E object, int index) {
        if (index >= size || index < 0) {
            return;
        }
        getNodeByIndex(index).value = object;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(E o) {
        Node<E> currentNode = first;
        while (currentNode != null){
            if (currentNode.value.equals(o)){
                return true;
            }
            currentNode = currentNode.next;
        }
            return false;
    }

    @Override
    public boolean remove(E o) {
        Node<E> currentNode = first;
        for (int i = 0; i < size; i++) {
            if (currentNode.value.equals(o)){
                removeById(i);
                return true;
            }
            currentNode = currentNode.next;
        }

        return false;
    }

    @Override
    public E removeById(int index) {
        Node<E> deletedNode = getNodeByIndex(index);
        if (deletedNode !=null){
            E value = deletedNode.value;
            if (deletedNode == first){ // если первая
                first = deletedNode.next;
                if (deletedNode.prev!=null){ // если есть слева
                    deletedNode.prev.next=deletedNode.next;
                    deletedNode.prev = null;
                }
            }
            if (deletedNode == last){ // если последняя
                last = deletedNode.prev;
                if (deletedNode.next!=null){
                    deletedNode.next.prev = deletedNode.prev;  // если не последняя
                    deletedNode.next = null; //
                }
            }
            deletedNode.value = null;
            size--;
            return value;
        }
        return null;
    }

    private static class Node<E> {
        Node<E> prev;
        E value;
        Node<E> next;

        Node(Node<E> prev, E value, Node<E> next) {
            this.next = next;
            this.prev = prev;
            this.value = value;
        }
    }
}