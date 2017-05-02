/**
 * jQuery EasyUI 1.3.6
 * 
 * Copyright (c) 2009-2014 www.jeasyui.com. All rights reserved.
 *
 * Licensed under the GPL license: http://www.gnu.org/licenses/gpl.txt
 * To use it on other terms please contact us at info@jeasyui.com
 *
 */

(function(a){function b(b){var c=a.data(b,"splitbutton").options;a(b).menubutton(c),a(b).addClass("s-btn")}a.fn.splitbutton=function(c,d){if(typeof c=="string"){var e=a.fn.splitbutton.methods[c];return e?e(this,d):this.menubutton(c,d)}return c=c||{},this.each(function(){var d=a.data(this,"splitbutton");d?a.extend(d.options,c):(a.data(this,"splitbutton",{options:a.extend({},a.fn.splitbutton.defaults,a.fn.splitbutton.parseOptions(this),c)}),a(this).removeAttr("disabled")),b(this)})},a.fn.splitbutton.methods={options:function(b){var c=b.menubutton("options"),d=a.data(b[0],"splitbutton").options;return a.extend(d,{disabled:c.disabled,toggle:c.toggle,selected:c.selected}),d}},a.fn.splitbutton.parseOptions=function(b){var c=a(b);return a.extend({},a.fn.linkbutton.parseOptions(b),a.parser.parseOptions(b,["menu",{plain:"boolean",duration:"number"}]))},a.fn.splitbutton.defaults=a.extend({},a.fn.linkbutton.defaults,{plain:!0,menu:null,duration:100,cls:{btn1:"m-btn-active s-btn-active",btn2:"m-btn-plain-active s-btn-plain-active",arrow:"m-btn-downarrow",trigger:"m-btn-line"}})})(jQuery)