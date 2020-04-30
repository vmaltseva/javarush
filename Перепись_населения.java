package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

/* 
Перепись населения
Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.

Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String,
String состоящих из 10 записей по принципу «Фамилия» - «Имя».
4. Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
5. Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Имя1", "Фамилия1");
        map.put("Имя2", "Фамилия2");
        map.put("Имя3", "Фамилия3");
        map.put("Имя4", "Фамилия4");
        map.put("Имя5", "Фамилия5");
        map.put("Имя6", "Фамилия6");
        map.put("Имя7", "Фамилия1");
        map.put("Имя8", "Фамилия7");
        map.put("Имя9", "Фамилия8");
        map.put("Имя10", "Фамилия9");

        return map;

    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //value
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int count = 0;
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            String value = pair.getValue(); // получила значения
            if (value.equals(name)) {
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //key
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int count = 0;
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            String Key = pair.getKey();
            if (Key.equals(lastName)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        //System.out.println(getCountTheSameFirstName(createMap(), "Фамилия1"));
        //System.out.println(getCountTheSameLastName(createMap(), "Имя2"));
        //System.out.println(createMap());
    }
}
