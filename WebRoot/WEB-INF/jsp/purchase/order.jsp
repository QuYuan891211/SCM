<%--
  Created by IntelliJ IDEA.
  User: qy
  Date: 2018/5/16
  Time: 20:16
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
<%@include file="/common/common.jspf"%>
    <title>Purchase</title>
    <script type="text/javascript">
        $(function () {
            $("#shoppingCart").datagrid({
                //url:"",
                width : 800,
                columns: myColumns,
                toolbar: goodsToolBar

            });
        })



        var goodsToolBar=[{
            text:'add goods',
            iconCls:'icon-add',
            handler:function () {
                window.open ( "${pageContext.request.contextPath}/base/pageTransitionByURL/goods/GoodsList.action" , "_blank" ,
                    "height=300,width=500,scrollbars=no,location=no" )
                }
        },'-',{
            text:'delete goods',
            iconCls:'icon-delete',
            handler:function () {

            }
        }];




        var myColumns = [[{
          field:'ck',
          checkbox:true
        },{
            field : 'goodsId',
            title : 'goodsId',
            width : 100
        }, {
            field : 'goodsName',
            title : 'goodsName',
            width : 100
        }, {
            field : 'goodsUnit',
            title : 'goodsUnit',
            width : 100
        }, {
            field : 'goodsType',
            title : 'goodsType',
            width : 100
        }, {
            field : 'goodsColor',
            title : 'goodsColor',
            width : 100
        }, {
            field : 'bodAmount',
            title : 'bodAmount',
            width : 100
        }, {
            field : 'bodBuyPrice',
            title : 'bodBuyPrice',
            width : 100
        }, {
            field : 'bodTotalPrice',
            title : 'bodTotalPrice',
            width : 100
        }, {
            field : 'bodImeiList',
            title : 'bodImeiList',
            width : 100,
            align : 'right'
        }  ] ]


    </script>
</head>
<body>
<%--<form style="padding:15px;margin:0px;background:#eee;" id="ff" action="">--%>
    <%--Please fill the Supplier Information：<br>--%>
    <%--Supplier：<input type="text" id="supId" name="supId"/>--%>
    <%--Warehouse：<input type="text" id="shId" name="shId"/>--%>
    <%--Date：<input  type="text" id="boDate"--%>
               <%--class="easyui-datebox" name="boDate" required="required"></input>--%>

    <%--Price：<input type="text" id="boPayable" name="boPayable"/><br>--%>
    <%--Pay：<input type="text" id="boPaid" name="boPaid"/>--%>
    <%--Arrears：<input type="text" id="boArrears" name="boArrears"/>--%>
    <%--OrderNo：<input type="text" id="boOriginal" name="boOriginal"/><br>--%>
    <%--Staff：<input type="text" id="boAttn" name="boAttn"/>--%>
    <%--Operator：<input type="text" id="boOperator" name="boOperator"/>--%>
    <%--Remark：<input type="text" id="boRemark" name="boRemark"/>--%>
<%--</form>--%>
    <table id="shoppingCart"></table>


</body>
</html>
