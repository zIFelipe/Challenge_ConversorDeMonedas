package principal;
import model.Moneda;
import servicio.ConversionesCalculadora;
import servicio.JsonAnalizador;
import servicio.consumoAPI;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ConversorMonedas {


    public void menuConversor(){
        System.out.println("\n\n ******IMPORTANTE******: " +
                "\n Se está haciendo uso de una VARIABLE DE ENTORNO para la API KEY, favor si prueba el programa utilizar la suya propia y nombrarla *TU_API_KEY* " +
                "\n****************************************************");
        try {

            String respuestaJSON = consumoAPI.solicitarDatos();
            JsonAnalizador analisis = new JsonAnalizador(respuestaJSON);

            Set<String> codigosFiltrados = Set.of("ARS", "CRC", "BRL", "USD");
            Map<String, Double> monedasFiltro = analisis.filtrarMonedas(codigosFiltrados);

            System.out.println("Monedas disponibles para la conversion: ");
            monedasFiltro.forEach((codigo, tasa) ->
                    System.out.printf("Codigo: %s - Tasa: %.4f\n", codigo, tasa));


            Scanner scanner = new Scanner(System.in);
            System.out.println("-----Bienvenidos al conversor de monedas-----");

            while (true) {
                System.out.println(
                        "\nOpciones de conversión:\n" +
                                "1. ARS - Peso argentino -> CRC - Colón costarricense\n" +
                                "2. CRC - Colón costarricense -> ARS - Peso argentino\n" +
                                "3. BRL - Real brasileño -> CRC - Colón costarricense\n" +
                                "4. CRC - Colón costarricense -> BRL - Real brasileño\n" +
                                "5. USD - Dólar estadounidense -> CRC - Colón costarricense\n" +
                                "6. CRC - Colón costarricense -> USD - Dólar estadounidense\n" +
                                "0. Salir\n" +
                                "Favor leer el apartado IMPORTANTE en la consola antes de empezar\n " +
                                "Selecciona una opción (1-6 o 0 si desea salir del programa):"

                );
                int opcion = scanner.nextInt();
                Moneda monedaInicial = null;
                Moneda monedaDestino = null;

                ////////variables creadas para evitar redundancias y mayor flexibilidad en el codigo

                Moneda argentino = new Moneda("ARS", monedasFiltro.get("ARS"));
                Moneda colon = new Moneda("CRC", monedasFiltro.get("CRC"));
                Moneda realBrasileno = new Moneda("BRL", monedasFiltro.get("BRL"));
                Moneda dolar = new Moneda("USD", monedasFiltro.get("USD"));

                switch (opcion) {

                    case 1:
                        monedaInicial = argentino;
                        monedaDestino = colon;
                        break;
                    case 2:
                        monedaInicial = colon;
                        monedaDestino = argentino;
                        break;
                    case 3:
                        monedaInicial = realBrasileno;
                        monedaDestino = colon;
                        break;
                    case 4:
                        monedaInicial = colon;
                        monedaDestino = realBrasileno;
                        break;
                    case 5:
                        monedaInicial = dolar;
                        monedaDestino = colon;
                        break;
                    case 6:
                        monedaInicial = colon;
                        monedaDestino = dolar;
                        break;
                    case 0:
                        System.out.println("Salir. Gracias por usar ");
                        return;
                    default:
                        System.out.println("Opcion no válida. Intenta de nuevo.");
                        continue;
                }
                /////metodo para convertir los valores
                if(monedaInicial != null && monedaDestino != null){
                    System.out.println("Ingresa la cantidad en "+ monedaInicial.getCodigo() +": ");
                    double cantidad = scanner.nextDouble();
                    double total = ConversionesCalculadora.convertir(monedaInicial, monedaDestino, cantidad);
                    System.out.printf("Resultado: %.2f %s equivalen a %.2f %s\n", cantidad, monedaInicial.getCodigo(), total, monedaDestino.getCodigo());

                }
            }
        }catch (Exception e) {
            System.out.println("Error al ejecutar el programa: "+ e.getMessage());
        }

    }
}
