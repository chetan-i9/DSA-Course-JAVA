import java.util.Scanner;
import java.lang.Math;
class EfficientUnsortedSol{
    static void printDivisors (int num){
        for (int i=1;i<=Math.sqrt(num);i++){
            if (num%i==0)
            {
                if (num/i == i)
                    System.out.print(" "+ i);
                else {
                    System.out.print(i + " " + num / i + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter any Number : ");
            int num=sc.nextInt();
            System.out.print("Divisors of given Number in an unsorted manner:");
            printDivisors(num);
    }
}