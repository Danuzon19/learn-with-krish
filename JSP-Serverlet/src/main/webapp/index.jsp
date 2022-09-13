<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Virtusa Calculator</title>
</head>
<body>
<h1><%= "calculator" %>
</h1>
<br/>

<form method="GET" action="A">

    <input type="text" name="number1" placeholder="Enter Your First Number" /> &nbsp;&nbsp;


    <select name="sign">
        <option>+</option>
        <option>-</option>
        <option>*</option>
        <option>/</option>
    </select> &nbsp;&nbsp;


    <input type="text" name="number2" placeholder="Enter Your Second Number"/>
    <br/><br/><br/><br/>
    <input type="submit" value="Calculate" />
</form>


</body>
</html>