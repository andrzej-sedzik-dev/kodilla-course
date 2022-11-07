package com.kodilla.stream;


import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println(poemBeautifier.beautify("tekst do upiększenia", t -> "!" + t + "!"));
        System.out.println(poemBeautifier.beautify("tekst do upiększenia", t -> t.toUpperCase() + "###"));

        Forum forum = new Forum();
        // final List<ForumUser> result = forum.getUserList().stream() // ma byc mapa, a nie lista użytkowników
        // przy pomocy kolektora utworzy mapę par, w której rolę klucza będzie pełnił unikalny identyfikator użytkownika,
        // wyświetli otrzymaną mapę wynikową.

        System.out.println("----------------------------------------");
        final Map<Integer, List<ForumUser>> map = forum.getUserList()
                .stream()
                .filter(fu -> fu.getSex() == 'M')
                .filter(fu -> fu.getDateOfBirth().getYear() <= 2002)
                .filter(fu -> fu.getPostCount() > 0)
                .collect(Collectors.groupingBy(ForumUser::getId));
        map.forEach((n, users) -> {
            System.out.println("Name: " + n);
            users.forEach(System.out::println);
            System.out.println("----------------------------------------");
        });
    }
}

