package homeworkweek9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class programme_6_RetrieveAnElement {
        public static void main(String[] args) {


            // Creae a list and add some colors to the list
            List<String> list_Strings = new ArrayList<String>();
            list_Strings.add("Red");
            list_Strings.add("Green");
            list_Strings.add("Orange");
            list_Strings.add("White");
            list_Strings.add("Black");

            // Print the list
            System.out.println(list_Strings);

            System.out.print("\nPlease enter index: ");
            Scanner scn = new Scanner(System.in);
            int z = scn.nextInt();
            scn.close();
            // z = z-1;
            if (z < 0 || z > 4) {

                System.out.println("Nothing to return at index " + z);

            } else {
                // Retrive the first and third element
                String element = list_Strings.get(z);
                System.out.println("Element at index " + z + " " + element);
        /*element = list_Strings.get(2);
        System.out.println("Third element: " + element);*/
            }
        }
    }