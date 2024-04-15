#### Contexto:
Imagina que estás trabajando en un proyecto de desarrollo web para una empresa de turismo que desea mostrar información sobre diferentes destinos turísticos. La empresa necesita una forma estructurada de almacenar esta información para poder mostrarla en su sitio web de manera consistente.

#### Especificaciones:
1. Cada destino turístico debe tener un nombre, una descripción, una lista opcional de actividades y una lista opcional de atracciones.
2. La lista de actividades y la lista de atracciones principales pueden contener cero o más elementos.
3. Cada actividad debe tener un nombre y una descripción.
4. Cada atracción principal debe tener un nombre, una descripción y una ubicación.
5. Los nombres, descripciones y ubicaciones pueden contener texto enriquecido.
6. Cada destino turístico uno o más atributos, como el país, que es obligatorio, la región, idioma,moneda, clima.


### Tarea:
Escribe una DTD (Document Type Definition) que defina la estructura XML para almacenar la información de los destinos turísticos según las especificaciones dadas.




#### Archivos XML para chequear la DTD

1. Ejemplo de un destino turístico con actividades y atracciones:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE destinos SYSTEM "destinos.dtd">
<destinos>
    <destino pais="España" region="Andalucía" idioma="Español" moneda="Euro" clima="Mediterráneo">
        <nombre>Sevilla</nombre>
        <descripcion>Una hermosa ciudad llena de historia y cultura.</descripcion>
        <actividades>
            <actividad>
                <nombre>Visita a la Catedral de Sevilla</nombre>
                <descripcion>Explora la impresionante catedral gótica y la Giralda.</descripcion>
            </actividad>
            <actividad>
                <nombre>Recorrido por el Barrio de Santa Cruz</nombre>
                <descripcion>Descubre las estrechas calles y los patios encantadores de este barrio histórico.</descripcion>
            </actividad>
        </actividades>
        <atracciones>
            <atraccion>
                <nombre>Alcázar de Sevilla</nombre>
                <descripcion>Palacio real con jardines exuberantes y arquitectura impresionante.</descripcion>
                <ubicacion>Plaza del Triunfo, s/n, 41004 Sevilla, España</ubicacion>
            </atraccion>
            <atraccion>
                <nombre>Plaza de España</nombre>
                <descripcion>Impresionante plaza construida para la Exposición Iberoamericana de 1929.</descripcion>
                <ubicacion>Av de Isabel la Católica, 41004 Sevilla, España</ubicacion>
            </atraccion>
        </atracciones>
    </destino>
</destinos>
```

1. Ejemplo de un destino turístico sin actividades ni atracciones:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE destinos SYSTEM "destinos.dtd">
<destinos>
    <destino pais="Francia" region="Île-de-France" idioma="Francés" moneda="Euro" clima="Templado">
        <nombre>París</nombre>
        <descripcion>La ciudad del amor y la luz.</descripcion>
    </destino>
</destinos>
```


1. Este ejemplo contiene tres destinos diferentes: Granada en España, Florencia en Italia y Niza en Francia. Granada tiene actividades pero no atracciones, Florencia no tiene ni actividades ni atracciones, y Niza tiene atracciones pero no actividades. Todos los destinos cumplen con la estructura definida en la DTD.

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE destinos SYSTEM "destinos.dtd">
<destinos>
    <destino pais="España" region="Andalucía">
        <nombre>Granada</nombre>
        <descripcion>Granada es una ciudad ubicada en el sur de España, conocida por la Alhambra y el barrio del Albaicín.</descripcion>
        <actividades>
            <actividad>
                <nombre>Visita a la Alhambra</nombre>
                <descripcion>Recorrido por el complejo de palacios, jardines y fortaleza.</descripcion>
            </actividad>
            <actividad>
                <nombre>Paseo por el Albaicín</nombre>
                <descripcion>Exploración del pintoresco barrio árabe con sus estrechas calles y vistas panorámicas.</descripcion>
            </actividad>
        </actividades>
    </destino>
    <destino pais="Italia" region="Toscana">
        <nombre>Florencia</nombre>
        <descripcion>Florencia es una ciudad ubicada en la región de Toscana, Italia, famosa por su arte y arquitectura renacentista.</descripcion>
    </destino>
    <destino pais="Francia" region="Provenza-Alpes-Costa Azul">
        <nombre>Niza</nombre>
        <descripcion>Niza es una ciudad costera en la Riviera francesa, famosa por su clima mediterráneo y su paseo marítimo.</descripcion>
        <atracciones>
            <atraccion>
                <nombre>Promenade des Anglais</nombre>
                <descripcion>Paseo marítimo bordeado de palmeras y playas.</descripcion>
                <ubicacion>Nice, Francia</ubicacion>
            </atraccion>
            <atraccion>
                <nombre>Vieux Nice</nombre>
                <descripcion>Barrio antiguo con calles estrechas, edificios coloridos y mercados.</descripcion>
                <ubicacion>Nice, Francia</ubicacion>
            </atraccion>
        </atracciones>
    </destino>
</destinos>
```

