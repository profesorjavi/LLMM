## Esquemas JSON

**¿Para qué sirven?**

Los esquemas JSON se utilizan para definir la estructura de un documento JSON. Un esquema JSON es un documento JSON que describe los tipos de datos y las estructuras que se pueden usar en un documento JSON válido.

**Beneficios:**

* **Validación:** Los esquemas JSON se pueden usar para validar documentos JSON para asegurarse de que cumplen con la estructura definida.
* **Documentación:** Los esquemas JSON pueden usarse para documentar la estructura de un documento JSON.
* **Interoperabilidad:** Los esquemas JSON pueden usarse para mejorar la interoperabilidad entre diferentes aplicaciones que intercambian datos JSON.

**¿Cómo se realizan?**

Los esquemas JSON se definen utilizando la sintaxis JSON. Un esquema JSON se compone de una serie de definiciones que describen los tipos de datos y las estructuras que se pueden usar en un documento JSON válido.

**Tipos de definiciones:**

* **`type`:** Define el tipo de dato que se puede usar para una propiedad. Los tipos de datos válidos son `string`, `number`, `boolean`, `object`, `array` y `null`.
* **`properties`:** Define un conjunto de propiedades que se pueden usar en un objeto.
* **`items`:** Define el tipo de dato que se puede usar para los elementos de un array.
* **`required`:** Define una lista de propiedades que son obligatorias para un objeto.
* **`enum`:** Define una lista de valores válidos que se pueden usar para una propiedad.


**Toda la documentación la encontramos en:**

  [https://json-schema.org/learn/getting-started-step-by-step](https://json-schema.org/learn/getting-started-step-by-step)



**Ejemplo:**

```json
{
  "$schema": "http://json-schema.org/draft-07/schema#",
  "title": "Instituto La Sénia",
  "type": "object",
  "properties": {
    "nombre": {
      "type": "string",
      "required": true
    },
    "ubicacion": {
      "type": "string",
      "required": true
    },
    "fundacion": {
      "type": "integer",
      "required": true
    },
    "tipo": {
      "type": "string",
      "enum": ["instituto de educación secundaria", "escuela primaria", "escuela infantil"]
    }
  }
}
```



## Validar un documento JSON con un esquema

**Existen dos maneras principales de validar un documento JSON con un esquema:**

**1. Usando herramientas en línea:**

    [https://www.jsonschemavalidator.net/](https://www.jsonschemavalidator.net/)


**2. Usando una biblioteca de validación JSON:**

## Librerías Python para validar un esquema JSON

**Existen varias librerías Python que se pueden usar para validar un esquema JSON.**


**jsonschema**

* **Documentación:** [https://python-jsonschema.readthedocs.io/en/stable/](https://python-jsonschema.readthedocs.io/en/stable/)
* **Instalación:** `pip install jsonschema`

**Ejemplo de uso:**

```python
import jsonschema

schema = {
  "type": "object",
  "properties": {
    "nombre": {
      "type": "string",
      "required": True
    },
    "edad": {
      "type": "integer",
      "required": True
    }
  }
}

data = {
  "nombre": "Juan",
  "edad": 30
}

try:
  jsonschema.validate(data, schema)
  print("El documento JSON es válido")
except jsonschema.ValidationError as e:
  print(f"El documento JSON no es válido: {e}")
```


**Recursos adicionales:**

* **Documentación oficial de JSON Schema:** [https://json-schema.org/](https://json-schema.org/)
* **Tutorial de JSON Schema:** [se quitó una URL no válida]
