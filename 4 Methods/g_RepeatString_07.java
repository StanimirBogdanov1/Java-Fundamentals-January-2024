package D_Methods_4;

import java.util.Scanner;

public class g_RepeatString_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString=scanner.nextLine();
        int repeatTime=Integer.parseInt(scanner.nextLine());


        String resultString=repeatingStringNtimes(inputString,repeatTime);
        System.out.println(resultString);


    }

    public static String repeatingStringNtimes(String inputString,int repeatTime){

        String resultString="";

        for(int i=1;i<=repeatTime;i++){
            resultString+=inputString;
        }
        return resultString;

    }
}
