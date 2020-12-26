<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<html>

<head>

    <title>Title</title>
    <link rel="stylesheet" href="/resources/css/style.css">
    <script src="/resources/js/Functions.js" charset="UTF-8" type="text/javascript"></script>
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
    <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <script>
        $( function() {
            $( "#datepicker" ).datepicker();
        } );
    </script>
</head>
<body>
<aside class="navigation">
    <a href="#" class="navigation-item">на главную</a>
     <a href="#" class="navigation-item">назад</a>
</aside>

<main class="main">
    <h1 class="main-heading"> система управления студентами и их успеваемостью</h1>
    <jsp:include page="${currentPage}" flush="true" />
</main>
<aside class="logout">
    <a href="#" class="logout-btn">logout</a>

</aside>
</body>
</html>
