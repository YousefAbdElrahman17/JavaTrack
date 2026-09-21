import java.util.Scanner;

public class JavaDay1 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        //region 1. Mini-Calculator
        System.out.print("Enter Number1: ");
        int A = Integer.parseInt(in.nextLine());
        System.out.print("Enter Number2: ");
        int B = Integer.parseInt(in.nextLine());

        System.out.println(A + " + " + B +" = "+ (A+B));
        System.out.println(A + " - " + B +" = "+ (A-B));
        System.out.println(A + " * " + B +" = "+ (A*B));
        System.out.println(B!=0? A + " / " + B +" = " +(A/B):"Invalid");
        System.out.println(A + " % " + B +" = "+ (A%B));
        // endregion

        System.out.println("--\n-----------------------------\n--");

        //region 2. Last-Digit
        System.out.print("Enter a number: ");
        int num = Integer.parseInt(in.nextLine());
        System.out.println(num%2==0? 1:6);
        // endregion

    }
}