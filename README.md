﻿# MIRepositorio
Control de Gastos Telefónicos
Descripción

Esta aplicación está diseñada para gestionar y controlar los gastos telefónicos de una empresa con múltiples cabinas telefónicas. Permite registrar llamadas, mostrar información detallada de cada cabina, consolidar datos y reiniciar las cabinas cuando sea necesario. La aplicación está desarrollada en Kotlin y está estructurada para ser modular y eficiente.
Estructura del Código

El código se organiza en torno a dos clases principales: Cabina y Llamada.

    Clase Llamada: Representa los detalles de cada llamada realizada. Es una clase de datos simple que contiene cuatro propiedades: id, tipo, duración y costo. Esta clase se utiliza para almacenar la información de cada llamada de manera estructurada y accesible.

    Clase Cabina: Maneja la lógica principal de la aplicación. Cada instancia de Cabina tiene un identificador único, un contador de llamadas, y listas para almacenar las llamadas realizadas. También mantiene un registro del tiempo total de llamadas, el costo total y el número de llamadas.

Funcionalidades Clave de la Aplicación

La aplicación ofrece varias funcionalidades clave para gestionar eficientemente las cabinas telefónicas:
Agregar Cabinas

La función agregarCabinas permite al usuario agregar múltiples cabinas a la vez. Cada cabina se crea con un identificador único y se añade a la lista de cabinas activas.
Registrar Llamadas

La función registrarLlamadas permite al usuario registrar llamadas en una cabina específica. El usuario selecciona el tipo de llamada y la duración, y la llamada se registra con un identificador único.
Mostrar Información de Cabinas

La función mostrarInformacion de la clase Cabina muestra los detalles de todas las llamadas realizadas en una cabina específica, incluyendo el número de llamada, el tipo, la duración y el costo.
Mostrar Consolidado

La función mostrarConsolidado proporciona un resumen de todas las cabinas, mostrando el total de llamadas, la duración total, el costo total y el costo promedio por minuto.
Reiniciar Cabina

La función reiniciarCabina permite al usuario reiniciar una cabina específica, restableciendo todos sus valores a cero.
Cómo Usar

    Agregar Cabinas: Utiliza la función agregarCabinas para añadir nuevas cabinas a tu sistema.
    Registrar Llamadas: Usa registrarLlamadas para registrar cada llamada realizada en una cabina específica.
    Mostrar Información de Cabinas: Llama a mostrarInformacion para ver los detalles de las llamadas registradas en una cabina.
    Mostrar Consolidado: Ejecuta mostrarConsolidado para obtener un resumen general de todas las cabinas.
    Reiniciar Cabina: Utiliza reiniciarCabina para restablecer una cabina específica a su estado inicial.

Instalación

Para utilizar esta aplicación, clona este repositorio y sigue las instrucciones de configuración en el archivo setup.md.

bash

git clone https://github.com/tu_usuario/control-de-gastos-telefonicos.git

Luego, abre el proyecto en tu IDE de Kotlin y compílalo.
Contribuciones

Las contribuciones son bienvenidas. Si encuentras un error o tienes una idea para mejorar la aplicación, no dudes en abrir un problema o enviar una solicitud de extracción.
Licencia

Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo LICENSE para más detalles.
