## Práctica con la API de Star Wars en Python

**Formato Markdown**

**Introducción**

En esta práctica, aprenderás a realizar peticiones a la API de Star Wars y procesar la información para obtener diferentes resultados.

**Tareas:**

**1. Obtener información sobre un personaje:  "https://swapi.dev/api/people/1/"**

* Imprime el nombre, la altura, el peso y el color de pelo del personaje.

**2. Obtener la lista de películas: https://swapi.dev/api/films/**

* Imprime el título de cada película.

**3. Obtener información sobre una película: https://swapi.dev/api/films/1/**

* Imprime el título, el director, el año de estreno y los personajes que aparecen en la película.

**4. Buscar personajes por nombre: name = "Luke Skywalker"**

* Imprime el nombre, la altura y el planeta de origen de cada personaje que coincida con la búsqueda.

**5. Obtener la lista de planetas: name = "Luke Skywalker"**

* Imprime el nombre y el clima de cada planeta.

**6. Obtener información sobre un planeta: "https://swapi.dev/api/planets/1/"**

* Imprime el nombre, el clima, la población y el terreno del planeta.

**7. Obtener la lista de naves espaciales: https://swapi.dev/api/starships/**

* Imprime el nombre, el modelo y la clase de cada nave espacial.
  
**8. Obtener la lista de películas de Star Wars y obtener la lista de personajes para cada película.**

* Imprime la pelicula y el nombre de sus personajes.

**9. Encontrar todas las parejas de personajes de Star Wars que comparten una película y que además tienen un planeta de origen diferente**

* Imprime la pareja de personajes, la pelicula, el planeta de origen y el planeta de destino.

**Recursos adicionales:**

* **Documentación de la API de Star Wars:** [https://swapi.dev/documentation](https://swapi.dev/documentation)
* **Tutoriales sobre la API de Star Wars:** [se quitó una URL no válida]

**Solución:**

**1. Obtener información sobre un personaje:**

```python
import requests

url = "https://swapi.dev/api/people/1/"

response = requests.get(url)

if response.status_code == 200:
  data = response.json()
  print(f"Nombre: {data['name']}")
  print(f"Altura: {data['height']}")
  print(f"Peso: {data['mass']}")
  print(f"Color de pelo: {data['hair_color']}")
```

**2. Obtener la lista de películas:**

```python
import requests

url = "https://swapi.dev/api/films/"

response = requests.get(url)

if response.status_code == 200:
  data = response.json()
  for film in data['results']:
    print(film['title'])
```

**3. Obtener información sobre una película:**

```python
import requests

url = "https://swapi.dev/api/films/1/"

response = requests.get(url)

if response.status_code == 200:
  data = response.json()
  print(f"Título: {data['title']}")
  print(f"Director: {data['director']}")
  print(f"Año de estreno: {data['release_date']}")
  print("Personajes:")
  for character in data['characters']:
    print(f" - {character}")
```

**4. Buscar personajes por nombre:**

```python
import requests

name = "Luke Skywalker"

url = f"https://swapi.dev/api/people/?search={name}"

response = requests.get(url)

if response.status_code == 200:
  data = response.json()
  for character in data['results']:
    print(f"Nombre: {character['name']}")
    print(f"Altura: {character['height']}")


## Continuación de la práctica con la API de Star Wars en Python
**5. Obtener la lista de planetas:**

```python
import requests

url = "https://swapi.dev/api/planets/"

response = requests.get(url)

if response.status_code == 200:
  data = response.json()
  for planet in data['results']:
    print(f"Nombre: {planet['name']}")
    print(f"Clima: {planet['climate']}")
```

**6. Obtener información sobre un planeta:**

```python
import requests

url = "https://swapi.dev/api/planets/1/"

response = requests.get(url)

if response.status_code == 200:
  data = response.json()
  print(f"Nombre: {data['name']}")
  print(f"Clima: {data['climate']}")
  print(f"Población: {data['population']}")
  print(f"Terreno: {data['terrain']}")
```

**7. Obtener la lista de naves espaciales:**

```python
import requests

url = "https://swapi.dev/api/starships/"

response = requests.get(url)

if response.status_code == 200:
  data = response.json()
  for starship in data['results']:
    print(f"Nombre: {starship['name']}")
    print(f"Modelo: {starship['model']}")
    print(f"Clase: {starship['starship_class']}")
```

**8. Obtener la lista de películas de Star Wars y obtener la lista de personajes para cada película.**

```python
import requests

url = "https://swapi.dev/api/films/"

response = requests.get(url)

if response.status_code == 200:
  data = response.json()
  films = data['results']

for film in films:
  # Imprimir el título de la película
  print(f"Película: {film['title']}")

  # Obtener la lista de personajes de la película
  url = film['characters'][0]

  response = requests.get(url)

  if response.status_code == 200:
    data = response.json()
    characters = data['results']

  # Recorrer la lista de personajes
  for character in characters:
    # Imprimir el nombre del personaje
    print(f" - {character['name']}")
```

**9. Encontrar todas las parejas de personajes de Star Wars que comparten una película y que además tienen un planeta de origen diferente.**

**Solución:**

```python
import requests

# Obtener la lista de películas
url_peliculas = "https://swapi.dev/api/films/"
response_peliculas = requests.get(url_peliculas)
data_peliculas = response_peliculas.json()

# Recorrer las películas
for pelicula in data_peliculas['results']:
  # Obtener la lista de personajes de la película
  url_personajes = pelicula['characters']
  response_personajes = requests.get(url_personajes)
  data_personajes = response_personajes.json()

  # Recorrer los personajes de la película
  for personaje1 in data_personajes['results']:
    # Obtener el planeta de origen del personaje 1
    url_planeta1 = personaje1['homeworld']
    response_planeta1 = requests.get(url_planeta1)
    data_planeta1 = response_planeta1.json()

    # Recorrer los personajes de la película
    for personaje2 in data_personajes['results']:
      # Si el personaje 2 es diferente al personaje 1
      if personaje1 != personaje2:
        # Obtener el planeta de origen del personaje 2
        url_planeta2 = personaje2['homeworld']
        response_planeta2 = requests.get(url_planeta2)
        data_planeta2 = response_planeta2.json()

        # Si los personajes tienen diferentes planetas de origen
        if data_planeta1['name'] != data_planeta2['name']:
          print(f"Pareja de personajes: {personaje1['name']} y {personaje2['name']}")
          print(f"Película: {pelicula['title']}")
          print(f"Planeta de origen de {personaje1['name']}: {data_planeta1['name']}")
          print(f"Planeta de origen de {personaje2['name']}: {data_planeta2['name']}")
          print()
```

**Recursos adicionales:**

* **Documentación de la API de Star Wars:** [https://swapi.dev/documentation](https://swapi.dev/documentation)
* **Tutoriales sobre la API de Star Wars:** [se quitó una URL no válida]

**Notas:**

* Esta práctica es solo un punto de partida. Puedes ampliarla o modificarla para adaptarla a tus necesidades.
* Te recomiendo que explores la API de Star Wars para descubrir otras funcionalidades que puedes utilizar.

**Espero que esta práctica te haya sido útil.**

**Si tienes alguna otra pregunta sobre la API de Star Wars o sobre la práctica, no dudes en preguntar.**
