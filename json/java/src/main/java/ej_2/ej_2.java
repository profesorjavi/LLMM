package ej_2;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ej_2 {
    public static void main() {
        String jokeJson = getChuckNorrisJoke();
        
        Gson gson = new Gson();
        ChuckNorrisJoke joke = gson.fromJson(jokeJson, ChuckNorrisJoke.class);

        System.out.println("Chuck Norris Joke:");

        System.out.println(joke.getValue());
    }

    private static String getChuckNorrisJoke() {
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
}
