package converter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Converter for english units of length");
        System.out.println("Version 1.0");
        double miles = 5;
        double kilometersConv1 = milesToKilometers(miles);
        System.out.println(miles + " миль = " + kilometersConv1 + " километров");
        double kilometers = 10;
        double milesConv1 = kilometersToMiles(kilometers);
        System.out.println(kilometers + " километров = " + milesConv1 + " миль");
        double inches = 10;
        double millimetersConv1 = inchesToMillimeters(inches);
        System.out.println(inches + " дюймов = " + millimetersConv1 + " миллиметров");
        double millimeters = 100;
        double inchesConv1 = millimetersToInches(millimeters);
        System.out.println(millimeters + " миллиметров = " + inchesConv1 + " дюймов");
        double feet = 6;
        double centimetersConv1 = feetToCentimeters(feet);
        System.out.println(feet + " футов = " + centimetersConv1 + " сантиметров");
        double centimeters = 170;
        double feetConv1 = centimetersToFeet(centimeters);
        System.out.println(centimeters + " сантиметров = " + feetConv1 + " футов");
    }
    public static double milesToKilometers(double miles) {
        return miles * 1.60934;
    }
    public static double kilometersToMiles(double kilometers) {
        return kilometers / 1.60934;
    }
    public static double inchesToMillimeters(double inches) {
        return inches * 25.4;
    }
    public static double millimetersToInches(double millimeters) {
        return millimeters / 25.4;

    }
    public static double feetToCentimeters(double feet) {
        return feet * 30.48;
    }
    public static double centimetersToFeet(double centimeters) {
        return centimeters / 30.48;
    }
}
