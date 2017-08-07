
$(document).ready(function(){	

	$("#btnGuardar").click(function(event){
		  event.preventDefault();
                  
                  if ($("#nombre").val()=== ""   ) {
                      alert('el campoNOMBRE esta vacio');
                  } else if ($("#appaterno").val()=== "") {
                      alert('PARTERNO esta vacio');
                  }else if ($("#appaterno").val()=== "") {
                      alert('PARTERNO esta vacio');
                  }else if ($("#apmaterno").val()=== "") {
                      alert('MATERNO esta vacio');
                  }  
                  
                    var regex = /[\w-\.]{2,}@([\w-]{2,}\.)*([\w-]{2,}\.)[\w-]{2,4}/;
                    if (regex.test($("#correo").val().trim())) {
                        
                    }                    
                    else {
                        alert('La direccion de correo no es valida');
                    }
            });

  
    

});

   
 $(function() {   
    
$( "#fechanacim" ).datepicker();  
  });




