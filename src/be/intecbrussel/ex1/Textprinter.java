package be.intecbrussel.ex1;

public class Textprinter {
    private String sentence;

    public Textprinter(String sentence) {
        this.sentence = sentence;
    }

    public void printFilteredWords(WordFilter wordFilter){

        String[] wordsInSentence = sentence.split(" ");

        for (String word: wordsInSentence){
            if(wordFilter.isValid(word)){
                System.out.println(word);
            }

        }


    }




}
