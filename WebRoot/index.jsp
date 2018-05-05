<%--
  Created by IntelliJ IDEA.
  User: qy
  Date: 2018/5/3
  Time: 10:58
  To change this template use File | Settings | File Templates.
--%>
<%@include file="common/common.jspf"%>
<html>
<head>
    <title>login</title>
</head>
<body>
    <%--login Dialog--%>
<div id="loginDialog">
    <form id="loginForm" action="${pageContext.request.contextPath}/account/loginAccount.action" method="post">
        <tr>
            <td>login:</td>
            <td><input id="loginName" name="loginName"></td>
        </tr>
        <tr>
            <td>password:</td>
            <td><input id="password" name="password"></td>
        </tr>
    </form>
    <div style="color:red" >${requestScope.msg}</div>
</div>

<script type="text/javascript">
    $("#loginForm").form("disableValidation");
    $("#loginDialog").dialog({
        title: 'login',
        width: 700,
        height: 400,
        closable: false,
        cache:false,
        closed:false,
        modal:true,
        buttons:[{
            text:'Submit',
            iconCls:'icon-ok',
            handler:function () {
                $("#loginForm").form("enableValidation");
                //validate方法:进行form表单字段的验证，通过返回true
                if($("#loginForm").form("validate")){
//                    alert("login");
                    //$("#ff").get(0).submit();
                    $("#loginForm").submit();

                }

            }
        },
            {
                text:'Cancel',
                iconCls:'icon-cancel',
                handler:function () {
                    $("#loginForm").form("reset");
                }
            }
        ]
    })

    $("#loginName").validatebox({
        required:true,
        validType:length[1,100]
    })
    $("#password").validatebox({
        required:true,
        validType:length[1,100]
    })



    function loginCancel() {

    }
</script>
</body>
</html>
