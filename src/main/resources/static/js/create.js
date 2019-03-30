$(document).ready(function () {

    $('input').blur(function() {
        $(this).addClass('is-valid');
    });

    'use strict';
    window.addEventListener('load', function () {
        // Fetch all the forms we want to apply custom Bootstrap validation styles to
        var forms = document.getElementsByClassName('needs-validation');
        // Loop over them and prevent submission
       var validation = Array.prototype.filter.call(forms, function (form) {
            console.log(form.classList);
           form.addEventListener('submit', function (event) {
               if (form.checkValidity() === false) {
                    event.preventDefault();
                    event.stopPropagation();
                }
                form.classList.add('was-validated');
            }, false);
       });
    }, false);

});