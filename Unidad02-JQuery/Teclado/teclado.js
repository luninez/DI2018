
// nos valida si estamos pulsado un boton dentro de nuestro teclado
function isAlphanumericKey(keycode){
    return (keycode >= 48) && (keycode <= 90) || (keycode == 32); //estos son solo el codigo de las letras y numeros
}

$(document).keydown(function (e) { 
    if(isAlphanumericKey(e.which)){
        var id = "#key-" + String.fromCharCode(e.which);
        console.log(id);
        $(id).addClass('btn_pressed');
    }
});

$(document).keyup(function (e) {
    
    if (isAlphanumericKey(e.which)) {
        var id = "#key-" + String.fromCharCode(e.which);
        $(id).removeClass('btn_pressed');
    }
});