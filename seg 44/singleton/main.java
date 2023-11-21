public class main {
    public static void main(String[] args) {
        cosa Cosa = cosa.getInstance();
        Cosa.setNombre("koala");
        Cosa.setNumero(15);

        System.out.println(Cosa.getNombre());
        System.out.println(Cosa.getNumero());
    }
}
