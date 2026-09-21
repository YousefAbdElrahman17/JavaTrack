import java.util.Scanner;

public class Day1Main{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter Number1: ");
        int A = Integer.parseInt(in.nextLine());
        System.out.print("Enter Number2: ");
        int B = Integer.parseInt(in.nextLine());

        System.out.println(A + " + " + B +" = "+ (A+B));
        System.out.println(A + " - " + B +" = "+ (A-B));
        System.out.println(A + " * " + B +" = "+ (A*B));
        System.out.println(B!=0? A + " / " + B +" = " +(A/B):"Invalid");
        System.out.println(A + " % " + B +" = "+ (A%B));

    }
}