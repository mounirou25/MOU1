import java.util.concurrent.Callable;
import java.util.function.DoubleToIntFunction;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        System.out.println("Enter number (1 TO 9)");
Scanner input = new Scanner(System.in);
int player = input.nextInt();

        char[][] gameboat = {{' ', '|', ' ', '|', ' '},
                {'+', '-', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'+', '-', '+', '-', '+'},
                {' ', '|', ' ', '|', ' '}};

        switch (player) {
            case 1:
                gameboat[0][1] = 'X';
                break;
            case 2:
                gameboat[0][2] = 'X';
                break;
            case 3:
                gameboat[0][4] = 'X';
                break;
            case 4:
                gameboat[2][0] = 'X';
                break;
            case 5:
                gameboat[2][2] = 'X';
                break;
            case 6:
                gameboat[2][4] = 'X';
                break;
            case 7:
                gameboat[4][0] = 'X';
                break;
            case 8:
                gameboat[4][2] = 'X';
                break;
            case 9:
                gameboat[4][4] = 'X';
                break;
        }

        printGameBaot(gameboat);


            }


    public static void printGameBaot (char [][] gameboat){
        for (char[] row : gameboat) {
            for (char c : row)
                System.out.print(c);
            System.out.println();
        }
    }}













