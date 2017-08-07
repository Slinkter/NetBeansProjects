<%-- 
    Document   : AdminCatalogo
    Created on : 12/11/2015, 04:26:21 PM
    Author     : LuiS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.List,java.util.HashMap, java.util.ArrayList, java.sql.Date, java.util.Iterator, java.util.Map, ulima.auxiliar.Consumo"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
        <title>Luz del Norte</title>
    </head>
    <body>
               
        
        <div class="container">
            <h1>Listado de Consumos por Suministro </h1>
            
            <br>
            
                
            <table class="table table-striped" id="tablaEmpleados">
                <tr>
                                      
             
                    <td>ID Sumnistro </td>
                    <td>Fecha  </td>
                    <td>Consumo   </td>
                    
                    
                    
                </tr>
                
            <%
            Map<String, List<Consumo>> consumosBySum = (HashMap) request.getAttribute("ConsumosBySum");
            
            Iterator it = consumosBySum.keySet().iterator();
            
            while(it.hasNext()){
            	String id_sum = (String) it.next();
            	List<Consumo> consumos = consumosBySum.get(id_sum);
            	
            	for (int i =0;i < consumos.size();i++){
            		
            		Consumo cons = consumos.get(i);
            		Date fecha = cons.getFecha_consumo();
            		float consumo_KWH = cons.getConsumo_KWH();
            		
            		%> <tr>
            		
            		<td><%= id_sum %> </td>
            		<td><%= fecha.toString() %></td>
            		<td><%= consumo_KWH %></td>
            		</tr>
            		<%
            	}
            }
            
            %>
            
            </table>
        </div>
    </body>
</html>
