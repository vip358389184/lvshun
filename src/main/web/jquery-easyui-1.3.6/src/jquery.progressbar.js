/**
 * jQuery EasyUI 1.3.6
 * 
 * Copyright (c) 2009-2014 www.jeasyui.com. All rights reserved.
 *
 * Licensed under the GPL license: http://www.gnu.org/licenses/gpl.txt
 * To use it on other terms please contact us at info@jeasyui.com
 *
 */

(function(a){function b(b){return a(b).addClass("progressbar"),a(b).html('<div class="progressbar-text"></div><div class="progressbar-value"><div class="progressbar-text"></div></div>'),a(b)}function c(b,c){var d=a.data(b,"progressbar").options,e=a.data(b,"progressbar").bar;c&&(d.width=c),e._outerWidth(d.width)._outerHeight(d.height),e.find("div.progressbar-text").width(e.width()),e.find("div.progressbar-text,div.progressbar-value").css({height:e.height()+"px",lineHeight:e.height()+"px"})}a.fn.progressbar=function(d,e){if(typeof d=="string"){var f=a.fn.progressbar.methods[d];if(f)return f(this,e)}return d=d||{},this.each(function(){var e=a.data(this,"progressbar");e?a.extend(e.options,d):e=a.data(this,"progressbar",{options:a.extend({},a.fn.progressbar.defaults,a.fn.progressbar.parseOptions(this),d),bar:b(this)}),a(this).progressbar("setValue",e.options.value),c(this)})},a.fn.progressbar.methods={options:function(b){return a.data(b[0],"progressbar").options},resize:function(a,b){return a.each(function(){c(this,b)})},getValue:function(b){return a.data(b[0],"progressbar").options.value},setValue:function(b,c){return c<0&&(c=0),c>100&&(c=100),b.each(function(){var b=a.data(this,"progressbar").options,d=b.text.replace(/{value}/,c),e=b.value;b.value=c,a(this).find("div.progressbar-value").width(c+"%"),a(this).find("div.progressbar-text").html(d),e!=c&&b.onChange.call(this,c,e)})}},a.fn.progressbar.parseOptions=function(b){return a.extend({},a.parser.parseOptions(b,["width","height","text",{value:"number"}]))},a.fn.progressbar.defaults={width:"auto",height:22,value:0,text:"{value}%",onChange:function(a,b){}}})(jQuery)