# -CVDS-LABORATORIO-2---PATTERNS

## **LA HERRAMIENTA MAVEN** 

**- Cuál es su mayor utilidad**
  Estandarizar la construcción de proyectos en Java, facilitando su creacion de un sistema uniforme y mejorando las buenas practicas de desarrollo.
  
**- Ciclo de vida de la construcción**
  Las partes principales del proyecto Maven son:
  i. **compile**: Genera los ficheros (.class) compliando el codigo en (.java)
  ii. **test**: Ejecuta automaticamente los test en JUnit
  iii. **package**: Genera los ficheros (.jar) con los archivos (.class) compilados
  iV. **install**: Se realiza una copia del fichero  (.jar) a un directorio dentor del ordenador.
  v. **deploy**: Se realiza una copia del fichero (.jar) a un servidor remoto.
  
**- Para qué sirven los plugins**
  Maven es un framework de plugin ejecutables. Los plugins tienen unas metas donde varia su funcionamiento algunas pueden: compilar el proyecto, implementarlo en un servidor local o remoto. 
  
**- Qué es y para qué sirve el repositorio central de maven**
  El repositorio central es donde Maven descarga todas las bibliotecas de dependencias del proyecto en una ubicación predeterminada. La forma que lo hace es por medio de la carpeta .m2 dentro del repositorio local. 

## **CREAR UN PROYECTO CON MAVEN**

**-Como se crea un proyecto maven con ayuda de los arquetipos(archetypes)**
  Un arquetipo es una plantilla parametrizadas para desarrollar. Se realiza por medio de la siguiente estructura: 

  mvn archetype:generate

  Usando los siguientes parametros. 
  <img width="493" alt="image" src="https://github.com/Hajaku12/-CVDS-LABORATORIO-2---PATTERNS/assets/62758651/c03efb9c-7f8b-4da5-a342-86ccca39e059">

## **COMPILAR Y EJECTUAR**

**Busque cúal es el objetivo del parámetro "package" y qué otros parámetros se podrían enviar al comando mvn.**
  - **mvn package**: Comando para empaquetado del proyecto maven. Para un proyecto java se realiza en un paquete (.jar)
  - **mvn compile**: Compando para la compilación del proyecto maven. Se forman archivos (.class) y se guardan en la carpeta de clases.
  - **mvn test**: Comando para realizar los test de las pruebas unitarias del proyecto maven.

**Busque cómo ejecutar desde línea de comandos, un proyecto maven y verifique la salida cuando se ejecuta con la clase App.java como parámetro en "mainClass**
  mvn exec:java -Dexec.mainClass="edu.eci.cvds.patterns.archetype.App"

## **HACER EL ESQUELETO DE LA APLICACIÓN**

**¿Cuál fábrica hiciste? y ¿Cuál es mejor?**
  - **Simple Factory**: De las 3 opciones hicimos el simple factory. En cuanto a cual es mejor consideramos que no hay una respuesta definitiva ya que cada uno tiene propositos diferentes que llegan a ser mas utiles dependiendo de la situcaión. Por ejemplo simple factory esta pensado para tener una clase que se encargue de crear instancias de diferentes clases concretas basado en un parámetro de entrada; pero en algunos casos puede volverse dificil de mantener y extender mas adelante. Esto sucede enlos 3 patrones de diseño lo que genera que el uso de cada uno dependa de la situación para lo que necesitemos en nuestro software.
  
**¿Cuál(es) de las anteriores instrucciones se ejecutan y funcionan correctamente y por qué?**
  - **Sin Parametros**: No se ejecuta ya que es obligatorio tener un parametro para que funcione.
  - **qwerty**: No funciona ya que el parametro qwerty no es un parametro que exita en la memoria, por lo que es como sino ubiera parametro y sin parametro es imposible el funcionamiento.
  - **pentagon**: Con este comando si funciona correctamente ya  que es un parametro valido; sin embargo se debe tener cuidado con las mayusculas y minusculas ya que si en nuetro codigo estuviera pentagon con p mayuscula el codigo no ubiera funcionado.
  - **Hexagon**:  Con este comando si funciona correctamente ya  que es un parametro valido; sin embargo se debe tener cuidado con las mayusculas y minusculas ya que si en nuetro codigo estuviera hexagon con h minuscula el codigo no ubiera funcionado.

## **PARA QUE SIRVE "GITIGNORE"**
El git ignore es un comando de git que se usa cuando queremos que un archivo espeecifico sea ignnorado, porque no queremos hacerle un control de versiones esto permite que al hacer git status no nos muestre el archivo que queremos que ignore. El git ignore se queda como un archivo de texto en la raiz del proyecto.
## Bibliografia:
- https://maven.apache.org/what-is-maven.html
- https://www.mojohaus.org/exec-maven-plugin/usage.html
- https://refactoring.guru/design-patterns/catalog
- https://jenkov.com/tutorials/maven/maven-commands.html
