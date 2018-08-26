<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sitemesh" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title><sitemesh:title /></title>

    <%@include file="phone_css_template.jsp"%>
    <sitemesh:head />
</head>

<body>
<%@ include file="phone_top_template.jsp"%>

<div class="container-fluid">
    <div class="row">
        <%@ include file="phone_left_template.jsp"%>

        <%@ include file="phone_body_template.jsp"%>
    </div>
</div>

<%@ include file="phone_js_template.jsp"%>

</body>
</html>
