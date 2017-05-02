/**
 * jQuery EasyUI 1.3.6
 * 
 * Copyright (c) 2009-2014 www.jeasyui.com. All rights reserved.
 *
 * Licensed under the GPL license: http://www.gnu.org/licenses/gpl.txt
 * To use it on other terms please contact us at info@jeasyui.com
 *
 */

(function($){function _1(a){function d(b){var c=[];return b.addClass("menu"),c.push(b),b.hasClass("menu-content")||b.children("div").each(function(){var b=$(this).children("div");if(b.length){b.insertAfter(a),this.submenu=b;var e=d(b);c=c.concat(e)}}),c}function e(b){var c=$.parser.parseOptions(b[0],["width","height"]);b[0].originalHeight=c.height||0,b.hasClass("menu-content")?b[0].originalWidth=c.width||b._outerWidth():(b[0].originalWidth=c.width||0,b.children("div").each(function(){var b=$(this),c=$.extend({},$.parser.parseOptions(this,["name","iconCls","href",{separator:"boolean"}]),{disabled:b.attr("disabled")?!0:undefined});c.separator&&b.addClass("menu-sep");if(!b.hasClass("menu-sep")){b[0].itemName=c.name||"",b[0].itemHref=c.href||"";var d=b.addClass("menu-item").html();b.empty().append($('<div class="menu-text"></div>').html(d)),c.iconCls&&$('<div class="menu-icon"></div>').addClass(c.iconCls).appendTo(b),c.disabled&&_d(a,b[0],!0),b[0].submenu&&$('<div class="menu-rightarrow"></div>').appendTo(b),_e(a,b)}}),$('<div class="menu-line"></div>').prependTo(b)),_f(a,b),b.hide(),_10(a,b)}$(a).appendTo("body"),$(a).addClass("menu-top"),$(document).unbind(".menu").bind("mousedown.menu",function(a){var b=$(a.target).closest("div.menu,div.combo-p");if(b.length)return;$("body>div.menu-top:visible").menu("hide")});var b=d($(a));for(var c=0;c<b.length;c++)e(b[c])}function _f(a,b){var c=$.data(a,"menu").options,d=b.attr("style")||"";b.css({display:"block",left:-1e4,height:"auto",overflow:"hidden"});var e=b[0],f=e.originalWidth||0;f||(f=0,b.find("div.menu-text").each(function(){f<$(this)._outerWidth()&&(f=$(this)._outerWidth()),$(this).closest("div.menu-item")._outerHeight($(this)._outerHeight()+2)}),f+=40),f=Math.max(f,c.minWidth);var g=e.originalHeight||b.outerHeight(),h=Math.max(e.originalHeight,b.outerHeight())-2;b._outerWidth(f)._outerHeight(g),b.children("div.menu-line")._outerHeight(h),d+=";width:"+e.style.width+";height:"+e.style.height,b.attr("style",d)}function _10(a,b){var c=$.data(a,"menu");b.unbind(".menu").bind("mouseenter.menu",function(){c.timer&&(clearTimeout(c.timer),c.timer=null)}).bind("mouseleave.menu",function(){c.options.hideOnUnhover&&(c.timer=setTimeout(function(){_1b(a)},100))})}function _e(a,b){if(!b.hasClass("menu-item"))return;b.unbind(".menu"),b.bind("click.menu",function(){if($(this).hasClass("menu-item-disabled"))return;if(!this.submenu){_1b(a);var b=$(this).attr("href");b&&(location.href=b)}var c=$(a).menu("getItem",this);$.data(a,"menu").options.onClick.call(a,c)}).bind("mouseenter.menu",function(c){b.siblings().each(function(){this.submenu&&_22(this.submenu),$(this).removeClass("menu-active")}),b.addClass("menu-active");if($(this).hasClass("menu-item-disabled")){b.addClass("menu-active-disabled");return}var d=b[0].submenu;d&&$(a).menu("show",{menu:d,parent:b})}).bind("mouseleave.menu",function(a){b.removeClass("menu-active menu-active-disabled");var c=b[0].submenu;c?a.pageX>=parseInt(c.css("left"))?b.addClass("menu-active"):_22(c):b.removeClass("menu-active")})}function _1b(a){var b=$.data(a,"menu");return b&&$(a).is(":visible")&&(_22($(a)),b.options.onHide.call(a)),!1}function _25(a,b){var c,d;b=b||{};var e=$(b.menu||a);if(e.hasClass("menu-top")){var f=$.data(a,"menu").options;$.extend(f,b),c=f.left,d=f.top;if(f.alignTo){var g=$(f.alignTo);c=g.offset().left,d=g.offset().top+g._outerHeight(),f.align=="right"&&(c+=g.outerWidth()-e.outerWidth())}c+e.outerWidth()>$(window)._outerWidth()+$(document)._scrollLeft()&&(c=$(window)._outerWidth()+$(document).scrollLeft()-e.outerWidth()-5),c<0&&(c=0),d+e.outerHeight()>$(window)._outerHeight()+$(document).scrollTop()&&(d=$(window)._outerHeight()+$(document).scrollTop()-e.outerHeight()-5)}else{var h=b.parent;c=h.offset().left+h.outerWidth()-2,c+e.outerWidth()+5>$(window)._outerWidth()+$(document).scrollLeft()&&(c=h.offset().left-e.outerWidth()+2);var d=h.offset().top-3;d+e.outerHeight()>$(window)._outerHeight()+$(document).scrollTop()&&(d=$(window)._outerHeight()+$(document).scrollTop()-e.outerHeight()-5)}e.css({left:c,top:d}),e.show(0,function(){e[0].shadow||(e[0].shadow=$('<div class="menu-shadow"></div>').insertAfter(e)),e[0].shadow.css({display:"block",zIndex:$.fn.menu.defaults.zIndex++,left:e.css("left"),top:e.css("top"),width:e.outerWidth(),height:e.outerHeight()}),e.css("z-index",$.fn.menu.defaults.zIndex++),e.hasClass("menu-top")&&$.data(e[0],"menu").options.onShow.call(e[0])})}function _22(a){function b(a){a.stop(!0,!0),a[0].shadow&&a[0].shadow.hide(),a.hide()}if(!a)return;b(a),a.find("div.menu-item").each(function(){this.submenu&&_22(this.submenu),$(this).removeClass("menu-active")})}function _2e(a,b){function e(f){f.children("div.menu-item").each(function(){var f=$(a).menu("getItem",this),g=d.empty().html(f.text).text();b==$.trim(g)?c=f:this.submenu&&!c&&e(this.submenu)})}var c=null,d=$("<div></div>");return e($(a)),d.remove(),c}function _d(a,b,c){var d=$(b);if(!d.hasClass("menu-item"))return;c?(d.addClass("menu-item-disabled"),b.onclick&&(b.onclick1=b.onclick,b.onclick=null)):(d.removeClass("menu-item-disabled"),b.onclick1&&(b.onclick=b.onclick1,b.onclick1=null))}function _38(_39,_3a){var _3b=$(_39);if(_3a.parent){if(!_3a.parent.submenu){var _3c=$('<div class="menu"><div class="menu-line"></div></div>').appendTo("body");_3c.hide(),_3a.parent.submenu=_3c,$('<div class="menu-rightarrow"></div>').appendTo(_3a.parent)}_3b=_3a.parent.submenu}if(_3a.separator)var _3d=$('<div class="menu-sep"></div>').appendTo(_3b);else{var _3d=$('<div class="menu-item"></div>').appendTo(_3b);$('<div class="menu-text"></div>').html(_3a.text).appendTo(_3d)}_3a.iconCls&&$('<div class="menu-icon"></div>').addClass(_3a.iconCls).appendTo(_3d),_3a.id&&_3d.attr("id",_3a.id),_3a.name&&(_3d[0].itemName=_3a.name),_3a.href&&(_3d[0].itemHref=_3a.href),_3a.onclick&&(typeof _3a.onclick=="string"?_3d.attr("onclick",_3a.onclick):_3d[0].onclick=eval(_3a.onclick)),_3a.handler&&(_3d[0].onclick=eval(_3a.handler)),_3a.disabled&&_d(_39,_3d[0],!0),_e(_39,_3d),_10(_39,_3b),_f(_39,_3b)}function _3e(a,b){function c(a){if(a.submenu){a.submenu.children("div.menu-item").each(function(){c(this)});var b=a.submenu[0].shadow;b&&b.remove(),a.submenu.remove()}$(a).remove()}c(b)}function _43(a){$(a).children("div.menu-item").each(function(){_3e(a,this)}),a.shadow&&a.shadow.remove(),$(a).remove()}$.fn.menu=function(a,b){return typeof a=="string"?$.fn.menu.methods[a](this,b):(a=a||{},this.each(function(){var b=$.data(this,"menu");b?$.extend(b.options,a):(b=$.data(this,"menu",{options:$.extend({},$.fn.menu.defaults,$.fn.menu.parseOptions(this),a)}),_1(this)),$(this).css({left:b.options.left,top:b.options.top})}))},$.fn.menu.methods={options:function(a){return $.data(a[0],"menu").options},show:function(a,b){return a.each(function(){_25(this,b)})},hide:function(a){return a.each(function(){_1b(this)})},destroy:function(a){return a.each(function(){_43(this)})},setText:function(a,b){return a.each(function(){$(b.target).children("div.menu-text").html(b.text)})},setIcon:function(a,b){return a.each(function(){$(b.target).children("div.menu-icon").remove(),b.iconCls&&$('<div class="menu-icon"></div>').addClass(b.iconCls).appendTo(b.target)})},getItem:function(a,b){var c=$(b),d={target:b,id:c.attr("id"),text:$.trim(c.children("div.menu-text").html()),disabled:c.hasClass("menu-item-disabled"),name:b.itemName,href:b.itemHref,onclick:b.onclick},e=c.children("div.menu-icon");if(e.length){var f=[],g=e.attr("class").split(" ");for(var h=0;h<g.length;h++)g[h]!="menu-icon"&&f.push(g[h]);d.iconCls=f.join(" ")}return d},findItem:function(a,b){return _2e(a[0],b)},appendItem:function(a,b){return a.each(function(){_38(this,b)})},removeItem:function(a,b){return a.each(function(){_3e(this,b)})},enableItem:function(a,b){return a.each(function(){_d(this,b,!1)})},disableItem:function(a,b){return a.each(function(){_d(this,b,!0)})}},$.fn.menu.parseOptions=function(a){return $.extend({},$.parser.parseOptions(a,["left","top",{minWidth:"number",hideOnUnhover:"boolean"}]))},$.fn.menu.defaults={zIndex:11e4,left:0,top:0,alignTo:null,align:"left",minWidth:120,hideOnUnhover:!0,onShow:function(){},onHide:function(){},onClick:function(a){}}})(jQuery)