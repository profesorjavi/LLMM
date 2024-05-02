## Recorrer objetos JSON con java


**Introducción**

En este documento aprenderás a recorrer diferentes objetos JSON con java.

**Ejemplo**

Comencemos con el siguiente ejemplo:

```json
{
  "name": "Madame Uppercut",
  "age": 39,
  "secretIdentity": "Jane Wilson",
  "powers": [
    "Million tonne punch",
    "Damage resistance",
    "Superhuman reflexes"
  ]
},
{
  "name": "Eternal Flame",
  "age": 1000000,
  "secretIdentity": "Unknown",
  "powers": [
    "Immortality",
    "Heat Immunity",
    "Inferno",
    "Teleportation",
    "Interdimensional travel"
  ]
}
```


Para recorrer objetos JSON y arrays en Java utilizando la librería GSON, primero necesitas convertir el JSON en un objeto Java utilizando GSON, y luego puedes acceder a los campos y elementos del objeto Java de manera programática. Aquí tienes un ejemplo de cómo hacerlo con tu JSON:

