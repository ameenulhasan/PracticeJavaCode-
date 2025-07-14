package com.ameen.practice.controller;

import com.ameen.practice.dto.Marks;
import com.ameen.practice.dto.MergeListsRequest;
import com.ameen.practice.service.CollectionsService;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/collectionApi")
public class CollectionsController {

    private final CollectionsService collectionsService;

    public CollectionsController(CollectionsService collectionsService) {
        this.collectionsService = collectionsService;
    }

    @PostMapping("/sortStudentsByMarksDesc")
    public List<Marks> sortStudentsByMarksDesc(@RequestBody List<Marks> marks) {
        return collectionsService.sortStudentsByMarksDesc(marks);
    }

    @PostMapping("/removeDuplicatesFromList")
    public List<Long> removeDuplicatesFromList(@RequestBody List<Long> list) {
        return collectionsService.removeDuplicatesFromList(list);
    }

    @PostMapping("/sortHashMapByValue")
    public Map<String, Long> sortHashMapByValue(@RequestBody Map<String, Long> map) {
        return collectionsService.sortHashMapByValue(map);
    }

    @PostMapping("/mergeListsWithout")
    public List<String> mergeListsWithoutDuplicates(@RequestBody MergeListsRequest request) {
        return collectionsService.mergeListsWithoutDuplicates(request.getList1(), request.getList2());
    }

    @GetMapping("/findFirstNonRepeatingCharacter")
    public Character findFirstNonRepeatingCharacter(@RequestParam String input) {
        return collectionsService.findFirstNonRepeatingCharacter(input);
    }

    @PostMapping("/convertHashMapToTreeMap")
    public Map<String, Long> convertHashMapToTreeMap(@RequestBody Map<String, Long> map) {
        return collectionsService.convertHashMapToTreeMap(map);
    }

    @PostMapping("/findFrequencyOfElements")
    public Map<Long, Long> findFrequencyOfElements(@RequestBody int[] array) {
        return collectionsService.findFrequencyOfElements(array);
    }

    @PostMapping("/removeAllOccurrences")
    public List<Long> removeAllOccurrences(@RequestBody List<Long> list, @RequestParam int element) {
        return collectionsService.removeAllOccurrences(list, element);
    }

    @PostMapping("/findMostFrequentWord")
    public String findMostFrequentWord(@RequestBody List<String> words) {
        return collectionsService.findMostFrequentWord(words);
    }

    @PostMapping("/findIntersectionOfLists")
    public Set<String> findIntersectionOfLists(@RequestBody List<String> list1, @RequestBody List<String> list2) {
        return collectionsService.findIntersectionOfLists(list1, list2);
    }

    @PostMapping("/findDuplicatesInArray")
    public Set<Long> findDuplicatesInArray(@RequestBody int[] array) {
        return collectionsService.findDuplicatesInArray(array);
    }

    @PostMapping("/convertListToMap")
    public Map<Integer, String> convertListToMap(@RequestBody List<Marks> marks) {
        return collectionsService.convertListToMap(marks);
    }

    @PostMapping("/convertLinkedListToArrayList")
    public List<String> convertLinkedListToArrayList(@RequestBody LinkedList<String> linkedList) {
        return collectionsService.convertLinkedListToArrayList(linkedList);
    }

    @GetMapping("/createCustomLinkedHashMap")
    public Map<String, Long> createCustomLinkedHashMap() {
        return collectionsService.createCustomLinkedHashMap();
    }

    @PostMapping("/findDifferenceBetweenLists")
    public List<String> findDifferenceBetweenLists(@RequestBody List<String> list1, @RequestBody List<String> list2) {
        return collectionsService.findDifferenceBetweenLists(list1, list2);
    }

    @PostMapping("/reverseLinkedList")
    public LinkedList<String> reverseLinkedList(@RequestBody LinkedList<String> linkedList) {
        return collectionsService.reverseLinkedList(linkedList);
    }

    @PostMapping("/findHighestOccurringElement")
    public Long findHighestOccurringElement(@RequestBody List<Long> list) {
        return collectionsService.findHighestOccurringElement(list);
    }

    @GetMapping("/checkIfMapContainsKeyValue")
    public boolean checkIfMapContainsKeyValue(@RequestParam Map<String, Long> map, @RequestParam String key, @RequestParam int value) {
        return collectionsService.checkIfMapContainsKeyValue(map, key, value);
    }

    @PostMapping("/convertListToSet")
    public Set<Long> convertListToSet(@RequestBody List<Long> list) {
        return collectionsService.convertListToSet(list);
    }

    @PostMapping("/removeElementsGreaterThanNumber")
    public List<Long> removeElementsGreaterThanNumber(@RequestBody List<Long> list, @RequestParam int number) {
        return collectionsService.removeElementsGreaterThanNumber(list, number);
    }
}
