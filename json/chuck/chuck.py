import json
import requests
import apertium
import os


from apertium import Translator

# libreria request ----> https://juncotic.com/solicitudes-http-en-python-con-requests/
# información API  ----> https://profile.es/blog/apis-front-end/
# API chuckNorris  ----> https://api.chucknorris.io/
####### traduccion ---> https://github.com/apertium/apertium-python
# sudo apt install apertium-en-es


### Parte1 mostrar 
def cita_random(doc):
	chiste=doc["value"]
	return chiste

def chuck_norris_joke():
    url = "https://api.chucknorris.io/jokes/random"
    response = requests.get(url)
    if response.status_code == 200:
        data = response.json()
        return data['value']
    else:
        return None


def translate_to_spanish(text):
    # Creamos un traductor para el par de idiomas inglés-español
    traductor = Translator("en", "es")
    # Traducimos la frase "Hola mundo!"
    traduccion = traductor.translate(text)
    # Imprimimos la traducción
    return traduccion



## Parte1 mostrar el json
r = requests.get('https://api.chucknorris.io/jokes/random')
#cita = r.json()
cita = json.loads(r.text)
print (cita)

## Parte 2 mostrar el texto de la cita
print ("Parte 2 mostrar el texto de la cita")
chiste=cita_random(cita)
print (chiste)


### Parte 3 Con numero de chistes en castellano y traduccción
num_requests = int(input("Ingrese el número de peticiones: "))
os.system('clear')
for _ in range(num_requests):
    joke = chuck_norris_joke()
    if joke:
        print(joke)    
        print("------traducción------")
        translated_joke = translate_to_spanish(joke)
        print(translated_joke)
    else:
        print("No se pudo obtener la broma de Chuck Norris.")
