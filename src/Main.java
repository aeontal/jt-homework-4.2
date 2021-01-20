public class Main {
    public static void main(String[] abs)
    { BodyMassIndexService service = new BodyMassIndexService();
    double weight_info = 50.0;
    double height_info =1.58;
    double bmi_info=service.calculate(weight_info,height_info);
    System.out.print(bmi_info);



    }

}
