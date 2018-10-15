
var contador;
$(document).ready(function () { {
   contador = 0;
   setInterval(function (param) {
       $('#segundos').html(contador)
    }, 60000);
   }
});
/*Devuelve TRUE si la tecla pulsada está asociada con una tecla alfanumérica, basado
en la propiedad de jQuery event.which
*/
function isAlphanumericKey(keycode) {
    return (keycode >= 48) && (keycode <= 90);
}


/*$(document).ready(function(){
    $(".keyboard-key").on({
        mousedown: function() {
            $("#selectedLetter").stop().css('opacity', '1.0').text($(this).text());
        },
        mouseup: function() {
            $("#selectedLetter").stop().animate({opacity: 0}, 1000);
        }
    });
});*/



//Emula un evento mousedown en un botón keyboard-key
$(document).keydown(function (e) {
    if (isAlphanumericKey(e.which)) {
        var myID = "#key-" + String.fromCharCode(e.which);
        $(myID).trigger("mousedown").addClass('active-style');
       // $('#texto').append(String.fromCharCode(e.which));
        contador++;
    }
});

// Emula un evento mouseup en un botón keyboard-key
$(document).keyup(function (e) {
    if (isAlphanumericKey(e.which)) {
        var myID = "#key-" + String.fromCharCode(e.which);
        $(myID).trigger("mouseup").removeClass('active-style');
    }
});