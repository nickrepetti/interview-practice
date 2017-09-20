public class Trie {

  private TrieNode root;

  public Trie() {
    root = new TrieNode();
  }

  public void add(String s) {
    System.out.println("Adding " + s + " to the trie.");

    TrieNode cur = root;
    for (int i = 0; i < s.length(); i++) {
      int charIndex = s.charAt(i) - 'a';
      TrieNode[] children = cur.getChildren();

      if (children[charIndex] == null) {
        children[charIndex] = new TrieNode();
      }

      cur = children[charIndex];
    }

    cur.setIsEndOfWord(true);
  }

  public boolean contains(String s) {
    System.out.println("Checking if " + s + " is in the trie.");

    TrieNode cur = root;
    for (int i = 0; i < s.length(); i++) {
      int charIndex = s.charAt(i) - 'a';
      TrieNode[] children = cur.getChildren();
      if (children[charIndex] != null) {
        cur = children[charIndex];
      } else {
        return false;
      }
    }

    return cur.isEndOfWord();
  }

}

