# Ruedas y Coches

# Parte 1.

Queremos un esquema XML para validar docuementos XML de este tipo

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
#### Especificaciones parte 1
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
