$(document).ready(function (){
    $('#userName').blur(function (event){
        var name = $('#userName').val();
        $.get('GetUSerServlet', {
            userName:name
        },function (responseText){
            $('#ajaxGetUserServletResponse').text(responseText);
        }); 
    });  
});

$.ajax(
{
url     : url,
data    : data,
success : success,
dataType: dataType
}
)