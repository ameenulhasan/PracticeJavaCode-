package com.ameen.practice.service;

import com.ameen.practice.dto.Marks;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public interface CollectionsService {

    List<Marks> sortStudentsByMarksDesc(List<Marks> marks);

    List<Long> removeDuplicatesFromList(List<Long> list);

    Map<String, Long> sortHashMapByValue(Map<String, Long> map);

    List<String> mergeListsWithoutDuplicates(List<String> list1, List<String> list2);

    Character findFirstNonRepeatingCharacter(String input);

    Map<String, Long> convertHashMapToTreeMap(Map<String, Long> map);

    Map<Long, Long> findFrequencyOfElements(int[] array);

    List<Long> removeAllOccurrences(List<Long> list, int element);

    String findMostFrequentWord(List<String> words);

    Set<String> findIntersectionOfLists(List<String> list1, List<String> list2);

    Set<Long> findDuplicatesInArray(int[] array);

    Map<Integer, String> convertListToMap(List<Marks> marks);

    List<String> convertLinkedListToArrayList(LinkedList<String> linkedList);

    Map<String, Long> createCustomLinkedHashMap();

    List<String> findDifferenceBetweenLists(List<String> list1, List<String> list2);

    LinkedList<String> reverseLinkedList(LinkedList<String> linkedList);

    Long findHighestOccurringElement(List<Long> list);

    boolean checkIfMapContainsKeyValue(Map<String, Long> map, String key, int value);

    Set<Long> convertListToSet(List<Long> list);

    List<Long> removeElementsGreaterThanNumber(List<Long> list, int number);

}
