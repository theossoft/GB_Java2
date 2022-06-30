import javax.swing.*;
import java.util.*;

public class TelSpr {

    private Map<Integer, String> telSpr = new HashMap<>();

    public void add(String name, int telephone) {
        telSpr.put(telephone, name);
    }

    public void get(String name) {
        List<Integer> tempTelephone = new ArrayList<>();

        for (Map.Entry item: telSpr.entrySet()) {
            if(item.getValue().equals(name)) {
                tempTelephone.add((Integer)item.getKey());
            }
        }

        System.out.println(name + ": " + Arrays.toString(tempTelephone.toArray()));
    }

}
