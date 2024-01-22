package B_DataTypesAndVariables_2;

import java.util.Scanner;

public class j_SpecialNumbers_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

//        int input=Integer.parseInt(scanner.nextLine());
//
//        for(int number=1;number<=input;number++){
//            String inputAsText=String.valueOf(number);
//
//            String trueOrFalse="";
//            int result=0;
//            for(int n=0;n<inputAsText.length();n++){
//                char SYMBOL=inputAsText.charAt(n);
//
//                int symbol =Integer.parseInt(SYMBOL+"");
//
//                result+=symbol;
//
//
//            }
//
//            if(result==5 || result==7 || result==11){
//                trueOrFalse="True";
//            }else{
//                trueOrFalse="False";
//            }
//            System.out.printf("%d -> %s\n",number,trueOrFalse);
//
//
//        }





        int input=Integer.parseInt(scanner.nextLine());

        String trueOrFalse="";



        for(int number=1;number<=input;number++){

            int num=number;

            int result=0;
            if( number <=9){


                if(number==5 || number==7){
                    trueOrFalse="True";
                }else {
                    trueOrFalse="False";
                }

            } else {

               while(num>0){
                    result=result+num%10;
                    num=num/10;
                }
                if(result==5 || result==7 || result==11){
                    trueOrFalse="True";
                }else{
                    trueOrFalse="False";
                }


            }


            System.out.printf("%d -> %s\n",number,trueOrFalse);


        }



    }
}
