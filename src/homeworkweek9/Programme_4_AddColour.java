package homeworkweek9;

import java.util.ArrayList;

public class Programme_4_AddColour {
    public static void main(String[] args) {
        ArrayList obj = new ArrayList();
      // obj.getColours();
    }

    public void getcolours() {
        ArrayList<String> colours = new ArrayList<String>();
        colours.add("White");
        colours.add("Yellow");
        colours.add("Blue");
        colours.add("Black");
        colours.add("Purple");

        for (String col:colours) {
            System.out.println(col);
        }
    }
}