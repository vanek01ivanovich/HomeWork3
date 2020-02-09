package main;

import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;
    private static int MIN = 0;
    private static int MAX = 100;
    private static int time = 0;
    private String input;
    private static boolean outOfGame = true;



    public Controller(Model model,View view){
        this.model = model;
        this.view = view;
    }

    public void start() {


        model.makeBorder(MIN,MAX);
        model.setMyNumber(MIN,MAX);

        Scanner scanner = new Scanner(System.in);

        while (outOfGame) {
            MIN = model.getValueFromBorder(0);
            MAX = model.getValueFromBorder(1);

            view.printBorderInput(View.INPUT_INT,MIN,MAX);
            model.setValueFromInput(checkForNumber(scanner));

            outOfGame = model.lessOrMore(model.getValueFormInput(),model.getMyNumber(),time);
        }
        view.printResult(View.WIN_GAME,model.getValueFormInput());
        model.outputArrayOfNumber();


    }

    private int checkForNumber(Scanner scanner) {
        this.input = scanner.nextLine();

        while(! (input.matches("[0-9]+") && ( MIN < Integer.parseInt(input)
                && Integer.parseInt(input) < MAX ))){
            view.printMessage(View.WRONG_INPUT);
            this.input = scanner.nextLine();
        }
        time++;
        return Integer.parseInt(input);

    }





}
