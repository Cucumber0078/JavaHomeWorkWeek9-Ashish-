package homeworkweek9;

import java.util.ArrayList;

public class Programme_7_Undergroundtube {
    public static void main(String[] args) {
        isArryEmpty();
    }
        public static void isArryEmpty() {

            ArrayList<String> underGroundTrains = new ArrayList<>();

            System.out.println("Original array list: " + underGroundTrains);
            if (underGroundTrains.isEmpty()) {
                System.out.println("ArrayList is empty");
            }
            // System.out.println("Check if the above array list is empty or not! "+underGroundTrains.isEmpty());


            underGroundTrains.add("Jubilee Line");
            underGroundTrains.add("Victoria Line");
            underGroundTrains.add("Bakerloo Line");
            underGroundTrains.add("Metropolitan Line");
            underGroundTrains.add("Over Ground");
            underGroundTrains.add("Central Line");
            underGroundTrains.add("Northern Line");
            underGroundTrains.add("Central Line");
            underGroundTrains.add("District Line");
            underGroundTrains.add("DLR Line");
            underGroundTrains.add("Elizabeth Line");

            System.out.println("\nUdated ArrayList: " + underGroundTrains);
            System.out.println("ArraList is not empty");
            //System.out.println("Check if the above array list is empty or not! "+underGroundTrains.isEmpty());

        }
    }