package HHH_ObjectsandClasses_Built_in_7;

import java.util.Random;
import java.util.Scanner;

public class a_a_AdvertisementMessage_from_exe_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String[] phrasesArr={"Excellent product.","Such a great product.",
                "I always use that product.","Best product of its category.",
                "Exceptional product.","I can’t live without this product."};

        String[] eventsArr={"Now I feel good.","I have succeeded with this product.",
                "Makes miracles. I am happy of the results!","I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.","I feel great!"};

        String[] authorsArr={"Diana","Petya","Stella","Elena","Katya","Iva","Annie","Eva"};

        String[] cityArr={"Burgas","Sofia","Plovdiv","Varna","Ruse"};

        int input=Integer.parseInt(scanner.nextLine());

        Random rnd=new Random();

        for(int count=1;count<=input;count++){
            int phraseRnd=rnd.nextInt(phrasesArr.length);
            int eventRnd=rnd.nextInt(eventsArr.length);
            int authorRnd=rnd.nextInt(authorsArr.length);
            int cityRnd=rnd.nextInt(cityArr.length);

            System.out.printf("%s %s %s - %s\n",phrasesArr[phraseRnd],eventsArr[eventRnd],
                    authorsArr[authorRnd],cityArr[cityRnd]);

        }




    }
}
