package com.ameen.practice.serviceImpl;

import com.ameen.practice.dto.Marks;
import com.ameen.practice.service.CollectionsService;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class CollectionsServiceImpl implements CollectionsService {

    @Override
    public List<Marks> sortStudentsByMarksDesc(List<Marks> marks) {
        marks.sort((s1, s2) -> s2.getMarks() - s1.getMarks());
        return marks;
    }

    @Override
    public List<Long> removeDuplicatesFromList(List<Long> list) {
        return new ArrayList<>(new LinkedHashSet<>(list));
    }

    @Override
    public Map<String, Long> sortHashMapByValue(Map<String, Long> map) {
        return map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }

    @Override
    public List<String> mergeListsWithoutDuplicates(List<String> list1, List<String> list2) {
        Set<String> set = new HashSet<>(list1);
        set.addAll(list2);
        return new ArrayList<>(set);
    }

    @Override
    public Character findFirstNonRepeatingCharacter(String input) {
        Map<Character, Long> map = new LinkedHashMap<>();
        for (char c : input.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0L) + 1);
        }
        for (Map.Entry<Character, Long> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return null;
    }

    @Override
    public Map<String, Long> convertHashMapToTreeMap(Map<String, Long> map) {
        return new TreeMap<>(map);
    }

    @Override
    public Map<Long, Long> findFrequencyOfElements(int[] array) {
        Map<Long, Long> frequencyMap = new HashMap<>();
        for (int num : array) {
            frequencyMap.put((long) num, frequencyMap.getOrDefault(num, 0L) + 1);
        }
        return frequencyMap;
    }

    @Override
    public List<Long> removeAllOccurrences(List<Long> list, int element) {
        list.removeIf(n -> n == element);
        return list;
    }

    @Override
    public String findMostFrequentWord(List<String> words) {
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        return Collections.max(wordCount.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    @Override
    public Set<String> findIntersectionOfLists(List<String> list1, List<String> list2) {
        Set<String> set1 = new HashSet<>(list1);
        set1.retainAll(list2);
        return set1;
    }

    @Override
    public Set<Long> findDuplicatesInArray(int[] array) {
        Set<Long> set = new HashSet<>();
        Set<Long> duplicates = new HashSet<>();
        for (int num : array) {
            if (!set.add(Long.valueOf(num))) {
                duplicates.add(Long.valueOf(num));
            }
        }
        return duplicates;
    }

    @Override
    public Map<Integer, String> convertListToMap(List<Marks> marks) {
        return marks.stream().collect(Collectors.toMap(Marks::getMarks, Marks::getName));
    }

    @Override
    public List<String> convertLinkedListToArrayList(LinkedList<String> linkedList) {
        return new ArrayList<>(linkedList);
    }

    @Override
    public Map<String, Long> createCustomLinkedHashMap() {
        Map<String, Long> map = new LinkedHashMap<>();
        map.put("One", 1L);
        map.put("Two", 2L);
        map.put("Three", 3L);
        return map;
    }

    @Override
    public List<String> findDifferenceBetweenLists(List<String> list1, List<String> list2) {
        Set<String> set1 = new HashSet<>(list1);
        Set<String> set2 = new HashSet<>(list2);
        set1.removeAll(set2);
        return new ArrayList<>(set1);
    }

    @Override
    public LinkedList<String> reverseLinkedList(LinkedList<String> linkedList) {
        LinkedList<String> reversed = new LinkedList<>();
        for (String s : linkedList) {
            reversed.addFirst(s);
        }
        return reversed;
    }

    @Override
    public Long findHighestOccurringElement(List<Long> list) {
        Map<Long, Long> frequencyMap = new HashMap<>();
        for (Long num : list) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0L) + 1);
        }
        return Collections.max(frequencyMap.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    @Override
    public boolean checkIfMapContainsKeyValue(Map<String, Long> map, String key, int value) {
        return map.containsKey(key) && map.get(key) == value;
    }

    @Override
    public Set<Long> convertListToSet(List<Long> list) {
        return new HashSet<>(list);
    }

    @Override
    public List<Long> removeElementsGreaterThanNumber(List<Long> list, int number) {
        list.removeIf(n -> n > number);
        return list;
    }

}
