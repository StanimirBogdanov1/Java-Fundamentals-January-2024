package C_ArraysLab_3;

import java.util.Scanner;

public class a_DayOfWeek_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int input =Integer.parseInt(scanner.nextLine());

        String[] dayOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};


        if(input<=7 && input>=1){

            System.out.println(dayOfWeek[input-1]);
        }else{
            System.out.println("Invalid day!");
        }


    }
}
