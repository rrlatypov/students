<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>




    <h2 class="heading-secondary">список дисциплин</h2>

    <div class="container">
        <table class="discipline-table" border="1">
            <tr>
                <th>&nbsp</th>
                <th> название дисциплин</th>
            </tr>
            <c:forEach items="${disciplines}" var="d">
                <tr>
                    <td><input type="checkbox" value="${d.id}"></td>
                    <td align="left">${d.discipline} </td>
                </tr>

            </c:forEach>


        </table>
        <div class="discipline-buttons">
            <form method="get" action="/discipline-create">
                <button>создать дисциплину</button>
            </form>

                <button onclick="modifyDisciplines()">модифицировать выбранную дисциплину</button>


                <button onclick="deleteDisciplines()">удалить выбранную дисциплину</button>


        </div>
    </div>

<form action="/disciplines" method="post" id="deleteDiscForm">
    <input type="hidden" id="deleteDiscHidden" name="deleteDiscHidden">
</form>

<form action="/discipline-modify" method="get" id="modifyDiscForm">
    <input type="hidden" id="modifyDiscHidden" name="modifyDiscHidden">
</form>






