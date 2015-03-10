/**
 * 
 */

window.onload=function(){
	elem = document.getElementById("submit");
	elem.onmouseover= callFn;
	
	
}

function callFn(){ 
	elem.cssStyle(backgroundColor,"red");
	
}