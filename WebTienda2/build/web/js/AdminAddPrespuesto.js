$(document).ready(function(){
	$("#accion").click(function(){
		var servicio = $("#servicio").val();
                var material = $("#material").val();
                var grosor = parseInt($("#grosor").val());
                var ancho = parseInt($("#ancho").val());
                var altura = parseInt($("#altura").val());
		

		if(servicio == "Ventana" ){
                    if(material = "Crudo"){
                        if (grosor == 6 ){
                            var rpta = (ancho*altura)*100;
                        }else if (grosor == 8){
                            var rpta = (ancho*altura)*150;
                        }else if (grosor == 10){
                            var rpta = (ancho*altura)*180;
                        }
                        
                        
                    }else if (material = "Templado"){
                        var rpta = numero1 + numero2;
                    }
			
		}else if(servicio == "Mampara"){
			var rpta = numero1 - numero2;
		}else if(servicio == "Ducha"){
			var rpta = numero1 * numero2;
		}else if(servicio == "Espejo"){
			var rpta = numero1 / numero2;
		
                }else if(servicio == "Incoloro"){
			var rpta = numero1 / numero2;
		
                }else if(servicio == "Bronce"){
			var rpta = numero1 / numero2;
		
                }else if(servicio == "Catedral"){
			var rpta = numero1 / numero2;
		}

		$("#txtResultado").val(rpta);
	});
});
