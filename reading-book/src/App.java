public class App {
    public static void main(String[] args) throws Exception {
        double gallons = 10;
        System.out.println(gallons + " gallons is " + App.GallonToLiters(gallons));
    }

    public static double GallonToLiters(double gallon) {
        return gallon * 3.7854;
    }

}
