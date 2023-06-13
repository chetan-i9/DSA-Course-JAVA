import java.util.Scanner;
import java.lang.Math;

class MoreEfficientSol{
    static boolean isPrime(int num){
        if (num==1){
            return false;
        }
        if (num==2 || num==3){
            return true;
        }
        if (num%2==0 || num%3==0){
            return false;
        }
        for (int i=5;i<=Math.sqrt(num);i=i+6){
            if (num%i==0 || num%(i+2)==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number : ");
        int num=sc.nextInt();
        if (isPrime(num)){
            System.out.println("Prime Number.");
        }
        else{
            System.out.println("Not a Prime Number.");
        }
    }
}