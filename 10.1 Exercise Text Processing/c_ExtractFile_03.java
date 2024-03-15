package J_J_ExerciseTextProcessing_9_1;

import java.util.Scanner;

public class c_ExtractFile_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        String[] inputArr=scanner.nextLine().split("\\\\");

        String[] lastTextArr=inputArr[inputArr.length-1].split("\\.");


        System.out.println("File name: "+lastTextArr[0]);
        System.out.println("File extension: "+lastTextArr[1]);


    }
}
