public class BmiService {
    public double calculate(double mass, double high) {
        double index = mass / Math.pow(high,2) * 10000;
        return index;
    }
}
