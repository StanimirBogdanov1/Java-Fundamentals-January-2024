package F_MID_Exams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class b_b_b_Numbers_2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        List<Integer> numberList= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());


        int sum=numberList.stream().mapToInt(Integer::intValue).sum();
        int numberDigitst=numberList.size();
        double average=sum*1.0/numberDigitst;


        if(numberList.size()==1){
            System.out.println("No");
            return;
        }


        for(int positions=0;positions<numberList.size();positions++){

            int number= numberList.get(positions);
            if(number<=average){
                numberList.remove(numberList.get(positions));
                positions--;
            }
        }

        Collections.sort(numberList);
        Collections.reverse(numberList);

        if(numberList.size()>5) {
            List<Integer> first5TopNumbers = numberList.subList(0, 5);
            System.out.println(first5TopNumbers.toString().replace("[","").replace("]","").replace(",",""));
        } else{
            System.out.println(numberList.toString().replace("[","").replace("]","").replace(",",""));
        }




    }
}
