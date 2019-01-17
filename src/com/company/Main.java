package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        String promptAtStartup = "Would you like to: ";
        String optionOne = "1 - Check Account Balance";
        String optionTwo = "2 - Withdraw Funds";
        String optionThree = "3 - Deposit Funds";
        String lineBreak = "\n";
        boolean likeToContinue = true;

        do{
            System.out.println(promptAtStartup + lineBreak + optionOne + lineBreak + optionTwo + lineBreak + optionThree);
            int userIntegerInputAtStart= userInput.nextInt();

                if(userIntegerInputAtStart == 1){

                } else if (userIntegerInputAtStart == 2){

                } else if (userIntegerInputAtStart == 3){

                }


        }while(likeToContinue);


    }
}
