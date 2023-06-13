import java.util.Scanner;
import java.lang.Math;

class EfficientSol{
    static boolean isPrime(int num){
        if (num==1){
            return false;
        }
        for (int i=2;i<=Math.sqrt(num);i++){
            if (num%i==0){
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