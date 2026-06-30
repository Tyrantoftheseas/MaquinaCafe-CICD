public class Cafetera {
    private int cantidadCafe;

    public Cafetera(int cantidadCafe) {
        this.cantidadCafe = cantidadCafe;
    }

    public void setCantidadCafe(int cantidadCafe) {
        this.cantidadCafe = cantidadCafe;
    }

    public int getCantidadCafe() {
        return cantidadCafe;
    }

    public boolean hasCafe(int cantidadPedida) {
        return this.cantidadCafe >= cantidadPedida;
    }

    public void giveCafe(int cantidadPedida) {
        this.cantidadCafe -= cantidadPedida;
    }
}