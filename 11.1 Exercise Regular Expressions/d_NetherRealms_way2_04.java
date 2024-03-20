package K_K_RegularExpressionsExercises_10_1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class d_NetherRealms_way2_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        //not
        List<String> daemons = Arrays.stream(scanner.nextLine().split(",\\s*"))
                .map(String::trim)
                .collect(Collectors.toList());

        Pattern healthPattern = Pattern.compile("[^-+*/.\\d]");
        Pattern damagePattern = Pattern.compile("[-+]?\\d+(\\.\\d+)?");
        Pattern damageModifiersPattern = Pattern.compile("[*/]");

        for (String daemonName : daemons) {

            //health without - + * / . and digits
            int daemonHealth = healthPattern.matcher(daemonName)
                    .results()
                    .mapToInt(m -> m.group().charAt(0))
                    .sum();

            //damage
            double daemonDamage = damagePattern.matcher(daemonName)
                    .results()
                    .map(MatchResult::group)
                    .mapToDouble(Double::parseDouble)
                    .sum();

            //finalDamage
            Matcher matcher = damageModifiersPattern.matcher(daemonName);
            while (matcher.find()) {
                //if name contain *
                if (matcher.group().equals("*")) {
                    daemonDamage *= 2.0;
                    // if name contain /
                } else {
                    daemonDamage /= 2.0;
                }
            }

            System.out.printf("%s - %d health, %.2f damage%n", daemonName, daemonHealth, daemonDamage);
        }


    }
}
