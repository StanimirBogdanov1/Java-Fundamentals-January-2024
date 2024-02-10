package E_Lists_5;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class a_SumAdjacentEqualNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbersList= Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());

        for(int i=0;i<numbersList.size()-1;i++){

            if(numbersList.get(i).equals(numbersList.get(i+1))){
                double sumEquals=numbersList.get(i)+numbersList.get(i+1);
                numbersList.set(i,sumEquals);
                numbersList.remove(i+1);
                i=-1;
            }

        }


        String output=joinElementsByDecimalFormat(numbersList," ");
        System.out.println(output);


    }
    public static String joinElementsByDecimalFormat(List<Double> items, String delimter){

        String output="";

        for(double elements:items){

            output+=(new DecimalFormat("0.#")).format(elements)+delimter;
        }

        return output;

    }



}
