<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="resources/css/style.css">
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
    <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <script>
        $( function() {
            $( "#datepicker" ).datepicker();
        } );
    </script>
    <title>discipline-creating</title>
</head>
<body>
<aside class="navigation">
    <a href="/home" class="navigation-item">на главную</a>
    <a href="/disciplines" class="navigation-item">назад</a>

</aside>

<main class="main">
    <h1 class="main-heading"> система управления студентами и их успеваемостью</h1>
    <c:choose>
        <c:when test="${isCreate==1}">
            <div>
                <h3 class="heading-secondary">для того, что бы создать новую дисциплину заполните все поля и нажмите кнопку "создать":</h3>
            </div>
            <form action="/discipline-create" method="post">
        </c:when>

        <c:otherwise>
            <div>
                <h3 class="heading-secondary">для того, что бы модифицировать дисциплину введите новое значение и нажмите кнопку "применить":</h3>
            </div>
            <form action="/discipline-modify" method="post">
        </c:otherwise>
    </c:choose>
            <input type="hidden" value="${discipline.id}" name="idDiscip">




        <table>
            <tr>
                <td class="cell1">название</td>
                <td class="cell"> <input type="text" id="datepicker" name="newDiscip" class="text" value="${discipline.discipline}"></td>
            </tr>
        </table>
        <br>
        <c:choose>
            <c:when test="${isCreate==1}">
                <input type="submit" value=" создать" class="field">
            </c:when>

            <c:otherwise>
                <input type="submit" value=" применить" class="field">
            </c:otherwise>
        </c:choose>
            <c:choose>
                <c:when test="${message==1}">
                    <br>
                    <h3> поля не должны быть пустыми </h3>
                </c:when>


            </c:choose>



    </form>





</main>
<aside class="logout">
    <a href="#" class="logout-btn">logout</a>
    //комментарий (фонарно)

</aside>

</body>
</html>




