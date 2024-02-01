package D_Methods_4;

import java.util.Scanner;

public class c_PrintingTriangle_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        int input=Integer.parseInt(scanner.nextLine());

        printLine(input);

    }


    public static void printLine(int input){

        for(int start=1;start<=input;start++){
            inside(start);
            System.out.println();
        }
        for(int start=input-1;start>=1;start--){
            inside(start);
            System.out.println();
        }

    }

    public static void inside(int start){
        for(int col=1;col<=start;col++){
            System.out.print(col+" ");
        }


    }






}
