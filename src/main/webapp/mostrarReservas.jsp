
<%@page import="com.proyectoreservascoworking.entity.Reserva"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <!-- BootStrap -->
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
          
    </head>
  <body class="bg-light">
        <div class="container mt-5">
            <h1 class="mb-4 text-center">Listado de Reservas</h1>
            
            <%
                // Obtenemos la lista de reservas de la sesión
                List<Reserva> reservas = (List<Reserva>) request.getSession().getAttribute("listaReservas");
                
                if (reservas != null && !reservas.isEmpty()) {
            %>
            
            <!-- Tabla de Reservas -->
            <table class="table table-striped table-bordered">
                <thead class="thead-dark text-center">
                    <tr>
                        <th>ID</th>
                        <th>Nombre Usuario</th>
                        <th>Fecha de Reserva</th>
                        <th>Espacio</th>
                        <th>Duración</th>
                        <th>Acciones</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        for (Reserva reserva : reservas) {
                    %>
                    <tr>
                        <td><%= reserva.getId() %></td>
                        <td><%= reserva.getNombreUsuario() %></td>
                        <td><%= reserva.getFechaReserva() %></td>
                        <td><%= reserva.getEspacio() %></td>
                        <td><%= reserva.getDuracion() %></td>
                        
                        <td>
                    <form action="EliminarReservaServlet" method="post" class="d-inline">
                                <input type="hidden" name="id" value="<%= reserva.getId() %>">
                                <button type="submit" class="btn btn-danger btn-sm">
                                    <i class="fas fa-trash-alt"></i> Eliminar
                                </button>
                            </form>
                </td>
                        
                    </tr>
                    <%
                        }
                    %>
                </tbody>
            </table>
            
            <%
                } else {
            %>
            
            <!-- Mensaje de que no hay reservas -->
            <div class="alert alert-danger center">
                No hay reservas.
            </div>
            
            <%
                }
            %>
            <!-- Boton para ir al index.html -->
            <a type="submit" class="btn btn-success btn-block mt-3" href="index.html">
                            Crear Reserva
            </a>
        </div>
        
      
    </body>
</html>
