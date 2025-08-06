package Generics.Streams;

import java.io.*;
public class UserInputToFile {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileWriter fw = new FileWriter("userdata.txt")) {
            System.out.print("Enter Name: ");
            String name = br.readLine();
            System.out.print("Enter Age: ");
            String age = br.readLine();
            System.out.print("Enter Favorite Language: ");
            String language = br.readLine();
            fw.write("Name: " + name + "\nAge: " + age + "\nLanguage: " + language);
            System.out.println("Data saved to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

