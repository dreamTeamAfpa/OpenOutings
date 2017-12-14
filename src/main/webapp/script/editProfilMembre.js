/* multiple select Hobbies list */
$(document).ready(function() {
   $('#datalist option').on('click', function(){             
   $("#data").append('<span class="smallBloc">'+$(this).attr()+'</span><br>');
 });
    $('.flexdatalist').flexdatalist({
    	selectionRequired: 1,
        minLength: 1
  });
});


