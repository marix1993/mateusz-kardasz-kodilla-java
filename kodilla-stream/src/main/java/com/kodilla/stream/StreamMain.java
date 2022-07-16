package com.kodilla.stream;

import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {

    public static void main(String[] args) {
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
        //ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        //PoemBeautifier poemBeautifier = new PoemBeautifier();
        //String textFirst = poemBeautifier.beautify("Text to beautify ", (text -> "ABC" + text + "ABC"));
        //System.out.println(textFirst);

        //String textSecond = poemBeautifier.beautify("Text to beautify ", (text -> text.toUpperCase()));
        //System.out.println(textSecond);

        //String textThird = poemBeautifier.beautify("Text to beautify ", (text -> text.replace(" ", "***")));
        //System.out.println(textThird);

        //String textFourth = poemBeautifier.beautify("Text to beautify ", (text -> text.repeat(4)));
        //System.out.println(textFourth);


        //System.out.println("Calculating expressions with lambdas");
        //expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        //expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        //expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        //expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        //System.out.println("Calculating expressions with method references");
        //expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        //expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        //expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        //expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
    }
}