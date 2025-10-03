// Name : Mark Li
// mli585@emory.edu / 2768161
// THIS CODE WAS MY OWN WORK , IT WAS WRITTEN WITHOUT
// CONSULTING ANY SOURCES OUTSIDE OF THOSE APPROVED BY THE INSTRUCTOR .
// Mark Li

public class CodingProblem3 {
    public static void main(String[] args){
        displayOddPrimes(500);
        System.out.print ( " Sum of non - prime numbers between 1 to 1000 is : " );
        System.out.println ( computeNonPrimeSum (10));
    }
    static boolean isEven(int x){
        return x%2==0;
    }
    static boolean isPrime(int x){
        if(x<=1){
            return false;
        }
        else if(x==2){
            return true;
        }
        int testTo = (int) Math.sqrt(x)+1;//Only need to check to sqrt(x) or so.
        for(int i = 2; i <= testTo; i++){
            if(x%i == 0) return false;
        }
        return true;
    }

    static void displayOddPrimes(int x){
        for(int i = 2; i<x; i++){
            if(isPrime(i) && !isEven(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    static int computeNonPrimeSum(int x){
        int res = 0;
        for(int i = 1; i<=x; i++){
            if(!isPrime(i) && isEven(i)) {
                res += i;
            }
        }
        return res;
    }
}
