package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer,ForumUser> mapOfForumUsers = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex()=='M')
                .filter(forumUser->Period.between(forumUser.getBirthdayDate(), LocalDate.now()).getYears()>=20)
                .filter(forumUser -> forumUser.getNumberOfPosts()>=1)
                .collect(Collectors.toMap(ForumUser::getId,ForumUser->ForumUser));

        mapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}

//    public static void main(String[] args) {
//        BookDirectory theBookDirectory = new BookDirectory();
//
//        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .collect(Collectors.toMap(Book::getSignature, book -> book));
//
//        System.out.println("# elements: " + theResultMapOfBooks.size());
//        theResultMapOfBooks.entrySet().stream()
//                .map(entry -> entry.getKey() + ": " + entry.getValue())
//                .forEach(System.out::println);

//    public static void main(String[] args) {
//        BookDirectory theBookDirectory = new BookDirectory();
//        List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .collect(Collectors.toList());
//
//        System.out.println("# elements: " + theResultListOfBooks.size());
//        theResultListOfBooks.stream()
//                .forEach(System.out::println);


//    public static void main(String[] args) {
//        BookDirectory theBookDirectory = new BookDirectory();
//        theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .forEach(System.out::println);

//    public static void main(String[] args) {
//        People.getList().stream()
//                .map(String::toUpperCase)
//                .filter(s -> s.length() > 11)
//                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
//                .filter(s -> s.substring(0, 1).equals("M"))
//                .forEach(System.out::println);

//        System.out.println("Using Stream to generate even numbers from 1 to 20");
//        NumbersGenerator.generateEven(20);
//       ExpressionExecutor expressionExecutor = new ExpressionExecutor();
//
//       PoemBeautifier poemBeautifier = new PoemBeautifier();
//       String textFirst = poemBeautifier.beautify("Text to beautify ", (text -> "ABC" + text + "ABC"));
//       System.out.println(textFirst);
//
//       String textSecond = poemBeautifier.beautify("Text to beautify ", (text -> text.toUpperCase()));
//       System.out.println(textSecond);
//
//       String textThird = poemBeautifier.beautify("Text to beautify ", (text -> text.replace(" ", "***")));
//       System.out.println(textThird);
//
//       String textFourth = poemBeautifier.beautify("Text to beautify ", (text -> text.repeat(4)));
//       System.out.println(textFourth);
//
//       System.out.println("Calculating expressions with lambdas");
//       expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
//       expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
//       expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
//       expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
//
//       System.out.println("Calculating expressions with method references");
//       expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
//       expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
//       expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
//       expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
