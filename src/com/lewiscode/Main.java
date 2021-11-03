package com.lewiscode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        String path;
        String output;
        String str = scanner.nextLine();
        System.out.println("This is:");
        path= "/home/lewi/"+ str;
        output = readFileString(path);
        System.out.println(output);
        int allWords = words(output);
        System.out.print("Words: ");
        System.out.print(allWords);
        System.out.println();
        int allSentences = sentence(output);
        System.out.print("Sentences: ");
        System.out.print(allSentences);


    }
    //reading the file
    public static String readFileString(String fileName) throws IOException{
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }
    //outputting the number of words
    public static int words(String str){
        int allWords;
        String[] words = str.split(" ");
        allWords = words.length;
        return allWords;
    }
    public static int sentence(String str){
        int allSentences;
        String[] sentence = str.split("[.!/?]");
        allSentences = sentence.length;
        return allSentences;
    }


}
