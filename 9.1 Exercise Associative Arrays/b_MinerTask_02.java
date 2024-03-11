package I_I_ExerciseAssociativeArrays_8_1;

import java.util.*;

public class b_MinerTask_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        String inputRes=scanner.nextLine();

        Map<String, Integer> resMap=new LinkedHashMap<>();

        while(!inputRes.equals("stop")){

            int price=Integer.parseInt(scanner.nextLine());

            if(!resMap.containsKey(inputRes)){
                resMap.put(inputRes,price);

            }else{
                int oldPrice=resMap.get(inputRes);
                resMap.put(inputRes,oldPrice+price);
            }


            inputRes=scanner.nextLine();
        }

        resMap.entrySet().forEach( entry -> System.out.printf("%s -> %d\n",entry.getKey(),entry.getValue()));


    }
}
