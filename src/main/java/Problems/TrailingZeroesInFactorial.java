package Problems;

public class TrailingZeroesInFactorial {
    public static int fact(int n){
    if(n==0){
        return 1;
    }
    else
        return n*fact(n-1);
    }
    public static double trailNumber(int n){
        Double trail=1.0;
       for(int i=1;i<=n;i++){
         trail=((Math.floor(n/Math.pow(5,i))));
       }
        System.out.println(trail);
        return 1;
    }
    public static void main(String[] args) {
        int number=12; //30 has 7 zeroes
        trailNumber(number);
       int Factorial= fact(number);
        System.out.println(Factorial);
    }
}
