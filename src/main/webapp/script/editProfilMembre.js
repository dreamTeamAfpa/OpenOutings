/* multiple select Hobbies list */
$(document).ready(function() {
    $('#select option').on('click', function(){             
    $("#sel").append('<span class="smallBloc">'+$(this).val()+'</span><br>');
 });
});