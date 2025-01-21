package model;

public class Moneda {
    private String codigo;
    private Double tasa;

    public Moneda() {
    }

    public Moneda(String codigo, Double tasa) {
        this.codigo = codigo;
        this.tasa = tasa;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getTasa() {
        return tasa;
    }

    public void setTasa(Double tasa) {
        this.tasa = tasa;
    }

    @Override
    public String toString() {
        return "Moneda{" +
                "codigo='" + codigo + '\'' +
                ", tasa=" + tasa +
                '}';
    }
}
