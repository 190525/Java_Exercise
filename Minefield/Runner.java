package Mayın;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome Minefield!!!");

        System.out.println("Please enter the dimensions you want to play with (first the number of rows, then the number of columns): ");
        int row= input.nextInt();
        int column= input.nextInt();
        MayınTarlası mayınTarlası=new MayınTarlası(row,column);
        mayınTarlası.run();
    }
}

