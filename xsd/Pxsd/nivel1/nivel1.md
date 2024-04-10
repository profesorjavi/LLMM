## Ejercicios Esquemas XML nivel 1

**Fuentes**

* github.com/AlanLlorente/ifp-asir
* github.com/alenewberry/CSAppBE
* github.com/Hiroshi1228/Proyecto-T4IS


**Ejercicio 1: La Guerra de las Galaxias XML**

El Imperio Galáctico está atacando la base rebelde en Hoth. Para defenderse, los rebeldes necesitan descifrar las comunicaciones imperiales. Han interceptado un mensaje codificado en XML, pero no saben cómo interpretarlo. ¡Tu misión es crear un esquema XSD que les ayude a entender el mensaje y ganar la batalla!

**El mensaje XML:**

```xml
<?xml version="1.0" encoding="utf-8"?>
<orden>
  <tipo>ataque</tipo>
  <objetivo>base rebelde Hoth</objetivo>
  <fuerzas>
    <unidad>batallón de AT-AT</unidad>
    <unidad>escuadrón de TIE Fighters</unidad>
  </fuerzas>
  <coordenadas>
    <latitud>-89.123456</latitud>
    <longitud>179.678901</longitud>
  </coordenadas>
</orden>
```

**Tu misión:**

1. Crea un esquema XSD que defina la estructura del mensaje XML.
2. Valida el mensaje XML contra el esquema XSD para asegurarte de que no haya errores.


**Ejercicio 2: La Búsqueda del Tesoro XML**

**El pergamino XML:**

```xml
<?xml version="1.0" encoding="utf-8"?>
<mapa>
  <titulo>Mapa del Tesoro Perdido</titulo>
  <coordenadas>
    <latitud>-33.873651</latitud>
    <longitud>151.206990</longitud>
  </coordenadas>
  <pistas>
    <pista>Sigue la luz del faro.</pista>
    <pista>Cruza el puente de piedra.</pista>
    <pista>Escala la montaña más alta.</pista>
    <pista>Cava bajo la palmera.</pista>
  </pistas>
  <tesoro>
    <nombre>El Cofre de Oro Azteca</nombre>
    <descripcion>Un cofre de oro macizo con joyas y monedas antiguas.</descripcion>
  </tesoro>
</mapa>
```

**Tu misión:**

1. Crea un esquema XSD que defina la estructura del archivo XML.
2. Valida el archivo XML contra el esquema XSD para asegurarte de que no haya errores.
