public class LinkedListStack<T> implements IStack<T> {

  private LinkedList<T> ll;
  private int size;

  public LinkedListStack() {
    ll = new LinkedList<T>();
    size = 0;
  }

  @Override
  public void push(T data) {
    size++;
    ll.addFront(data);
  }

  @Override
  public T pop() {
    size--;
    Node<T> removedNode = ll.removeFront();
    if (removedNode != null) {
      return removedNode.getData();
    }
    return null;
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  @Override
  public String toString() {
    return ll.toString();
  }

}

