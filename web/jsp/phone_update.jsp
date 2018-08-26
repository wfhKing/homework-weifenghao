<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<form action="<c:url value="/phone/PhoneUpdateServlet" />" method="post" class="form-horizontal">
    <div class="modal fade" id="myModal" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-body">
                    <div class="form-group">
                        <label for="id" class="col-sm-2 control-label">ID</label>
                        <div class="col-sm-10">
                            <input type="text" id="id" class="form-control" name="id" readonly>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="name" class="col-sm-2 control-label">名称</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="name" placeholder="手机名称" name="name">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="price" class="col-sm-2 control-label">价格</label>
                        <div class="col-sm-10">
                            <input type="number" step="0.01" class="form-control" id="price" placeholder="价格" name="price">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="memory" class="col-sm-2 control-label">内存</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="memory" placeholder="内存" name="memory">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="press" class="col-sm-2 control-label">厂商</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="press" placeholder="厂商" name="press">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="cpu" class="col-sm-2 control-label">CPU核数</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="cpu" placeholder="CPU核数" name="cpu">
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                    </button>
                    <input type="submit" class="btn btn-primary" value="确认修改"></input>
                </div>
            </div>
        </div>
    </div>
</form>

<%--数据区--%>

<script src="/assets/js/jquery-1.11.3.min.js" type="text/javascript"></script>
<script>
    /*$("#myModal").on("show.bs.modal", function (e) {
        var id = $(e.relatedTarget).data("id");
        $.ajax({
            type: "get",
            url: "/phone/PhoneUpdateServlet",
            data: {id: id},
            success: function (data) {
                $.each(data,function (index,obj) {
                    $("#id").val(obj.id);
                    $("#name").val(obj.name);
                    $("#price").val(obj.price);
                    $("#memory").val(obj.memory);
                    $("#press").val(obj.press);
                    $("#cpu").val(obj.cpu);
                })
            },
            error: function (xhr, textStatus, errorThrown) {
                alert(xhr + textStatus + errorThrown);
            }
        })
    })*/
    function update(id) {
        $.ajax({
            type: "get",
            url: "/phone/PhoneUpdateServlet",
            data: {id: id},
            success: function (data) {
                $.each(data,function (index,obj) {
                    $("#id").val(obj.id);
                    $("#name").val(obj.name);
                    $("#price").val(obj.price);
                    $("#memory").val(obj.memory);
                    $("#press").val(obj.press);
                    $("#cpu").val(obj.cpu);
                })
            },
            error: function (xhr, textStatus, errorThrown) {
                alert(xhr + textStatus + errorThrown);
            }
        })
    }
</script>
