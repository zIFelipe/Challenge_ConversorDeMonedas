package servicio;

import model.Moneda;

public class ConversionesCalculadora {

    public static double convertir(Moneda monedaBase, Moneda monedaDestino, double cantidad){
        if(monedaBase == null || monedaDestino == null){
            throw new IllegalArgumentException("La moneda no puede ser nula");
        }
        if(cantidad < 0 ){
            throw new IllegalArgumentException("La cantidad no puede ser negativo");
        }
        double tasaBase = monedaBase.getTasa();
        double tasaDestino = monedaDestino.getTasa();
        return (cantidad / tasaBase) * tasaDestino;
    }

}
