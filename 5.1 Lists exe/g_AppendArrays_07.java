package EE_List_Exe_5_1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class g_AppendArrays_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        List<String> numbersList= Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());


        Collections.reverse(numbersList);

        System.out.print(numbersList.toString().replace("[","").replace("]","")
                .replace(",","").replaceAll("\\s+"," ").trim());

    }
}
