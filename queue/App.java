public class App {

  public static void main(String[] args) {
    IQueue<Integer> queue = new LinkedListQueue<Integer>();
    queue.add(6);
    System.out.println(queue);
    queue.add(5);
    System.out.println(queue);
    queue.add(9);
    System.out.println(queue);

    Integer val1 = queue.remove();
    System.out.println(queue);
    Integer val2 = queue.remove();
    System.out.println(queue);
    Integer val3 = queue.remove();
    System.out.println(queue);
  }

}

