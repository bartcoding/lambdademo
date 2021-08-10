package be.intecbrussel.ex1;

public class WordFilterApp {

    public static void main(String[] args) {

        Textprinter textprinter = new Textprinter("welkom in de wondere wereld van de lambda expression");
        // print alle woorden die starten met een w
        textprinter.printFilteredWords((word) -> word.startsWith("w"));


    }
}
