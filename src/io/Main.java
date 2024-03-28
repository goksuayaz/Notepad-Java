package io;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a text : ");
            String text = scanner.nextLine();
            FileWriter fileWriter = new FileWriter("file.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print(text);
            printWriter.close();
            System.out.println("Text saved to file.");
        } catch (Exception e) {
            System.out.println("An error occured ! " + e.getMessage());
        }

        try{
            FileReader fileReader = new FileReader("file.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String newText = bufferedReader.readLine();
            bufferedReader.close();
            if(newText != null){
                System.out.println("New Text " + newText);
            }else{
                System.out.println("No Text Saved.");
            }
        }catch (Exception e){
            System.out.println("An error occured !" + e.getMessage());
        }

    }
}