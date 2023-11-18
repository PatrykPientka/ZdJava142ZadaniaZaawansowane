package day3.task30;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFileClass {


        String fileName = "zadanie.txt";
        String result;




    public String readFromFile(String fileName) {
        String text = null;
        try(Scanner scanner = new Scanner(new File(fileName)))
        {
            int lines = 0;
            while (scanner.hasNextLine()){
                 text = scanner.nextLine();
                System.out.println(text);
                lines++;
            }

        } catch (FileNotFoundException e) {
            System.err.println("Nie znaleziono pliku");;
        }
        return text;
    }

    public void readReversedTextFromFile(String fileName){
        try(Scanner scanner = new Scanner(new File(fileName)))
        {
            int lines = 0;
            while (scanner.hasNextLine()){
                String text = scanner.nextLine();
                System.out.println(fileName);
                lines++;
            }

        } catch (FileNotFoundException e) {
            System.err.println("Nie znaleziono pliku");;
        }
    }
}
