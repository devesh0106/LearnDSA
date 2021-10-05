package Problems;
/*
* 3 Steps for Recursion
*
* 1. Find the Base Case
* 2. Find the relation between the problem and subproblems
* 3. Generalise the relation
* */
public class Recursion {
     static void rec(){
        System.out.println("Hello");
        rec();
    }
    public static void main(String[] args) {
    rec();
    }
}
