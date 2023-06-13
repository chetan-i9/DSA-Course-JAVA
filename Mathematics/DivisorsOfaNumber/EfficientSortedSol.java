import java.util.Scanner;
import java.lang.Math;

class EfficientSortedSol{
    static void printDivisors(int num){
        int i;
        for (i=1;i<=Math.sqrt(num);i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
            for(;i>=1;i--){
                if (num%i==0){
                    System.out.print((num/i) + " ");
                }
            }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number : ");
        int num=sc.nextInt();
        System.out.print("Divisors of given Number in sorted manner:");
        printDivisors(num);
    }
}