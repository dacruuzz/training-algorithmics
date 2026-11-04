package app.trainingalgorithmics.graph.breadthfirst;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BreadthFirstExample {

    public static void main(String[] args) {
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("you",    List.of("alice", "bob", "claire"));
        graph.put("bob",    List.of("anuj", "peggy"));
        graph.put("alice",  List.of("peggy"));
        graph.put("claire", List.of("thom", "jonny"));
        graph.put("anuj",   List.of());
        graph.put("peggy",  List.of());
        graph.put("thom",   List.of());
        graph.put("jonny",  List.of());

        System.out.println(new BreadthFirst().search(graph, "you")); // thom was found!
        System.out.println(new BreadthFirst().contains(graph, "you")); // true

        graph.put("claire", List.of("jonny"));
        graph.remove("thom", List.of());

        System.out.println(new BreadthFirst().search(graph, "you")); // Not found
        System.out.println(new BreadthFirst().contains(graph, "you")); // false
    }
}
