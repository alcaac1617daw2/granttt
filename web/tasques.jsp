<%-- 
    Document   : tasques
    Created on : 19-mar-2017, 17:38:36
    Author     : alcampo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Tasques</title>
  </head>
  <body>
      
      <h1>Nova tasca</h1>
  <form action="controlador">
    Nom <input type="text" name="nomT"><br/>
    Descripcio <input type="text" name="descT"><br/>
    Numero de dies <input type="number" name="nT"><br/>
    <input type="hidden" name="prNom" value="${projecte.nom}" >
    <input type="hidden" name="prCodi" value="${projecte.codi}" >
    <input type="hidden" name="prvell" value="${prvell}" >
    <br/>prvell
    <input type="submit" name="tascasave" value="Guardar" >
    

  </form>
  </body>
</html>

