<%-- 
    Document   : index
    Created on : 19-mar-2017, 17:28:22
    Author     : alcampo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="c2" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
  <head>
    <title>Projectes</title>
     
 
    <c:set var="now" value="<%=new java.util.Date()%>" />
  </head>
   <table border="1" width="20%">
      <tr>
        <td width="30" colspan="2" >
          <p align="center">
            <b>
              <font size="4">
              <fmt:formatDate value="${now}" type="both"
              timeStyle="long" dateStyle="long" />
              </font>
            </b>
          </p>
        </td>
      </tr>
   
    </table>
  <h1>Projectes i tasques</h1>
  <body>
     
  <form action="controlador">
    Nom del projecte <input type="text" name="nom"><br/>
    <br/>
    <input type="submit" name="save" value="Guardar" >
  </form>
      <br><br> 
      
     <c:forEach var='project' items='${projectes}'>
        
        <p>Nom del projecte: ${project.nom}</p>
        <c2:forEach var='tasca' items='${project.tasques}'>
        
            <p>Tasca : ${tasca.nom}</p>
            <p>Descripcio : ${tasca.descripcio}</p>
            <p>Durada de la tasca : ${tasca.getNdies()} </p>
       
        </c2:forEach>
      
     <form action="controlador">
    <input type="hidden" name="prCodi" value="${project.codi}" >     
    <input type="submit" name="detall" value="Detalls" >
    </form>
    </c:forEach>
    
    
    
    
  </form>
  </body>
</html>

