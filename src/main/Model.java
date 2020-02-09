package main;

import java.util.ArrayList;
import java.util.Arrays;

public class Model {

    private int value;
    private View view;
    private int myNumber;
    private int[] border = new int[2];
    private static ArrayList<Integer> arrayOfNumbers = new ArrayList<Integer>();

    public Model(View view) {
        this.view = view;
    }

    public int getMyNumber(){return myNumber;}

    public void setMyNumber(int min,int max){
        this.myNumber = (int) (Math.random() * (max - (min+1))) +(min+1);
    }

    public void changeBorder(int place,int numb){
        border[place] = numb;
    }

    public void makeBorder(int min,int max){
       border = new int[]{min, max};
    }

    public int getValueFromBorder(int numb){
        return border[numb];
    }

    public int getValueFormInput(){
        return value;
    }

    public void setValueFromInput(int value){
        this.value = value;
    }



    public void addInfo(int number,int time){
        arrayOfNumbers.add(number);
        View.YOUR_NUMBERS += number;
        View.YOUR_NUMBERS += ",";
        view.printMessage(View.TIMES + time);
    }

    public void outputArrayOfNumber(){
       view.printArrays(View.NUMBERS,arrayOfNumbers);
    }

    public boolean lessOrMore(int value,int guessNumb,int time){
        if (value > guessNumb){
            view.printMessage(View.LESS);
            changeBorder(1,value);
            addInfo(value,time);
            view.printMessage(View.YOUR_NUMBERS);
            return true;
        }else if (value < guessNumb){
            view.printMessage(View.MORE);
            changeBorder(0,value);
            addInfo(value,time);
            view.printMessage(View.YOUR_NUMBERS);
            return true;
        }else {
            addInfo(value,time);
            view.printMessage(View.YOUR_NUMBERS);
            return false;
        }
    }

}
