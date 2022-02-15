import java.lang.Math;

public class Lab4_Qn1_BMI {
    private double weight;
    private double height;
    private final static double CONVERTWEIGHT = 0.45359237;
    private final static double CONVERTHEIGHT = 0.0254;
    private double bmi;
    private String interpretation;

    public Lab4_Qn1_BMI(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBmi() {
        bmi = (weight*CONVERTWEIGHT) / Math.pow(height*CONVERTHEIGHT, 2);
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public String getInterpretation() {
        if (bmi < 18.5){
            System.out.println("Underweight");
        }
        else if (bmi >= 18.5 && bmi < 25.0){
            System.out.println("Normal");
        }
        else if (bmi >= 25.0 && bmi < 30.0){
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obese");
        }
        return this.interpretation;
    }

    public void setInterpretation(String interpretation) {
        this.interpretation = interpretation;
    }
}
