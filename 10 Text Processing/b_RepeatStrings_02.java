package J_TextProcessing_9;

import java.util.Scanner;

public class b_RepeatStrings_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        String[] textArr = scanner.nextLine().split(" ");


        //StringBuilder
        StringBuilder sb=new StringBuilder();

        for(int count=0;count<textArr.length;count++){
            String textPossition= textArr[count];
            int textPossitionLength=textPossition.length();

            //StringBuilder
            for(int countTime=1;countTime<=textPossitionLength;countTime++){
                sb.append(textPossition);
            }


            //basic but with StringBuilder is better!!!
//            for(int numberSymbols=1;numberSymbols<=textPossitionLength;numberSymbols++){
//                System.out.print(textPossition);
//            }

          //   with string method  ----   .repeat();
//            System.out.print(textPossition.repeat(textPossitionLength));

        }

        //StringBuilder
        System.out.println(sb.toString());



    }
}
