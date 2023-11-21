public class pagoFactory {
    public static pagos getpagos(String tipo) {
        if (tipo.equalsIgnoreCase("A")) {
            return new pagoA();
        } else if (tipo.equalsIgnoreCase("B")) {
            return new pagoB();
        }
        return null;
}}
