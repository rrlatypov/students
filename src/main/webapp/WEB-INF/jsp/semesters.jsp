
<%@ page contentType="text/html;charset=UTF-8" language= "java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="choice-semestr1">
    <h2> выбрать семестр       : </h2>
    <select border="1">
        <option class="choice"> семестр1 </option>
        <option class="choice"> семестр2 </option>

    </select>
    <form>
        <input type="button" class="choice-btn" value="выбрать">
    </form>

</div>
<br>


<h2>
    длительность семестра: 24 недели
</h2>
<br>
<h2>
    список дисциплин семестра
</h2>
<br>
<div class="term">
    <table border="1">
        <tr>
            <th> название дисциплин</th>
        </tr>
        <tr>
            <td>высшая математика</td>
        </tr>
    </table>
    <div class="discipline-btns">
        <button>создать семестр</button>
        <button>модифицировать текущий семестр</button>
        <button>удалить текущий семестр</button>
    </div>
    <table>
        <tr>
            <td></td>
        </tr>
    </table>
</div>
</body>
</html>
