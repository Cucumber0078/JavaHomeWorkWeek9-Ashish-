package homeworkweek9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Programme_8HashSet {
    public void integerObjects() {
        HashSet<Integer> num = new HashSet();
        num.add(4);
        num.add(7);
        num.add(8);
        for(int i = 1; i <= 10; i++) {
            if(num.contains(i)) {
                System.out.println(i + " found in the set.");
            } else {
                System.out.println(i + " not found in the set.");
            }
        }
    }
    public static void main (String[]args){
        Programme_8HashSet obj = new Programme_8HashSet();
        obj.integerObjects();
    }




    }

