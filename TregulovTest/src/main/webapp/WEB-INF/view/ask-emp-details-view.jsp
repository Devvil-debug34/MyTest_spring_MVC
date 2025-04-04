<!DOCTYPE html>

<html>

<body>

<h2>Dear Employee, Please enter your details</h2>

<br> <%--тег для перехода на новую строку--%>
<br>

<form action="showDetails" method="get">
    <input type="text" name="employeeName" <%--в переменную Name мы сохраняем текст написанный юзером--%>
           placeholder="Write your name"/> <%--подсказка что нужно вводить в строку--%>

    <input type="submit"/> <%--тип который будет отображать кнопку--%>

</form>

</body>

</html>