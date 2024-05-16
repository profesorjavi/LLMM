package ej_4;

import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;

public class JsonValidator {

    private static final String SCHEMA_JSON = "{\n" +
            "  \"$schema\": \"http://json-schema.org/draft-07/schema#\",\n" +
            "  \"type\": \"object\",\n" +
            "  \"properties\": {\n" +
            "    \"icon_url\": {\n" +
            "      \"type\": \"string\",\n" +
            "      \"format\": \"uri\"\n" +
            "    },\n" +
            "    \"id\": {\n" +
            "      \"type\": \"string\"\n" +
            "    },\n" +
            "    \"url\": {\n" +
            "      \"type\": \"string\"\n" +
            "    },\n" +
            "    \"value\": {\n" +
            "      \"type\": \"string\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"required\": [\"icon_url\", \"id\", \"url\", \"value\"]\n" +
            "}";

    public static boolean validateJson(String jsonString) {
        try {
            JSONObject rawSchema = new JSONObject(SCHEMA_JSON);
            Schema schema = SchemaLoader.load(rawSchema);
            schema.validate(new JSONObject(jsonString));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
