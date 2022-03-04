package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public String beautify(String poem, PoemDecorator poemDecorator) {

        String output = poemDecorator.decorate(poem);
        System.out.println("Decorated poem: " + output);

        return output;
    }

    public static String toUpperCase(String poem) {
        return poem.toUpperCase();
    }

    public static String toLowerCase(String poem) {
        return poem.toLowerCase();
    }
}