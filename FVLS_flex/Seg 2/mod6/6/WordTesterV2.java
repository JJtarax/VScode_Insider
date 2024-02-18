public class WordTesterV2 {
    // instance variable myWords contains an array of String values storing thewords
    // fromthe phrase-where eachelement isasingleword.
    // // The instance variable myNumWords acts as a check digit to confirmthe
    // numberof wordsfound inthe phrase.
    // // The instance variable myTargetWord contains a target word is tobe
    // locatedin thearray
    // // The constructor accepts a String array with the words, an
    // intrepresentingthe numberof wordsin thephrase anda Stringrepresenting
    // thetarget word.
    // // There may be other instance variables, constructors and methodsnot shown
    private String[] myWords;
    private int myNumWords;
    private String myTargetWord;

    public WordTesterV2(String[] words, int numWords, String targetWord) {

        myWords = words;
        myNumWords = numWords;
        myTargetWord = targetWord;

    }

    public boolean isWithin() {
        // to be implemented in Part A
        for (String myword : myWords) {

            if (myTargetWord.equals(myword)) {
                return true;
            }
        }
        return false;
    }

    public boolean sameNumber() {
        // to be implemented in Part B
        if (myWords.length == myNumWords) {
            return true;
        } else {
            return false;
        }

    }
}