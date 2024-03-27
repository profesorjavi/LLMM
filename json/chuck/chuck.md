# Práctica de iniciación a JSON con Python y la API de Chuck Norris

![](chuck_norris_seal_of_approval_by_jigaraphale_dculocj-pre.png)
https://www.deviantart.com/jigaraphale/art/Chuck-Norris-Seal-Of-Approval-776993923


> ## Empieza investigando como fuciona la API de Chuck
>
> * **API de Chuck Norris:** [https://api.chucknorris.io/](https://api.chucknorris.io/)

## Parte 1: Mostrar el JSON

**Objetivo:** Imprimir el contenido del objeto JSON obtenido de la API de Chuck Norris.

**Pasos:**

1. Importar la biblioteca `json`.
2. Realizar una solicitud GET a la API de Chuck Norris (`https://api.chucknorris.io/jokes/random`) usando la biblioteca `requests`.
3. Decodificar la respuesta JSON usando la función `json.loads`.
4. Imprimir el contenido del objeto JSON usando `print`.

**Código:**

```python
import json
import requests

# Realizar la solicitud GET a la API
response = requests.get('https://api.chucknorris.io/jokes/random')

# Decodificar la respuesta JSON
data = json.loads(response.text)

# Imprimir el contenido del objeto JSON
print(data)
```

## Parte 2: Mostrar el texto de la cita

**Objetivo:** Extraer el texto de la broma del objeto JSON y mostrarlo por pantalla.

**Pasos:**

1. Definir una función `cita_random` que recibe un objeto JSON como argumento y devuelve el texto de la broma.
2. En la función `cita_random`, acceder al campo `value` del objeto JSON.
3. Llamar a la función `cita_random` con el objeto JSON obtenido de la API y mostrar el resultado por pantalla.

## Parte 3: Mostrar varias citas con traducción

**Objetivo:** Solicitar al usuario un número de citas, obtenerlas de la API, traducirlas al castellano y mostrarlas por pantalla.

**Pasos:**

1. Solicitar al usuario un número de citas mediante la función `input`.
2. Utilizar un bucle `for` para realizar el número de peticiones indicado por el usuario.
3. En cada iteración del bucle:
   - Obtener una nueva cita usando la función `chuck_norris_joke`.
   - Si la cita se ha obtenido correctamente:
     - Mostrar la cita en inglés.
     - Traducir la cita al castellano usando la función `translate_to_spanish` (que utiliza la biblioteca `apertium`).
     - Mostrar la traducción al castellano.
   - Si no se ha podido obtener la cita, mostrar un mensaje de error.

### Recursos adicionales

* **Documentación de la biblioteca json:** [https://docs.python.org/3/library/json.html](https://docs.python.org/3/library/json.html)
* **Documentación de la biblioteca requests:** [se quitó una URL no válida]
* **Documentación de la biblioteca apertium-python:** [https://github.com/apertium/apertium-python](https://github.com/apertium/apertium-python)
* **API de Chuck Norris:** [https://api.chucknorris.io/](https://api.chucknorris.io/)

### Notas

* Asegúrate de instalar las bibliotecas necesarias (`json`, `requests`, `apertium-python`) antes de ejecutar el código.
  * sudo apt install apertium-en-es
* Puedes modificar el código para adaptarlo a tus necesidades. Por ejemplo, puedes cambiar el idioma de traducción o añadir otras funcionalidades
