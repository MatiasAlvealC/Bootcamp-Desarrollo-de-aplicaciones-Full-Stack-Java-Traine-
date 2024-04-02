// Selecciona el elemento del carrusel y los botones de control
const carouselElement = document.querySelector('.carousel');
const prevBtn = carouselElement.querySelector('.carousel-control-prev');
const nextBtn = carouselElement.querySelector('.carousel-control-next');

// Selecciona las diapositivas del carrusel
const slides = carouselElement.querySelectorAll('.carousel-item');

let counter = 0;
const intervalTime = 5000; // Valor del tiempo de intervalo en milisegundos
let slideInterval;

// Función para mostrar la siguiente diapositiva
function nextSlide() {
  slides[counter].classList.remove('active');
  counter = (counter + 1) % slides.length;
  slides[counter].classList.add('active');
}

// Función para mostrar la diapositiva anterior
function prevSlide() {
  slides[counter].classList.remove('active');
  counter = (counter - 1 + slides.length) % slides.length;
  slides[counter].classList.add('active');
}

// Agrega el evento click al botón de siguiente
nextBtn.addEventListener('click', () => {
  nextSlide();
});

// Agrega el evento click al botón de anterior
prevBtn.addEventListener('click', () => {
  prevSlide();
});

// Función para iniciar la reproducción automática del carrusel
function startSlide() {
  slideInterval = setInterval(() => {
    nextSlide();
  }, intervalTime);
}

// Detiene la reproducción automática al pasar el cursor sobre el carrusel
carouselElement.addEventListener('mouseenter', () => {
  clearInterval(slideInterval);
});

// Reanuda la reproducción automática al quitar el cursor del carrusel
carouselElement.addEventListener('mouseleave', () => {
  startSlide();
});

// Inicia la reproducción automática del carrusel
startSlide();


