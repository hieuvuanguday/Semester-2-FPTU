package asm;

import java.util.*;

public class CJ_ASM_Ngay_2 {
    public static void main(String[] args) {
        //Lab2
//        int pack, distance;
//        int shift, feedback;
//        int call, electric;
//        int other;
//        double salary;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter package number: ");
//        pack = sc.nextInt();
//        System.out.println("Enter distance number: ");
//        distance = sc.nextInt();
//        System.out.println("Enter shift night number: ");
//        shift = sc.nextInt();
//        System.out.println("Enter feedback number: ");
//        feedback = sc.nextInt();
//        System.out.println("Enter the call number: ");
//        call = sc.nextInt();
//        System.out.println("Enter electricity number: ");
//        electric = sc.nextInt();
//        System.out.println("Enter the other number: ");
//        other = sc.nextInt();
//        salary = pack * 50 + distance * 75 + shift * 50 * 0.1 + feedback + call + electric + other;
//        System.out.println("The salary is "+ salary);
        
        //Lab4
        int choice, firstNumber, secondNumber;
        double result = 0;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Welcome to Jave program ");
        System.out.print("Enter the first number: ");
        
        firstNumber = Integer.parseInt(sc1.nextLine());
        System.out.println("Enter the second number: ");
        secondNumber = Integer.parseInt(sc1.nextLine());
        do {            
            System.out.println("Select operation: ");
            System.out.println("1. Add");
            System.out.println("2. Sub");
            System.out.println("3. Mul");
            System.out.println("4. Div");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(sc1.nextLine());
            switch(choice){
                case 1:
                    result = firstNumber + secondNumber;
                    System.out.format("%d + %d = %.2f\n", firstNumber, secondNumber, result);
                    break;
                case 2:
                    result = firstNumber - secondNumber;
                    System.out.format("%d - %d = %.2f\n", firstNumber, secondNumber, result);
                    break;
                case 3:
                    result = firstNumber * secondNumber;
                    System.out.format("%d * %d = %.2f\n", firstNumber, secondNumber, result);
                    break;
                case 4:
                    result = 1.0*firstNumber / secondNumber;
                    System.out.format("%d / %d = %.2f\n", firstNumber, secondNumber, result);
                    break;
                default:
                    System.out.println("Thank you . Good bye. ");
                    System.exit(0);
            }
        } while (true);
    }
}
