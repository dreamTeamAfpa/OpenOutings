
var username = document.getElementById("username");
var password = document.getElementById("password");
var email = document.getElementById("email");


// A l'écoute du clic "S'inscrire"
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
// EMAIL FIELD
var regEmail =  /^[0-9a-z._-]+@{1}[0-9a-z.-]{2,}[.]{1}[a-z]{2,5}$/;
		if (!email.value.match(regEmail)) { // si la regExp ne match pas avec la valeur "d'email"
			e.preventDefault();
		alert ("Veuillez enter une adresse email valide. (nom de domaine : min 2 caractères)");
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
$(document).ready(function () {51
	var $pseudo = $('#username'),
	$mdp = $('#password'),
	$confirmation = $('#passwordVerif'),
	$mdpplusconf = $('#password, #passwordVerif'),
	$mail = $('#email'),
	$envoi = $('#connectBtn'),
	$champ = $('input');

// HANDLERS
	// check si l'input (champ actif) est correct ou non
	$pseudo.keyup(function(){
		var regUsername =  /^[A-Za-z0-9_[\]-]{6,15}$/;
		// si la chaîne de caractères est compris entre 6 et 15 OU ne match pas le regexp
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

	// check si le champ email est correct
	$mail.keyup(function(){
		var regEmail =  /^[0-9a-z._-]+@{1}[0-9a-z.-]{2,}[.]{1}[a-z]{2,5}$/;
        if($(this).val().length < 6 || !email.value.match(regEmail)){ // si la chaîne de caractères est inférieure à 6
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

	// check si les champs password & passwordVerif sont corrects
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
