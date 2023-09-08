//package linkedlist_implementation;
//
//public class OurLinkedList<E>  {
//
//    private int size;
//    private Node<E> first;
//    private Node<E> last;
//
//    public OurLinkedList(){
//
//    }
//
//    @Override
//    public void append(E value) {
//        if (size>0){
//            Node<E> newNode = new Node<>(null, last, value);
//            last.next = newNode;
//            last = newNode;
//        } else {
//            Node<E> newNode = new Node<>(null, null, value);
//            first = newNode;
//            last = newNode;
//        }
//        size++;
//    }
//
//    @Override
//    public Object get(int index) {
//        return null;
//    }
//
//    @Override
//    public void set(Object o, int index) {
//
//    }
//
//    @Override
//    public int size() {
//        return 0;
//    }
//
//    @Override
//    public boolean contains(Object o) {
//        return false;
//    }
//
//    @Override
//    public boolean remove(Object o) {
//        return false;
//    }
//
//    @Override
//    public Object removeById(int index) {
//        return null;
//    }
//
//
//    private static class Node<E> {
//
//        Node<E> next;
//        Node<E> prev;
//        E value;
//
//
//        Node(Node<E> next, Node<E> prev, E value) {
//            this.next = next;
//            this.prev = prev;
//            this.value = value;
//        }
//    }
//}
