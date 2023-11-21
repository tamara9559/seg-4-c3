import java.util.Objects;

public class main {
    public static void main(String[] args) {
        pagos p1 = pagoFactory.getpagos("A");
        Objects.requireNonNull(p1).pago();
        pagos p2 = pagoFactory.getpagos("B");
        Objects.requireNonNull(p2).pago();
    }
}
