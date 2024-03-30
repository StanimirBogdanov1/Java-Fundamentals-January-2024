package L_FINAL_EXAM_oldsExe_11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class aaaBeforeExams_DestinationMapper_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String input = scanner.nextLine();
        String regex = "([=\\/])(?<name>[A-Z][A-Za-z]{2,})\\1";

        Pattern pattern =Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);


        List<String> destinationList =new ArrayList<>();
        int travelPoints=0;
        while(matcher.find()){

            int destination = matcher.group("name").length(); // дължина на всяка дестинация
            destinationList.add(matcher.group("name"));
            travelPoints+=destination;
        }


        System.out.print("Destinations: ");
        System.out.println(String.join(", ",destinationList));
        System.out.printf("Travel Points: %d\n",travelPoints);
    }
}
