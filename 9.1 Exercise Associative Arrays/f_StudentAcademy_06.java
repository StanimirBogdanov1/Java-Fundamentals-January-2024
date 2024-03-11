package I_I_ExerciseAssociativeArrays_8_1;

import java.util.*;

public class f_StudentAcademy_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        int input=Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentGradeMap=new LinkedHashMap<>();


        for(int countStudent=1;countStudent<=input;countStudent++){
            String name=scanner.nextLine();
            double grade=Double.parseDouble(scanner.nextLine());

            studentGradeMap.putIfAbsent(name,new ArrayList<>());

            studentGradeMap.get(name).add(grade);


        }


        for(Map.Entry<String , List<Double> > pair:studentGradeMap.entrySet()){

           //1 nachin
//            double average=pair.getValue().stream().mapToDouble(Double::doubleValue).sum();

            //2 nachin
             double average=0;
            for(double grades:pair.getValue()){
                average+=grades;
            }

            average=average/pair.getValue().size();


            if(average>=4.50){
                System.out.printf("%s -> %.2f\n",pair.getKey(),average);
            }

        }

    }
}
