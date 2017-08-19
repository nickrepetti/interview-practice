public class Vector {

  private static int[] a;
  private static int n;

  public Vector(int size) {
    if (size > 0) {
      a = new int[size];
    } else {
      a = new int[0];
    }
    n = 0;
  }

  public static void main(String[] args) {
    Vector vector = new Vector(2);
    print();
    insert(5); 
    print();
    insert(1); 
    print();
    insert(11); 
    print();
    int val = 4;
    int index = find(val);
    if (index > -1) {
      System.out.println("Found " + val + " at index " + index + ".");
    } else {
      System.out.println(val + " was not found.");
    }
    insert(4); 
    print();
    val = 4;
    index = find(val);
    if (index > -1) {
      System.out.println("Found " + val + " at index " + index + ".");
    } else {
      System.out.println(val + " was not found.");
    }
    delete(1);
    print();
    insert(15); 
    print();
    delete(5);
    print();
  }

  public static void print() {
    System.out.print("[");

    if (n > 1) {
      for (int i = 0; i < n-1; i++) {
        System.out.print(a[i] + ", ");
      }
      System.out.print(a[n-1]);
    } else if (n == 1) {
      System.out.print(a[0]);
    }

    System.out.print("]");

    System.out.println();
  }

  public static void insert(int x) {
    if (!isFull()) {
      System.out.println("Inserting " + x + ".");

      int index = findInsertionIndex(x);

      for (int i = n; i > index; i--) {
        a[i] = a[i-1];
      }
      a[index] = x;
      n++;
    } else {
      resize();
      insert(x);
    }
  }

  private static void resize() {
    System.out.println("Resizing.");
    // Create new larger array
    int[] largerArray = new int[n*2];

    // Copy items from one original array
    for (int i = 0; i < n; i++) {
      largerArray[i] = a[i];
    }

    a = largerArray;
  }

  private static int findInsertionIndex(int x) {
    return findInsertionIndex(0, n-1, x);
  }

  private static int findInsertionIndex(int l, int h, int x) {
    if (l > h) {
      return l;
    }

    int m = l + (h-l) / 2;

    if (x == a[m]) {
      return m;
    } else if (x < a[m]) {
      return findInsertionIndex(l, m-1, x);
    } else {
      return findInsertionIndex(m+1, h, x);
    }
  }

  public static boolean isFull() {
    return n == a.length;
  }

  public static boolean delete(int x) {
    System.out.println("Deleting " + x + ".");

    int index = find(x);

    if (index > -1) {
      for (int i = index; i < n-1; i++) {
        a[i] = a[i+1];
      }

      n--;
      return true;
    }

    return false;
  }

  public static int find(int x) {
    return binarySearch(0, n-1, x);
  }

  public static boolean contains(int x) {
    return binarySearch(0, n-1, x) > -1;
  }

  private static int binarySearch(int l, int h, int x) {
    if (l > h) {
      return -1;
    }

    int m = l + (h-l) / 2;

    if (x == a[m]) {
      return m;
    } else if (x < a[m]) {
      return binarySearch(l, m-1, x);
    } else {
      return binarySearch(m+1, h, x);
    }
  }

} 

