package com.ameen.practice.controller;

import com.ameen.practice.dto.Employee;
import com.ameen.practice.dto.Salary;
import com.ameen.practice.dto.Student;
import com.ameen.practice.service.JavaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/Api")
public class JavaController {

    private final JavaService service;

    public JavaController(JavaService service) {
        this.service = service;
    }

    @GetMapping("/even-numbers")
    public List<Long> getEvenNumbers(@RequestParam List<Long> numbers) {
        return service.getEvenNumbers(numbers);
    }

    @GetMapping("/sum-of-even")
    public int sumOfEvenNumbers(@RequestParam List<Long> numbers) {
        return service.sumOfEvenNumbers(numbers);
    }

    @GetMapping("/uppercase")
    public List<String> convertToUppercase(@RequestParam List<String> words) {
        return service.convertToUppercase(words);
    }

    @GetMapping("/sort-desc")
    public List<Long> sortDescending(@RequestParam List<Long> numbers) {
        return service.sortDescending(numbers);
    }

    @GetMapping("/first-a")
    public Optional<String> findFirstStartingWithA(@RequestParam List<String> names) {
        return service.findFirstStartingWithA(names);
    }

    @PostMapping("/groupByDepartment")
    public Map<String, List<Employee>> groupByDepartment(@RequestBody List<Employee> employees) {
        return service.groupByDepartment(employees);
    }

    @PostMapping("/groupByPassFail")
    public Map<String, List<Student>> groupByPassFail(@RequestBody List<Student> students) {
        return service.groupByPassFail(students);
    }

    @PostMapping("/secondHighest")
    public ResponseEntity<Object> findSecondHighest(@RequestBody List<Long> numbers) {
        Optional<Long> secondHighest = service.findSecondHighest(numbers);
        return secondHighest.<ResponseEntity<Object>>map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).body("No second highest number found."));
    }

    @PostMapping("/removeDuplicates")
    public List<Long> removeDuplicates(@RequestBody List<Long> numbers) {
        return service.removeDuplicates(numbers);
    }

    @PostMapping("/findMaxMin")
    public Map<String, Integer> findMaxMin(@RequestBody List<Long> numbers) {
        return service.findMaxMin(numbers);
    }

    @GetMapping("/countCharacter")
    public Map<Character, Long> countCharacter(@RequestParam String input) {
        return service.countCharacter(input);
    }

    @PostMapping("/flattenLists")
    public List<Long> flattenLists(@RequestBody List<List<Long>> listOfLists) {
        return service.flattenLists(listOfLists);
    }

    @PostMapping("/partitionEvenOdd")
    public Map<Boolean, List<Long>> partitionEvenOdd(@RequestBody List<Long> numbers) {
        return service.partitionEvenOdd(numbers);
    }

    @PostMapping("/findLongestWord")
    public Optional<String> findLongestWord(@RequestBody List<String> words) {
        return service.findLongestWord(words);
    }

    @GetMapping("/countWordFrequency")
    public Map<String, Long> countWordFrequency(@RequestParam String sentence) {
        return service.countWordFrequency(sentence);
    }

    @PostMapping("/findProduct")
    public int findProduct(@RequestBody List<Long> numbers) {
        return service.findProduct(numbers);
    }

    @PostMapping("/convertToCommaSeparated")
    public String convertToCommaSeparated(@RequestBody List<Long> numbers) {
        return service.convertToCommaSeparated(numbers);
    }

    @GetMapping("/findMostRepeatedCharacter")
    public Optional<Character> findMostRepeatedCharacter(@RequestParam String input) {
        return service.findMostRepeatedCharacter(input);
    }

    @PostMapping("/findHighestPaidEmployee")
    public Optional<Salary> findHighestPaidEmployeeSalary(@RequestBody List<Salary> salaries) {
        return service.findHighestPaidEmployeeSalary(salaries);
    }

    @PostMapping("/removeNullValues")
    public List<String> removeNullValues(@RequestBody List<String> list) {
        return service.removeNullValues(list);
    }

}
