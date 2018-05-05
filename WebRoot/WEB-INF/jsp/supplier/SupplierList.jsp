<%--
  Created by IntelliJ IDEA.
  User: qy
  Date: 2018/5/4
  Time: 9:14
  To change this template use File | Settings | File Templates.
--%>
<%@include file="/common/common.jspf"%>
<html>
<head>
    <title>SupplierList</title>

</head>
<body>
<table id="dg"></table>
<script type="text/javascript">
    $(function () {
        $("#dg").datagrid({
            url:'${pageContext.request.contextPath}/json/SupplierDatagrid.json',
            columns: columns,
//            fitColumns : true,
            width : 800,
            //设定是否换行显示数据， true为不换行
            nowrap : true,
            loadMsg : '加载中...',
            selectOnCheck : true,
            rownumbers : true,
            selectOnCheck : true,
            frozenColumns:frozenColumns,
            pagination:true,
            toolbar:toolbar


        });
    })




    var columns = [[
        {
            field : 'unitcost',
            title : 'unitcost',
            align : 'right'
        },{
            field : 'listprice',
            title : 'Price',
            align : 'right',

        }, {
            field: 'itemid',
            title: 'itemid',
            align: 'right',
            formatter: function (value, row, index) {
                return "<span title='" + value + "'>" + value + "</span>";

            }
        },{
            field : 'attr1',
            title : 'attr1',
            align : 'right',
            formatter: function (value, row, index) {
                return "<span title='" + value + "'>" + value + "</span>";

            }
        }
    ]];

    var frozenColumns = [[
        {
            field:'ck',
            checkbox:true
        }, {
            field: 'productid',
            width: 100,
            title: 'id',
            formatter: function (value, row, index) {
                return "<span title='" + value + "'>" + value + "</span>";

            }
        }
    ]];

    var toolbar=[
        {
            text:'add',
            iconCls:'icon-add',
            handler : function() {
                alert('add');
            }
        },'-',{
            text:'edit',
            iconCls:'icon-edit',
            handler : function() {
                alert('edit');
            }
        },'-',{
            text:'remove',
            iconCls:'icon-remove',
            handler : function() {
                alert('remove');
            }
        },'-',{
            text:'undo',
            iconCls:'icon-undo',
            handler : function() {
                alert('undo');
            }
        },'-', {
            text: 'redo',
            iconCls: 'icon-redo',
            handler: function () {
                alert('redo');
            }
        },'-',{
            text : "<input type='text' id='ss' name='keyword'/>"
        },'-', {
            text: 'search',
            iconCls: 'icon-search',
            handler: function () {
                alert('search');
            }
        }
    ]

    $('#ss').searchbox({
        searcher : function(value, name) {
            alert(value + "," + name);
        },
        prompt : '请输入供应商名称'
    });

</script>
</body>
</html>
