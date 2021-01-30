public class Main {
    public static void main(String[] args) {
        BMIService service = new BMIService();
        int weight = 70;
        float height = 1.83F;
        float bmIndex = service.calculate(183, 70);
        System.out.println("Индекс массы тела:" + bmIndex);

    }
}
