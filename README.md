# ProyectoReservaCoworking
Parcial Primer Momento Backend - Construccion de un Servlet con Java 

# Requisitos 
* Java 21
* Tomcat 8

# Instrucciones

1. clona el repositorio
    ```bash
    git clone https://github.com/HansDussich/ProyectoReservaCoworking.git
2. En MySQL crea una base de datos llamada
   ```bash
   coworkingDB
3. Construye el proyecto y las dependencias
4. Asegurate de tener el XAMPP abierto con Apache y MySQL habilitados.
5. Run Project y abre tu navegador y busca
   ```bash
   http://localhost:8080/ProyectoReservasCoworking/

## Index.html
![image](https://github.com/user-attachments/assets/d2229766-9d21-4d4b-a4a3-393283634621)

## MostrarReservas.jsp
![image](https://github.com/user-attachments/assets/c0316ba9-8886-4f2e-b973-c49a66dc8f67)


# Informe
   * Se crea una entidad Reserva que modela los datos.
   * Se cre auna clases PersistencaReserva que contiene los metodos de almacenar, traer y eliminar reservas.
   * Se crean Tres servlets:
        - ReservaServlet: Procesa el formulario Index.html, valida los campos y los guarda en la base de datos.
        - ListaReservasServlet: trae y muestra todas las reservas.
        - EliminarReservaServlet: Elimina una reserva usando el Id.

   * Tenemos dos vistas:
        - Index.html: muestra un formulario y un campo para redirigir hacia mostrarReservas.jsp
        - mostrarReservas.jps: crea una tabla que muestra todas las reservas y un campo para redirigir al index.html
    
