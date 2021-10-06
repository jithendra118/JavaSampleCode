import java.math.BigDecimal;
import java.math.RoundingMode;

public class Jith {

    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal(1000);
        BigDecimal b2 = new BigDecimal(13);
        BigDecimal b3 = b1.multiply(new BigDecimal(8)).divide(b2, RoundingMode.CEILING);
        b3 =b3.add(new BigDecimal(1));
        BigDecimal b4 = b1.multiply(new BigDecimal(8)).divide(b2, RoundingMode.FLOOR);
        b4 =b4.add(new BigDecimal(1));
        System.out.println(b3);
        System.out.println(b4);
        Long.valueOf("123");
    }
}
