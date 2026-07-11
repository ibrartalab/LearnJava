package coreJava.binarySystem.custom;

import java.util.ArrayList;

public class DecimalToBinary {
    /**
     * This class has two properties decimalList which is used to stores all the decimal values after each division
     * of the decimal number provided as the parameter to convertToBinary method which is the first step of the process
     */
    private final ArrayList<Integer> decimalList;
    /**
     * BinaryList has containing the final binary digits or the binary representation for the input decimal provided by the user
     */
    private final ArrayList<Integer> binaryList;

    /**
     * Constructor to do the initial setup for the DecimalToBinary
     * instantiating the decimalList and binaryList to work further in this class
     */
    public DecimalToBinary(){
        this.decimalList = new ArrayList<>();
        this.binaryList = new ArrayList<>();
    }

    /**
     * this private method is useful to extract all the possible decimals after each operation(Dividing the number)
     * and those decimals to the decimalList .
     * it takes only one parameter of type int -> the decimal for which you find the binary representation
     * we make it private because its only used internally, user do not need this method to get the respective result
     */
    private int addDecimalToList(int num){
        decimalList.add(num);
        if(num == 1) return 1;
        return addDecimalToList(num/2);
    }
    /**
     * convertToBinary is the only public method that user will be using it.
     * this method will need to run the addDecimalToList method inside itself
     * other than that this method does two more thing, getting the decimals from the decimalList once again
     * but this time its adding them into the binaryList for further use.
     * also printing the final binary combination to the console/terminal for the end-user.
     */
    public ArrayList<Integer> convertToBinary(int decimal){
        /*
         this will extract the possible decimals after each operation on decimal
         and will add them into the decimalList
        */
        addDecimalToList(decimal);

        // here the binary are adding to the binaryList
        for(int i: decimalList){
            binaryList.add(i%2);
        }
        return binaryList;
    }

    /**
     * This will reverse the binaryList and will print the result in a correct sequence
     */
    public void printBinaryToConsole(ArrayList<Integer> bList){
        for(int i=bList.size()-1; i >= 0; i--){
            System.out.print(bList.get(i));
        }
    }
}
