package com.epam.mjc.collections.combined;

import java.util.*;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
         Set<String> strings = new HashSet<>();
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        for (String e : weekDays) {
            if (timetable.containsKey(e)) {
                for (String str : timetable.get(e)) {
                    strings.add(str);
                }
            }
        }
        return strings;
    }
}
