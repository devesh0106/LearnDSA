package Problems;

public class ReverseString {
    public static void main(String[] args) {
        String  str = "racecar";//AnanA
        char[] chrStr = str.toCharArray();
        int length = str.length();
        String rev="";
        for(int i=length-1;i>=0;i--){
        rev=rev+(chrStr[i]);
        }
        System.out.println("Original String is "+str +" and "+"Reversed String is "+rev);
        if(str.equals(rev)){
            System.out.println("Palindrome");
        }
        else
            System.out.println("Not a Palindrome");
    }
}
