package E_Lists_5;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        List<Double> numberList= Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());

        for(int index=0;index<numberList.size()-1;index++){
            double currentIndex=numberList.get(index);
            double afterIndex=numberList.get(index+1);


            if(currentIndex==afterIndex){
                double sum=currentIndex+afterIndex;
                numberList.set(index,sum);
                numberList.remove(index+1);
                index=-1;
            }


        }


        for(double elements:numberList){

            System.out.print(new DecimalFormat("0.#").format(elements)+" ");
        }


    }
}
