// partimos con las notas y promedio de html

var html_n1 = document.getElementById('html_n1');
var html_n2 = document.getElementById('html_n2');
var html_n3 = document.getElementById('html_n3');
var html_promedio = document.getElementById('html_promedio');

html_n1.innerHTML = prompt("Ingrese la nota 1 de HTML");
html_n2.innerHTML = prompt("Ingrese la nota 2 de HTML");
html_n3.innerHTML = prompt("Ingrese la nota 3 de HTML");


var html_promedioFinal = (parseFloat(html_n1.innerHTML) + parseFloat(html_n2.innerHTML) + parseFloat(html_n3.innerHTML))/3;

html_promedio.innerHTML = html_promedioFinal;


// Continuamos con las de CSS

var css_n1 = document.getElementById('css_n1');
var css_n2 = document.getElementById('css_n2');
var css_n3 = document.getElementById('css_n3');

var css_promedio = document.getElementById('css_promedio');

css_n1.innerHTML = prompt("Ingrese la nota 1 de CSS");
css_n2.innerHTML = prompt("Ingrese la nota 2 de CSS");
css_n3.innerHTML = prompt("Ingrese la nota 3 de CSS");

var css_promedioFinal = (parseFloat(css_n1.innerHTML) + parseFloat(css_n2.innerHTML) + parseFloat(css_n3.innerHTML))/3;
css_promedio.innerHTML = css_promedioFinal;


// Finalizamos con las de JavaScript


var javascript_n1 = document.getElementById('javascript_n1');
var javascript_n2 = document.getElementById('javascript_n2');
var javascript_n3 = document.getElementById('javascript_n3');

var javascript_promedio = document.getElementById('javascript_promedio');

javascript_n1.innerHTML = prompt("Ingrese la nota 1 de JavaScript");
javascript_n2.innerHTML = prompt("Ingrese la nota 2 de JavaScript");
javascript_n3.innerHTML = prompt("Ingrese la nota 3 de JavaScript");

var javascript_promedioFinal = (parseFloat(javascript_n1.innerHTML) + parseFloat(javascript_n2.innerHTML) + parseFloat(javascript_n3.innerHTML))/3;
javascript_promedio.innerHTML = javascript_promedioFinal;
