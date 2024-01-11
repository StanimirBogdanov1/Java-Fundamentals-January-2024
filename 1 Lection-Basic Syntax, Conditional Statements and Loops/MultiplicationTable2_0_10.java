package LectionBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class MultiplicationTable2_0_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int intNum=Integer.parseInt(scanner.nextLine());
        int startMultiply =Integer.parseInt(scanner.nextLine());

        int sum=1;

        for(int i=startMultiply;i<=10;i++){

            sum=i*intNum;
                System.out.printf("%d X %d = %d%n",intNum,i,sum);
        }

        if(startMultiply>10){
            sum=intNum*startMultiply;
            System.out.printf("%d",sum);
        }

    }
}
