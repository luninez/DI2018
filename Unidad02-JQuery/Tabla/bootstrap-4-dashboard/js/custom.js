//El boton de guardar no funciona
//El boton de eliminar no reacciona
//Las nuevas filas insertadas no se editan
//el boton de eliminar no desaparece


$(document).ready(function () {
    //añadimos
    $("#add").click(function () {
        
        var nuevaFila = "<tr>";
        var col1 = "<td><i>EJ: Federico</i></td>";
        var col2 = "<td><i>EJ: García Lorca</i></td>";
        var col3 = "<td><i>EJ: 2ºESO</i></td>";
        var col4 = "<td><button id=\"edit\" type=\"button\" class=\"btn btn-sm btn-primary\">Editar</button><button id=\"deleted\" type=\"button\" class=\"btn btn-sm btn-primary\">Eliminar</button></td>";
        nuevaFila += col1+col2+col3+col4+"</tr>";
        $("#tabla").append(nuevaFila);
    });

    //eliminamos
    $("#deleted").click(function(){
        $(this).remove();
    });

    //editamos
    $("#edit").click(function(){
        let tdNombre = $(this).closest("tr").find("td").first();
        let tdApellidos = $(this).closest("tr").find("td:nth-child(2)");
        let tdClase = $(this).closest("tr").find("td:nth-child(3)");
        
        tdNombre.html(`<input id="input-nombre" type="text" value="${tdNombre.text()}" />`);
        tdApellidos.html(`<input id="input-apellidos" type="text" value="${tdApellidos.text()}" />`);
        tdClase.html(`<input id="input-clase" type="text" value="${tdClase.text()}" />`);

        $(this).css("display","none");
        $(this).parent().append('<button id="save" class="btn btn-primary">Guardar</button>');
    });


    //guardamos
    $("#save").click(function(){
        let nombre = $("#input-nombre").val();
        let apellidos = $("#input-apellidos").val();
        let clase = $("#input-clase").val();

        $(this).closest("tr").find("td:nth-child(1)").html(nombre);
        $(this).closest("tr").find("td:nth-child(2)").html(apellidos);
        $(this).closest("tr").find("td:nth-child(3)").html(clase);

        // Restauro el botón Editar
        $(this).parent().find("#edit").css("display","block");
        $(this).parent().find("#deleted").css("display","block");

        // Elimino el botón guardar
        $(this).remove();
    });
});
