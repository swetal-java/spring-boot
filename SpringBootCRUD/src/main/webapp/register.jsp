<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <form action="addUser">
    <label for="name">Name:</label>
        <input type="text" id="name" name="name">
        <br>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email">
        <br>

        <label for="gender">Gender:</label>
        Female:<input type="radio" id="gender" name="gender" value="Female">
        Male:<input type="radio" id="gender" name="gender" value="Male">
        <br>
        
        <label for="password">Password:</label>
        <input type="password" id="password" name="password">
        <br>
        <button type="submit">Submit</button>
   </form>
</body>
</html>