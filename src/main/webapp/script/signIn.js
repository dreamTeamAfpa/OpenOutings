
var username = document.getElementById("username");
var password = document.getElementById("password");


// A l'écoute du clic "Se connecter"
connectBtn.addEventListener("click", function(e) {
	e.preventDefault();

// USERNAME FIELD
		var regUsername =  /^[A-Za-z0-9_[\]-]{6,15}$/; // nombre de caractères compris entre 6 et 15
		if (!username.value.match(regUsername)) { // si la regExp ne match pas avec la valeur de "username"
			alert ("Veuillez enter un identifiant compris entre 6 et 15 caractères");
			e.preventDefault();
		}
// PASSWORD FIELD
		var regPassword =  /^[A-Za-z0-9_[\]-]{6,64}$/; // nombre de caractères compris entre 6 et 64
		if (!password.value.match(regPassword)) { // si la regExp ne match pas avec la valeur de "password"
			alert ("Veuillez enter un mot de passe compris entre 6 et 64 caractères");
		e.preventDefault(); 
	}
}, false);

// FUNCTIONS
	function verifier(champ){
        if(champ.val() == ""){ // si le champ est vide
            champ.css({ // on rend le champ rouge
            	borderColor : 'red',
            	color : 'red'
            })
        }
    }


// JQUERY
// Declare variables
$(document).ready(function () {
	var $pseudo = $('#username'),
	$mdp = $('#password');
	$confirmation = $('#passwordVerif'),
	$mdpplusconf = $('#password, #passwordVerif'),
	$envoi = $('#connectBtn'),
	$champ = $('input');


	// HANDLERS
	// check si l'input username est correct
	$pseudo.keyup(function(){
		var regUsername =  /^[A-Za-z0-9_[\]-]{6,12}$/;
		// si la chaîne de caractères est inférieure à 6 OU ne match pas le regexp
		if($(this).val().length < 6 || !username.value.match(regUsername)){ 
            $(this).css({ // on rend le champ rouge
            	borderColor : 'red',
            	color : 'red'
            });
        }
        else{
             $(this).css({ // si tout est bon, on le rend vert
             	borderColor : 'green',
             	color : 'green'
             });
         }
     });
		// check si le champ passwordVerif est correct
		$mdpplusconf.keyup(function(){
			var regPassword =  /^[A-Za-z0-9_[\]-]{6,64}$/;
        if($(this).val().length < 6 || !password.value.match(regPassword) && passwordVerif.value.match(regPassword)){ // si la chaîne de caractères est inférieure à 6
            $(this).css({ // on rend le champ rouge
            	borderColor : 'red',
            	color : 'red'
            });
        }
        else{
             $(this).css({ // si tout est bon, on le rend vert
             	borderColor : 'green',
             	color : 'green'
             });
         }
     });


		$confirmation.keyup(function(){
        if($(this).val() != $mdp.val()){ // si la confirmation est différente du mot de passe
            $(this).css({ // on rend le champ rouge
            	borderColor : 'red',
            	color : 'red'
            });
        }
        else{
	    $(this).css({ // si tout est bon, on le rend vert
	    	borderColor : 'green',
	    	color : 'green'
	    });
	}
});

		$envoi.click(function(e){
        e.preventDefault(); // on annule la fonction par défaut du bouton d'envoi

        // puis on lance la fonction de vérification sur tous les champs :
        verifier($pseudo);
        verifier($mdp);
        verifier($confirmation);
        verifier($mail);
    });
	});

