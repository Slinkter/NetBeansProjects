
$(document).ready(function(){	

	$("#btnGuardar").click(function(event){
		
                 event.preventDefault();
           
                  if ($("#nombre").val()=== ""   ) {
                      alert('el campo Nombre esta vacio');
                  } else  if ($("#clave").val()=== ""   ) {
                      alert(' Contraseña invalida!!!  ');
                  }
        });
 
 
        
            
});



