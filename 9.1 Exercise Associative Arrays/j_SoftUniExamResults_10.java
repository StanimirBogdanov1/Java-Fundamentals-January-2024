package I_I_ExerciseAssociativeArrays_8_1;

import java.util.*;

public class j_SoftUniExamResults_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);



        String input = scanner.nextLine();

        Map<String,Integer> userAndPointsMap=new LinkedHashMap<>();
        Map<String,Integer> userAndLanguagesMap=new LinkedHashMap<>();


        while (!input.equals("exam finished")) {


            if(input.contains("banned")){
                String name=input.split("-")[0];
                userAndPointsMap.remove(name);

            }else{
                String name=input.split("-")[0];
                String language=input.split("-")[1];
                int points=Integer.parseInt(input.split("-")[2]);

                if(!userAndPointsMap.containsKey(name)){
                    userAndPointsMap.put(name,points);
                }else {
                    int existingpoints = userAndPointsMap.get(name);
                    if (points > existingpoints) {
                        userAndPointsMap.put(name, points);
                    }
                }

                if(!userAndLanguagesMap.containsKey(language)){
                    userAndLanguagesMap.put(language,1);
                }else{
                    int existingCount=userAndLanguagesMap.get(language);
                    userAndLanguagesMap.put(language,existingCount+1);
                }

            }


            input = scanner.nextLine();
        }


        System.out.println("Results:");


        userAndPointsMap.entrySet().forEach(entry -> System.out.printf("%s | %d\n",entry.getKey(),entry.getValue()));

        System.out.println("Submissions:");
        userAndLanguagesMap.entrySet().forEach(entry -> System.out.printf("%s - %d\n",entry.getKey(),entry.getValue()));

    }
}
