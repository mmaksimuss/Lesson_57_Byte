package ait.byteIo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CompareAppl {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Wrong number of arguments");
            return;
        }
        System.out.println("Source 1: " + args[0]);
        System.out.println("Source 2: " + args[1]);
        try (FileInputStream fin1 = new FileInputStream(args[0]);
             FileInputStream fin2 = new FileInputStream(args[1])) {
            int b1, b2;
            do {
                b1 = fin1.read();
                b2 = fin2.read();
                if (b1 != b2) {
                    break;
                }
            }
            while (b1 != -1 && b2 != -1);
            if (b1 == b2) {
                System.out.println("Files are the same");
            } else {
                System.out.println("Files are the different");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading data: " + e.getMessage());
        }

    }
}
