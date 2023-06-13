import java.util.Scanner;

class RecursiveSolution{
    static int factorial(int num){
        if (num==0){
            return 1;
        }
        return num*factorial(num-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        System.out.println("Factorial of the given number : " + factorial(num));
    }
}