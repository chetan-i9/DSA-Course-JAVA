import java.util.Scanner;

class NaiveSol{
    static boolean isPrime(int num){
        for (int i=2;i<num;i++){
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void primeFactors(int num){
        for(int i=2;i<num;i++){
            if (isPrime(i)){
                int x=i;
                while (num%x==0){
                    System.out.print(i+" ");
                    x=x*i;
                }
            }
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