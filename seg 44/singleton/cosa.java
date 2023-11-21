public class cosa {
    private static cosa instance;
    private String nombre;
    private int numero;
    private cosa() {}
    public static cosa getInstance(){
        if(instance == null) {
            instance = new cosa();
        }
        return instance;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
