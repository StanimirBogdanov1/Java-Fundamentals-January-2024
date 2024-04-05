package L_FINAL_EXAM_oldsExe_11;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class c_c_c_NeedforSpeed3_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int numberCars=Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String,Integer> carMileageMap = new LinkedHashMap<>();
        LinkedHashMap<String,Integer> carFuelMap = new LinkedHashMap<>();

        for(int carNumber=1;carNumber<=numberCars;carNumber++){
            String[] inputCarsParts= scanner.nextLine().split("\\|");
            String carName =inputCarsParts[0];
            int carMileage = Integer.parseInt(inputCarsParts[1]);
            int carFuel=Integer.parseInt(inputCarsParts[2]);

            carMileageMap.put(carName,carMileage);
            carFuelMap.put(carName,carFuel);

        }

        String command =scanner.nextLine();

        while (!command.equals("Stop")){
            String[] commandParts=command.split(" : ");
            String firstCommand=commandParts[0];

            if(firstCommand.equals("Drive")){
                String car=commandParts[1];
                int distance = Integer.parseInt(commandParts[2]);
                int fuel = Integer.parseInt(commandParts[3]);

                int existingCarFuel= carFuelMap.get(car);

                if(existingCarFuel<fuel){
                    System.out.println("Not enough fuel to make that ride");
                }else{
                    int existingMileage = carMileageMap.get(car);
                    carMileageMap.put(car,existingMileage+distance);
                    carFuelMap.put(car,existingCarFuel-fuel);
                    System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.\n",car,distance,fuel);
                }
                int mileageReaches=carMileageMap.get(car);
                if(mileageReaches>=100000){
                    System.out.printf("Time to sell the %s!\n",car);
                    carMileageMap.remove(car);
                    carFuelMap.remove(car);

                }


            }else if(firstCommand.equals("Refuel")){
                String car = commandParts[1];
                int fuel = Integer.parseInt(commandParts[2]);

                int existingFuel=carFuelMap.get(car);

                if(fuel+existingFuel<=75){
                    carFuelMap.put(car,fuel+existingFuel);
                    System.out.printf("%s refueled with %d liters\n",car,fuel);
                }else{
                    int newFuel=75-existingFuel;
                    carFuelMap.put(car,75);
                    System.out.printf("%s refueled with %d liters\n",car,newFuel);
                }




            }else if(firstCommand.equals("Revert")){
                String car=commandParts[1];
                int kilometers = Integer.parseInt(commandParts[2]);

                int existingMileages =carMileageMap.get(car);
                carMileageMap.put(car,existingMileages-kilometers);

                if(carMileageMap.get(car)>=10000){
                    System.out.printf("%s mileage decreased by %d kilometers\n",car,kilometers);
                }else{
                    carMileageMap.put(car,10000);
                }

            }




            command =scanner.nextLine();
        }



// way 1
//        for(Map.Entry<String,Integer> pair:carMileageMap.entrySet()){
//            String car= pair.getKey();
//            int mileage = pair.getValue();
//            int fuel = carFuelMap.get(car);
//
//            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.\n",car,mileage,fuel);
//        }

        //way2
        carMileageMap.entrySet().forEach(entry -> System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.\n",entry.getKey(),entry.getValue(),carFuelMap.get(entry.getKey())));



    }
}
