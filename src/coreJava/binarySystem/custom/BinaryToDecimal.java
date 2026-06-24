package coreJava.binarySystem.custom;

import java.util.ArrayList;

public class BinaryToDecimal {
    // these are the required fields for the class to make the conversion happened from
    // a binary representation number into an actual decimal
    private final ArrayList<Integer> binaryElementList;
    private final ArrayList<Integer> multipliedElementsList;
    private int resultDecimalNumber;

    // as usual a constructor to do the initial stuff
    // this will instantiate all the objects and primitives with initial values
    public BinaryToDecimal(){
        this.multipliedElementsList = new ArrayList<>();
        this.binaryElementList = new ArrayList<>();
        this.resultDecimalNumber = 0;
    }

    // this method helps to extract digits from the binary representational number
    // add them into the binaryElementList array list.
    private void setDigitToBinaryElementList(int c){
        while(c > 0){
            int digit = c%10;
            c /=10;
            binaryElementList.add(digit);
        }
    }

    // this method as same as the above one setToBinaryElementList , but it did some extra and important stuff
    // iterating over the binaryElementList each element calculating the power and multiply it
    // 2^currentIndex * currentValue -- which is equal to binaryElementList(i).
    private void setValuesToMultipliedElementList(){
        for(int i=0; i < binaryElementList.size(); i++){
            multipliedElementsList.add(Math.powExact(2,i) * binaryElementList.get(i));
        }
    }

    // a simple one to get each number/element from the multipliedElementList and SUM it.
    // the resulted value stored into the resultedDecimalNumber field.
    private void sumArrayElements(){
        for (Integer integer : multipliedElementsList) {
            this.resultDecimalNumber += integer;
        }
    }

    // the only public method that the end user will need to call and convert binary back into a decimal.
    // calling all the required private methods and printing the resulted value.
    public void convertToDecimal(int binary){
        setDigitToBinaryElementList(binary);
        setValuesToMultipliedElementList();
        sumArrayElements();
        // This is the final resulted decimal value
        System.out.println("Your actual number is: " + resultDecimalNumber);
    }
}
