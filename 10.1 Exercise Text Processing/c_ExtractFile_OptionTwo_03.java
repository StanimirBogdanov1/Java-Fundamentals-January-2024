package J_J_ExerciseTextProcessing_9_1;

import java.util.Scanner;

public class c_ExtractFile_OptionTwo_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String path = scanner.nextLine();
        int lastSlashIndex = path.lastIndexOf("\\");
        int dotIndex = path.lastIndexOf(".");

        String fileName = path.substring(lastSlashIndex + 1, dotIndex);
        String extension = path.substring(dotIndex + 1);

        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + extension);

    }
}
