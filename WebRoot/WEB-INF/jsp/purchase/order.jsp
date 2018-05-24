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
        },'-',{
            text:'save',
            iconCls:'icon-add',
            handler:function () {
                formSubmit();
            }
        }
        ];




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

    function formSubmit() {
        var rows = $("#shoppingCart").datagrid('getRows');
        console.info(rows);
        rows = JSON.stringify(rows);
        console.info(rows);
        $("#ff").form('submit',{
            url:'${pageContext.request.contextPath}/buyOrder/insertBuyOrder.action',
            onSubmit:function (param) {
                param.rows = rows;
                return true;
            },
            success:function (data) {
                alert(data)
            }
        });
    }
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
<form style="padding:15px;margin:0px;background:#eee;" id="ff" action="">
    input order information：<br>
    supName<input type="hidden" id="supId" name="supId"/>
    <input type="text" id="supName" name="supName"/>
    shId<input type="text" id="shId" name="shId"/>
    boDate<input  type="text" id="boDate"
               class="easyui-datebox" name="boDate" required="required"></input>

    boPayable<input type="text" id="boPayable" name="boPayable"/><br>
    boPaid<input type="text" id="boPaid" name="boPaid"/>
    boArrears<input type="text" id="boArrears" name="boArrears"/>
    boOriginal<input type="text" id="boOriginal" name="boOriginal"/><br>
    boAttn<input type="text" id="boAttn" name="boAttn"/>
    boOperator<input type="text" id="boOperator" name="boOperator"/>
    boRemark<input type="text" id="boRemark" name="boRemark"/>
</form>
    <table id="shoppingCart"></table>


</body>
</html>
