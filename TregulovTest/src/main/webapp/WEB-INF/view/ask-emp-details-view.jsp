<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>

<body>

<h2>Dear Employee, Please enter your details</h2>

<br> <%--тег для перехода на новую строку--%>
<br>

<form:form action ="showDetails" modelAttribute="employee">

    Name <form:input path="name"/>
    <br>
    <br>
    Surname <form:input path="surname"/>
    <br>
    <br>
    Salary <form:input path="salary"/>
    <br>
    <br>
    Department <form:select path="department">
    <form:options items="${employee.departments}"/>

</form:select>
    <br>
    <br>

    <input type="submit" value="OK"> <%--при нажатии на ОК срабатывают Сеттеры--%>

</form:form>

</body>

</html>