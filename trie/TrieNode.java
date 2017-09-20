public class TrieNode {

  private TrieNode[] children;
  private boolean isEndOfWord;

  public TrieNode() {
    isEndOfWord = false;
    children = new TrieNode[26];
  }

  public TrieNode[] getChildren() {
    return children;
  }

  public boolean isEndOfWord() {
    return isEndOfWord;
  }

  public void setIsEndOfWord(boolean isEndOfWord) {
    this.isEndOfWord = isEndOfWord;
  }

}

