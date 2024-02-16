package EE_List_Exe_5_1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class a_Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        List<Integer> trainCapacityList= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacityEachWagon=Integer.parseInt(scanner.nextLine());

        String command=scanner.nextLine();
        while (!command.equals("end")){


            if(command.contains("Add")){
                int peopleWgon=Integer.parseInt(command.split(" ")[1]);
                trainCapacityList.add(peopleWgon);
            }else{
                int people =Integer.parseInt(command);

                for(int index=0; index<= trainCapacityList.size()-1;index++){
                    int peopleInWagon=trainCapacityList.get(index);
                    if(peopleInWagon+people<=maxCapacityEachWagon){
                        int updatePeopleInWagon=peopleInWagon+people;
                        trainCapacityList.set(index,updatePeopleInWagon);

                        break;
                    }


                }
            }



            command=scanner.nextLine();
        }

        for(int elements:trainCapacityList){
            System.out.print(elements+" ");
        }



    }
}
