document.addEventListener('DOMContentLoaded', function() {
    const button = document.getElementById('clickMe');
    let isClicked = false;

    button.addEventListener('click', function() {
        if (isClicked) {
            button.textContent = 'Click me';
            button.classList.remove('clicked');
        } else {
            button.textContent = 'You clicked me';
            button.classList.add('clicked');
        }
        isClicked = !isClicked;
    });
}); 