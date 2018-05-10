<%--
  Created by IntelliJ IDEA.
  User: qy
  Date: 2018/5/10
  Time: 8:24
  To change this template use File | Settings | File Templates.
--%>
<%@include file="/common/common.jspf"%>
<html>
<head>
    <title>updateSupplier</title>
</head>
<body>
<form id="updateForm" method="post">
    <tr>
        <td>id:</td>
        <td><input type="text" id="updateId" name="id"><br></td>
    </tr>

    <tr>
        <td>name:</td>
        <td><input type="text" id="updateName" name="name"><br></td>
    </tr>
    <tr>
        <td>linkman:</td>
        <td><input type="text" id="updateLinkman" name="linkman"><br></td>
    </tr>
    <tr>
        <td>phone:</td>
        <td><input type="text" id="updatePhone" name="phone"><br></td>
    </tr>
    <tr>
        <td>address:</td>
        <td><input type="text" id="updateAddress" name="address"><br></td>
    </tr>
    <tr>
        <td>remark:</td>
        <td><input type="text" id="updateRemark" name="remark" ><br></td>
    </tr>
    <tr>
        <td><input type="button" id="submitBtn" value="submit"></td>
        <td><input type="button" id="clearBtn" value="clear"></td>
    </tr>

</form>
<script type="text/javascript">
$(function () {
    var selectedSuppliers = window.opener.getSelected();
    $("#updateForm").form('load',{
        id: selectedSuppliers[0].id,
        name:selectedSuppliers[0].name,
        linkman:selectedSuppliers[0].linkman,
        phone:selectedSuppliers[0].phone,
        address:selectedSuppliers[0].address,
        remark:selectedSuppliers[0].remark
    })


})

    $("#submitBtn").click(function () {
        $("#updateForm").form('submit',{
            url:'${pageContext.request.contextPath}/supplier/updateById.action',
            onSubmit:function () {
                return true;
            },
            success:function (count) {
                $.messager.alert('information','success','info');
                window.close();
                $("#dg").datagrid('reload');
            }
        })
    })

    $("#clearBtn").click(function () {
        $("#updateForm").form('clear');
    })
</script>
</body>
</html>
