public class BmiService {
    public double calculate(double mass, double high) {
        double index = (mass*10000) / (high*high);
        return index;
    }
}
