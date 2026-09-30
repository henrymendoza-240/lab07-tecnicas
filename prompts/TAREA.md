# Tarea: Mi prompt avanzado

## Tarea elegida
Generar casos de prueba automatizados y validaciones para un formulario de registro de usuarios.

## Version 1: Prompt basico
```text
Haz casos de prueba para un registro.
```
- Técnica agregada: Ninguna (Prompt directo).

- Por qué: Para obtener una línea base del comportamiento de la IA sin restricciones.

- Resultado: Casos de prueba genéricos y muy básicos sin formato de tabla ni criterios de aceptación claros.
## Version 2
```text
Actua como analista de QA. Haz una tabla con 5 casos de prueba para el formulario de registro que valide nombre, correo y contrasena.
```
- Técnica agregada: Role Prompting y Formato estructurado.

- Por qué: Para asignar un enfoque técnico de calidad de software y ordenar los datos en columnas claras.

- Resultado: La IA entregó una tabla con columnas ordenadas, pero omitió evaluar casos límite complejos (como correos mal formados o campos vacíos).
## Version 3: prompt final
```text
<rol>Actua como analista de QA Senior especializado en testing funcional.</rol>
<contexto>Formulario web de registro de usuarios que solicita: Nombre, Correo electronico y Contrasena (minimo 8 caracteres).</contexto>
<instruccion>Diseña 5 casos de prueba aplicando Chain of Thought (piensa paso a paso los posibles fallos) y utiliza Few-Shot imitando exactamente este formato de ejemplo:</instruccion>
<ejemplos>
Ejemplo 1: ID: CP01 | Escenario: Registro exitoso | Entrada: Juan, juan@mail.com, Pass1234 | Resultado: Usuario registrado correctamente.
</ejemplos>
<formato>Presenta el resultado final estrictamente en una tabla con las columnas: ID, Escenario, Datos de entrada, Resultado esperado.</formato>

Revisa tu propia tabla mediante autocrítica: ¿Faltaron casos límite de entradas vacías o errores de sintaxis en el correo? Si es así, agrégalos al final.
```
- Técnica agregada: Chain of Thought, Few-Shot, Prompt estructurado por etiquetas y Autocrítica.

- Por qué: Para asegurar una cobertura de pruebas exhaustiva, estandarizar el diseño mediante un ejemplo y forzar a la IA a auditar su propio trabajo.

- Resultado: Un conjunto de casos de prueba profesionales, estructurados en tabla, que incluye tanto los escenarios felices como los casos límite detectados por la autocrítica.
## Tecnicas usadas en el prompt final
| Tecnica|Parte del prompt final donde se aplica|
|---------|---------------------------------------|
|Role Prompting|```<rol>Actua como analista de QA Senior...</rol>```|
|Chain of Thought|```...aplicando Chain of Thought (piensa paso a paso los posibles fallos)... ```|
|Few-Shot|```<ejemplos> Ejemplo 1: ID: CP01... </ejemplos>```|
|Prompt Estructurado|```Uso de etiquetas XML (<rol>, <contexto>, <instruccion>, etc.)```|
|Autocrítica|```Revisa tu propia tabla mediante autocrítica...```|
## Evaluacion del resultado
|               Criterio            |Cumple (Sí / No)|
|-----------------------------------|----------------|
|¿El rol asignado es específico y técnico?|Si|
|¿Utiliza etiquetas estructuradas para organizar el prompt?|Si|
|¿Muestra un ejemplo claro (Few-Shot) para el formato?|Si|
|¿La autocrítica añade casos límite faltantes?|Si|
## Por que elegi estas tecnicas
Elegí combinar Role Prompting, Prompt Estructurado, Few-Shot y Autocrítica porque el diseño de pruebas de software requiere un rigor técnico elevado. Las etiquetas estructuradas evitan confusiones en instrucciones largas, el Few-Shot fija de inmediato la estructura tabular deseada, y la autocrítica actúa como un filtro de calidad indispensable para no pasar por alto escenarios de error crítico.
