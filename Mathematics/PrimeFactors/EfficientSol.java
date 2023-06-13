import java.util.Scanner;
import java.lang.Math;

class EfficientSol{
    static void primeFactors(int num){
        if (num<=1){
            return;
        }
        for (int i=2;i<=Math.sqrt(num);i++){
            while (num%i==0){
                System.out.print(i+" ");
                num=num/i;
            }
        }
        if (num>1){
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