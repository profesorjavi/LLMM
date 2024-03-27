## Recorrer objetos JSON y arrays en Python


**Introducción**

En este documento aprenderás a recorrer diferentes objetos JSON en Python y obtener valores específicos de ellos.

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

**1. Cargar el archivo JSON:**

El primer paso es cargar el archivo JSON en una variable. Puedes hacerlo usando la biblioteca `json`:

```python
import json

with open("heroes.json", "r") as f:
  heroes = json.load(f)
```

**2. Recorrer los objetos JSON:**

Ahora que tenemos los datos en una variable, podemos recorrer los objetos JSON usando un bucle `for`:

```python
for hero in heroes:
  print(f"Nombre: {hero['name']}")
  print(f"Edad: {hero['age']}")
  print(f"Identidad secreta: {hero['secretIdentity']}")

  # Imprimir los poderes
  print("Poderes:")
  for power in hero['powers']:
    print(f" - {power}")
```

2. La f-string:

Las f-strings son una forma de formatear cadenas en Python. Permiten interpolar expresiones dentro de la cadena. En este caso, la expresión hero['name'] se interpola dentro de la cadena para imprimir el nombre del héroe.

3. La variable hero:

La variable hero contiene un objeto JSON que representa a un héroe. El objeto JSON tiene una clave name que contiene el nombre del héroe.

4. La clave name:

La clave name se utiliza para acceder al nombre del héroe dentro del objeto JSON.

**3. Obtener un valor específico:**

Si solo necesitas un valor específico de un objeto JSON, puedes acceder a él directamente usando la clave correspondiente:

```python
hero_name = heroes[0]['name']
hero_age = heroes[1]['age']

print(f"El nombre del primer héroe es: {hero_name}")
print(f"La edad del segundo héroe es: {hero_age}")
```

**Recursos adicionales:**

* **Documentación de la biblioteca json:** [https://docs.python.org/3/library/json.html](https://docs.python.org/3/library/json.html)
* **Tutoriales sobre JSON en Python:** [https://realpython.com/python-json/](https://realpython.com/python-json/)

**Ejercicios:**

* Modifica el código para imprimir solo los nombres de los héroes que tienen más de 100 años.
* Crea una función que recibe un nombre de héroe como argumento y devuelve su edad.
* Escribe un programa que permite al usuario buscar un héroe por su nombre e imprimir su información.

