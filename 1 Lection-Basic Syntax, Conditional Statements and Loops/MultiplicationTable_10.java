package LectionBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class MultiplicationTable_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int inputNum =Integer.parseInt(scanner.nextLine());

        int product = 0;

        for(int i=1;i<=10;i++){
            product=inputNum*i;
            System.out.printf("%d X %d = %d\n",inputNum,i,product);
        }


    }
}
