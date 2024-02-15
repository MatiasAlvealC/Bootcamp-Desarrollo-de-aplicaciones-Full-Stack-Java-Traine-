
var variable1 = parseInt(prompt("Ingrese un numero"));
var variable2 = parseInt(prompt("Ingrese un segundo numero"));

var signo = prompt("Ingrese que operación desea realizar, mediante su signo")
if (signo === "+"){
    resultado = variable1 + variable2;
}
else if(signo === "-"){
    resultado= variable1 - variable2;
}
else if(signo === "*"){
    resultado = variable1 * variable2;
}
else{
    resultado = variable1 / variable2;
}

document.write("El resultado es "+resultado);
