package lab14.sict.must.edu.mn;

/**
 * Энгийн хуваах функц. Тэгээр хуваах үед IllegalArgumentException үүсгэнэ.
 */
public class Division {
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Тэгээр хуваах боломжгүй");
        }
        return a / b;
    }
}
