package main;

import java.util.ArrayList;
import java.util.Arrays;

public class View {

    public static final String INPUT_INT = "Input value from ";

    public static final String WRONG_INPUT = "Wrong input! Try again : ";
    public static String YOUR_NUMBERS = "Your numbers are: ";
    public static String NUMBERS = "Your numbers are: ";
    public static String WIN_GAME = "You won the GAME! Your number is:  ";
    public static String TIMES = "Times: ";
    public static final String LESS = "Less! Try again: ";
    public static final String MORE = "More! Try again: ";


    public void printMessage(String message){
        System.out.println(message);
    }
    public void printArrays(String message,ArrayList<Integer> arrayOfNumbers){
        System.out.println(message +  Arrays.toString(arrayOfNumbers.toArray()));
    }

    public void printBorderInput(String input,int min,int max){
        System.out.println(input + "]" + min + " to " + max + "[ :");
    }


    public void printResult(String message,int number){
        System.out.println(message + number);
    }


}
