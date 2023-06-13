import java.util.Scanner;
import java.lang.Math;

class MoreEfficientSol{
    static void primeFactors(int num){
        if (num<=1){
            return;
        }
        while (num%2==0){
            System.out.print(2 +" ");
            num=num/2;
        }
        while (num%3==0){
            System.out.print(3 +" ");
            num=num/3;
        }
        for (int i=5;i<=Math.sqrt(num);i=i+6){
            while(num%i==0){
                System.out.print(i+" ");
                num=num/i;
            }
            while(num%(i+2)==0){
                System.out.print((i+2)+" ");
                num=num/(i+2);
            }
        }
        if (num>3){
            System.out.print(num);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number : ");
        int num=sc.nextInt();
        System.out.print("Prime Factors: ");
        primeFactors(num);
    }
}