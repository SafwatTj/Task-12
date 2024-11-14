import java.util.Iterator;

public class MyLinkedList<T>  implements Iterator<T>, Iterable<T>{
    private Node<T> head = null;
    private Node<T> tail = null;
    private int size = 0;
    private Node<T> currentNode = null;

    public void add(T obj){
        if (head==null){
            head = new Node<>(obj,null,null);
            tail = head;
            currentNode = head;
        } else {
            Node<T> newNode =  new Node<>(obj,tail, null );
            newNode.getPrev().setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    public void addFirst(T obj){
        if (head==null){
            add(obj);
        }
        Node<T> newNode = new Node<>(obj, null, head);
        size++;
        head.setPrev(newNode);
        head = newNode;

    }


    public void add(int index, T obj){
        if (index<0){
            // Exception
            return;
        }
        if(index>=size){
            add(obj);
            return;
        }
        if (index==0){
            addFirst(obj);
            return;
        }
        Node<T> nodeIndex = getNodeByIndex(index);
        Node<T> nodePrev = nodeIndex.getPrev();

        Node<T> newNode = new Node<>(obj, nodePrev, nodeIndex);
        nodeIndex.setPrev(newNode);
        nodePrev.setNext(newNode);
        size++;
    }

    public void print(){
        Node<T> currentNode = head;
        while (currentNode!=null){
            System.out.println(currentNode.getObj());
            currentNode = currentNode.getNext();
        }
    }

    public String toString(){

        StringBuilder sb = new StringBuilder();
        Node<T> currenNode = head;
        while (currenNode!=null){
            sb.append(currenNode.getObj()).append("    ");
            currenNode = currenNode.getNext();
        }
        return sb.toString();

    }

    private Node<T> getNodeByIndex(int index){
        if(index<0|| index>=size){
            return null;
        };
        int currentIndex = 0;
        Node<T> currenNode = head; //(0)
        while (currenNode!=null && currentIndex!=index){
            currenNode = currenNode.getNext();
            currentIndex++;
        }
        return currenNode;
    }

    public T get(int index){
        Node<T> nodeByIndex = getNodeByIndex(index);
        if (nodeByIndex!=null){
            return nodeByIndex.getObj();
        }
        return null;
    }

    public int size(){
        return size;
    }


    public  static <E> MyLinkedList<E> of(E ... elements){
        MyLinkedList<E> result = new MyLinkedList<>();
        for (E element: elements){
           result.add(element);
        }
        return result;
    }


    @Override
    public boolean hasNext() {
        return currentNode!=null;
    }

    @Override
    public T next() {
        T result = currentNode.getObj();
        currentNode=currentNode.getNext();
        return result;
    }

    @Override
    public Iterator<T> iterator() {
        return this;
    }
}
