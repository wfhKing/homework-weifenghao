<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <meta name="subtitle" content="进货">
</head>
<body>

<div class="container">
    <form action="/phone/PhoneAddServlet" method="post">
        <div class="form-group">
            <label for="id">手机ID</label>
            <input type="number" class="form-control" id="id" name="id" placeholder="id">
        </div>
        <div class="form-group">
            <label for="name">手机名称</label>
            <input type="text" class="form-control" id="name" name="name" placeholder="name">
        </div>
        <div class="form-group">
            <label for="price">手机价格</label>
            <input type="number" class="form-control" id="price" name="price" placeholder="price">
        </div>
        <div class="form-group">
            <label for="memory">手机内存</label>
            <input type="text" class="form-control" id="memory" name="memory" placeholder="memory">
        </div>
        <div class="form-group">
            <label for="press">厂商</label>
            <input type="text" class="form-control" id="press" name="press" placeholder="press">
        </div>
        <div class="form-group">
            <label for="cpu">CPU核数</label>
            <input type="text" class="form-control" id="cpu" name="cpu" placeholder="cpu">
        </div>
        <div><input type="submit" class="btn btn-primary"></div>
    </form>
</div>

<script src="/assets/js/jquery-1.11.3.min.js" type="text/javascript"></script>
<script>
    $("#list").removeClass("nav-link active");
    $("#list").addClass("nav-link");
    $("#add").addClass("nav-link active");
</script>
</body>
</html>
