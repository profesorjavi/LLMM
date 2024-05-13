import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonValidator {
    public static void main(String[] args) {
        JSONObject rawSchema = new JSONObject(
"{  \"$schema\": \"https://json-schema.org/draft/2020-12/schema\",  \"$id\": \"https://example.com/product.schema.json\",  \"title\": \"Product\",  \"description\": \"A product from Acme's catalog\",  \"type\": \"object\",  \"properties\": {    \"productId\": {      \"description\": \"The unique identifier for a product\",      \"type\": \"integer\"    },    \"productName\": {      \"description\": \"Name of the product\",      \"type\": \"string\"    },    \"price\": {      \"description\": \"The price of the product\",      \"type\": \"number\",      \"exclusiveMinimum\": 0    },    \"tags\": {      \"description\": \"Tags for the product\",      \"type\": \"array\",      \"items\": {        \"type\": \"string\"      },      \"minItems\": 1,      \"uniqueItems\": true    }  },  \"required\": [ \"productId\", \"productName\", \"price\" ]}" );

        JSONObject jsonSubject = new JSONObject(
            "{
  \"productId\": 12345,
  \"productName\": \"Example Product\",
  \"price\": 19.99,
  \"tags\": [\"tag1\", \"tag2\"]
}
"
        );

        Schema schema = SchemaLoader.load(rawSchema);
        schema.validate(jsonSubject);
        System.out.println("El JSON es válido según el esquema.");
    }
}
