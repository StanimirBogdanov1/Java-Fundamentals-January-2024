package E_Lists_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class b_GaussTrick_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        List<Integer> numberList= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());


// moqt wariant
        int startSize=numberList.size();
        int halfIndex=numberList.get(numberList.size()/2);
        for(int index=0;index<=(numberList.size())-1;index++){
            int currentIndex=numberList.get(index);
            int lastIndex=numberList.get(numberList.size()-1);

            int sum=currentIndex+lastIndex;
            numberList.set(index,sum);
            numberList.remove(numberList.size()-1);

        }


        if(startSize %2 !=0) {
            numberList.add(halfIndex);
        }

        for(int element:numberList){
            System.out.print(element+" ");
        }


    }
}
