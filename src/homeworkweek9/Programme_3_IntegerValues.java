package homeworkweek9;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Programme_3_IntegerValues {
    public static void main(String[] args) {
        int[] my_array1 = {
                1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        System.out.println("Original array;" +Arrays.toString(my_array1));
        for ( int i = 0; i < my_array1.length / 2; i++)
        {
            int temp = my_array1[i];
            my_array1[i] = my_array1[my_array1.length - i -1];
            my_array1[my_array1.length -i -1] = temp;
        }
        System.out.println( "Reverse array: "+ Arrays.toString(my_array1));
    }
}