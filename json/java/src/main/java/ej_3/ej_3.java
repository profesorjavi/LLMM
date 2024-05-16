package ej_3;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class ej_3 {


    public static void main() {
        String jokeJson = getChuckNorrisJoke();
        
        Gson gson = new Gson();
        ChuckNorrisJoke joke = gson.fromJson(jokeJson, ChuckNorrisJoke.class);

        System.out.println("Chuck Norris Joke traducido:");

       // System.out.println(getChuckNorrisJoke_traducido(joke.getValue(), "", ""));
    }

    private static String getChuckNorrisJoke() {
        
        System.out.println("borrar");
        return "borrar";
    }
 /*   private static String getChuckNorrisJoke() {
        StringBuilder jokeJson = new StringBuilder();
        try {
            URL url = new URL("https://api.chucknorris.io/jokes/random");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                jokeJson.append(inputLine);
            }

            in.close();

            

        } catch (IOException e) {
            e.printStackTrace();
        }
        return jokeJson.toString();
    }
*/

    private static String getChuckNorrisJoke_traducido(String encodedText, String sourceLang, String targetLang  ) {
       
        String API_URL = "https://www.apertium.org/apy/translate";

        String urlString = API_URL + "?q=" + encodedText + "&langpair=" + "en" + "|" + "es";
        StringBuilder response = new StringBuilder();

        try {
            // Realizar la solicitud HTTP GET
            HttpURLConnection connection = (HttpURLConnection) new URL(urlString).openConnection();
            connection.setRequestMethod("GET");

            // Leer la respuesta de la API
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();
         } catch (IOException e) {
            e.printStackTrace();
        }
        return response.toString();
    }

}
