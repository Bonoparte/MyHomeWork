package com.epam.FifthModuleTasks.FifthModuleFirstTask;

import java.io.*;
import java.util.Scanner;
import java.io.FileWriter;


public class FileManager {
    private StringBuilder path;

    public FileManager() {
        this.path = new StringBuilder(new File(".").getAbsolutePath());
        this.path.replace(0, this.path.length(), this.path.substring(0, this.path.length() - 2));
        try {
            getFileNameFromFolder();
        } catch (NullPointerException e) {}
    }

    public void moveHere() {
        System.out.print("Type name of directory in current directory in which you want to go: ");
        Scanner scanner = new Scanner(System.in);
        StringBuilder backUp = new StringBuilder();
        backUp.append(this.path.toString());
        this.path.append("/" + scanner.next());
        try {
            getFileNameFromFolder();
        } catch (NullPointerException e) {
            System.out.println("There is no such directory! You will be returned into previous directory.");
            this.path.replace(0,path.length(),backUp.toString());
            try {
                getFileNameFromFolder();
            } catch (NullPointerException e1){}
        }

    }

    public void moveTo() {
        System.out.print("Type absolute path of directory in which you want to go: ");
        Scanner scanner = new Scanner(System.in);
        StringBuilder backUp = new StringBuilder();
        backUp.append(this.path.toString());
        this.path.replace(0, this.path.length(), scanner.next());
        try {
            getFileNameFromFolder();
        } catch (NullPointerException e) {
            System.out.println("There is no such directory! You will be returned into previous directory.");
            this.path.replace(0,path.length(),backUp.toString());
            try {
                getFileNameFromFolder();
            } catch (NullPointerException e1){}
        }
    }

    public void getFileNameFromFolder() throws NullPointerException {
        File folder = new File(this.path.toString());
        File[] listOfFiles = folder.listFiles();
            if (listOfFiles.length != 0) {
                System.out.println("\nNow you are here: " + (folder.getAbsolutePath()));
                System.out.println("There are the following files and directories in this directory:");
                for (int i = 0; i < listOfFiles.length; i++) {
                    System.out.println(listOfFiles[i].getName());
                }
                System.out.println();
            } else {
                System.out.println("\nNow you are here: " + (folder.getAbsolutePath()));
                System.out.println("This directory is empty.\n");
            }
        System.out.println();
    }

    public void showEntryOfFileByAbsolutePath() {
        System.out.print("Type absolute path of file which entry you want to see: ");
        Scanner scanner = new Scanner(System.in);
        File f = new File(scanner.next());
        BufferedReader bufferedReader = null;
        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader(f));
            System.out.println("Entry of " + f.getAbsolutePath() + " file:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println();
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("There is no such file.\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showEntryOfFileHere() {
        System.out.print("Type name of file in current directory which entry you want to see: ");
        Scanner scanner = new Scanner(System.in);
        File f = new File(this.path + "/" + scanner.next());
        BufferedReader bufferedReader = null;
        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader(f));
            System.out.println("Entry of " + f.getAbsolutePath() + " file:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println();
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("There is no such file.\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void touchTxt() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type the name of text file you want to create (without .txt): ");
        String fileName = scanner.next();
        try {
            PrintWriter writer = new PrintWriter(this.path + "/" + fileName + ".txt","UTF-8");
            System.out.println("File " + fileName + ".txt was created!\n");
            writer.close();
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public void removeTxt() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type the name of text file in current directory which you want to delete (without .txt): ");
        String fileName = scanner.next();
        File file = new File (this.path + "/" + fileName + ".txt");
        if (file.delete()) {
            System.out.println("File " + fileName + ".txt was deleted\n");
        }
        else {
            System.out.println("There is no such .txt file in this directory.\n");
        }
    }

    public void writeInTxtFile() {
        StringBuilder text = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the name of the text file to the end of which you want to write (with no .txt): ");
            FileWriter writer = new FileWriter(this.path.toString() + "/" + scanner.next() + ".txt",true);
            System.out.println("Type text that you want to write in the end of this file (to stop - type \'exit\'):");
            String buffer = "";
            buffer = scanner.nextLine();
            while (!(buffer.equals("exit"))) {
                text.append(buffer+"\r\n");
                buffer = scanner.nextLine();
            }
            text.replace(0,2,"");
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write(text.toString());
            bufferWriter.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }

    }

    public void overWriteTxtFile() {
        StringBuilder text = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the name of the text file which you want to overwrite (with no .txt): ");
            FileWriter writer = new FileWriter(this.path.toString() + "/" + scanner.next() + ".txt",false);
            System.out.println("Type text that you want to write in the end of this file (to stop - type \'exit\'):");
            String buffer = "";
            buffer = scanner.nextLine();
            while (!(buffer.equals("exit"))) {
                text.append(buffer+"\r\n");
                buffer = scanner.nextLine();
            }
            text.replace(0,2,"");
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write(text.toString());
            bufferWriter.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }

    }

}
