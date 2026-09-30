# Bitacora de tecnicas avanzadas
Laboratorio 07: Tecnicas Avanzadas de Prompting.
Herramienta de IA usada: ChatGPT

## Ejercicio 2: Zero-shot, one-shot y few-shot

### Tabla de resultados
| Tipo | Aciertos (de 5) | Formato de la respuesta | Todas con el mismo formato (Si/No) |
|------|-----------------|-------------------------|------------------------------------|
| Zero-shot | 5 | Texto libre con explicaciones | No |
| One-shot | 5 | Texto guiado por el ejemplo | Si |
| Few-shot | 5 | Estricto: texto -> etiqueta | Si |

## Ejercicio 3: Chain of Thought

### Tabla de resultados
| Pedido | Respuesta de la IA | Muestra los pasos (Si/No) | Correcta (Si/No) |
|--------|--------------------|---------------------------|------------------|
| Directo | S/ 318.60 | No | Si |
| Paso a paso | Calculo 1: 120 x 0.75 = 90... Total: S/ 318.60 | Si | Si |

*Por qué es útil:* Ver el razonamiento paso a paso permite verificar la lógica matemática y detectar exactamente dónde se originaría un fallo si la respuesta fuera errónea.

## Ejercicio 4: Role prompting

### Tabla de diferencias
| Version | Vocabulario (sencillo/tecnico) | Usa ejemplos o codigo | A quien le sirve mas |
|---------|-------------------------------|-----------------------|----------------------|
| A. Sin rol | Neutral / Estándar | Si | A cualquier lector general |
| B. Rol docente | Sencillo y cotidiano | Sí (ejemplo de la caja) | Estudiantes principiantes |
| C. Rol senior | Técnico (memoria, tipos, alcance) | Sí (código Java) | Desarrolladores profesionales |

## Ejercicio 5: Descomposicion

- **Paso 1:** Listar los 5 requisitos principales (registro, stock, ventas, reportes, alertas).
- **Paso 2:** Diseño de clases orientadas a objetos (Cliente, Producto, Venta, Inventario).
- **Paso 3:** Código Java limpio de la clase `Producto`.
- **Paso 4:** Propuesta de 3 mejoras (control de excepciones, encapsulamiento estricto, persistencia).
*Comparación:* La descomposición por pasos evita respuestas genéricas y garantiza un desarrollo modular y coherente frente a un pedido masivo.

## Ejercicio 6: Prompt estructurado y autocritica

### Tabla de evaluación post-autocrítica
| Criterio | Cumple (Sí / No) |
|----------|------------------|
| ¿Tiene las 4 columnas pedidas? | Sí |
| ¿Incluye el bloqueo después de 3 intentos? | Sí |
| ¿Incluye casos con campos vacíos? | Sí |
| ¿Indica qué casos agregó en la autocrítica? | Sí |
| ¿Hay algún caso repetido o que no tenga sentido? | No |

### Prompt estructurado final y autocrítica utilizada
```text
<rol>Actua como analista de pruebas de software.</rol>
<contexto>Login web con correo y contrasena. La cuenta se bloquea despues de 3 intentos fallidos.</contexto>
<tarea>Piensa paso a paso que puede fallar y escribe 6 casos de prueba.</tarea>
<formato>Tabla con las columnas: ID, escenario, datos de entrada, resultado esperado.</formato>

Revisa tu tabla: faltan casos limite como campos vacios, correo sin @ o contrasena con espacios? Agrega los que falten e indica cuales agregaste.
```