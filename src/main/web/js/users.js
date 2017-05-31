
$(function() {

	//注册处理
	var username= $("#username"),
        phone= $("#phone"),
 		smscode= $("#smscode"),
 		password= $("#password"),
 		repassword= $("#repassword"),
 		agree = $("#agree");

 	username.change(function() {
 		checkUserName(false);
 	});
    phone.change(function() {
        checkphone(false);
 	});
 	password.change(function(){
 		checkPwd(false);
 	});
 	repassword.change(function(){
 		checkRePwd(false);
 	});
 	agree.click(function(){
 		checkAgree();
 	});

 	//验证用户名
 	function checkUserName(issubmit) {
 		var isValid = false;
 		var v=$.trim(username.val());
 		var i= username.siblings(".Validform_checktip").children();
 		if (v=='') {
 			if (issubmit) {
 				i.attr('class',"i-err").children("label").text('请输入用户名');
 			} else{
 				i.attr('class',"i-tip").children("label").text('支持中文、字母、数字、“-”“_”的组合');
 			}
 		}
 		else if (getStringLength(v) < 4) {
 			i.attr('class',"i-err").children("label").text('长度只能在4-20个字符之间');
 		}
 		else if (/^[0-9]+$/.test(v)) {
 			i.attr('class',"i-err").children("label").text('用户名不能是纯数字，请重新输入！');
 		}
 		else if (!/^[A-Za-z0-9_\-\u4e00-\u9fa5]+$/.test(v)) {
 			i.attr('class',"i-err").children("label").text('请使用中文、字母、数字、“-”“_”的组合');
 		}
 		else
 		{
 			i.attr('class',"i-suc").children("label").text('');
 			isValid = true;
 		}
 		return isValid;
 	}

	function is_phone(phone){
		var pattern = /^1[34578]\d{9}$/;
    return pattern.test(phone);
  }

 	//验证手机
 	function checkphone(issubmit) {
 		var isValid = false;
 		var v= $.trim(phone.val());
 		var i= phone.siblings(".Validform_checktip").children();
 		if (v=='') {
 			if (issubmit) {
 				i.attr('class',"i-err").children("label").text('请输入手机号码');
 			} else{
 				i.attr('class',"").children("label").text('');
 			}
 		}
 		else if(!is_phone(v))
 		{
 			i.attr('class',"i-err").children("label").text('手机号码格式不正确');
 		}
 		else
 		{
 			i.attr('class',"i-suc").children("label").text('');
 			isValid =true;
 		}
 		return isValid;
 	}

 	//验证密码
 	function checkPwd(issubmit) {
 		var isValid = false;
 		var v=$.trim(password.val()),u=$.trim(username.val());
 		var i= password.siblings(".Validform_checktip").children();
 		if (v=='') {
 			if (issubmit) {
 				i.attr('class',"i-err").children("label").text('请输入密码');
 			} else{
 				i.attr('class',"i-tip").children("label").text('支持中文、字母、数字、“-”“_”的组合');
 			}
 		}
 		else if (getStringLength(v) < 6) {
 			i.attr('class',"i-err").children("label").text('长度只能在6-20个字符之间');
 		}
 		else if (v==u) {
 			i.attr('class',"i-err").children("label").text('密码与用户名相似，有被盗风险，请更换密码');
 		}
 		else
	 	{
	 		if($.trim(repassword.val())!='' && v !=$.trim(repassword.val()))
	 		{
	 			repassword.siblings(".Validform_checktip").children().attr('class',"i-err").children("label").text('两次密码输入不一致');
	 		}
 			i.attr('class',"i-suc").children("label").text('');
 			isValid = true;
 		}
 		return isValid;
 	}

 	//验证密码
 	function checkRePwd(issubmit) {
 		var isValid = false;
 		var v=$.trim(repassword.val()),u=$.trim(password.val());
 		var i= repassword.siblings(".Validform_checktip").children();
 		if (v=='') {
 			if (issubmit) {
 				i.attr('class',"i-err").children("label").text('请输入密码');
 			} else{
 				i.attr('class',"").children("label").text('');
 			}
 		}
 		else if(v!=u)
 		{
 			i.attr('class',"i-err").children("label").text('两次密码输入不一致');
 		}
 		else
 		{
 			i.attr('class',"i-suc").children("label").text('');
 			isValid = true;
 		}
 		return isValid;
 	}


/*
 	//用户注册
 	$("#reg").click(function() {
 		if (!checkUserName(true) || !checkPhone(true) || !checkSmscode() || !checkPwd(true) || !checkRePwd(true) || !checkAgree()) {
 			return;
 		}
 		var isOauth = $("#isOauth").length; //是否绑定第三方

 		$.ajax({
			type: "post",
			url: "/user/addUser,",
			data: {
				act:'reg',
				username:$.trim(username.val()),
				password: $.trim(password.val()),
				repassword: $.trim(repassword.val()),
			},
			dataType: "json",
			success: function(data) {
				if (data.err != '') {
					msg(data.err);
				}
				else{
					msg("注册成功，欢迎您的加入！");
					setTimeout(function() {
                        window.location="login.html"
						/!*window.location.href= return_url ? return_url :'/';*!/
					},3000);
				}
			},
			error:function(data,t){
				msg('注册失败，请您稍后再试');
			} ,
			complete: function(XMLHttpRequest, textStatus){}
		});
 	});
 	*/

 	//登陆处理
 	$("#loginname").change(function() {
 		checkLoginname(false);
 	});

 	function checkLoginname(issubmit) {
 		var isValid=true;
 		var v = $.trim($("#loginname").val());
 		var i = $("#loginname").siblings(".Validform_checktip");
		if (v=='') {
			i.children().attr('class',"i-err").children("label").text('请填写账户名');
			isValid = false;
		}
		else if (getStringLength(v) < 4) {
 			i.children().attr('class',"i-err").children("label").text('账户名不正确');
 			isValid = false;
 		}
		else
		{
			i.children().attr('class',"").children("label").text('');
		}

		return isValid;
 	}

 	function checkLoginPwd(issubmit) {
 		var isValid=true;
 		var v = $.trim($("#passw").val());
 		var i = $("#passw").siblings(".Validform_checktip");
		if (v=='') {
			i.children().attr('class',"i-err").children("label").text('请填写密码');
			isValid = false;
		}
		else if (getStringLength(v) < 6) {
 			i.children().attr('class',"i-err").children("label").text('密码不正确');
 			isValid = false;
 		}
		else
		{
			i.children().attr('class',"").children("label").text('');
		}

		return isValid;
 	}
 	
 	
 /*	//用户登陆
	$("#login").click(function() {		
		var login_name=$.trim($("#loginname").val()),
			passw=$.trim($("#passw").val()),
			authcode=''
			isOauth = $("#isOauth").length; //是否绑定第三方
 
		if (!checkLoginname(true) || !checkLoginPwd(true)) {
			return;
		}

		if ($('.yanm-div').css("display")!='none') {
			authcode = $.trim($("#authcode").val());
		}
		//msg(return_url);return;
 
 		$.ajax({
			type: "post",
			url: "user_api.html?return_url="+(typeof(return_url) != "undefined"?return_url:""),
			data: {
				act: 'login',
				username:login_name,
				password: passw,
				authcode:authcode,
				autologin: $.trim($("#autologin:checked").val()),
				isOauth: isOauth
			},
			dataType: "json",
			success: function(data) {
				if (data.err != '') {
					msg(data.err,10000);
					if(data.data.authcode!=undefined) {
						$(".yanm-div").show();
					}
				}
				else{
					window.location.href= return_url ? return_url :'/';
				}
			},
			error:function(data,t){
				msg('登陆失败，请您稍后再试');
			} ,
			complete: function(XMLHttpRequest, textStatus){}
		});
 	});
 	
   loadLayer();*/
})
