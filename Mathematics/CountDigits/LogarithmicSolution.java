import java.util.Scanner;
import java.lang.Math;

class LogarithmicSolution{
    static int countDigits(int num){
        return (int) Math.floor(Math.log10(num)+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        System.out.println("Number of Digits: "+countDigits(num));
    }
}