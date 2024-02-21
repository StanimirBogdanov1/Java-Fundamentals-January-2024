package F_MID_Exams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class c_c_ShootForTheWin_3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        List<Integer> targetsList= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());


        String shoots=scanner.nextLine();

        while(!shoots.equals("End")){
            int index=Integer.parseInt(shoots);

            if(index>=targetsList.size()){
                shoots=scanner.nextLine();
                continue;
            }else {

                int targetNumber=targetsList.get(index);
                for (int position = 0; position < targetsList.size(); position++) {
                        int possitionNumber=targetsList.get(position);

                    if(targetNumber<possitionNumber){
                        targetsList.set(index,-1);
                        if(targetsList.get(position)==-1){
                            continue;
                        }else {

                            int numberPossitionCurrent = targetsList.get(position);
                            targetsList.set(position, numberPossitionCurrent - targetNumber);
                        }

                    }else{

                        if(targetNumber>=possitionNumber) {
                            targetsList.set(index, -1);
                            if (targetsList.get(position) == -1) {
                                continue;
                            } else {

                                int numberPossitionCurrent = targetsList.get(position);
                                targetsList.set(position, numberPossitionCurrent + targetNumber);
                            }
                        }
                    }


                }
            }



            shoots=scanner.nextLine();
        }


        int count=0;

        for(int elements:targetsList){

            if(elements==-1){
                count++;
            }

        }
        System.out.println("Shot targets: "+ count + " -> "+ targetsList.toString().replace("[","").replace("]","").replace(",",""));


    }
}
