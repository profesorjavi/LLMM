package ej_1;
import com.google.gson.Gson;

public class ej_1 {
    public static void main() {
        String json = "[\n" +
                "  {\n" +
                "    \"name\": \"Madame Uppercut\",\n" +
                "    \"age\": 39,\n" +
                "    \"secretIdentity\": \"Jane Wilson\",\n" +
                "    \"powers\": [\n" +
                "      \"Million tonne punch\",\n" +
                "      \"Damage resistance\",\n" +
                "      \"Superhuman reflexes\"\n" +
                "    ]\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"Eternal Flame\",\n" +
                "    \"age\": 1000000,\n" +
                "    \"secretIdentity\": \"Unknown\",\n" +
                "    \"powers\": [\n" +
                "      \"Immortality\",\n" +
                "      \"Heat Immunity\",\n" +
                "      \"Inferno\",\n" +
                "      \"Teleportation\",\n" +
                "      \"Interdimensional travel\"\n" +
                "    ]\n" +
                "  }\n" +
                "]";

        Gson gson = new Gson();
        
        Superhero[] superheroes = gson.fromJson(json, Superhero[].class);

        for (Superhero superhero : superheroes) {
            System.out.println("Name: " + superhero.getName());
            System.out.println("Age: " + superhero.getAge());
            System.out.println("Secret Identity: " + superhero.getSecretIdentity());
            System.out.println("Powers:");
            for (String power : superhero.getPowers()) {
                System.out.println("- " + power);
            }
            System.out.println();
        }
    }
    
}
