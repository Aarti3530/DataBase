<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Hello Buddies!!
<form action="addAlien">
Enter id : <input type="text" name = "id"><br>
Enter name : <input type="text" name = "name"><br>
Enter age : <input type="text" name = "age"><br>
Enter num : <input type="text" name = "num"><br>
<input type = "submit"><br><br>
</form>

<form action="getAlien">
Enter id : <input type="text" name="id"><br>
<input type="submit">
</form><br>

<form action="all">
GET ALL : <input type="submit">
</form>

</body>
</html>