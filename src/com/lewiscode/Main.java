package com.lewiscode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("This is: ");
        String path= "/home/lewi/"+ str;
        String output = readFileString(path);
        System.out.println(output);
        int allWords = words(output);
        System.out.print("Words: ");
        System.out.print(allWords);
        System.out.println();
        int allSentences = sentence(output);
        System.out.print("Sentences: ");
        System.out.print(allSentences);
        System.out.println();
        int allCharacters = characters(output);
        System.out.print("Characters: ");
        System.out.print(allCharacters);
        System.out.println();
        double score = score(output);
        System.out.print("The score is: ");
        System.out.format("%.2f", score);

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
    // outputting the number of sentences
    public static int sentence(String str){
        int allSentences =0;
        String[] sentence = str.split("[!?.]+(\\s)");
        allSentences += sentence.length;
        return allSentences;
    }
    // outputting number of characters excluding spaces
    public static int characters(String str){
        int allChars =0;
        char[] character = str.toCharArray();
        for (int i=0; i < character.length-1;i++){
            if (character[i] != ' '){
                allChars++;
            }
        }
        return allChars;
    }
    //text score
    public static double score(String str){
        double scores;
        double first = (double) characters(str)/ (double) words(str);
        double second = (double) words(str)/ (double) sentence(str);
        scores = (((4.71 * first) + (0.5 * second)) - 21.43);
        return scores;
    }
    // level of understanding as per age
    public static void ageUnderstanding(String str){
      double score = score(str);
      if (score > 1 && score < 2 ){
          System.out.println("This text should be understood by 5-6-year-olds.");
      }else if (score > 2 && score < 3 ){
            System.out.println("This text should be understood by 6-7-year-olds.");
      }else if (score > 3 && score < 4 ){
          System.out.println("This text should be understood by 7-8-year-olds.");
      }else if(score > 4 && score < 5){
          System.out.println("This text should be understood by 8-9-year-olds.");
      }else if (score > 5 && score < 6){
          System.out.println("This text should be understood by 9-10-year-olds.");
      }else if (score > 6 && score < 7){
          System.out.println("This text should be understood by 10-11-year-olds.");
      }else if (score > 7 && score < 8){
          System.out.println("This text should be understood by 11-12-year-olds.");
      }else if (score > 8 && score < 9){
          System.out.println("This text should be understood by 12-13-year-olds.");
      }else if (score > 9 && score < 10){
          System.out.println("This text should be understood by 13-14-year-olds.");
      }else if (score > 10 && score < 11){
          System.out.println("This text should be understood by 14-15-year-olds.");
      }else if (score > 11 && score < 12){
          System.out.println("This text should be understood by 15-16-year-olds.");
      }else if (score > 12 && score < 13){
          System.out.println("This text should be understood by 16-17-year-olds.");
      }else if (score >13 && score < 14){
          System.out.println("This text should be understood by 17-18-year-olds.");
      }
    }
}
