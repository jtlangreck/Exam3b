
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
   <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" href="style.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

        <title>Customers DB Admin Access</title>
    </head>
    
    <% String table = (String) request.getAttribute("table"); %>
    
    <body>
        <div class="wrap">
           
                 <%@ include file="includes/menu.jsp" %> 
             <%@ include file="includes/header.jsp" %> 
            
           
        
            
            <div class="main">
                <div class="col-sm-1 col-xs-12"></div>
                <div class="col-sm-10 col-xs-12">
                    <h1 id="tablehead">My Customers</h1><br>
                <%= table %></div>

               
            </div>
           
        </div>
       
    </body>
</html>
