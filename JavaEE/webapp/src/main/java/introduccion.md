### ¿Qué es un Servlet?

* Es una clase y objeto Java utilizado para implementar una pagina 
web dinámica con características HTTP de petición y respuesta.


* Http Request
* Http Response
    * Contenedor Web
      * Model <- JSP (View) <- Servlets (Controllador) -> Model 

* ¿Qué es un resquest (petición web)?
  * Información que es enviada desde un cliente hacia el servidor
  * Datos ingresados e enviados por el usuario
  * Método Http (Get p Post)
  * Cabecera HTTP (headers)
* ¿Qué es un response (respuesta web)?
  * Inforación que es enviada al cliente desde el servidor
  * Texto (html, plain, json, xml) o datos binarios (imágenes, pdf, videos)
  * Http headers, cookies, etc.
* Los métodos HTTP soportados por el API Servlet son 7:
  * doDelete
  * doGet
  * doHead
  * doOptions
  * doPost
  * doPut
  * doTrace


#### Clases e interfaces del Servlet

* Servlet <---- 
  * GenericServlet 
    * Servlet Response 
      * HttpServletResponse
        * HttpServlet
    * ServeletRequest
      * HttpServletRequest
        * HttpServlet


### Ciclo de vida de Servlet
* Compilar, hacer despliege
* Después de que se registra de manda a llamar el **init()**
* Cada que se hace una petición, es compartido, por los clientes, 
* Pero cada que se realiza un request se genera un hilo.
* Se invoca el metodo service() por cada uno.
* Un objeto unico y nuevo de request y response.
* Siento de llamadas de peticiones.
* **destroy()**.
* Un pool de servlet. **no maneje estados**.
* HTTP sessions.