import java.util.Scanner;
class NaiveSol{
    static int countzeroes(int num){
        int fact=1;
        for (int i=2;i<=num;i++){
            fact=fact*i;
        }
        int res=0;
        while(fact%10==0){
            res++;
            fact=fact/10;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        System.out.println("Number of Trailing Zeroes in factorial of a given Number " + countzeroes(num));
    }
}