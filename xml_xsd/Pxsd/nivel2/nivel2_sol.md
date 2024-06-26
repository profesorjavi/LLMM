## Ejercicios con Atributos en Esquemas XML Nivel 2

**Ejercicio 1: La Feria Medieval XML**

En la feria medieval, hay un vendedor de armaduras que tiene un inventario de cascos, espadas y escudos. Para organizar su inventario, necesita un archivo XML que describa cada pieza de armadura con sus características. ¡Tu misión es crear un esquema XSD que le ayude a tener un inventario ordenado!

**El inventario XML:**

```xml
<?xml version="1.0" encoding="utf-8"?>
<armaduras>
  <casco nombre="Casco de Caballero" tipo="cerrado" material="acero" precio="100 monedas">
    <descripcion>Un casco resistente con visera para proteger la cabeza del caballero.</descripcion>
  </casco>
  <espada nombre="Espada Larga" tipo="mandoble" material="acero" filo="doble" precio="80 monedas">
    <descripcion>Una espada larga y pesada para cortar y apuñalar.</descripcion>
  </espada>
  <escudo nombre="Escudo Normando" material="madera" tamaño="grande" diseño="escudo de cruz" precio="50 monedas">
    <descripcion>Un escudo grande de madera con diseño de cruz para proteger al caballero de flechas y lanzas.</descripcion>
  </escudo>
</armaduras>
```

**Tu misión:**

1. Crea un esquema XSD que defina la estructura del archivo XML, incluyendo atributos para cada elemento.
2. Valida el archivo XML contra el esquema XSD para asegurarte de que no haya errores.

**Solución:**

```xsd
<?xml version="1.0" encoding="utf-8"?>
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema">
  <xs:element name="armaduras">
    <xs:complexType>
      <xs:sequence>
        <xs:element name="casco" maxOccurs="unbounded">
          <xs:complexType>
            <xs:attribute name="nombre" type="xs:string" use="required"/>
            <xs:attribute name="tipo" type="xs:string" use="required"/>
            <xs:attribute name="material" type="xs:string" use="required"/>
            <xs:attribute name="precio" type="xs:decimal" use="required"/>
            <xs:element name="descripcion" type="xs:string" minOccurs="0"/>
          </xs:complexType>
        </xs:element>
        <xs:element name="espada" maxOccurs="unbounded">
          <xs:complexType>
            <xs:attribute name="nombre" type="xs:string" use="required"/>
            <xs:attribute name="tipo" type="xs:string" use="required"/>
            <xs:attribute name="material" type="xs:string" use="required"/>
            <xs:attribute name="filo" type="xs:string" use="required"/>
            <xs:attribute name="precio" type="xs:decimal" use="required"/>
            <xs:element name="descripcion" type="xs:string" minOccurs="0"/>
          </xs:complexType>
        </xs:element>
        <xs:element name="escudo" maxOccurs="unbounded">
          <xs:complexType>
            <xs:attribute name="nombre" type="xs:string" use="required"/>
            <xs:attribute name="material" type="xs:string" use="required"/>
            <xs:attribute name="tamaño" type="xs:string" use="required"/>
            <xs:attribute name="diseño" type="xs:string" use="required"/>
            <xs:attribute name="precio" type="xs:decimal" use="required"/>
            <xs:element name="descripcion" type="xs:string" minOccurs="0"/>
          </xs:complexType>
        </xs:element>
      </xs:sequence>
    </xs:complexType>
  </xs:element>
</xs:schema>
```

## Ejercicio 2 de Restricción de Valores en XML

**Objetivo:**

Crear un esquema XSD que restrinja los valores permitidos para elementos y atributos XML en un contexto de una tienda de mascotas.

**Explicación:**

* El esquema XSD define la estructura del archivo XML para una tienda de mascotas.
* El elemento "tienda" es el elemento raíz del archivo.
* El elemento "mascota" define una mascota individual.
* El elemento "nombre" define el nombre de la mascota.
* El elemento "especie" define la especie de la mascota.
* El elemento "raza" define la raza de la mascota (opcional).
* El elemento "edad" define la edad de la mascota.
* El elemento "precio" define el precio de la mascota.
* El atributo "tipo" define el tipo de mascota (perro, gato, ave, reptil).
* La restricción en el atributo "tipo" limita los valores permitidos a las cuatro opciones enumeradas.

**Ejemplo de llamada al XML:**

```xml
<?xml version="1.0" encoding="utf-8"?>
<tienda>
  <mascota tipo="perro">
    <nombre>Toby</nombre>
    <especie>Canino</especie>
    <raza>Labrador Retriever</raza>
    <edad>2</edad>
    <precio>500€</precio>
  </mascota>
  <mascota tipo="gato">
    <nombre>Luna</nombre>
    <especie>Felino</especie>
    <raza>Siamés</raza>
    <edad>1</edad>
    <precio>300€</precio>
  </mascota>
  <mascota tipo="ave">
    <nombre>Periquito</nombre>
    <especie>Psitácido</especie>
    <raza>Común</raza>
    <edad>0.5</edad>
    <precio>20€</precio>
  </mascota>
</tienda>
```

**Esquema XSD:**

```xsd
<?xml version="1.0" encoding="utf-8"?>
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema">
  <xs:element name="tienda">
    <xs:complexType>
      <xs:sequence>
        <xs:element name="mascota" maxOccurs="unbounded">
          <xs:complexType>
            <xs:sequence>
              <xs:element name="nombre" type="xs:string"/>
              <xs:element name="especie" type="xs:string"/>
              <xs:element name="raza" type="xs:string" minOccurs="0"/>
              <xs:element name="edad" type="xs:integer"/>
              <xs:element name="precio" type="xs:decimal"/>
            </xs:sequence>
            <xs:attribute name="tipo" type="xs:string" use="required">
              <xs:restriction base="xs:string">
                <xs:enumeration value="perro"/>
                <xs:enumeration value="gato"/>
                <xs:enumeration value="ave"/>
                <xs:enumeration value="reptil"/>
              </xs:restriction>
            </xs:attribute>
          </xs:complexType>
        </xs:element>
      </xs:sequence>
    </xs:complexType>
  </xs:element>
</xs:schema>
```



