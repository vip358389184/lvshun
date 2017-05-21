
//姓名长度
    function username_message() {
        var username = $("#username").val();
        if (username.length < 2 || username.length > 6) {
            $("#username_message").html("收件人名长度只能在2~6个字符");
            $("#username_img").css("display", "block");
        } else {
            $("#username_message").html("");
            $("#username_img").css("display", "none");
        }
    }

//判断姓名是否包含数字
    function BASEisNotNum(theNum) {
        for (var i = 0; i < theNum.length; i++) {
            oneNum = theNum.substring(i, i + 1);
            if (/\d/g.test(oneNum)) {
                return true;
            }
        }
        return false;
    }

//姓名是否包含数字或为空
    function username_num_message() {
        var username = $("#username").val();
        var number = BASEisNotNum(username);
        if (number == true) {
            $("#username_message").html("收件人名不能是纯数字");
            $("#username_img").css("display", "block");
        } else if (username == "" || username == null) {
            $("#username_message").html("收件人名不能为空");
            $("#username_img").css("display", "block");
        } else {
            $("#username_message").html("");
            $("#username_img").css("display", "none");
        }
    }


//手机号码长度
    function phone_message() {
        var phone = $("#phone").val();
        if (phone.length != 11) {
            $("#phone_message").html("手机号码长度只能为11位");
            $("#phone_img").css("display", "block");
        } else {
            $("#phone_message").html("");
            $("#phone_img").css("display", "none");
        }
    }

//手机号码是否是非数字
    function phone_num_message() {
        var phone = $("#phone").val();
        if (isNaN(phone)) {
            $("#phone_message").html("手机号码只能是纯数字");
            $("#phone_img").css("display", "block");
        } else if (phone == "") {
            $("#phone_message").html("手机号码不能为空");
            $("#phone_img").css("display", "block");
        } else {
            $("#phone_message").html("");
            $("#phone_img").css("display", "none");
        }
    }


//邮政编码长度
    function dawk_message() {
        var dawk = $("#dawk").val();
        if (dawk.length != 6) {
            $("#dawk_message").html("邮政编码长度只能为6位");
            $("#dawk_img").css("display", "block");
        } else {
            $("#dawk_message").html("");
            $("#dawk_img").css("display", "none");
        }
    }

//判断邮政编码是否为纯数字
    function dawk_num_message() {
        var dawk = $("#dawk").val();
        if (isNaN(dawk)) {
            $("#dawk_message").html("邮政编码只能是纯数字");
            $("#dawk_img").css("display", "block");
        } else if (dawk == "") {
            $("#dawk_message").html("邮政编码不能为空");
            $("#dawk_img").css("display", "block");
        } else {
            $("#dawk_message").html("");
            $("#dawk_img").css("display", "none");
        }
    }

//所在地区不能为空
    function prefecture_num_message() {
        var prefecture = $("#prefecture").val();
        if (prefecture == "") {
            $("#prefecture_message").html("所在地区不能为空");
            $("#prefecture_img").css("display", "block");
        } else {
            $("#prefecture_message").html("");
            $("#prefecture_img").css("display", "none");
        }
    }

//所在地区不能为空
    function prefecture_message() {
        var prefecture = $("#prefecture").val();
        if (prefecture.length == 0) {
            $("#prefecture_message").html("所在地区不能为空");
            $("#prefecture_img").css("display", "block");
        } else {
            $("#prefecture_message").html("");
            $("#prefecture_img").css("display", "none");
        }
    }

//详细地址不能为空
    function address_num_message() {
        var address = $("#address").val();
        if (address == "") {
            $("#address_message").html("详细地址不能为空");
            $("#address_img").css("display", "block");
        } else {
            $("#address_message").html("");
            $("#address_img").css("display", "none");
        }
    }

//详细地址不能为空
    function address_message() {
        var address = $("#address").val();
        if (address.length == 0) {
            $("#address_message").html("详细地址不能为空");
            $("#address_img").css("display", "block");
        } else {
            $("#address_message").html("");
            $("#address_img").css("display", "none");
        }
    }

function add(disabled) {
    var username = $("#username").val();
    var phone = $("#phone").val();
    var dawk = $("#dawk").val();
    var prefecture = $("#prefecture").val();
    var address = $("#address").val();
    if (username == "" || username == null) {
        $("#username_message").html("收件人名不能为空");
        $("#username_img").css("display", "block");
        disabled.username.focus();
        return false;
    } else if (phone == "" || phone == null) {
        $("#phone_message").html("手机号码不能为空");
        $("#phone_img").css("display", "block");
    } else if (prefecture == "" || dawk == null) {
        $("#dawk_message").html("邮政编码不能为空");
        $("#dawk_img").css("display", "block");
    } else if (prefecture == "" || prefecture == null) {
        $("#prefecture_message").html("所在地区不能为空");
        $("#prefecture_img").css("display", "block");
    } else if (address == "" || address) {
        $("#address_message").html("详细地址不能为空");
        $("#address_img").css("display", "block");
    }



}

