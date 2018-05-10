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
<div id="insertDg"></div>
<div id="updateDg"></div>
<script type="text/javascript">
    $(function () {
        $("#dg").datagrid({
            url:'${pageContext.request.contextPath}/supplier/pagination.action',
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
            pageSize:3,
            pageList : [3, 6, 9],
            toolbar:toolbar,
            queryParams:{
                name:"%%"
            }


        });



    })




    var columns = [[
        {
            field : 'name',
            title : 'name',
            align : 'right'
        },{
            field : 'linkman',
            title : 'linkman',
            align : 'right'

        }, {
            field: 'phone',
            title: 'phone',
            align: 'right',
            formatter: function (value, row, index) {
                return "<span title='" + value + "'>" + value + "</span>";

            }
        },{
            field : 'address',
            title : 'address',
            align : 'right',
            formatter: function (value, row, index) {
                return "<span title='" + value + "'>" + value + "</span>";

            }
        },{
            field:"remark",
            title:"remark",
            align:'center'
        }
    ]];

    var frozenColumns = [[
        {
            field:'ck',
            checkbox:true
        }, {
            field: 'id',
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
                $("#insertDg").dialog({
                    title:"insertSupplier",
                    width:400,
                    height:300,
                    href:'${pageContext.request.contextPath}/base/pageTransitionByURL/supplier/insertSupplier.action'
                })
            }
        },'-',{
            text:'edit',
            iconCls:'icon-edit',
            handler : function() {
                var selectedSuppliers = $("#dg").datagrid('getSelections');
                if(selectedSuppliers.length != 1){
                    $.messager.alert('warning','please select single row','warning');

                }else {
                    <%--$("#updateDg").dialog({--%>
                        <%--title:'updateSupplier',--%>
                        <%--width:400,--%>
                        <%--height:300,--%>
                        <%--href:'${pageContext.request.contextPath}/base/pageTransitionByURL/supplier/updateSupplier.action'--%>
                    <%--})--%>
                    window.open ( "${pageContext.request.contextPath}/base/pageTransitionByURL/supplier/updateSupplier.action" , "_blank" ,
                        "height=300,width=500,scrollbars=no,location=no" )

                }
            }
        },'-',{
            text:'remove',
            iconCls:'icon-remove',
            handler : function() {
                var selectedSuppliers = $("#dg").datagrid('getSelections');
                if(selectedSuppliers.length > 0) {
                    var pks = new Array();
                    for(var i=0; i <selectedSuppliers.length;i++ ){
                        pks[i] = selectedSuppliers[i].id;
                    }
                    parent.$.messager.confirm('Confirm', 'Are you sure to delete these suppliers ?', function(r){
                        if (r){
                            $.ajax({
                                url:"${pageContext.request.contextPath}/supplier/deleteById.action",
                                type:"POST",
//                                传数组且为多个参数的时候（类似["1","2"]），用传统方式，否则会被深度序列化
                                traditional:true,
                                data:{"pks":pks},
                                success:function () {
                                    $.messager.alert('success','success','info');
                                    $("#dg").datagrid("reload");
                                    $("#dg").datagrid("clearSelections");
                                },
                                error:function () {
                                    $.messager.alert('error','please contact the admin！','error');
                                },
                                dataType:'json'
                            })
                        }
                    });



                }
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
                var keywords = $("#ss").val();
                if(keywords != undefined){
                    $("#dg").datagrid("load",{
                        name: keywords
                    })
                }
            }
        }
    ]




function getSelected() {
    return $("#dg").datagrid('getSelections');
}
</script>
</body>
</html>
