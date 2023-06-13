import java.util.Scanner;
class NaiveSol{
    static void print_divisors(int num){
        for (int i=1;i<=num;i++){
            if (num%i==0){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number : ");
        int num=sc.nextInt();
        System.out.print("Divisors of given Number : ");
        print_divisors(num);
    }
}