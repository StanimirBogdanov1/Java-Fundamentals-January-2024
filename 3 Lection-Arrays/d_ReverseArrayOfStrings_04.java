package C_ArraysLab_3;

import java.util.Arrays;
import java.util.Scanner;

public class d_ReverseArrayOfStrings_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr= (scanner.nextLine().split(" "));


        for(int reverse=inputArr.length-1;reverse>=0;reverse--){

            System.out.print(inputArr[reverse] + " ");
        }


    }
}
