package Calculator;

import java.util.Scanner;

public class B_Main {
    int x;
    int y;
    char z;

    public static void main(String[] args) {
        B_Main main = new B_Main();
        A_Calculator calculator = new A_Calculator();
        Scanner scn = new Scanner(System.in);
        String answer;
        boolean yn;

        System.out.print("Please enter first number              : ");
        main.x = scn.nextInt();
        System.out.print("Please enter second number             : ");
        main.y = scn.nextInt();
        System.out.print("Please enter one of symbol +,-,*, /    : ");
        main.z = scn.next().charAt(0);
        calculator.calculateResult(main.x, main.y, main.z);
        System.out.print("do you want to continue (y/n)          : ");

        while (true) {
            answer = scn.nextLine().trim().toLowerCase();
            if (answer.equals("n")) {
                yn = true;
                break;
            } else if (answer.equals("y")) {
                //yn = false;
                System.out.print("Please enter first number              : ");
                main.x = scn.nextInt();
                System.out.print("Please enter second number             : ");
                main.y = scn.nextInt();
                System.out.print("Please enter one of symbol +,-,*, /    : ");
                main.z = scn.next().charAt(0);
                calculator.calculateResult(main.x, main.y, main.z);
                System.out.print("\ndo you wnat to continue (y/n)          : ");

            }
        }
        scn.close();
    }

}


    

