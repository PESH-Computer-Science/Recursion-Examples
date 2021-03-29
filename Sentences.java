// generating sentences given an array of words.
public class Sentences {
    static String words[] = {"hello", "hi", "cat", "bye"};
    static int n = 50;

    // given a sentence, this function will ad more words to it
    // until the length is as long as possible and ≤ n.
    public static void recurse(String sentence) {
        if (sentence.length() <= n) {
            for (String word : words) {
                if (sentence.length() != 0)
                    recurse(sentence + " " + word);
                else
                    recurse(sentence + word);
            }
            System.out.println(sentence);
        }
    }

    public static void main(String[] args) {
        recurse("");
    }
}
