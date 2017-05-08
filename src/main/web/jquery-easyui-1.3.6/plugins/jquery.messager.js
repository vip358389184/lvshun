/**
 * jQuery EasyUI 1.3.6
 * 
 * Copyright (c) 2009-2014 www.jeasyui.com. All rights reserved.
 *
 * Licensed under the GPL license: http://www.gnu.org/licenses/gpl.txt
 * To use it on other terms please contact us at info@jeasyui.com
 *
 */

(function($){function _1(a,b,c,d){var e=$(a).window("window");if(!e)return;switch(b){case null:e.show();break;case"slide":e.slideDown(c);break;case"fade":e.fadeIn(c);break;case"show":e.show(c)}var f=null;d>0&&(f=setTimeout(function(){_7(a,b,c)},d)),e.hover(function(){f&&clearTimeout(f)},function(){d>0&&(f=setTimeout(function(){_7(a,b,c)},d))})}function _7(a,b,c){if(a.locked==1)return;a.locked=!0;var d=$(a).window("window");if(!d)return;switch(b){case null:d.hide();break;case"slide":d.slideUp(c);break;case"fade":d.fadeOut(c);break;case"show":d.hide(c)}setTimeout(function(){$(a).window("destroy")},c)}function _b(a){var b=$.extend({},$.fn.window.defaults,{collapsible:!1,minimizable:!1,maximizable:!1,shadow:!1,draggable:!1,resizable:!1,closed:!0,style:{left:"",top:"",right:0,zIndex:$.fn.window.defaults.zIndex++,bottom:-document.body.scrollTop-document.documentElement.scrollTop},onBeforeOpen:function(){return _1(this,b.showType,b.showSpeed,b.timeout),!1},onBeforeClose:function(){return _7(this,b.showType,b.showSpeed),!1}},{title:"",width:250,height:100,showType:"slide",showSpeed:600,msg:"",timeout:4e3},a);b.style.zIndex=$.fn.window.defaults.zIndex++;var c=$('<div class="messager-body"></div>').html(b.msg).appendTo("body");return c.window(b),c.window("window").css(b.style),c.window("open"),c}function _f(_10,_11,_12){var win=$('<div class="messager-body"></div>').appendTo("body");win.append(_11);if(_12){var tb=$('<div class="messager-button"></div>').appendTo(win);for(var _13 in _12)$("<a></a>").attr("href","javascript:void(0)").text(_13).css("margin-left",10).bind("click",eval(_12[_13])).appendTo(tb).linkbutton()}return win.window({title:_10,noheader:_10?!1:!0,width:300,height:"auto",modal:!0,collapsible:!1,minimizable:!1,maximizable:!1,resizable:!1,onClose:function(){setTimeout(function(){win.window("destroy")},100)}}),win.window("window").addClass("messager-window"),win.children("div.messager-button").children("a:first").focus(),win}$.messager={show:function(a){return _b(a)},alert:function(a,b,c,d){var e="<div>"+b+"</div>";switch(c){case"error":e='<div class="messager-icon messager-error"></div>'+e;break;case"info":e='<div class="messager-icon messager-info"></div>'+e;break;case"question":e='<div class="messager-icon messager-question"></div>'+e;break;case"warning":e='<div class="messager-icon messager-warning"></div>'+e}e+='<div style="clear:both;"/>';var f={};f[$.messager.defaults.ok]=function(){g.window("close");if(d)return d(),!1};var g=_f(a,e,f);return g},confirm:function(a,b,c){var d='<div class="messager-icon messager-question"></div><div>'+b+"</div>"+'<div style="clear:both;"/>',e={};e[$.messager.defaults.ok]=function(){f.window("close");if(c)return c(!0),!1},e[$.messager.defaults.cancel]=function(){f.window("close");if(c)return c(!1),!1};var f=_f(a,d,e);return f},prompt:function(a,b,c){var d='<div class="messager-icon messager-question"></div><div>'+b+"</div>"+"<br/>"+'<div style="clear:both;"/>'+'<div><input class="messager-input" type="text"/></div>',e={};e[$.messager.defaults.ok]=function(){f.window("close");if(c)return c($(".messager-input",f).val()),!1},e[$.messager.defaults.cancel]=function(){f.window("close");if(c)return c(),!1};var f=_f(a,d,e);return f.children("input.messager-input").focus(),f},progress:function(a){var b={bar:function(){return $("body>div.messager-window").find("div.messager-p-bar")},close:function(){var a=$("body>div.messager-window>div.messager-body:has(div.messager-progress)");a.length&&a.window("close")}};if(typeof a=="string"){var c=b[a];return c()}var d=$.extend({title:"",msg:"",text:undefined,interval:300},a||{}),e='<div class="messager-progress"><div class="messager-p-msg"></div><div class="messager-p-bar"></div></div>',f=_f(d.title,e,null);f.find("div.messager-p-msg").html(d.msg);var g=f.find("div.messager-p-bar");return g.progressbar({text:d.text}),f.window({closable:!1,onClose:function(){this.timer&&clearInterval(this.timer),$(this).window("destroy")}}),d.interval&&(f[0].timer=setInterval(function(){var a=g.progressbar("getValue");a+=10,a>100&&(a=0),g.progressbar("setValue",a)},d.interval)),f}},$.messager.defaults={ok:"Ok",cancel:"Cancel"}})(jQuery)