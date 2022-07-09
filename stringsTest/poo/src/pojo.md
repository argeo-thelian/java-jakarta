# ¿Qué es un POJO? 
- Plain Old Java Objects

- Capa de persistencia

## 3 Elementos de la Arquitectura Enterprise
- Session Bean
- Entity Bean
- Message Bean
- - Tienen una funcionalidad muy concreta

* Los Session Bean eran componentes que se usaban para gestionar tareas muy diversas desde ordenaciones, listados, generacion de ficheros etc. Eran componenetes que se centraban en la funconalidad que la aplicación debía implementar.

* Por otro lado teníamos los Message Bean que eran componentes orientados a Mensajería y colas asíncronas. Estos componentes se encargana de realizar tareas asíncronas complejas que tardaban bastante tiempo en ser ejecutadas y habían que encolar por ejemplo la generación de todas las facturas de la empresa en formato pdf.

* Las Entity Beans que eran objetos que se automatizaba su persistencia contra una base de datos. Estos objetos cuando fueron diseñados tenían una alta complejidad a la hora de realizar su persistencia en la base de datos y surgieron muchas voces en su contra ya que implementaban unos iterfaces excesivos.

# POJO Evolución 
- Hibernate como framework donde la persistencia de clases en la base de datos se hacía sobre clases Java normales y corrientes. Hiberante sin tener que hacer que la clase implemente interfaces adicionales es capaz de persistirla de forma transparente contra la base de datos.

- Patron de diseño de persistencia

- Persistencia JPA o JAva Persistence API 


# JPA 
- Es una especificacion creada para acceder y hacer el mapeo entre las objetos y las bases de datos (ORM).

# Hibernate 
- Es la implementación un framework que complementa su espeficicación con JPA o solo

# Paquetes
- Agrupar y organizar
- Evitan conflicto de nombres
- Dependiendo el motificador se puede ocultar el acceso a sus clases o sus miembros
- Default es packet
- Estandares es:
  - deben estar escritos completamente en minúscula y los subpackage se separan con un punto.
  - Típicamente las empresas utilizan la extencion de su dominio(com, orm, es, cl, mx) seguido del nombre del dominio, ejemplo: com.goole / com.facebook
  - WildCard -> *
