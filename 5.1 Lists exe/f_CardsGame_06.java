package EE_List_Exe_5_1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class f_CardsGame_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        List<Integer> handOne= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> handTwo= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());


        while(!handOne.isEmpty() && !handTwo.isEmpty()){

            int firstPlayerCard=handOne.get(0);
            int secondPlayerCard=handTwo.get(0);

            handOne.remove(0);
            handTwo.remove(0);

            if(firstPlayerCard>secondPlayerCard){
                handOne.add(firstPlayerCard);
                handOne.add(secondPlayerCard);
            }else if(firstPlayerCard<secondPlayerCard){
                handTwo.add(secondPlayerCard);
                handTwo.add(firstPlayerCard);

            }


        }

        if(!handOne.isEmpty()){
            int sum=handOne.stream().mapToInt(Integer::intValue).sum();   //Намиране на сума от Всички числа на даден List без обхождане !
            System.out.println("First player wins! Sum: "+sum);
        }else if(!handTwo.isEmpty()){
            int sum=handTwo.stream().mapToInt(Integer::intValue).sum();   //Намиране на сума от Всички числа на даден List без обхождане !
            System.out.println("Second player wins! Sum: "+sum);
        }


    }
}
