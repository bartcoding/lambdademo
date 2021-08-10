package be.intecbrussel.ex1;

@FunctionalInterface
public interface WordFilter {

    boolean isValid(String word);

}
