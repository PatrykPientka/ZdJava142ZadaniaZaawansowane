package day3.NBP;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws MalformedURLException, JsonProcessingException {
        URL nbp = new URL("https://api.nbp.pl/api/exchangerates/tables/a/?format=json");
        StringBuilder result = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(nbp.openConnection().getInputStream()))) {
            String inputLine;
            while ((inputLine = br.readLine()) != null) {
                result.append(inputLine);
            }
            System.out.println(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // mapowanie json na java obiekt - Root
        ObjectMapper om = new ObjectMapper();
        Root root = om.readValue(result.toString(), Root[].class)[0];

        // logika - wyciągnięcie danej waluty
        double eur = root.getRates().stream()
                .filter(rate -> rate.getCode().equalsIgnoreCase("EUR"))
                .mapToDouble(Rate::getMid)
                .findFirst()
                .orElseThrow();
        System.out.println("EUR: " + eur);

        /*
        logika dla usera:
        1. aplikacja pyta: podaj currency
        2. apliakcja pyta: podaj ilość na wymianę
        3. zapis wyniku do pliku
         */
    }
}
