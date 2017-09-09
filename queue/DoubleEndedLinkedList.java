public class DoubleEndedLinkedList<T> {

  private Node<T> front;
  private Node<T> back;

  public DoubleEndedLinkedList() {
    front = null;
    back = null;
  }

  public void addBack(T data) {
    addBack(new Node<T>(data));
  }

  public void addBack(Node<T> node) {
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

