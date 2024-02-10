package E_Lists_5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class g_RemoveNegativesandReverse_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        List<Integer> numberList= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());



        for(int index=0;index<=numberList.size()-1;index++){
            int numberFromIndex=numberList.get(index);
            if(numberFromIndex<0){

                numberList.remove(numberList.get(index));
                index=index-1;
            }


        }
        Collections.reverse(numberList);

        for(int element:numberList){

                System.out.print(element + " ");

        }

        if(numberList.isEmpty()){
            System.out.println("empty");
        }



    }
}
