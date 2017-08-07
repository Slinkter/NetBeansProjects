
$(document).ready(function(){	

	$("#btnGuardar").click(function(event){
		
                $("#myAjaxRequestForm").submit(function(e){
                     e.preventDefault();
                  });
                
                //checks for the button click event
    $("#myButton").click(function(e){
          
          
                
                
                  if ($("#nombre").val()=== ""   ) {
                      alert('el campo Nombre esta vacio');
                  } else  if ($("#parteno").val()=== ""   ) {
                      alert(' el campo parteno esta vacio ');
                  }else  if ($("#marteno").val()=== ""   ) {
                      alert(' el campo marteno esta vacio ');
                  }
                  
                    var regex = /[\w-\.]{2,}@([\w-]{2,}\.)*([\w-]{2,}\.)[\w-]{2,4}/;
                    if (regex.test($("#Correo").val().trim())) {
                        
                    }                    
                    else {
                        alert('La direccion de correo no es valida');
                    }
                  
                 
        });
 
 
     
            
});
});

$(function() {   
    $( "#fechafin" ).datepicker();  
  });
