<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
     "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Result</title>
<link href="resources/style/iotcss.css" rel="stylesheet" type="text/css"/>
         <h:outputStylesheet name="css/jsfcrud.css"/>
</head>
<body>
    <br></br><br></br>
    <div id ="cuadro">
    <center>
        <h3><%=request.getAttribute("Message")%></h3>
    </center>
     </div>
    
    <br></br><br></br>
    
    <center>
    <a href="javascript:history.back()"></a>
    <input type="button" onclick="history.back()" name="volver atrás" value="volver atrás" class="boton2">
    </center>
    
</body>
</html>