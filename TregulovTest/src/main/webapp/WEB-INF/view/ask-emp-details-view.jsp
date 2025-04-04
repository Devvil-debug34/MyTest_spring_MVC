<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>

<body>

<h2>Dear Employee, Please enter your details</h2>

<br> <%--тег для перехода на новую строку--%>
<br>

<form:form action ="showDetails" modelAttribute="employee">

    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br>
    <br>
    Surname <form:input path="surname"/>
    <form:errors path="surname"/>
    <br>
    <br>
    Salary <form:input path="salary"/>
    <form:errors path="salary"/>
    <br>
    <br>
    Department <form:select path="department">
    <form:options items="${employee.departments}"/>

</form:select>
    <br>
    <br>
    Which car do you want?
   BMW <form:radiobutton path="carBrand" value="BMW"/>
   Audi <form:radiobutton path="carBrand" value="Audi"/>
   MB <form:radiobutton path="carBrand" value="Mersedes-Benz"/>

    <br>
    <br>
    Foreign Language(s)
<%--    EN <form:checkbox path="languages" value="English"/>--%>
<%--    DE <form:checkbox path="languages" value="Deutch"/>--%>
<%--    FR <form:checkbox path="languages" value="Franch"/>--%>
    
    <form:checkboxes path="languages" items="${employee.languageList}"/>

    Name <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br>
    <br>

    Name <form:input path="email"/>
    <form:errors path="email"/>
    <br>
    <br>

    <input type="submit" value="OK"> <%--при нажатии на ОК срабатывают Сеттеры--%>

</form:form>

</body>

</html>