package com.kodilla.stream.beautifier;

import java.util.Locale;

public class PoemBeautifier {

    public void decorate(String poem, PoemDecorator poemDecorator) {

        String output = poemDecorator.decorate(poem);
        System.out.println("Decorated poem: " + output);
    }

    public static String toUpperCase(String poem) {
        return poem.toUpperCase();
    }

    public static String toLowerCase(String poem) {
        return poem.toLowerCase();
    }
}