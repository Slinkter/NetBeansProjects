
$(document).ready(function(){	

	$("#btnGuardar").click(function(){
		
                  if ($("#nombre").val()=== ""   ) {
                      alert('el campo Nombre esta vacio');
                  } 
                  
              
    return  false;

});
});

   
 $(function() {   
    $( "#fechainicio" ).datepicker();  
  });

$(function() {   
    $( "#fechafin" ).datepicker();  
  });


