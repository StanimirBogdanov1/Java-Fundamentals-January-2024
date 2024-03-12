package J_TextProcessing_9;

import java.util.Scanner;

public class a_ReverseStrings_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String input=scanner.nextLine();


        while(!input.equals("end")){

            int textLength=input.length();



            String reversedText="";
            for(int lastSymbol=textLength-1;lastSymbol>=0;lastSymbol--){



            //with charAt()
            char charArr=input.charAt(lastSymbol);
            reversedText+=charArr;
        }
        System.out.printf("%s = %s\n",input,reversedText);



            // with StringBulder
//            StringBuilder sb=new StringBuilder();
//            sb.append(input);
//            String reversed = sb.reverse().toString();
//
//            System.out.println(input+" = "+reversed);




            //                //with charArr
//                char[] charArr=input.toCharArray();
//                reversedText+=charArr[lastSymbol];
//            }
//            System.out.printf("%s = %s\n",input,reversedText);
//
            input=scanner.nextLine();
        }
    }
}
