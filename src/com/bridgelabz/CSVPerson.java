package com.bridgelabz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CSVPerson {

    public static void readCSVfileUsingScanner(String filePath) {

        try {
            Scanner sc = new Scanner(new File(filePath));

            while (sc.hasNext()) {
                System.out.println("User data  :" + sc.next().toString());
            }
            sc.close();
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }
    }

    public static void writeCSVfileUsingScanner() {
        Scanner sc = new Scanner(System.in);
        File file = new File(
                "D:\\GitProgram\\AddressBook\\src\\com\\bridgelabz\\AddressBook\\abcd.txt");
        try {
            FileWriter fileWriter = new FileWriter(file);

            PrintWriter printWriter = new PrintWriter(fileWriter);

            System.out.println("Enter the First name :");
            String a = sc.nextLine();
            System.out.println("Enter the Last name :");
            String b = sc.nextLine();
            System.out.println("Enter the Address :");
            String c = sc.nextLine();
            System.out.println("Enter the city :");
            String d = sc.nextLine();
            System.out.println("Enter the state :");
            String e = sc.nextLine();
            System.out.println("Enter the zipCode :");
            String f = sc.nextLine();
            System.out.println("Enter the phoneNumber :");
            String g = sc.nextLine();
            System.out.println("Enter the emailID :");
            String h = sc.nextLine();

            printWriter.print(a);
            printWriter.print(",");
            printWriter.print(b);
            printWriter.print(",");
            printWriter.print(c);
            printWriter.print(",");
            printWriter.print(d);
            printWriter.print(",");
            printWriter.print(e);
            printWriter.print(",");
            printWriter.print(f);
            printWriter.print(g);
            printWriter.print(",");
            printWriter.print(h);

            printWriter.close();

        } catch (IOException e) {

            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("Enter \n 1. Read csv file \n2.Write csv file \n0.exit");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    readCSVfileUsingScanner(
                            "D:\\GitProgram\\AddressBook\\src\\com\\bridgelabz\\AddressBook\\abcd.csv");

                    break;
                case 2:
                    writeCSVfileUsingScanner();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter the wrong input");
            }
        }
    }
}