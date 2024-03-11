package I_I_ExerciseAssociativeArrays_8_1;

import java.util.*;

public class e_Courses_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        String inputStudentsCourses =scanner.nextLine();

        Map<String, List<String>> courseMap=new LinkedHashMap<>();

        while(!inputStudentsCourses.equals("end")){
            String[] inputStudentsCoursesArr=inputStudentsCourses.split(" : ");
            String courseName=inputStudentsCoursesArr[0];
            String studentName=inputStudentsCoursesArr[1];


            if (!courseMap.containsKey(courseName)) {
                courseMap.put(courseName,new ArrayList<>());
                courseMap.get(courseName).add(studentName);
            }else{
                courseMap.get(courseName).add(studentName);
            }




            inputStudentsCourses =scanner.nextLine();
        }

        for(Map.Entry<String, List<String> > pair:courseMap.entrySet()){

            System.out.println(pair.getKey()+": "+pair.getValue().size());

            for(String person : pair.getValue()){
                System.out.println("-- "+person);
            }
        }
    }
}
