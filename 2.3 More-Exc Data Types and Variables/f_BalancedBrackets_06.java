package BBB_DataTypesandVariablesMoreExercise_2_2;

import java.util.Scanner;

public class f_BalancedBrackets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);



//        int numberLines=Integer.parseInt(scanner.nextLine());
//
//
//
//        String brackets="";
//        int brackersCounter1=0;
//        int brackersCounter2=0;
//        for(int i=0;i<numberLines;i++){
//
//            String inputs=scanner.nextLine();
//
//            brackets=brackets+inputs;
//
//            for(int count=0;count<inputs.length();count++){
//                char symbols=inputs.charAt(count);
//
//
//
//                if(symbols=='('){
//                    brackersCounter1++;
//                }else if(symbols==')'){
//                    brackersCounter2++;
//                }
//

        //    towa bqh zabrawil
//                  if(brackersCounter2>brackersCounter1){
//                   System.out.println("UNBALANCED");
//                   return;
//                   }
//
//
//            }
//
//
//        }
//
//         if(brackersCounter1==brackersCounter2){
//            System.out.println("BALANCED");
//        }else{
//            System.out.println("UNBALANCED");
//        }
//
//



        int inputLine=Integer.parseInt(scanner.nextLine());

        int openingBracketCounter = 0;
        int closingBrackrtCounter = 0;

        for(int i=0;i<inputLine;i++){

            String command=scanner.nextLine();

            if(command.equals("(")){
                openingBracketCounter++;
            }else if(command.equals(")")){
                closingBrackrtCounter++;
            }

            if(closingBrackrtCounter>openingBracketCounter){
                System.out.println("UNBALANCED");
                return;
            }

        }

        if(openingBracketCounter==closingBrackrtCounter){
            System.out.println("BALANCED");
        }else{
            System.out.println("UNBALANCED");
        }



    }
}



