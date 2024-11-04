import java.util.Scanner;
public class Part2 {
    public static void main(String[] args) {
        float num1, num2;
        String op;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number 1: ");
        num1 = sc.nextFloat();
        System.out.println("Input the number 2: ");
        num2 = sc.nextFloat();
        System.out.println("Input operator(+-*/): ");
        sc = new Scanner(System.in);
        op = sc.nextLine();
        if(op.equals("+")){
            System.out.println("The result of "+num1 + op + num2 + "="+ (num1+num2));
        }
        if(op.equals("-")){
            System.out.println("The result of "+num1 + op + num2 + "="+ (num1-num2));
        }
        if(op.equals("*")){
            System.out.println("The result of "+num1 + op + num2 + "="+ (num1*num2));
        }
        if(op.equals("/")){
            System.out.println("The result of "+num1 + op + num2 + "="+ (num1/num2));
        }
    }
}
