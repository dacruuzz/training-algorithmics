package app.trainingalgorithmics.graph.breadthfirst;

import app.trainingalgorithmics.graph.Graph;

import java.util.*;

public class BreadthFirst implements Graph {

    private final ArrayDeque<String> queue = new ArrayDeque<>();
    Set<String> verified = new HashSet<>();

    @Override
    public String search(Map<String, List<String>> map, String start) {
        queue.addAll(map.getOrDefault(start, List.of()));

        while (!queue.isEmpty()) {
            String current = queue.removeFirst();

            if (verified.contains(current)) continue;

            if (match(current)) return current + " was found!";

            verified.add(current);
            queue.addAll(map.getOrDefault(current, List.of()));
        }

        return "Not found";
    }

    private static boolean match(String s) {
        if (s.isBlank()) throw new RuntimeException("String param is blank");
        return Character.toUpperCase(s.charAt(s.length() - 1)) == 'M';
    }
}
