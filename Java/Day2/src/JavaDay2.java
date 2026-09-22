import java.util.Scanner;

public class JavaDay2 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        // region 1.Factorial of number
        System.out.println("---------------- Factorial Program (1) -----------------\n--");
        System.out.print("Enter a number: ");
        int num = Integer.parseInt(in.nextLine());
        int factorial = 1;
        if(num>=0)
        {
            for(int i=1; i<=num; i++) factorial *=i;
            System.out.println("Factorial for "+num+" : "+ factorial);
        }
        else System.out.println("Invalid");
        //end region

        System.out.println("--\n");

        // region 2.is Number exist in an array
        System.out.println("---------------- Find Number in an Array Program (2) -----------------\n--");
        System.out.print("Enter Array length: ");
        int len = Integer.parseInt(in.nextLine());
        int[] arr = new int[len];
        for(int j=0; j<arr.length; j++)
        {
            System.out.print("Enter Element ("+ (j+1) +") : ");
            arr[j] = Integer.parseInt(in.nextLine());
        }
        System.out.print("Enter number u want to search for: ");
        int x = Integer.parseInt(in.nextLine());
        int location = -1;
        for(int k=0; k<arr.length; k++)
            if(x==arr[k]) location = k;
        System.out.println(location);
        //end region

        System.out.println("--\n");

        // region 3.Second (min&max) in an Array
        System.out.println("---------------- Second (min&max) in an Array Program (3) -----------------\n--");
        System.out.print("Enter Array length: ");
        int len0 = Integer.parseInt(in.nextLine());
        int[] arr0 = new int[len0];
        for(int a = 0; a <arr0.length; a++)
        {
            System.out.print("Enter Element ("+ (a +1) +") : ");
            arr0[a] = Integer.parseInt(in.nextLine());
        }
        int min0 = Integer.MAX_VALUE;
        int max0 = Integer.MIN_VALUE;
        int secondMin = min0;
        int secondMax = max0;
        for(int a=0; a<arr0.length; a++)
        {
            if(max0<=arr0[a])
            {
                secondMax = max0;
                max0 = arr0[a];
            }
            else if (secondMax<arr0[a] && arr0[a]!=max0)
            {
                secondMax = arr0[a];
            }
        }
        for(int a=0; a<arr0.length; a++)
        {
            if(min0>=arr0[a])
            {
                secondMin = min0;
                min0 = arr0[a];
            }
            else if (secondMin>arr0[a] && arr0[a]!=min0)
            {
                secondMin = arr0[a];
            }
        }
        System.out.println("Second Max number in the array: "+secondMax);
        System.out.println("Second Min number in the array: "+secondMin);
        //end region

        System.out.println("--\n");

        // region 4.min&max in an Array
        System.out.println("---------------- min&max in an Array Program (4) -----------------\n--");
        System.out.print("Enter Array length: ");
        int len1 = Integer.parseInt(in.nextLine());
        int[] arr1 = new int[len1];
        for(int b = 0; b <arr1.length; b++)
        {
            System.out.print("Enter Element ("+ (b +1) +") : ");
            arr1[b] = Integer.parseInt(in.nextLine());
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int b=0; b<arr1.length; b++)
        {
            if(max<=arr1[b]) max = arr1[b];
        }
        for(int b=0; b<arr1.length; b++)
        {
            if(min>=arr1[b]) min = arr1[b];
        }
        System.out.println("Max number in the array: "+max);
        System.out.println("Min number in the array: "+min);
        //end region
    }
}