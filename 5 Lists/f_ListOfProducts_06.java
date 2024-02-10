package E_Lists_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class f_ListOfProducts_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int inputNumber=Integer.parseInt(scanner.nextLine());


        List<String> names=new ArrayList<>();


        for(int i=1;i<=inputNumber;i++){
            String name=scanner.nextLine();

            names.add(name);

        }
        Collections.sort(names);

        int count=1;
        for(String elements:names){

            System.out.println(count+"."+elements);
            count++;
        }

    }
}
