$(document).ready(function() {
    // Asignar el evento dblclick a los elementos h2 con los textos "INGREDIENTES" y "PREPARACIÓN"
    $("h2:contains('INGREDIENTES')").dblclick(function() {
        // Cambiar el color del texto a rojo
        $(this).css("color", "#dc3545");
    });

    $("h2:contains('PREPARACIÓN')").dblclick(function() {
        // Cambiar el color del texto a rojo
        $(this).css("color", "#dc3545");
    });
});