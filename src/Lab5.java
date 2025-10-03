// Name : Mark Li
// mli585@emory.edu / 2768161
// THIS CODE WAS MY OWN WORK , IT WAS WRITTEN WITHOUT
// CONSULTING ANY SOURCES OUTSIDE OF THOSE APPROVED BY THE INSTRUCTOR .
// Mark Li

public class Lab5 {
    public static void main(String args[]){
        StarPattern(5);
        NumberPattern(5);
        StringPattern("Computer Science");
    }
    static void StarPattern(int N){
        for(int i = 1; i<=N; i++){
            for(int j = 0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void NumberPattern(int N){
        int counterEven = 2;
        int counterOdd = 1;
        boolean det = true;
        for(int i = 1; i<=N; i++){
            for(int j = 0; j<i; j++){
                if (det){
                    System.out.print(counterOdd + " ");
                    counterOdd+=2;
                }else {
                    System.out.print(counterEven + " ");
                    counterEven+=2;

                }

            }
            System.out.println();
            det = !det;
        }

    }
    static void StringPattern(String str){
        for(int i = 0; i<str.length(); i++){
            for(int j = 0; j<i; j++){
                System.out.print(" ");
            }
            System.out.println(str.substring(i, i+1));
        }
    }

}
