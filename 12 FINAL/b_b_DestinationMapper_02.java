package L_FINAL_EXAM_oldsExe_11;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class b_b_DestinationMapper_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String inputDestinations=scanner.nextLine();

        String regexDestination="([=]|[\\/])(?<name>[A-Z][A-Za-z]{2,})\\1";

        Pattern patternDestination = Pattern.compile(regexDestination);
        Matcher matcherDestination =patternDestination.matcher(inputDestinations);


        List<String> destinationList= new ArrayList<>();
        int length=0;

        while (matcherDestination.find()){

            destinationList.add(matcherDestination.group("name"));

            int destinationLength=matcherDestination.group("name").length();
            length+=destinationLength;
        }


        System.out.println("Destinations: "+ String.join(", ",destinationList));
        System.out.printf("Travel Points: %d\n",length);



    }
}
