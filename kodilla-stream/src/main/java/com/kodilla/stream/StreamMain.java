package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {

    public static void main(String[] args) {

        //Object
        System.out.println("Welcome to module 7 - Stream");
        SaySomething saySomething = new SaySomething();
        saySomething.say();

        //Interface implementation
        Processor processor1 = new Processor();
        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        processor1.execute(executeSaySomething);

        //Lambda 1
        Processor processor2 = new Processor();
        Executor codeToExecute = () -> System.out.println("This is an example text");
        processor2.execute(codeToExecute);

        //Lambda 2
        Processor processor3 = new Processor();
        processor3.execute(() -> System.out.println("This is an example text"));

        //Lambda math
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subAFromB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        //Poem Decorator
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.decorate("This is a poem...", (String poem) -> "ABC " + poem + " ABC");
        poemBeautifier.decorate("This is a poem...", PoemBeautifier::toUpperCase);
        poemBeautifier.decorate("THIS IS A POEM...", PoemBeautifier::toLowerCase);
        poemBeautifier.decorate("This is a poem...", (String poem) -> "\ud83c\udf40 " + poem + " \ud83c\udf40");

        //Stream
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}