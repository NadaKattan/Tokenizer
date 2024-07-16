package com.company;
import java.io.*;
import java.util.Scanner; // Import the Scanner class to read text files


import static com.company.Tokenizer.myTokenizer;

public class Main {
    public static void main(String[] args) {
        //another way to input from file not from cmd
        //File myObj = new File("Tiny.txt");
        System.out.println("please leave spaces between tokens like (read x ;):");
        Scanner myReader = new Scanner(System.in);
        myTokenizer(myReader);
    }
}
