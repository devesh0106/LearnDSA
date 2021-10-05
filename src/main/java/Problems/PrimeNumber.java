package Problems;

public class PrimeNumber {
    public static void primeNumbers(int n){
        int i=0,flag=0;
       double m=Math.sqrt(n); //n/2;
        if(n==0 ||n==1)
        {
            System.out.println(n+" is not a Prime Numbers");
        }
        else
        {
            for(i=2;i<=m;i++){
                if(n%i==0)
                {
                    System.out.println(n+" is not a Prime Number");
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(n+" is a Prime Number");
            }
        }
    }
    public static void main(String[] args) {
        primeNumbers(5);
        primeNumbers(10);
        primeNumbers(7);
        primeNumbers(1);
        primeNumbers(31);
    }

}
