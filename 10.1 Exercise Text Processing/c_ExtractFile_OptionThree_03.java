package J_J_ExerciseTextProcessing_9_1;

import java.util.Scanner;

public class c_ExtractFile_OptionThree_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        StringBuilder newFile = new StringBuilder(scanner.nextLine());
        StringBuilder file = new StringBuilder();

        int index = newFile.lastIndexOf("\\");
        newFile.replace(0, index +1,"");
        index = newFile.lastIndexOf(".");
        file.append(newFile,0,index);

        System.out.println("File name: " + file);

        file.replace(0, index +1,"");
        file.append(newFile, index  +1, newFile.length());

        System.out.println("File extension: " + file);

    }



}
