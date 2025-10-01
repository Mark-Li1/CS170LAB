// Name : Mark Li
// mli585@emory.edu / 2768161
// THIS CODE WAS MY OWN WORK , IT WAS WRITTEN WITHOUT
// CONSULTING ANY SOURCES OUTSIDE OF THOSE APPROVED BY THE INSTRUCTOR .
// Mark Li

public class Lab4 {
    public static void main(String args[]){
        for(int i = 0; i<10; i++){
            int number = (int)(Math.random()*10000);
            System.out.println("System generated the random number::" + number);

            if (number%2 == 0) {
                evenSum(number);
            }
            else {
                oddSum(number);
            }
            System.out.println();
        }
    }
    static void oddSum(int num){
        System.out.println(num + " is an odd number !");
        if (num == 0){//Technically shouldn't happen but ok
            System.out.println("Count of digits of 0 is 1");
            return;
        }
        int res = 0;
        for (int i = 1;i<=num;i*=10){
            res++;
        }
        System.out.println("Count of digits of " + num + " is " + res);
    }
    static void evenSum(int num){
        System.out.println(num + " is an even number !");
        int res = 0;
        for (int i = 1;i<=num;i*=10){
            res+=num%(i*10)/i;
        }
        System.out.println("Sum of digits of " + num + " is = " + res);
    }
}
