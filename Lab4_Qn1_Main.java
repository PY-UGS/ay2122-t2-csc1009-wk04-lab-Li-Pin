import java.util.Scanner;

public class Lab4_Qn1_Main {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        //User input weight in pounds
        System.out.print("Enter weight in pounds: ");
        int weight = input.nextInt();

        //User input height in pounds
        System.out.print("Enter height in inches: ");
        int height = input.nextInt();

        //Create object: bmi
        Lab4_Qn1_BMI bmi = new Lab4_Qn1_BMI(weight, height);
        double finalBMI = bmi.getBmi();

        //Print output of BMI
        System.out.println("BMI is " + finalBMI);

        //Prints BMI range
        bmi.getInterpretation();

        input.close();
    }
}
