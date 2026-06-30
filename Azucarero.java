public class Azucarero {
    private int cantidadDeAzucar;

    public Azucarero(int cantidadDeAzucar) {
        this.cantidadDeAzucar = cantidadDeAzucar;
    }

    public void setCantidadDeAzucar(int cantidadDeAzucar) {
        this.cantidadDeAzucar = cantidadDeAzucar;
    }

    public int getCantidadAzucar() {
        return cantidadDeAzucar;
    }

    public boolean hasAzucar(int cantidadPedida) {
        return this.cantidadDeAzucar >= cantidadPedida;
    }

    public void giveAzucar(int cantidadPedida) {
        this.cantidadDeAzucar -= cantidadPedida;
    }
}