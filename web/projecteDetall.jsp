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
        <form action="controlador">
             <input type="hidden" name="prCodi" value="${projecte.codi}" >
            Nom del projecte <input type="text" name="nom" value="${tasca.nom}"><br/>
            Descripcio del projecte <input type="text" name="desc" value="${tasca.descripcio}"><br/>
            <li>${tasca.getNdies()}</li><br/>
        <li>${tasca.isRealitzada()}</li><br/>
    
    <input type="submit" name="mod" value="Guardar" >
  </form>
        
        

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
        <form action="controlador">
            
        <input type="submit" name="tornar" value="Tornar" >
        </form>
        
        
    </body>
</html>
