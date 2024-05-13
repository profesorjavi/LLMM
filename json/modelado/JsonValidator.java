import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonValidator {
    public static void main(String[] args) {
        JSONObject rawSchema = new JSONObject(
            // Inserta tu esquema JSON Schema aquí como una cadena JSON
        );

        JSONObject jsonSubject = new JSONObject(
            // Inserta tu JSON aquí como una cadena JSON
        );

        Schema schema = SchemaLoader.load(rawSchema);
        schema.validate(jsonSubject);
        System.out.println("El JSON es válido según el esquema.");
    }
}
