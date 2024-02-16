package EE_List_Exe_5_1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class c_House_Party_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int numberComands=Integer.parseInt(scanner.nextLine());


        List<String> guestList=new ArrayList<>();
        for(int i=1;i<=numberComands;i++){
        String command=scanner.nextLine();
        String[] commandPart=command.split(" ");

        String name=commandPart[0];
        if(command.contains("not")){

            if(guestList.contains(name)){
                guestList.remove(name);
            }else{
                System.out.println(name+" is not in the list!");
            }


        }else{
            if(guestList.contains(name)){
                System.out.println(name+" is already in the list!");
            }else{
                guestList.add(name);
            }

        }



        }

        for(String names:guestList){
            System.out.println(names);
        }


    }
}
