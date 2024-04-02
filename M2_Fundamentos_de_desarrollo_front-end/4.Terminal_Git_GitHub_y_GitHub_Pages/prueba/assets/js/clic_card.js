$(document).ready(function() {
    $(".card").click(function() {
        // Busca el elemento .card-text dentro de la misma tarjeta que se hizo clic
        $(this).find(".card-text").toggle();
    });
});
