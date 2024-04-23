## Ejercicios con Atributos en Esquemas XML Nivel 2

### Ejercicio 1: Ruedas y coches
**Objetivo:**

El taller mecánico "Ruedas y Coches" necesita asegurarse de que todos sus documentos XML estén correctamente estructurados y cumplan con un estándar predefinido. Tu tarea es crear un programa que valide los documentos XML proporcionados por el taller, garantizando que cumplan con las especificaciones requeridas.

#### Especificaciones parte 1
Ejemplo de partida de un XML realizado por el taller

```xml
<?xml version="1.0" encoding="utf-8"?>
<taller>
    <marca id = "AB45GTX" />
    <matriz id ="DFX-D"> Renault Madrid </matriz>
    <coche>
        <marca>Porche</marca>
        <color>rojo</color>
    </coche>
    <mecanico especialidad="electrónica">
        <nombre>Rodrigo</nombre>
        <apellido>Vivar</apellido>
    </mecanico>
    <observaciones>
        <importancia>true</importancia>
        <fecha>2024-10-10</fecha>
        Este taller se de dedica principalmente a la reparación de vehículos de alta gama
    </observaciones>

</taller>

```


* La marca únicamente tendrá el atributo id
* La matriz puede tener un atributo id o no
* El coche esta formado por la marca y el color en ese orden
* El mecánico esta formado por el nombre y apellido en ese orden, además siempre se indica su especialidad
* Las observaciones estan formadas por su relevancia y la fecha además del texto propia de la observación

#### Especificaciones parte 2
Modificamos/ampliamos el esquema para que cumpla:


* No importa el orden de los elementos marca y colo de un coche
* Añadimos el elemento relevancia junto con el de importancia en las observaciones, en el xml únicamente aparecerá uno de los dos.
* El elemento coche puede repetirse 
* No es necesario que si indique el color de un coche ni la matriz 
* Como mínimo hay que indicar 2 mecanicos

#### Especificaciones parte 3
Modificamos/ampliamos el esquema para que cumpla:

* Crear un grupo para nombre completo y añadirlo tanto a mecanico como a un nuevo elemento opcional llamado gerente
* Crear un tipo de datos global para las especialidades de los mecanicos que únicamente tome los valores de (electrónica, chapa y pintura, motores) que además sea requerido 
  


----------------





### Ejercicio 2: La Feria Medieval XML

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

----------------

### Ejercicio 3 de Restricción de Valores en XML

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
    <precio>500</precio>
  </mascota>
  <mascota tipo="gato">
    <nombre>Luna</nombre>
    <especie>Felino</especie>
    <raza>Siamés</raza>
    <edad>1</edad>
    <precio>300</precio>
  </mascota>
  <mascota tipo="ave">
    <nombre>Periquito</nombre>
    <especie>Psitácido</especie>
    <raza>Común</raza>
    <edad>0.5</edad>
    <precio>20</precio>
  </mascota>
</tienda>
```
