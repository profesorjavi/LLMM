#### Contexto PARTE 1:

Imaginemos que existe un “Club de los Extraterrestres” en el universo, y nuestro objetivo es diseñar una DTD (Document Type Definition) para representar la información sobre los miembros de este club.

#### Especificaciones:

1. **Elementos Principales:**

   - El documento XML contendrá información sobre los miembros del club.
   - Cada miembro estará representado por un elemento `<extraterrestre>`.
   - Cada extraterrestre tendrá los siguientes atributos:
     - `id` (de tipo `ID`): Un identificador único para cada miembro.
     - `nombre` (de tipo `CDATA`): El nombre del extraterrestre.
     - `planeta_origen` (de tipo `CDATA`): El planeta de origen del miembro.
2. **Relaciones entre Miembros:**

   - Cada extraterrestre puede tener amigos dentro del club.
   - Para representar estas amistades, utilizaremos el atributo `amigos` (de tipo `IDREFS`) en cada elemento `<extraterrestre>`.
   - Los valores de `amigos` serán los `id` de otros miembros del club.
3. **Ejemplo de Documento XML Válido:**

   ```xml
   <club_extraterrestres>
       <extraterrestre id="e1001" nombre="Zog" planeta_origen="Xenón" amigos="e1002 e1003" />
       <extraterrestre id="e1002" nombre="Luna" planeta_origen="Nebulosa Azul" amigos="e1001 e1004" />
       <extraterrestre id="e1003" nombre="Glimp" planeta_origen="Andrómeda" amigos="e1001" />
       <extraterrestre id="e1004" nombre="Quasar" planeta_origen="Galaxia Espiral" amigos="e1002" />
   </club_extraterrestres>
   ```

### Tarea 1:

Escribe una DTD (Document Type Definition) que defina la estructura XML para almacenar la información de los destinos turísticos según las especificaciones dadas.

---



#### Contexto PARTE 2:

Ahora nuestro extraterrestes también van a  tener una  `<mision>` .Rrepresentará una misión secreta la cual se le asigan como miembro del “Club de los Extraterrestres”

#### Especificaciones:

- Cada `<extraterrestre>` ahora tiene una `<mision>` .La información de la misión estará referenciada en el atributo `target``.
- El elemento `<mision>` tiene un atributo `id` (de tipo `ID`) para identificar de manera única cada misión.
- El atributo `objetivo` (de tipo `CDATA`) describe el objetivo de la misión en su elemento.

### Tarea 2:

* Escribe una DTD (Document Type Definition) que defina la estructura XML para almacenar la información de los destinos turísticos según las especificaciones dadas.
* Escribe un XML para probar su valición incluyendo extraterrestres con amigos y misiones. El siguiente extraterrestre debería de ser valida en tu documento xml

```xml
    <extraterrestre id="e1001" nombre="Zog" planeta_origen="Xenón" amigos="e1002 e1003" target="m2001" >
    </extraterrestre>
```

**Fuentes**
(1) DTD Attribute Types - IDREF - Quackit Tutorials. https://www.quackit.com/xml/tutorial/dtd_attribute_types_idref.cfm.
(2) Atributos de tipo IDREF en DTD | Tutorial de DTD | Abrirllave.com. https://www.abrirllave.com/dtd/atributos-de-tipo-idref.php.
(3) XML DTD's ID and IDREF pointers - Stack Overflow. https://stackoverflow.com/questions/14452731/xml-dtds-id-and-idref-pointers.
