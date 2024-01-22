package B_DataTypesAndVariables_2;

import java.util.Scanner;

public class e_ConcatNames_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String firstName=scanner.nextLine();
        String secondName=scanner.nextLine();
        String delimiter =scanner.nextLine();

        String concat=firstName+delimiter+secondName;

        System.out.println(concat);



    }
}
