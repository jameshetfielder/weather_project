import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        double temperature;
        System.out.print("Please enter current temperature: ");
        temperature = input.nextDouble();

        if (temperature < 5){
            System.out.print("You can go to skiing.");
        }
        else if (5 <= temperature && temperature <= 15 ){
            System.out.print("You can go to cinema.");
        }
        else if (15 <= temperature && temperature <= 25){
            System.out.print("You can go to picnic.");
        }
        else {
            System.out.print("You can go to swimming.");
        }
    }
}