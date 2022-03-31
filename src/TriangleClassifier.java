import java.security.SecureRandom;

public class TriangleClassifier {

    public static final String TYPE_EQUILATERAL = "Equilateral";
    public static final String TYPE_ISOSCELES = "Isosceles";
    public static final String TYPE_NORMAL = "Normal";
    public static final String TYPE_INVALID = "Invalid";

    public static String classify(int a, int b, int c) {

        if (a == b && b == c)
            return TYPE_EQUILATERAL;
        if (a + b < c || a+c<b || b+c <c) {
            return TYPE_INVALID;
        }
        if (a == b || b == c || a == c) {
            return TYPE_ISOSCELES;
        }

        return TYPE_NORMAL;
    }


}
