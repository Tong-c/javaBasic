package com.tong;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.*;

public class StreamTest {

    List<Dish> menu = new ArrayList<>();

    @BeforeEach
    void setUp() {
        menu.add(new Dish("pork", false, 800, Dish.Type.MEAT));
        menu.add(new Dish("beef", false, 700, Dish.Type.MEAT));
        menu.add(new Dish("chicken", false, 400, Dish.Type.MEAT));
        menu.add(new Dish("french fries", true, 530, Dish.Type.OTHER));
        menu.add(new Dish("rice", true, 350, Dish.Type.OTHER));
        menu.add(new Dish("season fruit", true, 120, Dish.Type.OTHER));
        menu.add(new Dish("pizza", true, 550, Dish.Type.OTHER));
        menu.add(new Dish("prawns", false, 300, Dish.Type.FISH));
        menu.add(new Dish("salmon", false, 450, Dish.Type.FISH));
    }


    @Test
    public void test1() {
        List<String> threeHighCaloricDishNames = menu.stream().filter(d -> d.getCalories() > 300).map(Dish::getName).limit(3).collect(toList());
        System.out.println(threeHighCaloricDishNames);
    }


    @Test
    public void test2() {
        List<String> title = Arrays.asList("Java8", "In", "Action");
        Stream<String> s = title.stream();
        s.forEach(System.out::println);
        s.forEach(System.out::println);
    }

    @Test
    public void test3() {
        List<String> names = menu.stream().filter(dish -> {
            System.out.println("filtering " + dish.getName());
            return dish.getCalories() > 300;
        }).map(dish -> {
            System.out.println("mapping " + dish.getName());
            return dish.getName();
        }).limit(3).collect(toList());
        System.out.println(names);
    }


    @Test
    public void test4() {
        List<String> words = Arrays.asList("Java 8", "Lambdas", "In", "Action");
        List<Integer> wordLength = words.stream().map(String::length).collect(toList());
        System.out.println(wordLength);
    }


    @Test
    public void test5() {
        List<String> words = Arrays.asList("Hello", "world");
        List<String[]> wordsSplit = words.stream().map(word -> word.split("")).distinct().collect(toList());
        System.out.println(wordsSplit);
    }

    @Test
    public void test6() {
        if (menu.stream().anyMatch(Dish::isVegetarian)) {
            System.out.println("The menu is (somewhat) vegetarian friednly");
        }

        boolean isHealthy = menu.stream().noneMatch(d -> d.getCalories() >= 1000);
    }

    @Test
    public void test7() {
        menu.stream().filter(Dish::isVegetarian).findAny().ifPresent(dish -> System.out.println(dish.getName()));
    }

    @Test
    public void test8() {
        List<Integer> someNumbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> firstSquareDivisibleByThree = someNumbers.stream().map(x -> x * x).filter(x -> x % 3 == 0).findFirst();
    }

    @Test
    public void test9() {
        List<String> detailList = menu.stream().map(Dish::getName).collect(toList());
        System.out.println(detailList);
    }

    @Test
    public void test10() {
        long howManyDishes = menu.stream().collect(Collectors.counting());
        System.out.println(howManyDishes);
    }

    @Test
    public void test11() {
        Comparator<Dish> dishCaloriesComparator = comparingInt(Dish::getCalories);
//        Optional<Dish> mostCaloriesDish = menu.stream().collect(dishCaloriesComparator);
    }

    @Test
    public void test12() {
        int totalCalories = menu.stream().collect(summingInt(Dish::getCalories));
    }

    @Test
    public void test13() {
        int totalCalories = menu.stream().collect(reducing(0, Dish::getCalories, (i, j) -> i + j));
    }

    @Test
    public void test14() {
        Map<Dish.Type, Dish> mostCaloricByType = menu.stream().collect(groupingBy(Dish::getType, collectingAndThen(maxBy(comparingInt(Dish::getCalories)), Optional::get)));
        Map<Dish.Type, Integer> totalCaloriesByType = menu.stream().collect(groupingBy(Dish::getType, summingInt(Dish::getCalories)));
    }

    @Test
    public void test15() {
        Map<Boolean, List<Dish>> partitionedMenu = menu.stream().collect(partitioningBy(Dish::isVegetarian));
        List<Dish> vegetarianDishes = partitionedMenu.get(true);
    }

    @Test
    public void test16() {
        Map<Boolean, Map<Dish.Type, List<Dish>>> vegetarianDishesByType = menu.stream().collect(partitioningBy(Dish::isVegetarian, groupingBy(Dish::getType)));
    }

    @Test
    public void test17() {

    }

    public Map<Boolean, List<Integer>> partitionPrimes(int n) {
        return IntStream.rangeClosed(2, n).boxed().collect(partitioningBy(candidate -> isPrime(candidate)));
    }


    public boolean isPrime(int candidate) {
        int candidateRoot = (int) Math.sqrt((double) candidate);
        return IntStream.rangeClosed(2, candidateRoot).noneMatch(i -> candidate % i == 0);
    }


}
