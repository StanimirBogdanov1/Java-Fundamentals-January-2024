package D_Methods_4;

import java.util.Scanner;

public class i_GreaterOfTwoValues_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String command=scanner.nextLine();

        switch (command){
            case "int":
                int number1=Integer.parseInt(scanner.nextLine());
                int number2=Integer.parseInt(scanner.nextLine());

                int biggerNum=getMax(number1,number2);
                System.out.println(biggerNum);

                break;
            case "char":
                char symbol1=scanner.nextLine().charAt(0);
                char symbol2=scanner.nextLine().charAt(0);

                char biggerSymbol=getMax(symbol1,symbol2);
                System.out.println(biggerSymbol);

                break;
            case "string":
                String text1=scanner.nextLine();
                String text2=scanner.nextLine();

                String biggerText=getMax(text1,text2);
                System.out.println(biggerText);
                break;
        }




    }


    public static int getMax(int number1,int number2){

        if(number1>number2){
            return number1;
        }else{
            return number2;
        }
    }

    public static char getMax(char symbol1,char symbol2){

        if(symbol1>symbol2){
            return symbol1;
        }else{
            return symbol2;
        }

    }

    public static String getMax(String text1,String text2){

        if(text1.compareTo(text2)>0){
            return text1;
        }else{
            return text2;
        }


    }
}
