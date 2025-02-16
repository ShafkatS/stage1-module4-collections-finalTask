package com.epam.mjc.collections.combined;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> projectList = new ArrayList<>();

        for(Map.Entry<String, Set<String>> m : projects.entrySet()){
            if(m.getValue().contains(developer)){
                projectList.add(m.getKey());
            }
        }

        Collections.sort(projectList);
        System.out.println(projectList);
        return projectList;
    }
}
