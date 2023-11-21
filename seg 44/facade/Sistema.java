class Sistema {
    private Pago pago;
    private Inventario inventario;
    private Destino destino;

    public Sistema() {
        this.pago = pago;
        this.inventario = inventario;
        this.destino = destino;
    }

    public void venderProducto() {
        inventario.buscarProducto();
        inventario.reservarProducto();
        pago.cobrar();
        envio.enviar();
    }
}
