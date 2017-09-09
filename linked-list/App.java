public class App {

  public static void main(String[] args) {
    LinkedList<Integer> ll = new LinkedList<Integer>();
    ll.addFront(6);
    ll.addFront(3);
    ll.addFront(5);
    ll.addFront(1);

    System.out.println(ll);

    ll.removeFront();
    ll.removeFront();

    System.out.println(ll);
  }

}

