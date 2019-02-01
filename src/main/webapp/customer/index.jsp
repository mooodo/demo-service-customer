<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户信息</title>
<script type="text/javascript" src="/easyui/jquery.min.js"></script>
<script type="text/javascript" src="/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="/easyui/locale/easyui-lang-zh_CN.js"></script>
<link rel="stylesheet" type="text/css" href="/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="/easyui/themes/icon.css">
<script type="text/javascript" src="index.js"></script>
</head>

<body>
	<div id="buttons" style="padding-left:7px; color:#333">
		<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newUser()">New User</a>
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editUser()">Edit User</a>
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyUser()">Remove User</a>
		<a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-search',plain:true" onclick="refresh()">Refresh</a>
	</div>
	<div class="easyui-panel" data-options="border:false">
	 	<table id="datagrid" class="easyui-datagrid" style="width:90%;height:auto" 
	 		data-options="url:'/customer/easyui/query/customerQuery',iconCls: 'icon-edit'"
	 		toolbar="#buttons" idField="id" rownumbers="true" fitColumns="true" 
	 		singleSelect="true" pagination="true">
	 	<thead>
	        <tr>
	            <th field="id" width=100 editor="{type:'textbox',options:{required:true}}">客户编号</th>
	            <th data-options="field:'name',width:100" editor="{type:'textbox',options:{required:true}}">姓名</th>
	            <th data-options="field:'sex',width:100" editor="{type:'textbox',options:{required:true}}">性别</th>
	            <th data-options="field:'birthday',width:200,formatter:dateFormatRow" editor="{type:'datebox',options:{formatter:dateformatter,parser:dateparser}}">出生日期</th>
	            <th data-options="field:'identification',width:300" editor="{type:'textbox',options:{required:true}}">身份证</th>
	            <th data-options="field:'phoneNumber',width:200" editor="text">电话号码</th>
	        </tr>
	    </thead>
	 	</table>
	</div>
    <div id="dlg" class="easyui-dialog" style="width:400px" data-options="closed:true,modal:true,border:'thin',buttons:'#dlg-buttons'">
        <form id="fm" method="post" style="margin:0;padding:20px 50px" novalidate="true">
            <h3>User Information</h3>
            <div style="margin-bottom:10px">
                <input name="id" class="easyui-textbox" required="true" label="客户编号:" style="width:100%">
            </div>
            <div style="margin-bottom:10px">
                <input name="name" class="easyui-textbox" required="true" label="姓名:" style="width:100%">
            </div>
            <div style="margin-bottom:10px">
                <input name="sex" class="easyui-textbox" label="性别:" style="width:100%">
            </div>
            <div style="margin-bottom:10px">
                <input name="birthday" class="easyui-datebox" data-options="formatter:dateformatter,parser:dateparser" label="出生日期:" style="width:100%">
            </div>
            <div style="margin-bottom:10px">
                <input name="identification" class="easyui-textbox" label="身份证:" style="width:100%">
            </div>
            <div style="margin-bottom:10px">
                <input name="phoneNumber" class="easyui-textbox" label="电话号码:" style="width:100%">
            </div>
        </form>
    </div>
    <div id="dlg-buttons">
        <a href="javascript:void(0)" class="easyui-linkbutton c6" iconCls="icon-ok" onclick="saveUser()" style="width:90px">Save</a>
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')" style="width:90px">Cancel</a>
    </div>
</body>
</html>