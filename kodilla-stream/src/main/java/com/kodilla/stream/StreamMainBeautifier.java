package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMainBeautifier {

    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("This is a poem...", (String poem) -> "ABC " + poem + " ABC");
        poemBeautifier.beautify("This is a poem...", PoemBeautifier::toUpperCase);
        poemBeautifier.beautify("THIS IS A POEM...", PoemBeautifier::toLowerCase);
        poemBeautifier.beautify("This is a poem...", (String poem) -> "\ud83c\udf40 " + poem + " \ud83c\udf40");
        poemBeautifier.beautify(poemBeautifier.beautify("this is a poem...", (String poem) -> poem),  (String poem) -> "... and this is a second poem.");
    }
}