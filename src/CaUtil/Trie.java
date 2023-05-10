package CaUtil;

public class Trie {
    public static class TrieNode {
        private final TrieNode[] children;
        private boolean isWord;

        public TrieNode() {
            children = new TrieNode[128];
            isWord = false;
        }

        public TrieNode[] getChildren() {
            return children;
        }

        public boolean getIsWord() {
            return isWord;
        }

        public void setIsWord(boolean isWord) {
            this.isWord = isWord;
        }
    }

    private final TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void add(String word) {
        TrieNode current = root;
        for(char c: word.toCharArray()) {
            TrieNode[] children = current.getChildren();

            if(children[c] == null)
                children[c] = new TrieNode();

            current = children[c];
        }
        current.setIsWord(true);
    }

    public boolean contains(String word) {
        TrieNode current = root;
        for(char c: word.toCharArray()) {
            TrieNode[] children = current.getChildren();

            if(children[c] == null)
                return false;

            current = children[c];
        }
        return current.getIsWord();
    }
}