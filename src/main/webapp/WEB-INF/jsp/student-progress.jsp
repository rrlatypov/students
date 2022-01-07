
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2 class="heading-secondary">отображена успеваемость для следующего студента:</h2>

<div class="container">
    <table class="student-table" border="1">
        <tr>
            <th>фамилия </th>
            <th> имя</th>
            <th> группа</th>
            <th> дата поступления</th>
        </tr>
        <tr>
            <td>&nbsp</td>
            <td> &nbsp </td>
            <td> &nbsp </td>
            <td> &nbsp </td>
        </tr>
    </table>




</div>


<section class="semestr-note">
    <div>
        <table class="disciplina-note" border="1">
            <tr>
                <th>дисциплина </th>
                <th>оценка</th>
            </tr>
            <tr>
                <td>информатика</td>
                <td>&nbsp</td>
            </tr>
            <tr>
                <td>социология</td>
                <td>&nbsp</td>
            </tr>

        </table>

    </div>
    <div class="choice-semestr">
        <h2> выбрать семестр       : </h2>
        <select border="1">
            <option class="choice"> семестр1 </option>
            <option class="choice"> семестр2 </option>

        </select>
        <form>
            <input type="button" class="choice-btn" value="выбрать">
        </form>

    </div>




</section>
</body>
</html>
