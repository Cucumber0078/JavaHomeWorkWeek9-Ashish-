package homeworkweek9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Programme_5_Itretor {
    public void elementIterator() {

        ArrayList<String> element = new ArrayList<String>();
        element.add("Wood");
        element.add("Metal");
        element.add("Water");
        element.add("Fire");
        element.add("Air");
        element.add("Earth");
        Iterator itr=element.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    public static void main(String[] args) {
        Programme_5_Itretor obj  = new Programme_5_Itretor();
        obj.elementIterator();
    }
}

