import java.util.Scanner;
//how you import Scanner

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //this is for inputing things. it is not like c++! Don't think like that!
        System.out.println("Type in your temperature in Farenheit:");
        double num = sc.nextDouble();
        //This is for the input, has to be double so you can have decimals
        double kelNum=0;
        double celNum=0;
        kelNum = (num + 273.15);
        celNum = (num - 32)*(5.0/9.0);
        //can't do 5/9 because you said it's a double, so you have to add the .0 so it thinks its a double
        System.out.println( "In Kelvin " + num + "is " + kelNum);
        System.out.println( "In Celsius " + num + "is " + celNum);



    }
}