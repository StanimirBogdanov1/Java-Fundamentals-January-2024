package LectionBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class SumOfOddNumbers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        int numbers =Integer.parseInt(scanner.nextLine());


        int oddNum=1;
        int sum=0;

        for(int i=0;i<numbers;i++){


                sum+=oddNum;
            System.out.println(oddNum);

            oddNum+=2;

        }

        System.out.printf("Sum: %d",sum);

    }
}
