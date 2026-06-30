public class MaquinaDeCafe {
    private Cafetera cafetera;
    public Vaso vasosPequeno;
    public Vaso vasosMediano;
    public Vaso vasosGrande;
    private Azucarero azucarero;

    public void setCafetera(Cafetera cafetera) {
        this.cafetera = cafetera;
    }

    public Cafetera getCafetera() {
        return cafetera;
    }

    public void setVasosPequeno(Vaso vasosPequeno) {
        this.vasosPequeno = vasosPequeno;
    }

    public Vaso getVasosPequeno() {
        return vasosPequeno;
    }

    public void setVasosMediano(Vaso vasosMediano) {
        this.vasosMediano = vasosMediano;
    }

    public Vaso getVasosMediano() {
        return vasosMediano;
    }

    public void setVasosGrande(Vaso vasosGrande) {
        this.vasosGrande = vasosGrande;
    }

    public Vaso getVasosGrande() {
        return vasosGrande;
    }

    public void setAzucarero(Azucarero azucarero) {
        this.azucarero = azucarero;
    }

    public Azucarero getAzucarero() {
        return azucarero;
    }

    public Vaso getTipoDeVaso(String tipoDeVaso) {
        if (tipoDeVaso.equalsIgnoreCase("pequeno")) {
            return vasosPequeno;
        } else if (tipoDeVaso.equalsIgnoreCase("mediano")) {
            return vasosMediano;
        } else if (tipoDeVaso.equalsIgnoreCase("grande")) {
            return vasosGrande;
        }
        return null;
    }

    public String getVasoDeCafe(Vaso vaso, int cantidadVasos, int cantidadAzucar) {
        if (!vaso.hasVasos(cantidadVasos)) {
            return "No hay Vasos";
        }
        if (!cafetera.hasCafe(vaso.getContenido())) {
            return "No hay Cafe";
        }
        if (!azucarero.hasAzucar(cantidadAzucar)) {
            return "No hay Azucar";
        }

        vaso.giveVasos(cantidadVasos);
        cafetera.giveCafe(vaso.getContenido());
        azucarero.giveAzucar(cantidadAzucar);

        return "Felicitaciones";
    }
}