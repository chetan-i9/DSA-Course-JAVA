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