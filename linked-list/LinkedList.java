public class LinkedList<T> {

  private Node<T> head;

  public LinkedList() {
    head = null;
  }

  public void addFront(T data) {
    addFront(new Node<T>(data));
  }

  public void addFront(Node<T> node) {
    if (head == null) {
      head = node;
    } else {
      Node<T> tmp = head;
      head = node;
      head.setNext(tmp);
    }
  }

  public Node<T> removeFront() {
    if (head == null) {
      return null;
    }

    Node<T> tmp = head;
    head = head.getNext();
    return tmp;
  }

  @Override
  public String toString() {
    if (head == null) {
      return "";
    }

    StringBuilder sb = new StringBuilder();

    Node<T> cur = head;
    while (cur.getNext() != null) {
      sb.append(cur);
      cur = cur.getNext();
    }

    sb.append(cur);

    return sb.toString();
  }

}

