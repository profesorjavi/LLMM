### Modelar un sistema de gestión de conferencias en JSON

Se te ha encargado crear un sistema de gestión de conferencias para una conferencia internacional de informática. El sistema debe ser capaz de almacenar información detallada sobre las conferencias, incluidos los detalles de los oradores, el título de la conferencia, la fecha y la ubicación. Además, se requiere mantener un registro de los asistentes a cada conferencia, incluidos sus nombres, afiliaciones y direcciones de correo electrónico.

Cada conferencia puede tener múltiples oradores, y se necesita información detallada sobre cada uno, incluidos sus nombres, afiliaciones y biografías.

Por otro lado, cada asistente puede estar inscrito en más de una conferencia, por lo que es necesario mantener un registro de las conferencias a las que asisten, así como cualquier información adicional relevante sobre su participación.

Se te pide que diseñes una estructura de datos en formato JSON para almacenar toda esta información de manera eficiente y fácilmente accesible.

---
#### Utiliza estos datos para modelar en json la inormación.

1. Introducción a la Inteligencia Artificial
  * 2024-07-15"
  * Centro de Convenciones XYZ
  * orador1
    * Ana García
    * Universidad ABC
    * Experta en aprendizaje automático
  * orador2
    * Juan Martínez
    * Instituto XYZ
    * Investigador en redes neuronales
  * asistente1 
    * María López
    * Empresa XYZ
    * maria@example.com
  * asistente2
     * Pedro Ramírez
     * Universidad DEF
     * pedro@example.com

2. Desarrollo de Aplicaciones Web
   * 2024-08-20
   * Hotel ABC
   * orador1 
     * Elena Pérez
     * Empresa XYZ
     * Experta en desarrollo front-end
   * asistente1
      * Luis Fernández
      * Universidad GHI
      * luis@example.com
   * asistente2
      * Ana Rodríguez
      * Instituto JKL
      * ana@example.com

Este modelo incluye una estructura jerárquica con conferencias como objetos principales, cada una con un título, fecha, ubicación, una lista de oradores y una lista de asistentes. Los oradores y los asistentes son objetos con campos específicos para nombre, afiliación y, en el caso de los asistentes, su dirección de correo electrónico.