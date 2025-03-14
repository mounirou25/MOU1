import javax.swing.*;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.function.DoubleToIntFunction;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        char[][] gameboat = {{' ', '|', ' ', '|', ' '},
                {'+', '-', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'+', '-', '+', '-', '+'},
                {' ', '|', ' ', '|', ' '}};
        System.out.println("Enter number (1 TO 9)");
        Scanner input = new Scanner(System.in);
        int player = input.nextInt();

        System.out.println(player);

        plan(gameboat , player,"player");
//for cpu to play its position
        Random rand = new Random();
        int  Cpumou = rand.nextInt(9)+ 1;
        plan(gameboat,Cpumou,"Cpu");

   printGameBaot(gameboat);



    }
            //
    public static void printGameBaot (char [][] gameboat){
        for (char[] row : gameboat) {
            for (char c : row)
                System.out.print(c);
            System.out.println();
        }
    } public static void plan( char [][]gameBoat , int mou, String User  ){
        char Symbol = ' ';
        if (User.equals("player")){
         Symbol= 'X';
        } else if (User.equals("Cpu")) {
            Symbol= 'O';
        }
        switch (mou) {
            case 1:
                gameBoat[0][1] = Symbol;
                break;
            case 2:
                gameBoat[0][2] = Symbol;
                break;
            case 3:
                gameBoat[0][4] = Symbol;
                break;
            case 4:
                gameBoat[2][0] = Symbol;
                break;
            case 5:
                gameBoat[2][2] = Symbol;
                break;
            case 6:
                gameBoat[2][4] = Symbol;
                break;
            case 7:
                gameBoat[4][0] = Symbol;
                break;
            case 8:
                gameBoat[4][2] = Symbol;
                break;
            case 9:
                gameBoat[4][4] = Symbol;
                break;
        }


    }

}













