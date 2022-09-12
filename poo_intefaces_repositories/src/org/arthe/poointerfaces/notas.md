## DAO or DTO

* Patrones de diseño MVC, Data Acces Object (DAO).
* Data Transfer Object (DTO) 

- Qué es un patrón de diseño?
- Un patrón de diseño es un solución probada que resuleve un tipo de específico de problema en el desarrollo.
- Existen:
- Creación
- Estructurales
- Comportamiento
- Interacción

- Profundizar en https://wiki.c2.com/?DesignPatternsBook

#### Modelo:
- Esta capa representa todo lo que tiene que ver con el acceso a datos: guardar, actualizar, obtener datos, además
todo el código de la lógica del negocio, básicamente son las clases Java y parte de la lógica de negocio. 

#### Vista:
- La vista tiene que ver con la presentación de datos del modelo y lo que ve el usuario
por lo general una vista es la presentación visual de un modelo (POJO o Clase java).

#### Controlador: 
- Controlador es el encargado de conectar el modelo con la vista, funciona como un puente entre la vista y el modelo,
el controlador recibe eventos generados por el usuario desde las vistas y se encarga de direccionar al modelo peticiones respectivas.