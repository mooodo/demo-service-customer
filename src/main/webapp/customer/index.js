function newUser(){
    $('#dlg').dialog('open').dialog('center').dialog('setTitle','New User');
    $('#fm').form('clear');
}
function editUser(){
    var row = $('#datagrid').datagrid('getSelected');
    if (row){
        $('#dlg').dialog('open').dialog('center').dialog('setTitle','Edit User');
        $('#fm').form('load',row);
    }
}
function saveUser(){
    $('#fm').form('submit',{
        url: '/customer/execute/customerService/save',
        onSubmit: function(param){
            
        },
        success: function(){
        	$.messager.show({
                title: 'Info',
                msg: '保存成功'
            });
        	$('#dlg').dialog('close');        // close the dialog
            $('#datagrid').datagrid('reload');    // reload the user data
        }
    });
}
function destroyUser(){
    var row = $('#datagrid').datagrid('getSelected');
    if (row){
        $.messager.confirm('Confirm','Are you sure to destroy this user['+row.id+']?',function(r){
            if (r){
                $.post('/customer/execute/customerService/delete',{arg0:row.id},function(){
                    refresh();
                },'json');
            }
        });
    }
}
function refresh(){
	$('#datagrid').datagrid('reload');
}

//******Date Convert*************
function dateFormatRow(val,row){
	return dateformatter(val);
}
function dateformatter(val){
	var date = new Date(val);
	return $.fn.datebox.defaults.formatter(date);
}
function dateparser(s){
	if (!s) return new Date();
	var date = new Date(s);
	var s1 = $.fn.datebox.defaults.formatter(date);
	var ss = (s1.split('-'));
	var y = parseInt(ss[0],10);
	var m = parseInt(ss[1],10);
	var d = parseInt(ss[2],10);
	if (!isNaN(y) && !isNaN(m) && !isNaN(d)){
		return new Date(y,m-1,d);
	} else {
		return new Date();
	}
}
//********************************
