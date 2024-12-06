package arraylesson;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row, col , option;
        int floorNum, roomNum;
        System.out.println("Enter the number of floor: ");
        row = input.nextInt();
        System.out.println("Enter the number of rooms: ");
        col = input.nextInt();
        String[][]   condo= new String[row][col];
        do {
            System.out.println("1. Buy condo ");
            System.out.println("2. Sell condo ");
            System.out.println("3. Show condo information ");
            System.out.println("4. Exit");

            System.out.println("Choose option (1-4): ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.println("--------- Buy Condo--------- ");
                    System.out.println("Enter the floor number(1-"+row+")");
                    floorNum = input.nextInt();
                    System.out.println("Enter the room number( 1-"+col+")");
                    roomNum = input.nextInt();
                    System.out.println("Enter your name to buy the condo : ");
                    input.nextLine();
                    String name = input.nextLine();
                    condo[floorNum-1][roomNum-1] = name;
                    break;

                case 2 :
                    System.out.println("---------Sell Condo--------- ");
                    System.out.println("Enter the floor number(1-"+row+")");
                    floorNum = input.nextInt();
                    System.out.println("Enter the room number( 1-"+col+")");
                    roomNum = input.nextInt();
                    System.out.println("Enter your name to buy the condo : ");
                    input.nextLine();
                    condo[floorNum-1][roomNum-1] = null;
                    break;
                case 3:
                    System.out.println("-------Show the condo information-------");
                    for(int i =0; i < row; i++){
                        for(int j =0; j < col; j++){
                            System.out.print(condo[i][j]+" ");
                        }
                        System.out.println();
                    }

                    break;

                case 4 :
                    System.out.println("Exit the program!!! ");
                    break;
            }
        }while(option!=4);
    }
}
