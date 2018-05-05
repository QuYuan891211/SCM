<%--
  Created by IntelliJ IDEA.
  User: qy
  Date: 2018/4/29
  Time: 2:14
  To change this template use File | Settings | File Templates.
--%>
<%@include file="common/common.jspf"%>
<html>
<head>
    <title>main</title>
</head>
<body class="easyui-layout">
<div data-options="region:'north',title:'SupplierManagerSystem',split:true"
     style="height:130px;">
    <%--Welcome: ${sessionScope.userName}--%>
</div>
    <div id="westArea" data-options="region:'west',title:'menu',split:true" style="width: 200px">
        <div title="accordion" class="easyui-accordion">
            <div title="BaseData">


                <!-- list-style: none去左边的点；text-decoration: none：去超链接下划线,title用来区分后继定位这里的超链接 -->
                <ul style="padding: 0px;margin:0px;">
                    <li style="padding: 6px;"><a href="${pageContext.request.contextPath}/base//pageTransitionByURL/supplier/SupplierList.action" title="SupplierManager"
                                                 style="text-decoration: none;display: block;font-weight:bold;">SupplierManager</a>
                    </li>
                    <li style="padding: 6px;"><a href="${pageContext.request.contextPath}/base//pageTransitionByURL/goods/GoodsList.action" title="GoodsManager"
                                                 style="text-decoration: none;display: block;font-weight:bold;">GoodsManager</a>
                    </li>
                </ul>
            </div>
            <div title="Title3">content3</div>
        </div>
    </div>
    <div id="centerArea" data-options="region:'center',title:'main',split:true" style="padding: 5px;background: #00ee00">
        <div class="easyui-tabs" id="mainInformationTabs"  fit="true" style="width: 500px;height: 200px">
            <div title="MainInformation" style="padding:20px;">Introduction</div>
        </div>
    </div>


<script type="text/javascript">
    $(function () {
        $("a[title]").click(function () {

            var text = this.href;
            if($("#mainInformationTabs").tabs("exists",this.title)){
                $("#mainInformationTabs").tabs("select",this.title);
            }else {
                $("#mainInformationTabs").tabs("add", {
                    title : this.title,
                    closable : true,
                    content:"<iframe src='"+text+"' height='100%' width='100%' frameborder='0px' ></iframe>"
                });

            }
            return false;
        });
    });

</script>
</body>
</html>
