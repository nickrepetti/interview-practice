public class App {

  public static void main(String[] args) {
    Trie trie = new Trie();
    trie.add("taco");
    trie.add("rice");
    trie.add("tacocat");
    System.out.println(trie.contains("burrito"));
    System.out.println(trie.contains("taco"));
    System.out.println(trie.contains("rice"));
    System.out.println(trie.contains("tacocat"));
  }

}

