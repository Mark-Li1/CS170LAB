
// Name : Mark Li
// mli585@emory.edu / 2768161
// THIS CODE WAS MY OWN WORK , IT WAS WRITTEN WITHOUT
// CONSULTING ANY SOURCES OUTSIDE OF THOSE APPROVED BY THE INSTRUCTOR .
// Mark Li

public class Lab3 {
    public static void main(String args[]) {
        int itemID1 = 1, itemID2 = 2, itemID3 = 3, itemID4 = 4, itemID5 = 5; //Initialize item ids
        double price1 = 2.5, price2 = 6.4, price3 = 84.25, price4 = 6.5, price5 = 0.54;//Initialize prices for each item

        displayItem(itemID1,price1);
        displayItem(itemID2,price2);
        displayItem(itemID3,price3);
        displayItem(itemID4,price4);
        displayItem(itemID5,price5);

        System.out.println("Tax Rate :: 7.5%");
        System.out.println("Total Cost :: " + computeTotal(price1,price2,price3,price4,price5));
    }

    static void displayItem(int itemNumber, double itemPrice) {
        System.out.println(itemNumber + " :: " + itemPrice);
    }
    static double computeTotal(double itemPrice1, double itemPrice2, double itemPrice3, double itemPrice4, double itemPrice5){
        double taxRate = 0.075;
        return (itemPrice1 + itemPrice2 + itemPrice3 + itemPrice4 + itemPrice5)*(1+taxRate);
    }
}