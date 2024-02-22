# Proyecto: App abierta por primera vez

App que muestra distintos mensajes si es la primera vez que se abre o si ya se ha abierto 5 veces.
 
Esta app es introductoria a los test unitarios.

## Test o Pruebas

Existen varios tipos de pruebas en el desarrollo de software, cada uno enfocado en distintos aspectos y niveles de la
aplicación. Los principales tipos de pruebas incluyen:

### 1. **Pruebas Unitarias (Unit Testing)**

- **Descripción**: Prueban la menor parte de código que puede ser aislada en un sistema (por ejemplo, una función o un
  método). Su objetivo es verificar que cada unidad funcione correctamente de manera individual.
- **Ejemplo**: Probar una función que calcula el IVA (Impuesto al Valor Agregado) de un producto para asegurarse de que
  devuelve el valor correcto dado un precio de entrada.

### 2. **Pruebas de Integración (Integration Testing)**

- **Descripción**: Verifican que diferentes módulos o servicios funcionen correctamente cuando se combinan. Estas
  pruebas se centran en los puntos de interacción entre diversos componentes del sistema para detectar fallos en la
  integración.
- **Ejemplo**: Probar cómo un sistema de gestión de bases de datos interactúa con una aplicación backend, asegurando que
  las consultas y transacciones se ejecuten correctamente.

### 3. **Pruebas Funcionales (Functional Testing)**

- **Descripción**: Se enfocan en los requisitos funcionales del software para asegurar que la salida de un sistema es
  conforme a lo esperado. Estas pruebas se realizan desde la perspectiva del usuario.
- **Ejemplo**: Probar un formulario de registro en un sitio web para asegurarse de que los usuarios pueden registrarse
  correctamente usando sus datos personales.

### 4. **Pruebas de Sistema (System Testing)**

- **Descripción**: Pruebas de alto nivel que validan el sistema completo y su cumplimiento con los requisitos
  especificados. Este tipo de pruebas considera aspectos tanto funcionales como no funcionales del sistema.
- **Ejemplo**: Realizar pruebas en un sistema de comercio electrónico completo para validar su funcionamiento,
  incluyendo pruebas de carga para evaluar el rendimiento bajo condiciones de uso elevado.

### 5. **Pruebas de Aceptación (Acceptance Testing)**

- **Descripción**: También conocidas como pruebas de validación, se utilizan para determinar si el sistema satisface los
  criterios de aceptación y si es aceptable para el usuario final o cliente.
- **Ejemplo**: Un equipo de usuarios finales prueba una aplicación para determinar si cumple con sus necesidades y
  expectativas antes de que se despliegue o entregue oficialmente.

### 6. **Pruebas de Rendimiento (Performance Testing)**

- **Descripción**: Evalúan cómo se comporta el sistema en términos de velocidad, estabilidad y escalabilidad bajo una
  carga de trabajo específica.
- **Ejemplo**: Pruebas de estrés para determinar cómo se comporta un sitio web con un número muy alto de usuarios
  simultáneos.

### 7. **Pruebas de Usabilidad (Usability Testing)**

- **Descripción**: Se centran en la experiencia del usuario para asegurarse de que la interfaz es intuitiva, fácil de
  usar y entender.
- **Ejemplo**: Sesiones de prueba con usuarios reales para evaluar la facilidad de uso de una aplicación móvil.

### 8. **Pruebas de Seguridad (Security Testing)**

- **Descripción**: Identifican vulnerabilidades, amenazas y riesgos en el software y aseguran que los datos y recursos
  estén protegidos contra ataques.
- **Ejemplo**: Pruebas de penetración para detectar vulnerabilidades de seguridad en una aplicación web.

Cada tipo de prueba tiene su importancia y lugar dentro del ciclo de vida del desarrollo de software, y juntos aseguran
que el software entregado sea de alta calidad, funcional, seguro y amigable para el usuario final.

## Test Unitarios

Los tests unitarios son una metodología de pruebas en el desarrollo de software que consiste en verificar la correcta
ejecución y comportamiento de una parte específica de un programa, conocida como "unidad". Esta unidad puede ser una
función, un método, un procedimiento, un módulo o cualquier otro bloque de código que pueda ser probado de manera
aislada.

El objetivo de los tests unitarios es asegurar que cada unidad funcione correctamente por separado antes de integrarla
con otras partes del sistema. Esto ayuda a identificar y solucionar errores en las fases tempranas del desarrollo, lo
cual puede ahorrar mucho tiempo y recursos en etapas posteriores.

Los tests unitarios se caracterizan por:

1. **Automatización**: Se escriben y ejecutan a través de herramientas y frameworks de pruebas específicos para cada
   lenguaje de programación, como JUnit para Java, NUnit para .NET, PyTest para Python, etc.
2. **Aislamiento**: Cada test unitario debe ser independiente de los demás para evitar que el resultado de una prueba
   afecte a otra. Esto a menudo requiere simular (mocking o stubbing) las dependencias externas de la unidad, como bases
   de datos o servicios web.
3. **Repetibilidad**: Deben poder ejecutarse en cualquier momento y en cualquier entorno, siempre con el mismo resultado
   si no ha habido cambios en el código.
4. **Especificidad**: Cada prueba debe enfocarse en un aspecto concreto de la unidad, lo que permite identificar
   rápidamente la causa de cualquier fallo.

Implementar tests unitarios conlleva varios beneficios, como mejorar la calidad del código, facilitar los cambios y las
actualizaciones al código base, documentar el comportamiento de las unidades y apoyar las prácticas de desarrollo ágil,
como la integración continua (CI) y el despliegue continuo (CD).

## Mocks, Stubs y Spies (Test Dobles)

Los términos "mocks", "stubs" y "spies" se refieren a técnicas y objetos utilizados en el testing, especialmente en los
tests unitarios, para simular comportamientos de partes del sistema que no son el foco de la prueba.

Permiten aislar la unidad de código que se está probando de sus dependencias, facilitando así la verificación de su
correcto funcionamiento sin necesidad de que dichas dependencias estén presentes o se comporten de determinada manera.
Vamos a definir cada uno de estos términos y luego explicar sus diferencias.

### Mocks

Los mocks son objetos que simulan el comportamiento de dependencias reales utilizando especificaciones predefinidas. Se
utilizan principalmente para verificar interacciones entre la unidad bajo prueba y su dependencia simulada, como
verificar que se llamen ciertos métodos con parámetros específicos. Los mocks son útiles cuando quieres probar cómo se
usa una dependencia, no sólo que el código funciona correctamente bajo ciertas condiciones.

**Ejemplo**: Si estás probando un servicio que envía un mensaje a través de un servicio de correo electrónico, podrías
usar un mock para simular el servicio de correo y verificar que se intenta enviar el mensaje correctamente, sin
necesidad de enviar un email real.

### Stubs

Los stubs proporcionan respuestas predefinidas a las llamadas que se hacen durante el test. Son menos sofisticados que
los mocks y se utilizan principalmente para hacer que la unidad bajo prueba se comporte de manera específica. No se
utilizan para verificar si la unidad bajo prueba interactúa correctamente con sus dependencias, sino para asegurar que
bajo ciertas condiciones de entrada, se produce una salida esperada.

**Ejemplo**: Si tu aplicación necesita obtener información meteorológica de un servicio externo, podrías usar un stub
para simular respuestas de este servicio. Esto te permite probar cómo se comporta tu aplicación con diferentes
condiciones meteorológicas sin tener que realizar llamadas reales al servicio externo.

### Spies

Los spies son similares a los mocks en que pueden utilizarse para monitorear las interacciones con las dependencias,
pero a diferencia de los mocks, los spies permiten que la llamada al método real se ejecute. Los spies son útiles cuando
quieres verificar que se hicieron ciertas llamadas pero no quieres alterar el comportamiento de la dependencia.

**Ejemplo**: Supongamos que quieres verificar que se llama un método de registro (logging) sin interferir en su
ejecución. Podrías usar un spy para monitorear las llamadas al método de registro mientras permite que la implementación
original del método se ejecute.

### Diferencias Principales

- **Mocks**: Verifican cómo se usa una dependencia (interacciones). Se definen expectativas antes de la ejecución.
- **Stubs**: Proporcionan respuestas específicas a llamadas específicas. Se usan para controlar el flujo de ejecución de
  la prueba.
- **Spies**: Permiten observar las interacciones con las dependencias mientras permiten que la ejecución real de la
  dependencia continúe sin cambios.
