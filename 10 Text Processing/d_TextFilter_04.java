package J_TextProcessing_9;

import java.util.Scanner;

public class d_TextFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        String[] banWords=scanner.nextLine().split(", ");
        String text=scanner.nextLine();

        for(int index=0;index< banWords.length;index++){
            String banWord=banWords[index];   //    <--- една по една баннатите думи


            int banWordLength=banWord.length();    // <-- дължина на баннатата дума
            int banWordIsReal=text.indexOf(banWord); //  <-- дали я има в текста  има я --> 0 няма я --> -1

            // докато се среща забранената дума
            while(banWordIsReal!=-1){

                // обновяваме текста = от текста заменяме баннатата дума с *.repeat(дължината на баннатата дума)
                text=text.replace(banWord,"*".repeat(banWordLength));


                // проверяваме дали се среща
                banWordIsReal=text.indexOf(banWord);
            }

        }

        System.out.println(text);


    }
}
