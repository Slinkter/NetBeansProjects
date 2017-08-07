$(document).ready(function(){
	$("#accion").click(function(){
		var numero1 = parseInt($("#txtNumero1").val());
		var numero2 = parseInt($("#txtNumero2").val());
		var operacion = $("#txtOperacion").val();

		if(operacion == 1){
			var rpta = numero1 + numero2;
		}else if(operacion == 2){
			var rpta = numero1 - numero2;
		}else if(operacion == 3){
			var rpta = numero1 * numero2;
		}else if(operacion == 4){
			var rpta = numero1 / numero2;
		}
		
		$("#txtResultado").val(rpta);
	});
});