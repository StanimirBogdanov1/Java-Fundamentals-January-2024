package I_I_ExerciseAssociativeArrays_8_1;

import java.util.*;

public class h_CompanyUsers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        String input=scanner.nextLine();


        Map<String, List<String>> companyUsersMap=new LinkedHashMap<>();

        while(!input.equals("End")){
            String[] companyDataArr=input.split(" -> ");
            String companyName=companyDataArr[0];
            String employeeId=companyDataArr[1];

            if(!companyUsersMap.containsKey(companyName)){
                companyUsersMap.put(companyName,new ArrayList<>());


                if(!companyUsersMap.get(companyName).contains(employeeId)){
                    companyUsersMap.get(companyName).add(employeeId);
                }


            }else {
                if (!companyUsersMap.get(companyName).contains(employeeId)) {
                    companyUsersMap.get(companyName).add(employeeId);
                }


            }

            input=scanner.nextLine();
        }



        for(Map.Entry<String,List<String> >pair:companyUsersMap.entrySet()){
            System.out.println(pair.getKey());

            List<String> idList = pair.getValue();

            for(String ID : idList){
                System.out.println("-- "+ ID);
            }

        }



    }
}
