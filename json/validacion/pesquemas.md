## Práctica: Modelado de información con JSON y Python

**Objetivo:** Modelar la información de un texto en dos objetos JSON, crear un esquema para validarlos y escribir un código en Python para realizar la validación.

**Texto:**

```
**Instituto La Sénia**

**Dirección:** Calle Mayor, 12, 43760 La Sénia, Tarragona, España

**Teléfono:** +34 977 580 123

**Correo electrónico:** info@institutlasenia.cat

**Sitio web:** https://www.institutlasenia.cat/

**Oferta educativa:**

* ESO
* Bachillerato
* Ciclos formativos de grado medio
* Ciclos formativos de grado superior

**Instalaciones:**

* Aulas con pizarras digitales
* Laboratorios de ciencias
* Biblioteca
* Gimnasio
* Pista deportiva
* Comedor
```

**Objetos JSON:**

**1. Instituto:**

```json
{
  "nombre": "Instituto La Sénia",
  "direccion": "Calle Mayor, 12, 43760 La Sénia, Tarragona, España",
  "telefono": "+34 977 580 123",
  "correo_electronico": "info@institutlasenia.cat",
  "sitio_web": "https://www.institutlasenia.cat/"
}
```

**2. Oferta educativa:**

```json
{
  "niveles": [
    "ESO",
    "Bachillerato",
    "Ciclos formativos de grado medio",
    "Ciclos formativos de grado superior"
  ]
}
```

**Esquema JSON:**

```json
{
  "$schema": "http://json-schema.org/draft-07/schema#",
  "title": "Instituto La Sénia",
  "type": "object",
  "properties": {
    "instituto": {
      "type": "object",
      "properties": {
        "nombre": {
          "type": "string",
          "required": True
        },
        "direccion": {
          "type": "string",
          "required": True
        },
        "telefono": {
          "type": "string",
          "required": True
        },
        "correo_electronico": {
          "type": "string",
          "required": True
        },
        "sitio_web": {
          "type": "string",
          "required": True
        }
      }
    },
    "oferta_educativa": {
      "type": "object",
      "properties": {
        "niveles": {
          "type": "array",
          "items": {
            "type": "string"
          }
        }
      }
    }
  }
}
```

**Código Python:**

```python
import jsonschema

# Cargar el esquema JSON
schema = json.loads(open("esquema.json").read())

# Cargar los datos JSON
instituto = json.loads(open("instituto.json").read())
oferta_educativa = json.loads(open("oferta_educativa.json").read())

# Validar los datos JSON
try:
  jsonschema.validate(instituto, schema["properties"]["instituto"])
  jsonschema.validate(oferta_educativa, schema["properties"]["oferta_educativa"])
  print("Los datos JSON son válidos")
except jsonschema.ValidationError as e:
  print(f"Los datos JSON no son válidos: {e}")
```

**Explicación:**

* El código Python primero carga el esquema JSON en una variable.
* Luego, carga los dos objetos JSON en variables separadas.
* Finalmente, utiliza la biblioteca `jsonschema` para validar los dos objetos JSON contra el esquema.

**Recursos adicionales:**

* **Documentación oficial de JSON Schema:** [https://json-schema.org/](https://json-schema.org/)
* **Tutorial de JSON Schema:** [se quitó una URL no válida]
* **Librería jsonschema:** [https://python-jsonschema.readthedocs.io/en/stable/](https://python-jsonschema.readthedocs.io/en/stable/)
