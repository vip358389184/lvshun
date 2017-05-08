/**
 * jQuery EasyUI 1.3.6
 * 
 * Copyright (c) 2009-2014 www.jeasyui.com. All rights reserved.
 *
 * Licensed under the GPL license: http://www.gnu.org/licenses/gpl.txt
 * To use it on other terms please contact us at info@jeasyui.com
 *
 */

(function(a){function b(b){a(b).addClass("numberspinner-f");var c=a.data(b,"numberspinner").options;a(b).spinner(c).numberbox(a.extend({},c,{width:"auto"}))}function c(b,c){var d=a.data(b,"numberspinner").options,e=parseFloat(a(b).numberbox("getValue")||d.value)||0;c==1?e-=d.increment:e+=d.increment,a(b).numberbox("setValue",e)}a.fn.numberspinner=function(c,d){if(typeof c=="string"){var e=a.fn.numberspinner.methods[c];return e?e(this,d):this.spinner(c,d)}return c=c||{},this.each(function(){var d=a.data(this,"numberspinner");d?a.extend(d.options,c):a.data(this,"numberspinner",{options:a.extend({},a.fn.numberspinner.defaults,a.fn.numberspinner.parseOptions(this),c)}),b(this)})},a.fn.numberspinner.methods={options:function(b){var c=a.data(b[0],"numberspinner").options;return a.extend(c,{value:b.numberbox("getValue"),originalValue:b.numberbox("options").originalValue})},setValue:function(b,c){return b.each(function(){a(this).numberbox("setValue",c)})},getValue:function(a){return a.numberbox("getValue")},clear:function(b){return b.each(function(){a(this).spinner("clear"),a(this).numberbox("clear")})},reset:function(b){return b.each(function(){var b=a(this).numberspinner("options");a(this).numberspinner("setValue",b.originalValue)})}},a.fn.numberspinner.parseOptions=function(b){return a.extend({},a.fn.spinner.parseOptions(b),a.fn.numberbox.parseOptions(b),{})},a.fn.numberspinner.defaults=a.extend({},a.fn.spinner.defaults,a.fn.numberbox.defaults,{spin:function(a){c(this,a)}})})(jQuery)