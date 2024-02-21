$(document).ready(function() {
    // Selecciona todos los títulos de las tarjetas y asigna el evento de clic
    $(".card-title").click(function() {
        // Selecciona el contenido de la tarjeta dentro de la tarjeta actual y lo hace desaparecer o aparecer
        $(this).siblings(".card-text").toggle();
    });
});

