package J_TextProcessing_9;

import java.util.Scanner;

public class c_Substring_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String firstString=scanner.nextLine();
        String secondString=scanner.nextLine();

        //indexOf Проверява дали първата дума се среща някъде във втората   true -> 0   false -> -1
        int index= secondString.indexOf(firstString);


        while (index!=-1){



            // replace zamenq wsqka sreshtnata nawednuj... zatowa prawim 2 iteracii
            // а ако имахме replaceFirst заменя само първо срещане... имаме 3 итерации с всяка срещаме и заменяме по 1 път
            secondString=secondString.replace(firstString,"");

            index= secondString.indexOf(firstString);
        }

        System.out.println(secondString);

    }
}
