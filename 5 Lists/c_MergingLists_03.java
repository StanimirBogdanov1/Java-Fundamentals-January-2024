package E_Lists_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class c_MergingLists_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        List<String> numberFirstList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        List<String> numberSecondList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        List<String> newUpdateList = new ArrayList<>();

        int smallerList=0;

        if(numberFirstList.size()<numberSecondList.size()){
            smallerList=numberFirstList.size();
        }else{
            smallerList=numberSecondList.size();
        }



        for(int index=0;index<=smallerList-1;index++){

            newUpdateList.add(numberFirstList.get(index));
            newUpdateList.add(numberSecondList.get(index));

        }


        List<String> sublist=new ArrayList<>();
        if(numberFirstList.size()>numberSecondList.size()){
             sublist=numberFirstList.subList(smallerList,numberFirstList.size());
        }else{
            sublist=numberSecondList.subList(smallerList,numberSecondList.size());
        }

        newUpdateList.addAll(sublist);


        //way 1
//        for(String element: newUpdateList){
//
//            System.out.print(element+" ");
//        }


        System.out.println(newUpdateList.toString().replace("[","").replace("]","").replace(",",""));


    }

}
