// Name : Mark Li
// mli585@emory.edu / 2768161
// THIS CODE WAS MY OWN WORK , IT WAS WRITTEN WITHOUT
// CONSULTING ANY SOURCES OUTSIDE OF THOSE APPROVED BY THE INSTRUCTOR .
// Mark Li
//
public class Lab2 {
    public static void main(String[] args){
        //Declare relevant variables -- Task 3
        float subject1;
        float subject2;
        float subject3;


        //Initialize relevant variables
        float averageScore = 0f; //Task 4
        int roundedAverageScore = 0; //Task 5

        //Task 6
        subject1 = 95.7f;
        subject2 = 65.7f;
        subject3 = 85.7f;

        averageScore = (subject1+subject2+subject3)/3f; //Task 7

        roundedAverageScore = (int) averageScore; //Task 8

        //Task 9-11
        System.out.println("Student score in subject 1 = " + subject1 + "\nStudent score in subject 2 = " + subject2 + "\nStudent score in subject 3 = " + subject3 + "\nAverage score = " +  averageScore + "\nRounded average score = " + roundedAverageScore);
    }
}