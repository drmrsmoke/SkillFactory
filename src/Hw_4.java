public class Hw_4 {
    public static class NumOfWords{
        private String phrase ="";
        private int CountWords=0;

        public NumOfWords(String phrase) {
            this.phrase = phrase;
        }
        public void CountWords() {
            String[] words = phrase.split("\\s+");
            CountWords+=words.length;
            System.out.println("Слов в фразе "+CountWords);
        }
        public void Countsentence(){
            String[] sentenceList = phrase.split("[!?.:]+");
            int sentenceCount = sentenceList.length;
            System.out.println("Предложений в фразе "+sentenceCount);
        }
        public void CountWhiteSpasec(){
            int whitespaceCount = CountWords - 1;
            System.out.println("Пробелов " + whitespaceCount);
        }
        public void countMatches(){
            String main = phrase.toLowerCase();
            int[] foundArray = new int[26];
            String output = "";
            String[] alphabets = "a b c d e f g h i j k l m n o p q r s t u v w x y z".split("\\s");
            String[] mainArray = main.split("");
            for (String string : mainArray) {
                for (int i = 0; i < alphabets.length; i++) {
                    if (string.equals(alphabets[i])) {
                        foundArray[i] = foundArray[i] + 1;
                    }
                }
            }

            for (int i = 0; i < foundArray.length; i++) {

                if (foundArray[i] > 0) {
                    output += alphabets[i] + ":" + foundArray[i] + ", ";
                }
            }
            System.out.println(output);


        }


    }
    public static void main(String[] args) {
        String phrase = "matches the previous token between zero and unlimited times, as many times. possible, giving back as needed (greedy)";
        NumOfWords nums = new NumOfWords(phrase);
        nums.CountWords();
        nums.countMatches();
        nums.Countsentence();
        nums.CountWhiteSpasec();

    }



}
