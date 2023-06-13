import java.util.*;
class PalindromeNumber{
    static boolean isPalindrome(int num){
        int rev=0;
        int tmp=num;
        while(tmp!=0){
            int last=tmp%10;
            rev=rev*10+last;
            tmp=tmp/10;
        }
        return (rev==num);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        if (isPalindrome(num)){
            System.out.println("Palindrome.");
        }
        else{
            System.out.println("Not Palindrome.");
        }
    }
}