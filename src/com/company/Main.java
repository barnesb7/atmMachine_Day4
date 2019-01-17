package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        String promptAtStartup = "What would you like to do?";
        String optionOne = "1 - Check Account Balance";
        String optionTwo = "2 - Withdraw Funds";
        String optionThree = "3 - Deposit Funds";
        String lineBreak = "\n";
        double accountBalance = 100.50;
        boolean likeToContinue = true;

        do{
            System.out.println(promptAtStartup + lineBreak + optionOne + lineBreak + optionTwo + lineBreak + optionThree);
            int userIntegerInputAtStart= userInput.nextInt();

                if(userIntegerInputAtStart == 1){
                        System.out.println("Your current balance is: " + accountBalance);
                } else if (userIntegerInputAtStart == 2){
                        System.out.println("Please enter withdraw amount in multiples of 10");

                         int amountToWithdraw= userInput.nextInt();

                         accountBalance -= amountToWithdraw;
                         System.out.println("Please take your " + amountToWithdraw + " your current balance is " + accountBalance);

                } else if (userIntegerInputAtStart == 3){

                }

        String continuePrompt = "Would you like to make another transaction?";
        String continueOptionText = " 1 - Yes";
        String quitOptionText = "2 - No";

        System.out.println(continuePrompt + lineBreak + continueOptionText + lineBreak +  quitOptionText);
        int userWantsToContinue = userInput.nextInt();

        if(userWantsToContinue == 2){
            likeToContinue = false;
            System.out.println("Thank you, goodbye.");
        }

        }while(likeToContinue);


    }
}
