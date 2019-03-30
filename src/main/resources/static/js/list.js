$(document).ready(function () {

    $('.fa-user-times').click(function() {

        $('.alert').alert();

    });

    $(".btn-delete").click(function(e){
        let pessoaId = $(this).attr("data-id");
        $.ajax({
            type: "POST",
            url: "/delete",
            data: {
                "Id": pessoaId
            },
            success: function(result){
                // para dar refresh na pagina
                window.location.reload();
            }
        });
    });

    $(".btn-update").click(function(e){
        let pessoaId = $(this).attr("data-id");
        $.ajax({
            type: "POST",
            url: "/update",
            data: {
                "Id": pessoaId
            },
            success: function(result){
                // para dar refresh na pagina
                console.log(result);
                window.location.reload();
            }
        });
    });

});