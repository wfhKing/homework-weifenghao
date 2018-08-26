<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>手机列表</title>
    <meta name="subtitle" content="手机列表">
</head>
<body>

<div>
    <input type="text" name="byName" id="byName" placeholder="查询条件(书名)">
    <input type="button" id="selectBook" onclick="selectBook()" class="btn btn-primary btn-sm" value="搜索"/>
</div>

<div>
    <form action="/phone/PhoneDeleteServlet" method="post">
        <table class="table table-striped">
            <tr>
                <th>多选</th>
                <th>id</th>
                <th>名称</th>
                <th>价格</th>
                <th>内存</th>
                <th>厂商</th>
                <th>CPU</th>
                <th>操作</th>
            </tr>

            <tbody id="tbody"></tbody>
            <input type="submit" class="btn btn-primary" value="批量删除">
        </table>
    </form>
</div>

<%@include file="phone_update.jsp" %>

<script src="/assets/js/jquery-1.11.3.min.js" type="text/javascript"></script>
<script>

    function assin(data){
        var tbody = $("#tbody");
        $.each(data, function (index, obj) {
            tbody.append("<tr>"
                + "<td>" + "<input type='checkbox' name='ckb' value='" + obj.id + "'>" + "</td>"
                + "<td>" + obj.id + "</td>"
                + "<td>" + obj.name + "</td>"
                + "<td>" + obj.price + "</td>"
                + "<td>" + obj.memory + "</td>"
                + "<td>" + obj.press + "</td>"
                + "<td>" + obj.cpu + "</td>"
                + "<td>"
                + "<a href='/phone/PhoneDeleteServlet?id=" + obj.id + "'>删除</a> "
                //+ "<a href='#myModal' data-toggle='modal' data-id='"+obj.id+"'>修改</a>"
                + "<a href='#myModal' onclick='update(" + obj.id + ")' data-toggle='modal''>修改</a>"
                + "</td>"
                + "</tr>")
        })
    }

    $(function () {
        $.ajax({
            method: "post",
            url: "/phone/PhoneListServlet"
        }).done(function (data) {
            assin(data);
        })
    });

    function selectBook() {
        var byName = $("#byName").val();
        $.ajax({
            method: "post",
            url: "/phone/PhoneByNameServlet",
            data: {name: byName}
        }).done(function (data) {
            $("table tr:gt(0)").remove();
            assin(data);
        })
    }
</script>
</body>
</html>
