package servicio;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JsonAnalizador {
    private JsonObject jsonRespuesta;
    public JsonAnalizador(String json) {
        this.jsonRespuesta = new JsonParser().parseString(json).getAsJsonObject();

    }
    public String getMonedaBase(){
        return jsonRespuesta.get("base_code").getAsString();
    }
    public Double getTasa(String codigoMoneda){
        JsonObject tasas = jsonRespuesta.getAsJsonObject("conversion_rates");
        if(tasas.has(codigoMoneda)){
            return tasas.get(codigoMoneda).getAsDouble();
        }else{
            throw new IllegalArgumentException("Código de moneda no encontrado: " + codigoMoneda);
        }

    }
    public Map<String, Double> filtrarMonedas(Set<String> codigosFiltrados) {
        JsonObject tasas = jsonRespuesta.getAsJsonObject("conversion_rates");
        Map<String, Double> monedas = new HashMap<>();

        for (String codigo : codigosFiltrados) {
            if (tasas.has(codigo)) {
                monedas.put(codigo, tasas.get(codigo).getAsDouble());
            }
        }
        return monedas;
    }
}

