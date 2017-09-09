public class App {

  public static void main(String[] args) {
    IStack<Integer> stack = new LinkedListStack<Integer>();
    stack.push(6);
    System.out.println(stack);
    stack.push(5);
    System.out.println(stack);
    stack.push(9);
    System.out.println(stack);

    Integer val1 = stack.pop();
    System.out.println(stack);
    Integer val2 = stack.pop();
    System.out.println(stack);
    Integer val3 = stack.pop();
    System.out.println(stack);
  }

}

