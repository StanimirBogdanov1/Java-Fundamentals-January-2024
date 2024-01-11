package LectionBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class StudentInformation_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String nameStudent =scanner.nextLine();
        int ageStudent =Integer.parseInt(scanner.nextLine());
        double gradeStudent =Double.parseDouble(scanner.nextLine());

        System.out.printf("Name: %s, Age: %d, Grade: %.2f",nameStudent,ageStudent,gradeStudent);


    }
}
