import java.util.Scanner;
class RecursiveSolution{
    static int countDigits(int num){
        if (num==0){
            return 0;
        }
        return 1+countDigits(num/10);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        System.out.println("Number of Digits: "+countDigits(num));
    }
}