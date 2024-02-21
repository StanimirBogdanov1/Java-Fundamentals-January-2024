package F_MID_Exams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class a_a_TheLift_1_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int waitingPeople=Integer.parseInt(scanner.nextLine());
        List<Integer> currentLift= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());






            for(int position=0;position<currentLift.size();position++){
                int currentWagon=currentLift.get(position);
                if(waitingPeople<=0){

                    break;
                }
                if(currentWagon<5){
                    int inWagon=currentWagon;
                    int forWagon=4-inWagon;
                    if(waitingPeople<4){

                        if(inWagon+forWagon<=4){
                            int updateWagon=inWagon+Math.min(waitingPeople,forWagon);
                            currentLift.set(position,updateWagon);




                        }else{
                            int updateWagon=4-inWagon;
                            currentLift.set(position,updateWagon);

                        }


                    }else{
                        int updateWagon=inWagon+forWagon;
                        currentLift.set(position,updateWagon);
                    }

                    waitingPeople-=forWagon;

                    if(waitingPeople<=0) {
                        System.out.println("The lift has empty spots!");
                    }
                }

            }

            if(waitingPeople>0){
                System.out.printf("There isn't enough space! %d people in a queue!\n",waitingPeople);
            }

        System.out.println(currentLift.toString().replace("[","").replace("]","").replace(",",""));





    }
}
