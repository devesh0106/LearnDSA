package Problems;

public class Palindrome {
    public static void palindrome(int n){
        int sum=0,rem,temp=n;
        int length = String.valueOf(n).length();
        for(int i=1;i<=length;i++)
        {
            rem=n%10; //remainder
            sum=(sum*10)+rem; //reverse
            n=n/10;
        }
        System.out.println("Original Number is "+temp+" and "+"Reversed Number is "+sum);
        if(temp==sum){
            System.out.println("Palindrome");
        }
        else
            System.out.println("Not a palindrome");
    }
    public static void main(String[] args) {
        int number=454;
        Palindrome.palindrome(number);
    }
}
