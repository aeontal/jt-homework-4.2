public class BodyMassIndexService {
    public double calculate(double weight, double height){
    double bmi = Math.round((weight/ Math.pow(height,2)));
    return bmi;
    }
}
