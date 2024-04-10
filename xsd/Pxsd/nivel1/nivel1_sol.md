## Ejercicios Divertidos de Esquemas XML para Informática

**Ejercicio 2: La Guerra de las Galaxias XML**

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


**Solución**
´´´xsd
<?xml version="1.0" encoding="utf-8"?>
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema">
  <xs:element name="orden">
    <xs:complexType>
      <xs:sequence>
        <xs:element name="tipo" type="xs:string"/>
        <xs:element name="objetivo" type="xs:string"/>
        <xs:element name="fuerzas">
          <xs:complexType>
            <xs:sequence>
              <xs:element name="unidad" type="xs:string" maxOccurs="unbounded"/>
            </xs:sequence>
          </xs:complexType>
        </xs:element>
        <xs:element name="coordenadas">
          <xs:complexType>
            <xs:sequence>
              <xs:element name="latitud" type="xs:decimal"/>
              <xs:element name="longitud" type="xs:decimal"/>
            </xs:sequence>
          </xs:complexType>
        </xs:element>
      </xs:sequence>
    </xs:complexType>
  </xs:element>
</xs:schema>
´´´

**Ejercicio 2: La Búsqueda del Tesoro XML**

Imagina que eres un pirata informático en busca de un tesoro escondido. Tu mapa te lleva a una isla misteriosa donde encuentras un antiguo pergamino con un extraño código. ¡Es un archivo XML! Para descifrar el código y encontrar el tesoro, necesitas crear un esquema XSD que describa la estructura del archivo XML.

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
3. Usa la información del archivo XML y tu ingenio para descifrar las pistas y encontrar el tesoro.

**Solución:**

```xsd
<?xml version="1.0" encoding="utf-8"?>
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema">
  <xs:element name="mapa">
    <xs:complexType>
      <xs:sequence>
        <xs:element name="titulo" type="xs:string"/>
        <xs:element name="coordenadas">
          <xs:complexType>
            <xs:sequence>
              <xs:element name="latitud" type="xs:decimal"/>
              <xs:element name="longitud" type="xs:decimal"/>
            </xs:sequence>
          </xs:complexType>
        </xs:element>
        <xs:element name="pistas">
          <xs:complexType>
            <xs:sequence>
              <xs:element name="pista" type="xs:string" maxOccurs="unbounded"/>
            </xs:sequence>
          </xs:complexType>
        </xs:element>
        <xs:element name="tesoro">
          <xs:complexType>
            <xs:sequence>
              <xs:element name="nombre" type="xs:string"/>
              <xs:element name="descripcion" type="xs:string"/>
            </xs:sequence>
          </xs:complexType>
        </xs:element>
      </xs:sequence>
    </xs:complexType>
  </xs:element>
</xs:schema>
```
