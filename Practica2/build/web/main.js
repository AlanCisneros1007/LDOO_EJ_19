
function seguro(){
   var nombre = document.getElementById("nombre");
   var email = document.getElementById("email");
   var pass = document.getElementById("pass");
   var fn = document.getElementById("fn");
   
    if(nombre!==null && email!==null && pass!==null && fn!==null){
    return confirm('¿Estas seguro de enviar este formulario?'); 
    }
}
