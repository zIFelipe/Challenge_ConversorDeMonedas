package servicio;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;

public class consumoAPI {
    private static final String API_KEY = System.getenv("TU_API_KEY"); //VARIABLE DE ENTORNO PARA LA API KEY
    private static final String URL_API = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/USD";

    public static String solicitarDatos() throws Exception{
        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest solicitud = HttpRequest.newBuilder()
                .uri(URI.create(URL_API))
                .GET()
                .build();
        HttpResponse<String> respuesta = cliente.send(solicitud, HttpResponse.BodyHandlers.ofString());
        if(respuesta.statusCode() == 200){
            return respuesta.body();
        }else{
            throw new RuntimeException("Error en la solicitud: Código de estado " + respuesta.statusCode());
        }
    }

}
