package C_ArraysLab_3;

import java.util.Scanner;

public class b_PrintNumbersInReverseOrder_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numberInput =Integer.parseInt(scanner.nextLine());

        int [] numbersArr= new int[numberInput];

        for(int numbers=0;numbers<=numbersArr.length-1;numbers++){
            numbersArr[numbers]= Integer.parseInt(scanner.nextLine());


        }

        System.out.println();
        System.out.println();
        for(int revers=numbersArr.length-1;revers>=0;revers--){


            System.out.print(numbersArr[revers]+" ");

        }



    }
}
