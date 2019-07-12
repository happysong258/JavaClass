package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        // 2. Map계열 : Hashmap
        // key, value 쌍으로 저장
        Map<String, Integer> map = new HashMap<>();
        map.put("kor", 100);
        map.put("math", 95);
        map.put("eng", 90);
        map.put("eng", 95);
        printMap(map);

        System.out.println(map.get("kor"));
        System.out.println(map.get("sci"));

        map.remove("eng");
        printMap(map);

        map.clear();

        // Map : key(String), value(List<string>)
        Map<String, List<String>> map2 = new HashMap<>();
        List<String> list = new ArrayList<>();
        list.add("댄스곡1");
        list.add("댄스곡2");
        list.add("댄스곡3");
        map2.put("dance", list);

        // List : Map<String, String>
        List<Map<String, String>> list2 = new ArrayList<>();
        Map<String, String> map3 = new HashMap<>();
        map3.put("dance", "댄스곡");
        map3.put("ballad", "발라드곡");
        map3.put("hiphop", "힙합곡");
        list2.add(map3);
    }

    private static void printMap(Map<String, Integer> map) {
        for(String key : map.keySet()) {
            System.out.print(key + ":" + map.get(key) + " | ");
        }
        System.out.println();
    }
}
