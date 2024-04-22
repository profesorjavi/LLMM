## Expresiones regulares

Resumen: https://regexone.com/lesson/wildcards_dot?

```
Lesson Notes
 	abc… 	Letters
	123… 	Digits
	\d 	Any Digit
	\D 	Any Non-digit character
	. 	Any Character
	\. 	Period
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
	(…) 	Capture Group
	(a(bc)) 	Capture Sub-group
	(.*) 	Capture all
	(abc|def) 	Matches abc or def
```

## Práctica ....

Podemos testear el funcionamiento de una regex en https://regexr.com/

1. **Código Postal:** Valida códigos postales españoles en formato estándar de 5 dígitos. Ejemplos válidos son: "28001", "08012", "46001", etc.

2. **Número de Documento de Identidad:** Valida números de NIF españoles en formato estándar de 8 dígitos seguidos de una letra en mayusculas. Ejemplos válidos son: "12345678Z", "98765432X", etc.

4. **Teléfono :** Valida números de teléfono españoles que sigan el siguiente formato.
   El teléfono consta de 9 digitos y solo pueden empezar por 6,7 o 9. Además, opcionalmente también aceptamos el prefijo del país de dos digitos encabezado por el simbolo +

5. **Correo Electrónico:** Debe ser una dirección de correo electrónico válida que cumpla con el siguiente formato. (formato reducción del estandar)
    *Nombre de usuario:* Esta es la parte que identifica al usuario dentro del sistema de correo electrónico. Esta parte viene antes del símbolo "@" y puede contener letras (mayúsculas y minúsculas), dígitos y ciertos caracteres especiales como ".", "-", y "_". El nombre de usuario debe tener al menos un carácter. Por ejemplo, en la dirección de correo "usuario@example.com", "usuario" es el nombre de usuario.

    *Dominio:* Esta es la parte que identifica el servidor de correo electrónico al que está asociado el usuario. Esta parte viene después del símbolo "@" y para este ejercicio consta de dos partes: el nombre de dominio y la extensión del dominio de tres carácteres (como ".com", ".net", ".org", etc.). El nombre de dominio puede contener letras (mayúsculas y minúsculas), dígitos, y los caracteres especiales ".", "-" y, en algunos casos, "_". Por ejemplo, en la dirección de correo "usuario@example.com", "example.com" es el dominio.   
   