<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
    application.setAttribute("basePath", basePath);
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <script src="easyui/jquery.min.js"></script>
    <script src="easyui/jquery.easyui.min.js"></script>
    <script src="easyui/locale/easyui-lang-zh_CN.js"></script>
    <script src="easyui/util-js.js"></script>


    <script src="zTree/js/jquery.ztree.all.min.js"></script>
    <link href="easyui/themes/bootstrap/easyui.css" rel="stylesheet">
    <link href="easyui/themes/icon.css" rel="stylesheet">
    <link href="zTree/css/zTreeStyle/zTreeStyle.css" rel="stylesheet">
    <!-- 引入EasyUI的样式文件-->
    <%-- <link rel="stylesheet" href="<%=basePath %>/easyui/themes/default/easyui.css" type="text/css"/> --%>
    <!-- 引入EasyUI的图标样式文件-->
    <link rel="stylesheet"href="<%=basePath %>/easyui/themes/icon.css" type="text/css"/>
    <link rel="stylesheet" type="text/css" href="js/3Djs/css/normalize.css" />
    <link rel="stylesheet" type="text/css" href="js/3Djs/css/htmleaf-demo.css">
    <link rel="stylesheet" href="js/3Djs/css/style.css">
</head>
<body class="easyui-layout">
<div region="north" style="height: 78px;background-color: #E0ECFF">
    <table style="padding: 5px;" width="100%">
        <tr>
            <td width="50%">
            </td>
            <td valign="bottom" align="right" width="50%">
                欢迎！！
            </td>
        </tr>
    </table>
</div>
<div region="center" >
    <div class="easyui-tabs" fit="true" border="false" id="tabs">
        <div title="首页" data-options="iconCls:'icon-home'">
            <div align="center" style="padding-top: 100px;"><font color="red" size="10">欢迎使用</font></div>
        </div>
    </div>
</div>
<div region="west" style="width: 200px;" title="导航菜单" split="true">
    <div class="easyui-accordion" data-options="fit:true,border:false">
        <div title="系统管理"  data-options="iconCls:'icon-system'" style="padding:10px">
            <div id="menuTree" class="ztree"></div>

            <%--<a href="javascript:openPasswordModifyDialog()" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-modifyPassword'" style="width: 150px;">修改密码</a>--%>
            <%--<a href="javascript:logout()" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-exit'" style="width: 150px;">安全退出</a>--%>
        </div>
    </div>
</div>
<div region="south" style="height: 26px;padding: 5px" align="center">
    Copyright @ 2012-2016 Java知识分享网 版权所有
</div>
<script>
    var url;

    function openTab(text,url,iconCls){
        if($("#tabs").tabs("exists",text)){
            $("#tabs").tabs("select",text);
        }else{
            var content="<iframe frameborder=0 scrolling='auto' style='width:100%;height:100%' src='${pageContext.request.contextPath}/page/"+url+"'></iframe>";
            $("#tabs").tabs("add",{
                title:text,
                iconCls:iconCls,
                closable:true,
                content:content
            });
        }
    }

    $(function() {
        alert("22");
        load_menu_tree_data();

    });

    var setting = {
        data: {
            simpleData: {
                enable: true,
                idKey: "id",
                pIdKey: "pid",
                rootPId: 0
            },
        },
        callback: {
            onClick: function(event, treeId, treeNode) {
                if (null != treeNode.addPage && "" != treeNode.addPage) {
                    $("#tabs").tabs("add", {
                        title:treeNode.name,
                        closable:true,
                        href:treeNode.addPage
                    });
                }
            },
            beforeRemove: function(treeId, treeNode){
                var idss=treeNode.id;
                $.messager.confirm('删除', '确定要删除节点1 -- " + treeNode.name + " 吗？',  function(row){if (row){
                    $.ajax({
                        url:"tree/deletetree.action",
                        type:"post",
                        //								dataType:"json",
                        async: false,
                        data:{idss:idss},
                        success:function(data){
                            $.messager.alert("提示信息","删除成功！","info");
                        }
                    })

                }})



            },
        }
    };


    var menuTreeObj;
    //加载菜单数据
    function load_menu_tree_data() {
        $.ajax({
            url:"user/getCurrenUserNodes.action",
            type:"post",
//            dataType:"json",
            data:{left:1},
            success:function(data) {
                alert("2233");
                menuTreeObj = $.fn.zTree.init($("#menuTree"), setting, data);

            },error:function(){
                alert("cuol");

            }
        });
    }



</script>
</body>