<%--
  Created by IntelliJ IDEA.
  User: qy
  Date: 2018/5/4
  Time: 9:22
  To change this template use File | Settings | File Templates.
--%>
<%@include file="/common/common.jspf"%>
<html>
<head>
    <title>goodsList</title>
    <style type="text/css">
        .searchbox{
            margin:-3
        }
    </style>

    <script type="text/javascript">
        $(function(){

            $("#dg").datagrid({

                //支持多条件查询
                url:'${pageContext.request.contextPath}/goods/pagination.action',
                pagination:true,
                pageSize:2,
                pageList:[2,5,10,20],
                singleSelect:true,
                queryParams: {
                    goodsName: '%%'
                },
                toolbar: [{
                    iconCls: 'icon-add',
                    text:'add',
                    handler: function() {

                        var selectedGoods = $("#dg").datagrid("getChecked");

                        if(selectedGoods.length != null ) {

                            window.opener.$('#shoppingCart').datagrid('appendRow', {
                                goodsId: selectedGoods[0].goodsId,
                                goodsName: selectedGoods[0].goodsName,
                                goodsUnit: selectedGoods[0].goodsUnit,
                                goodsType: selectedGoods[0].goodsType,
                                goodsColor: selectedGoods[0].goodsColor,
                                bodAmount: $("#bodAmount").val(),
                                bodBuyPrice: $("#bodBuyPrice").val(),
                                bodTotalPrice: $("#bodBuyPrice").val() * $("#bodAmount").val(),
                                bodImeiList: $("#bodImeiList").val()
                            });

//                            $("#dg").datagrid("close");

                        }else {
                            $.messager.alert("info","please select one good","error");
                        }

                    }
                },'-',{
                    iconCls: 'icon-remove',
                    text:'remove',
                    handler: function(){
                        var selectedGoods = $("#dg").datagrid("getChecked");
                        alert(selectedGoods[0].goodsName);
                        alert(selectedGoods[0].goodsUnit);
                        /* 	var array = $('#dg').datagrid("getSelections");
                            if(array.length>0){
                                alert("选中");


                                //定义数组，通过下边的用来存储选中记录的Id
                            var ids = new Array();
                            for (i = 0; i < array.length; i++) {
                                ids[i] = array[i].supId;
                                alert(ids[i]);
                            }
                            //alert("ids" + ids);
                            //如果需要锁整个页面，前面加parent.
                            parent.$.messager.confirm('删除对话框', '您确认要删除吗？', function(r) {
                                if (r) {
                                    alert(r);
                                    $.ajax({

								  type:"POST",
								  //设置为传统方式传送参数
								  traditional:true,
								  data:{pks:ids},
								  success: function(html){
									  if(html>0){
									  	alert("恭喜您 ，删除成功，共删除了"+html+"条记录");
									  }else{
									  	alert("对不超 ，删除失败");
									  }
								  //重新刷新页面
								    $("#dg").datagrid("reload");
								    //请除所有勾选的行
								    $("#dg").datagrid("clearSelections");
								  },
								  error: function (XMLHttpRequest, textStatus, errorThrown) {
									    $.messager.alert('删除错误','请联系管理员！','error');
									},
								  dataType:'json'
								});


							}
						});










						}else{
							alert("请选择需要删除的记录！");
						}

						 */
                    }
                },'-',{
                    text:"goodsName：<input type='text' id='goodsName' name='goodsName'/>",
                }],


                columns : [[{
                    field:true,
                    checkbox:true
                }, {
                    field : 'goodsId',
                    title : 'goodsId'
                }, {
                    field : 'goodsName',
                    title : 'goodsName'
                }, {
                    field : 'goodsUnit',
                    title : 'goodsUnit'
                }, {
                    field : 'goodsType',
                    title : 'goodsType'
                }, {
                    field : 'goodsColor',
                    title : 'goodsColor'
                }]]
            });

            $('#goodsName').searchbox({
                searcher:function(value,name){

                    $('#dg').datagrid('load',{
                        goodsName:'%'+value+'%'
                    });
                },
                prompt:''
            });

            /* 通过关键字查询
                $('#ss').searchbox({
                    searcher:function(value,name){
                        alert(value + "," + name);
                        $('#dg').datagrid('load',{
                            keyWord: '%'+value+'%'
                        });
                    },
                    prompt:'请输入供应商名称'
                }); */

        });
    </script>
</head>

<body>

<table id="dg"></table>
<form  style="padding:5px;margin:0px;background:#eee;"  action="">
    bodAmount：<input type="text" id='bodAmount' name='bodAmount' class="easyui-numberbox" value="1" data-options="min:1,max:1000000000">
    bodBuyPrice：<input type="text" id='bodBuyPrice' name='bodBuyPrice' class="easyui-numberbox"  value="22" data-options="min:0,precision:2">
    bodImeiList：<textarea  id='bodImeiList' name='bodImeiList'>3333</textarea>

</form>
</body>
</html>