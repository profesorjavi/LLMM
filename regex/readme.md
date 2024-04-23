## Expresiones regulares

Resumen:

```
Lesson Notes
 	abc… 	Letters
	123… 	Digits
	\d 	Any Digit
	\D 	Any Non-digit character
	. 	Any Character
	[abc] 	Only a, b, or c
	[^abc] 	Not a, b, nor c
	[a-z] 	Characters a to z
	[0-9] 	Numbers 0 to 9
	\w 	Any Alphanumeric character
	\W 	Any Non-alphanumeric character
	{m} 	m Repetitions
	{m,n} 	m to n Repetitions
	* 	Zero or more repetitions
	+ 	One or more repetitions
	? 	Optional character
	\s 	Any Whitespace
	\S 	Any Non-whitespace character
	^…$ 	Starts and ends
	(abc) 	Capture Group abc
```

## Práctica ....

Podemos testear el funcionamiento de una regex en https://regexr.com/ o en cualquier página web al respecto

1. **Código Postal:** Valida códigos postales españoles en formato estándar de 5 dígitos. Ejemplos válidos son: "28001", "08012", "46001", etc.
2. **Número de Identificación Fiscal:** Valida números de NIF españoles en formato estándar de 8 dígitos seguidos de una letra en mayusculas. Ejemplos válidos son: "12345678Z", "98765432X", etc.
3. **Teléfono :** Valida números de teléfono españoles que sigan el siguiente formato.
   El teléfono consta de 9 digitos y solo pueden empezar por 6,7 o 9. Además, opcionalmente también aceptamos el prefijo del país de dos digitos encabezado por el simbolo '+'. Ejemplos válidos;  666554433, 961112233, +34709567896
4. **Correo Electrónico:** Debe ser una dirección de correo electrónico válida que cumpla con el siguiente formato. (formato reducción del estandar)
   *Nombre de usuario:* Esta es la parte que identifica al usuario dentro del sistema de correo electrónico. Esta parte viene antes del símbolo "@" y puede contener letras (mayúsculas y minúsculas), dígitos y ciertos caracteres especiales como ".", "-", y "_". El nombre de usuario debe tener al menos un carácter. Por ejemplo, en la dirección de correo "usuario@example.com", "usuario" es el nombre de usuario.

   *Dominio:* Esta es la parte que identifica el servidor de correo electrónico al que está asociado el usuario. Esta parte viene después del símbolo "@" y para este ejercicio consta de dos partes ('parte1.parte2'): La parte2 del dominio consta de tres carácteres (como ".com", ".net", ".org", etc.).La parte1  contiene letras (mayúsculas y minúsculas), dígitos, y los caracteres especiales como "-" y, en algunos casos, "_". Por ejemplo, en la dirección de correo "usuario@example.com", "example.com" es el dominio.
5. **Ruta de Windows** . Debe validar que una ruta absoluta de windows a un directorio o fichero sea válida. Limitamos a los siguientes requerimientos.
   *Los directorios* contener caracteres alfanumericos con vocales con acentos, guiones bajos o espacios en blanco pero no pueden empezar por espacio en blanco
   *Los archivos* mantienen el mismo formato que los directorios y además pueden contener el caracter '.' en cualquier posición
   *La unidad* consta de una única letra mayúscula o minúscula
   Una expresión valida sería	c:\Mis Documentos\práctica 1\prueba.txt

[&#34;...propuesta de soluciones&#34;](regex_sol.md)
