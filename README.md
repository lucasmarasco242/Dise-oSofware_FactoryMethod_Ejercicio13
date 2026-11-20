Ejercicio 13 - Sistema de Alertas por Canal de Texto

Explicación del programa

En este ejercicio se implementó el patrón de diseño Factory Method para emitir alertas de monitoreo por consola y por registro de archivo a través de un contrato común, sin utilizar librerías externas ni imports.
El programa cuenta con:
- Una interfaz Alerta con el método emitir(String mensaje).
- Dos clases concretas (AlertaConsola y AlertaArchivo) que implementan Alerta.
- Una clase abstracta FabricaAlerta que define el método de fábrica crearAlerta().
- Dos factorías concretas (FabricaAlertaConsola y FabricaAlertaArchivo) que devuelven cada tipo de alerta.

Luego, dentro del método main, se utilizan las factorías para crear las alertas y emitir los mensajes.

Lógica utilizada

La lógica del programa consiste en:
- Definir una interfaz común Alerta para unificar la salida de los mensajes.
- Delegar la creación de cada alertador concreto a su respectiva factoría.
- Hacer que el código cliente interactúe únicamente con la interfaz Alerta y el método de fábrica.

Resultado de la ejecución

La ejecución del programa muestra en la consola lo siguiente:
[CONSOLA] CPU al 95% en servidor-01.
Guardado en registro: [LOG] Disco al 90% en servidor-02.

Captura de pantalla


<img width="582" height="171" alt="image" src="https://github.com/user-attachments/assets/6b205499-2911-4723-9aed-45c2f4fdfafd" />
