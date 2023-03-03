package Mayın;

import java.util.Random;
import java.util.Scanner;

public class Minefield {
    int rowNumber;
    int columnNumber;
    int size;
    int [][]map;
    int [][] board;
    boolean game=true;
    boolean isCheckGameOver=false;
    Random random=new Random();
    Scanner input=new Scanner(System.in);
    public Minefield(int rowNumber, int columnNumber){
        this.rowNumber=rowNumber;
        this.columnNumber=columnNumber;
        this.map=new int[rowNumber][columnNumber];
        this.board=new int[rowNumber][columnNumber];
        this.size=rowNumber*columnNumber;
    }
    public void run(){
        prepeareGame();
        System.out.println("Game starts!!!");
        int row=0;
        int col=0;
        boolean checkInputValidation=false;
        while (game&&!isCheckGameOver){

            print(board);
            do {
                try {
                    System.out.println("row:");
                    row = input.nextInt();
                    System.out.println("col:");
                    col = input.nextInt();
                    checkInputValidation=false;
                    if ((row < 0 || row >= rowNumber)) {
                        throw new ArrayIndexOutOfBoundsException("Wrong row number.Try again!!!");
                    }
                    if ((col < 0 || col >= columnNumber)) {
                        throw new ArrayIndexOutOfBoundsException("Wrong column number.Try again!!!");


                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    checkInputValidation=true;
                    System.out.println(e);
                }
            }while (checkInputValidation);
            if(map[row][col]!=-1){
                check(row,col);

            }else {
                System.out.println("Game over!!!");
                game = false;
            }
            isCheckGameOver=checkGameOver();
        }
    }

    public boolean checkGameOver() {
        for(int i=0;i<rowNumber;i++){
            for (int j=0;j<columnNumber;j++){
                if(map[i][j]==0){
                    return false;
                }
            }
        }
        System.out.println("Congratulations!!!");
        printFirstMap(map);
        return true;
    }

    public void check(int row, int col) {
        if(map[row][col]==0) {
            if ((col < columnNumber - 1) && (map[row][col + 1] == 0)&&(board[row][col + 1] == 0)) {
                board[row][col+1]++;
                map[row][col+1]++;

            }
            if ((row < rowNumber - 1) &&(map[row + 1][col] == 0)&&(board[row+1][col] == 0)) {
                board[row+1][col]++;
                map[row+1][col]++;
            }
            if ((row > 0) && (map[row - 1][col] == 0)&&(board[row-1][col] == 0)) {
                board[row -1][col]++;
                map[row -1][col]++;
            }
            if ((col > 0) && (map[row][col - 1] == 0)&&(board[row][col - 1] == 0)){
                board[row][col-1]++;
                map[row][col-1]++;
            }
            board[row][col]++;
            map[row][col]++;
        }

    }

    public void prepeareGame(){
        int count=0;
        int randRow;
        int randCol;
        while(count!=(size/4)){
            randRow=random.nextInt(rowNumber);
            randCol=random.nextInt(columnNumber);
            if(map[randRow][randCol]!=-1){
                map[randRow][randCol]=-1;
                count++;
            }

        }
    }
    public void print(int [][] arr){
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.printf("%3d",arr[i][j]);
            }
            System.out.println();
        }
    }
    public void printFirstMap(int [][] arr){
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.printf("%3d",arr[i][j]);
            }
            System.out.println();
        }
    }
}

