package com.epam.FifthModuleTasks.FifthModuleFirstTask;

import java.util.Scanner;

public class FifthModuleFirstTask {

    public static void main(String[] args) {
        StringBuilder answer = new StringBuilder();
        FileManager fileManager = new FileManager();
        Scanner scanner = new Scanner(System.in);
        while (!(answer.toString().equals("10"))) {
            System.out.print("1) Move into directory by absolute path.\n" +
                    "2) Move into directory from current directory.\n" +
                    "3) Show entry of file in current directory.\n" +
                    "4) Show entry of file by absolute path.\n" +
                    "5) Show current directory and it's following directories and files.\n" +
                    "6) Create .txt file in current directory.\n" +
                    "7) Delete .txt file in current directory.\n" +
                    "8) Write in the end of text file in current directory.\n" +
                    "9) Overwrite text file in current directory.\n" +
                    "10) Exit from this program.\n\n" +
                    "Type your answer here: ");
            try {
                answer.replace(0, answer.length(), scanner.next());
                System.out.println();
                switch (Integer.parseInt(answer.toString())) {
                    case 1:
                        fileManager.moveTo();
                        break;
                    case 2:
                        fileManager.moveHere();
                        break;
                    case 3:
                        fileManager.showEntryOfFileHere();
                        break;
                    case 4:
                        fileManager.showEntryOfFileByAbsolutePath();
                        break;
                    case 5:
                        fileManager.getFileNameFromFolder();
                        break;
                    case 6:
                        fileManager.touchTxt();
                        break;
                    case 7:
                        fileManager.removeTxt();
                        break;
                    case 8:
                        fileManager.writeInTxtFile();
                        break;
                    case 9:
                        fileManager.overWriteTxtFile();
                        break;
                    case 10:
                        System.out.println("Thank you for using my program! Goodbye!");
                        break;
                    default:
                        System.out.println("There are only 10 options, try again.\n");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("There are only 10 options, try again.\n");
            }
        }

    }



}
