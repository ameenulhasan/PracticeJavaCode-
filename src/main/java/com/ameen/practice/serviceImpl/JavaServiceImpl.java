package com.ameen.practice.serviceImpl;

import com.ameen.practice.dto.Employee;
import com.ameen.practice.dto.Salary;
import com.ameen.practice.dto.Student;
import com.ameen.practice.service.JavaService;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class JavaServiceImpl implements JavaService {

    @Override
    public List<Long> getEvenNumbers(List<Long> numbers) {
        return numbers.stream().filter(n -> n % 2 == 0).toList();
    }

    @Override
    public int sumOfEvenNumbers(List<Long> numbers) {
        return Math.toIntExact(numbers.stream().filter(n -> n % 2 == 0).reduce(0L, Long::sum));
    }

    @Override
    public List<String> convertToUppercase(List<String> words) {
        return words.stream().map(String::toUpperCase).toList();
    }

    @Override
    public List<Long> sortDescending(List<Long> numbers) {
        return numbers.stream().sorted((a, b) -> Math.toIntExact(b - a)).toList();
    }

    @Override
    public Optional<String> findFirstStartingWithA(List<String> names) {
        return names.stream().filter(name -> name.startsWith("A")).findFirst();
    }

    @Override
    public Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        return employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
    }

    @Override
    public Map<String, List<Student>> groupByPassFail(List<Student> students) {
        return students.stream().collect(Collectors.groupingBy(s -> s.getScore() > 50 ? "Passed" : "Failed"));
    }

    //the Second Highest Number in a List Using Streams
    @Override
    public Optional<Long> findSecondHighest(List<Long> numbers) {
        return numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
    }

    //Remove Duplicates from a List Using Streams
    @Override
    public List<Long> removeDuplicates(List<Long> numbers) {
        return numbers.stream()
                .distinct()
                .toList();
    }

    //Maximum and Minimum Numbers Using Streams
    @Override
    public Map<String, Integer> findMaxMin(List<Long> numbers) {
        int max = Math.toIntExact(numbers.stream().max(Long::compareTo).orElseThrow());
        int min = Math.toIntExact(numbers.stream().min(Long::compareTo).orElseThrow());
        return Map.of("max", max, "min", min);
    }

    //Count Character Occurrences in a String
    @Override
    public Map<Character, Long> countCharacter(String input) {
        return input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    //Flatten a List of Lists Using flatMap()
    @Override
    public List<Long> flattenLists(List<List<Long>> listOfLists) {
        return listOfLists.stream()
                .flatMap(List::stream)
                .toList();
    }

    //Partition a List into Even and Odd Numbers
    @Override
    public Map<Boolean, List<Long>> partitionEvenOdd(List<Long> numbers) {
        return numbers.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
    }

    //The Longest Word in a List
    @Override
    public Optional<String> findLongestWord(List<String> words) {
        return words.stream().max(Comparator.comparingInt(String::length));
    }

    //Word Frequency in a Sentence
    @Override
    public Map<String, Long> countWordFrequency(String sentence) {
        return Arrays.stream(sentence.split("\\s+"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    //the Product of All Elements
    @Override
    public int findProduct(List<Long> numbers) {
        return Math.toIntExact(numbers.stream().reduce(1L, (a, b) -> a * b));
    }

    //Convert List of Integers to a Comma-Separated String
    @Override
    public String convertToCommaSeparated(List<Long> numbers) {
        return numbers.stream().map(String::valueOf).collect(Collectors.joining(", "));
    }

    //the Most Repeated Character in a String
    @Override
    public Optional<Character> findMostRepeatedCharacter(String input) {
        return input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }

    //the Highest-Paid Employee
    @Override
    public Optional<Salary> findHighestPaidEmployeeSalary(List<Salary> salaries) {
        return salaries.stream().max(Comparator.comparing(Salary::getSalary));
    }

    //Remove Null Values from a List
    @Override
    public List<String> removeNullValues(List<String> list) {
        return list.stream().filter(Objects::nonNull).toList();
    }

}
