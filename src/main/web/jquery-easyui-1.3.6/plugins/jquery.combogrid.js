/**
 * jQuery EasyUI 1.3.6
 * 
 * Copyright (c) 2009-2014 www.jeasyui.com. All rights reserved.
 *
 * Licensed under the GPL license: http://www.gnu.org/licenses/gpl.txt
 * To use it on other terms please contact us at info@jeasyui.com
 *
 */

(function(a){function b(b){function h(d,f){c.remainText=!1,i(),e.multiple||a(b).combo("hidePanel"),e.onClickRow.call(this,d,f)}function i(){var d=f.datagrid("getSelections"),g=[],h=[];for(var i=0;i<d.length;i++)g.push(d[i][e.idField]),h.push(d[i][e.textField]);e.multiple?a(b).combo("setValues",g):a(b).combo("setValues",g.length?g:[""]),c.remainText||a(b).combo("setText",h.join(e.separator))}var c=a.data(b,"combogrid"),e=c.options,f=c.grid;a(b).addClass("combogrid-f").combo(e);var g=a(b).combo("panel");f||(f=a("<table></table>").appendTo(g),c.grid=f),f.datagrid(a.extend({},e,{border:!1,fit:!0,singleSelect:!e.multiple,onLoadSuccess:function(f){var g=a(b).combo("getValues"),h=e.onSelect;e.onSelect=function(){},d(b,g,c.remainText),e.onSelect=h,e.onLoadSuccess.apply(b,arguments)},onClickRow:h,onSelect:function(a,b){i(),e.onSelect.call(this,a,b)},onUnselect:function(a,b){i(),e.onUnselect.call(this,a,b)},onSelectAll:function(a){i(),e.onSelectAll.call(this,a)},onUnselectAll:function(a){e.multiple&&i(),e.onUnselectAll.call(this,a)}}))}function c(b,c){var d=a.data(b,"combogrid"),e=d.options,f=d.grid,g=f.datagrid("getRows").length;if(!g)return;var h=e.finder.getTr(f[0],null,"highlight");h.length||(h=e.finder.getTr(f[0],null,"selected"));var i;if(!h.length)i=c=="next"?0:g-1;else{var i=parseInt(h.attr("datagrid-row-index"));i+=c=="next"?1:-1,i<0&&(i=g-1),i>=g&&(i=0)}f.datagrid("highlightRow",i),e.selectOnNavigation&&(d.remainText=!1,f.datagrid("selectRow",i))}function d(b,c,d){var e=a.data(b,"combogrid"),f=e.options,g=e.grid,h=g.datagrid("getRows"),i=[],j=a(b).combo("getValues"),k=a(b).combo("options"),l=k.onChange;k.onChange=function(){},g.datagrid("clearSelections");for(var m=0;m<c.length;m++){var n=g.datagrid("getRowIndex",c[m]);n>=0?(g.datagrid("selectRow",n),i.push(h[n][f.textField])):i.push(c[m])}a(b).combo("setValues",j),k.onChange=l,a(b).combo("setValues",c);if(!d){var o=i.join(f.separator);a(b).combo("getText")!=o&&a(b).combo("setText",o)}}function e(b,c){var e=a.data(b,"combogrid"),f=e.options,g=e.grid;e.remainText=!0,f.multiple&&!c?d(b,[],!0):d(b,[c],!0);if(f.mode=="remote")g.datagrid("clearSelections"),g.datagrid("load",a.extend({},f.queryParams,{q:c}));else{if(!c)return;g.datagrid("clearSelections").datagrid("highlightRow",-1);var h=g.datagrid("getRows"),i=f.multiple?c.split(f.separator):[c];a.map(i,function(c){c=a.trim(c),c&&a.map(h,function(a,d){c==a[f.textField]?g.datagrid("selectRow",d):f.filter.call(b,c,a)&&g.datagrid("highlightRow",d)})})}}function f(b){var c=a.data(b,"combogrid"),d=c.options,e=c.grid,f=d.finder.getTr(e[0],null,"highlight");c.remainText=!1;if(f.length){var g=parseInt(f.attr("datagrid-row-index"));d.multiple?f.hasClass("datagrid-row-selected")?e.datagrid("unselectRow",g):e.datagrid("selectRow",g):e.datagrid("selectRow",g)}var h=[];a.map(e.datagrid("getSelections"),function(a){h.push(a[d.idField])}),a(b).combogrid("setValues",h),d.multiple||a(b).combogrid("hidePanel")}a.fn.combogrid=function(c,d){if(typeof c=="string"){var e=a.fn.combogrid.methods[c];return e?e(this,d):this.combo(c,d)}return c=c||{},this.each(function(){var d=a.data(this,"combogrid");d?a.extend(d.options,c):d=a.data(this,"combogrid",{options:a.extend({},a.fn.combogrid.defaults,a.fn.combogrid.parseOptions(this),c)}),b(this)})},a.fn.combogrid.methods={options:function(b){var c=b.combo("options");return a.extend(a.data(b[0],"combogrid").options,{originalValue:c.originalValue,disabled:c.disabled,readonly:c.readonly})},grid:function(b){return a.data(b[0],"combogrid").grid},setValues:function(a,b){return a.each(function(){d(this,b)})},setValue:function(a,b){return a.each(function(){d(this,[b])})},clear:function(b){return b.each(function(){a(this).combogrid("grid").datagrid("clearSelections"),a(this).combo("clear")})},reset:function(b){return b.each(function(){var b=a(this).combogrid("options");b.multiple?a(this).combogrid("setValues",b.originalValue):a(this).combogrid("setValue",b.originalValue)})}},a.fn.combogrid.parseOptions=function(b){var c=a(b);return a.extend({},a.fn.combo.parseOptions(b),a.fn.datagrid.parseOptions(b),a.parser.parseOptions(b,["idField","textField","mode"]))},a.fn.combogrid.defaults=a.extend({},a.fn.combo.defaults,a.fn.datagrid.defaults,{loadMsg:null,idField:null,textField:null,mode:"local",keyHandler:{up:function(a){c(this,"prev"),a.preventDefault()},down:function(a){c(this,"next"),a.preventDefault()},left:function(a){},right:function(a){},enter:function(a){f(this)},query:function(a,b){e(this,a)}},filter:function(b,c){var d=a(this).combogrid("options");return c[d.textField].toLowerCase().indexOf(b.toLowerCase())==0}})})(jQuery)