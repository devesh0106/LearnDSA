package Problems;

public class FactorialUsingRecursion {

    public static int factRec(int n){
        if(n==0){
            return 1;
        }
        else
            return(n*factRec(n-1));
    }
    public static void main(String[] args) {
        int fact=1,i,number=12;
        fact=factRec(number);
        System.out.println("Factorial of "+ number + " is " + fact);
    }
}
