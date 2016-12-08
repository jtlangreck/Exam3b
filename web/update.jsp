<%-- 
    Document   : add
    Created on : Oct 16, 2016, 4:14:52 PM
    Author     : Jake Langreck
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Customers"%>
<% Customers customer = (Customers) request.getAttribute("customer"); %>
<!DOCTYPE html>
<html>
    <head>
         
   <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" href="style.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

        <title>Add Customer</title>
    </head>
    <body>
        <div class="wrap"> 
            
            <%@ include file="includes/header.jsp" %> 
            
            <%@ include file="includes/menu.jsp" %> 
            
        <div class="main">
            <div class='col-sm-2 col-xs-12'></div>
            <div class='col-sm-8 col-xs-12' style='margin-bottom:3%;'>
        <h1 id="tablehead">&nbsp; Add A Customer!</h1>
        
        <form name="addForm" action="updateCustomer" method ="get">
            <table align='center' class='addtable'>
                <tr><td class="addtd" text-align='right;'><label>First Name:</label></td>
                <td class="addtd"><input type="text" name="firstName" value="<%= customer.getCustID() %>" readonly/></td>
                </tr>
                
             <tr><td class="addtd" text-align='right;'><label>First Name:</label></td>
                <td class="addtd"><input type="text" name="firstName" value="<%= customer.getFirstName() %>" required /></td>
                </tr>
                <tr>
                    <td class="addtd"><label> Last Name:</label></td>
                    <td class="addtd"><input type="text" name="lastName" value="<%= customer.getLastName() %>" required /></td>
                </tr>
                 <tr>
                    <td class="addtd"><label> Address 1:</label></td>
                    <td class="addtd"><input type="text" name="Addr1" value="<%= customer.getAddr1() %>" required /></td>
                </tr>
                 <tr>
                    <td class="addtd"><label> Address 2:</label></td>
                    <td class="addtd"><input type="text" name="Addr2" value="<%= customer.getAddr2() %>" /></td>
                </tr>
                 <tr>
                    <td class="addtd"><label> City:</label></td>
                    <td class="addtd"><input type="text" name="City" value="<%= customer.getCity() %>" required /></td>
                </tr>
                 <tr>
                    <td class="addtd"><label> State:</label></td>
                    <td class="addtd"><input type="text" name="State" value="<%= customer.getState() %>" required /></td>
                </tr>
                 <tr>
                    <td class="addtd"><label> Zip Code:</label></td>
                    <td class="addtd"><input type="text" name="Zip" value="<%= customer.getZip() %>" required /></td>
                </tr>
                 <tr>
                    <td class="addtd"><label> Email Address:</label></td>
                    <td class="addtd"><input type="text" name="emailAddr" value="<%= customer.getEmailAddr() %>" required /></td>
                </tr>
                <br>
                <tr>
            <td class='addtd'>
            <input   style='background-color:red;' class="btn-info" type="reset" name="clear" value="Clear" />
            </td>
            <td class='addtd'>
            <input class="btn-info" type="submit" name="submit" value="Submit" />
            </td>
            </tr>
            </table>
            
            
        </form>
        </div>
        </div>
        
        </div>
    </body>
</html>
