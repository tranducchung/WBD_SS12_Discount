<%--
  Created by IntelliJ IDEA.
  User: tranchung
  Date: 14/04/2019
  Time: 11:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculator</title>
  </head>
  <body>
  <form method="get" action="${pageContext.request.contextPath}/discount">
    <label><h1>Product Discription</h1></label><br>
    <input type="text" placeholder="Product Description"/><br>
    <input type="number" placeholder="List Price" name="Price"/><br>
    <input type="number" placeholder="Discount Percent" name="Discount"/>%<br>
    <input type="submit" value="Calculator Discount">
  </form>
  </body>
</html>
