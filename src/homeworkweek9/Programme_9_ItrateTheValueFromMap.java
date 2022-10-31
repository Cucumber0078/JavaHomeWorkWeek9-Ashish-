package homeworkweek9;

import java.util.*;

public class Programme_9_ItrateTheValueFromMap {
    public static void main(String[] args) {
        Programme_9_ItrateTheValueFromMap obj = new Programme_9_ItrateTheValueFromMap();
        obj.person();
    }

    public void person() {
        Map<Integer, String> customers = new HashMap<>();
        customers.put(1, "Jhon");
        customers.put(2, "Smith");
        customers.put(3, "Sally");

        Iterator<Map.Entry<Integer, String>> iterator = customers.entrySet().iterator();
        while (iterator.hasNext()) { Map.Entry entry = iterator.next();
            System.out.println("Key : " + entry.getKey() + " value : " + entry.getValue());
        }
//{
    }
            


            }








