<%--
  Created by IntelliJ IDEA.
  User: qy
  Date: 2018/5/9
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@include file="/common/common.jspf"%>
<html>
<head>
    <title>insertSupplier</title>
</head>
<body>
<form id="insertForm" method="post">
    <tr>
    <td>name:</td>
    <td><input type="text" id="inputName" name="name"><br></td>
</tr>
    <tr>
        <td>linkman:</td>
        <td><input type="text" id="inputLinkman" name="linkman"><br></td>
    </tr>
    <tr>
        <td>phone:</td>
        <td><input type="text" id="inputPhone" name="phone"><br></td>
    </tr>
    <tr>
        <td>address:</td>
        <td><input type="text" id="inputAddress" name="address"><br></td>
    </tr>
    <tr>
        <td>remark:</td>
        <td><input type="text" id="inputRemark" name="remark"><br></td>
    </tr>
    <tr>
        <td><input type="button" id="submitBtn" value="submit"></td>
        <td><input type="button" id="clearBtn" value="clear"></td>
    </tr>

</form>

<script type="text/javascript">
    $(function () {
        $("input[name]").validatebox({
            required:true,
            missingMessage:'Please input information'
        });
        $("#insertForm").form("disableValidation");
        $("#submitBtn").click(function () {
            $("#insertForm").form("enableValidation");
            $("#insertForm").form('submit',{
                url:'${pageContext.request.contextPath}/supplier/insertSupplier.action',
                onSubmit:function () {
                    return true;
                },
                success:function (count) {
                    $.messager.alert('message','success','info')
                    $("#insertDg").dialog('close');
                    $("#dg").datagrid('reload');
                }
            });
            }

        )

        $("#clearBtn").click(function () {
            $("#insertForm").form('clear');
        })
    })
</script>
</body>
</html>
