package EE_List_Exe_5_1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class j_SoftUniCoursePlanning_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        // long..

        List<String> lessonsList= Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String command=scanner.nextLine();

        while(!command.equals("course start")){
            String[] commandParts=command.split(":");
            String nameCommand=commandParts[0];
            String lesson=commandParts[1];

            switch (nameCommand){
                case "Add":
                    if(!lessonsList.contains(lesson)){
                        lessonsList.add(lesson);
                    }

                    break;
                case "Insert":
                    int indexCommand=Integer.parseInt(commandParts[2]);
                    if(!lessonsList.contains(lesson)){
                        lessonsList.add(indexCommand,lesson);
                    }

                    break;
                case "Remove":
                    lessonsList.remove(lesson);
                    lessonsList.remove(lesson+ "-Exercise");

                    break;
                case "Swap":
                    String lessonNumberTwo=commandParts[2];

                    if(lessonsList.contains(lesson) && lessonsList.contains(lessonNumberTwo)){
                        int indexFirst =lessonsList.indexOf(lesson);
                        int indexSecond= lessonsList.indexOf(lessonNumberTwo);

                        lessonsList.set(indexFirst,lessonNumberTwo);
                        lessonsList.set(indexSecond,lesson);

                        String firstLessonExe=lesson + "-Exercise";
                        String secondLessonExe=lessonNumberTwo + "-Exercise";

                        if(lessonsList.contains(firstLessonExe)){
                            lessonsList.remove(firstLessonExe);
                            lessonsList.add(indexSecond+1,firstLessonExe);
                        }

                        if(lessonsList.contains(secondLessonExe)){
                            lessonsList.remove(secondLessonExe);
                            lessonsList.add(indexFirst+1,secondLessonExe);
                        }
                    }

                    break;
                case "Exercise":
                    String exerciseName=lesson+ "-Exercise";
                    if(lessonsList.contains(lesson)){
                        if(!lessonsList.contains(exerciseName)){
                            int indexOfTheLesson=lessonsList.indexOf(lesson);
                            lessonsList.add(indexOfTheLesson+1,exerciseName);
                        }

                    }else{
                        lessonsList.add(lesson);
                        lessonsList.add(exerciseName);
                    }


                    break;
            }




            command=scanner.nextLine();
        }

        int number=1;
        for(String lesson:lessonsList){

            System.out.println(number+"."+lesson);
            number++;
        }


    }
}
