package com.ameen.practice.controller;

import com.ameen.practice.service.StringService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/string")
public class StringController {

    private final StringService stringService;

    public StringController(StringService stringService) {
        this.stringService = stringService;
    }

    @GetMapping("/reverse/builder")
    public String reverseWithBuilder(@RequestParam String input) {
        return stringService.reverseWithBuilder(input);
    }

    @GetMapping("/reverse/buffer")
    public String reverseWithBuffer(@RequestParam String input) {
        return stringService.reverseWithBuffer(input);
    }

    @GetMapping("/palindrome")
    public boolean isPalindrome(@RequestParam String input) {
        return stringService.isPalindrome(input);
    }

    @PostMapping("/append")
    public String appendStrings(@RequestBody String[] inputs) {
        return stringService.appendStrings(inputs);
    }

    @GetMapping("/compare-performance")
    public String comparePerformance() {
        return stringService.comparePerformance();
    }
}
