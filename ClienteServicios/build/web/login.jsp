
<%@page import="wsCliente.wslogin"%>
<%@page import="wsCliente.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        String user = request.getParameter("login");
        String clv = request.getParameter("password");
        wslogin log = new wslogin();
        Usuario resultado = log.getJson(Usuario.class,user,clv);
        
        if(resultado.getLogin()!=null){
            out.println("<h1>Acceso concedido</h1>");
        }else{
            out.println("<h1>Acceso denegado</h1>");
        }       
                %>
    </body>
</html>
