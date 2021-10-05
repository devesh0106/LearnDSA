package Problems;

public class FactorialUsingLoop {
    public static void main(String[] args) {
        //Factorial of 5!=5*4*3*2*1
        int n= 5,fact=1;
        for(int i=n;i>=1;i--)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of a Number is = "+fact);
    }
}
