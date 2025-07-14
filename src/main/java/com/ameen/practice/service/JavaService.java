package com.ameen.practice.service;

import com.ameen.practice.dto.Employee;
import com.ameen.practice.dto.Salary;
import com.ameen.practice.dto.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public interface JavaService {

    List<Long> getEvenNumbers(List<Long> numbers);

    int sumOfEvenNumbers(List<Long> numbers);

    List<String> convertToUppercase(List<String> words);

    List<Long> sortDescending(List<Long> numbers);

    Optional<String> findFirstStartingWithA(List<String> names);

    Map<String, List<Employee>> groupByDepartment(List<Employee> employees);

    Map<String, List<Student>> groupByPassFail(List<Student> students);

    Optional<Long> findSecondHighest(List<Long> numbers);

    List<Long> removeDuplicates(List<Long> numbers);

    Map<String, Integer> findMaxMin(List<Long> numbers);

    Map<Character, Long> countCharacter(String input);

    List<Long> flattenLists(List<List<Long>> listOfLists);

    Map<Boolean, List<Long>> partitionEvenOdd(List<Long> numbers);

    Optional<String> findLongestWord(List<String> words);

    Map<String, Long> countWordFrequency(String sentence);

    int findProduct(List<Long> numbers);

    String convertToCommaSeparated(List<Long> numbers);

    Optional<Character> findMostRepeatedCharacter(String input);

    Optional<Salary> findHighestPaidEmployeeSalary(List<Salary> salaries);

    List<String> removeNullValues(List<String> list);

}
