// El siguiente js aplica un smooth scroll para la barra de navegacion
document.addEventListener("DOMContentLoaded", function() {
    const links = document.querySelectorAll('.navbar-nav a.nav-link');

    for (const link of links) {
        link.addEventListener('click', smoothScroll);
    }

    function smoothScroll(event) {
        event.preventDefault();

        const targetId = this.getAttribute('href');
        const targetElement = document.querySelector(targetId);
        const offsetTop = targetElement.offsetTop;

        window.scroll({
            top: offsetTop,
            behavior: 'smooth'
        });
    }
});
