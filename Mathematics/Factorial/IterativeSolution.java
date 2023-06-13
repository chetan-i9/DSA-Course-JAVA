import java.util.Scanner;

class IterativeSolution{
    static int factorial(int num){
        int res=1;
        for (int i=2;i<=num;i++){
            res=res*i;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        System.out.println("Factorial of the given number : " + factorial(num));
    }
}