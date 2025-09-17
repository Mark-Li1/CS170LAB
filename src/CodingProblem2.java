
// Name : Mark Li
// mli585@emory.edu / 2768161
// THIS CODE WAS MY OWN WORK , IT WAS WRITTEN WITHOUT
// CONSULTING ANY SOURCES OUTSIDE OF THOSE APPROVED BY THE INSTRUCTOR .
// Mark Li

public class CodingProblem2 {
    public static void main(String[] args){
        int intVar1 = 12, intVar2 = 10;
        float floatVar1 = 35.2f, floatVar2 = 54.94f;
        char charVar1 = 'a',charVar2 = 'b';

        System.out.println(intVar1 + " + " + intVar2 + " = " + add(intVar1,intVar2));
        System.out.println(floatVar1 + " + " + floatVar2 + " = " + add(floatVar1,floatVar2));
        System.out.println(charVar1 + " + " + charVar2 + " = " + add(charVar1,charVar2));
    }
    //Method overloading my beloved
    static int add(int a, int b){
        return a+b;
    }
    static float add(float a, float b){
        return a+b;
    }
    static char add(char a, char b){
        return (char)(a+b);
    }
}