package _08_loop;

import java.util.HashMap;
import java.util.Map;

public class JavaMapIteration {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

        for (String key : map.keySet()) {
            System.out.println(map.get(key));
        }

        for (String key : map.keySet()) {
            System.out.println(map.get(key));
        }
    }
}
