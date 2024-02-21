package F_MID_Exams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class c_c_c_MovingTarget_3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        List<Integer> targetsList= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());


        String shoots=scanner.nextLine();

        while(!shoots.equals("End")){

            String[] commandParts = shoots.split(" ");
            String command=commandParts[0];
            int indexPart=Integer.parseInt(commandParts[1]);
            int otherPart=Integer.parseInt(commandParts[2]);



            switch (command){
                case "Shoot":

                    if(indexPart>=0 && indexPart<targetsList.size()){

                            int numberTarget=targetsList.get(indexPart);
                            numberTarget=numberTarget-otherPart;
                            targetsList.set(indexPart,numberTarget);
                            if(targetsList.get(indexPart)<=0){
                                targetsList.remove(indexPart);
                            }

                    }


                    break;
                case "Add":

                    if(indexPart>=0 && indexPart<targetsList.size()) {
                        targetsList.add(indexPart, otherPart);

                    }else{
                        System.out.println("Invalid placement!");
                    }


                    break;
                case "Strike":
                    int radius=otherPart;
                    int leftIndex=indexPart-radius;
                    int rightIndex=indexPart+radius;
                    if(leftIndex>=0 && rightIndex<targetsList.size()) {
                        int count=radius*2+1;

                        for (int i = 0; i < count; i++) {
                            targetsList.remove(leftIndex);
                        }

                    }else{
                        System.out.println("Strike missed!");
                    }



                    break;
            }





            shoots=scanner.nextLine();
        }


        System.out.println(targetsList.toString().replace("[","").replace("]","").replace(" ","").replace(",","|"));



    }





}
