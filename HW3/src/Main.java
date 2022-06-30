

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//       Задание 1
        String[] str = {"ананас", "нектарин", "слива", "черешня", "дыня", "ананас", "черешня", "арбуз", "ананас", "манго", "слива", "ананас", "клубника", "малина", "вишня", "ананас", "груша", "слива", "апельсин", "груша", "яблоко", "дыня", "грейпфрут", "нектарин"};
        Map<String, Integer> hashmap = new HashMap<String, Integer>();
        for (int i = 0; i < str.length; i++) {
            hashmap.put(str[i], 0);
        }

        for (int i = 0; i < str.length; i++) {
            for (Map.Entry item: hashmap.entrySet()) {
                if(item.getKey().equals(str[i])) {
                    hashmap.put(str[i], ((int)item.getValue()) + 1);
                }
            }
        }


        for (Map.Entry map: hashmap.entrySet()) {
            System.out.println(map.getKey() + ":" + " " +  map.getValue() + " шт.");
//            System.out.println(map);
        }

//        Задание 2
        TelSpr telSpr = new TelSpr();
        telSpr.add("Иван", 899944433);
        telSpr.add("Петр", 8999233);
        telSpr.add("Иван", 8999433);
        telSpr.add("Иван", 911);
        telSpr.get("Иван");
        telSpr.get("Петр");
    }
}
