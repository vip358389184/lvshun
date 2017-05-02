/**
 * jQuery EasyUI 1.3.6
 * 
 * Copyright (c) 2009-2014 www.jeasyui.com. All rights reserved.
 *
 * Licensed under the GPL license: http://www.gnu.org/licenses/gpl.txt
 * To use it on other terms please contact us at info@jeasyui.com
 *
 */

(function(a){function b(b){a(b).addClass("droppable"),a(b).bind("_dragenter",function(c,d){a.data(b,"droppable").options.onDragEnter.apply(b,[c,d])}),a(b).bind("_dragleave",function(c,d){a.data(b,"droppable").options.onDragLeave.apply(b,[c,d])}),a(b).bind("_dragover",function(c,d){a.data(b,"droppable").options.onDragOver.apply(b,[c,d])}),a(b).bind("_drop",function(c,d){a.data(b,"droppable").options.onDrop.apply(b,[c,d])})}a.fn.droppable=function(c,d){return typeof c=="string"?a.fn.droppable.methods[c](this,d):(c=c||{},this.each(function(){var d=a.data(this,"droppable");d?a.extend(d.options,c):(b(this),a.data(this,"droppable",{options:a.extend({},a.fn.droppable.defaults,a.fn.droppable.parseOptions(this),c)}))}))},a.fn.droppable.methods={options:function(b){return a.data(b[0],"droppable").options},enable:function(b){return b.each(function(){a(this).droppable({disabled:!1})})},disable:function(b){return b.each(function(){a(this).droppable({disabled:!0})})}},a.fn.droppable.parseOptions=function(b){var c=a(b);return a.extend({},a.parser.parseOptions(b,["accept"]),{disabled:c.attr("disabled")?!0:undefined})},a.fn.droppable.defaults={accept:null,disabled:!1,onDragEnter:function(a,b){},onDragOver:function(a,b){},onDragLeave:function(a,b){},onDrop:function(a,b){}}})(jQuery)