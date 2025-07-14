package com.ameen.practice.controller;

import com.ameen.practice.service.MultiThreadingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/multithreading")
public class MultiThreadingController {

    private final MultiThreadingService service;

    public MultiThreadingController(MultiThreadingService service) {
        this.service = service;
    }

    @GetMapping("/startThreads")
    public String startThreads() {
        service.startThreads();
        return "Threads started";
    }

    @GetMapping("/printNumbers")
    public String printNumbersAlternately() {
        service.printNumbersAlternately();
        return "Printing numbers alternately";
    }

    @GetMapping("/causeDeadlock")
    public String causeDeadlock() {
        service.causeDeadlock();
        return "Deadlock caused";
    }

    @GetMapping("/computeSum")
    public int computeSum() throws Exception {
        return service.computeSum();
    }

    @GetMapping("/producerConsumer")
    public String producerConsumerExample() {
        service.producerConsumerExample();
        return "Producer-Consumer started";
    }

    @GetMapping("/reverseWithBuilder")
    public String reverseStringWithBuilder(@RequestParam String input) {
        return service.reverseStringWithBuilder(input);
    }

    @GetMapping("/reverseWithBuffer")
    public String reverseStringWithBuffer(@RequestParam String input) {
        return service.reverseStringWithBuffer(input);
    }

    @GetMapping("/isPalindrome")
    public boolean isPalindrome(@RequestParam String input) {
        return service.isPalindrome(input);
    }

    @GetMapping("/appendStrings")
    public String appendStrings(@RequestParam String[] inputs) {
        return service.appendStrings(inputs);
    }

    @GetMapping("/comparePerformance")
    public String comparePerformance() {
        return service.comparePerformance();
    }

}
