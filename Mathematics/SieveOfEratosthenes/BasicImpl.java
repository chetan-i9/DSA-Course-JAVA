import java.util.Scanner;
import java.lang.Math;

class BasicImpl{
    static void sieve(int num){
        boolean prime[]=new boolean[num+1];
        for (int i=0;i<num;i++){
            prime[i]=true;
        }
        for (int i=2;i<=Math.sqrt(num);i++){
            if (prime[i]){
                for (int j=2*i;j<=num;j=j+i){
                    prime[j]=false;
                }
            }
        }
        for (int i=2;i<=num;i++){
            if (prime[i]){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number : ");
        int num=sc.nextInt();
        System.out.print("Prime Numbers less than or equal to the given number : ");
        sieve(num);
    }
}