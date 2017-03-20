<%-- 
    Document   : projecteDetall
    Created on : 19-mar-2017, 18:08:46
    Author     : alcampo
--%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Projecte ${projecte.nom}</h1>
        <c:forEach var='tasca' items='${projecte.tasques}'>
        
        <li>${tasca.nom}</li>
        <li>${tasca.descripcio}</li>
        <li>${tasca.getNdies()}</li>
        <li>${tasca.isRealitzada()}</li>

    </c:forEach>
        
        <form action="controlador">
        <input type="hidden" name="prCodi" value="${projecte.codi}" >
        <input type="submit" name="novatasca" value="Nova tasca" >
        </form>
        
        <form action="controlador">
            Eliminar el Projecte
        <input type="hidden" name="prCodi" value="${projecte.codi}" >
        <input type="submit" name="eliminar" value="Eliminar" >
        </form>
        
        
    </body>
</html>
