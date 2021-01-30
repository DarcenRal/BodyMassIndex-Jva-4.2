public class BMIService {
    public float calculate(float height, int weight) {
        float bmIndex = weight / (height * height);
        return bmIndex;
    }
}
