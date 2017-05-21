function openwin(c_name){
    var ct = "From.jsp?c_name="+c_name;
    var modelWidth = 690;
    var modelHeight = 400;
    OpenLook(ct,modelWidth,modelHeight);
}


//打开窗体方法
function OpenLook(FormUrl,modelWidth,modelHeight){
    var url ="";
    if(FormUrl.indexOf("http://")==-1)
        url = FormUrl;
    else
        url=FormUrl;
    window.open(url,"newwindow", "height="+modelHeight+", width="+modelWidth+", top="+ ((screen.height-modelHeight))/2 +", left="+ ((screen.width-modelWidth)/2) +", toolbar=no, menubar=no, scrollbars=no, resizable=no, location=no, status=no");
}

