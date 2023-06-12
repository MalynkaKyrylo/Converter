package converter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Converter app");
        double miles = 5;
        double kilometersConv1 = milesToKilometers(miles);
        System.out.println(miles + " миль = " + kilometersConv1 + " километров");
        double kilometers = 10;
        double milesConv1 = kilometersToMiles(kilometers);
        System.out.println(kilometers + " километров = " + milesConv1 + " миль");
    }
    public static double milesToKilometers(double miles) {
        return miles * 1.60934;
    }
    public static double kilometersToMiles(double kilometers) {
        return kilometers / 1.60934;
    }
}
