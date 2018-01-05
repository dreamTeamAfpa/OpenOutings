window.addEventListener('load', function() {

	if (window.location.pathname.includes("profilmembre")) {
		$('#r1').prop('disabled', true);
		$('#r2').prop('disabled', true);
		$('#pseudo').prop('disabled', true);
		$('#nom').prop('disabled', true);
		$('#prenom').prop('disabled', true);
		$('#email').prop('disabled', true);
		$('#telephone').prop('disabled', true);
		$('#dateNaissance').prop('disabled', true);
		$('#description').prop('disabled', true);
		document.getElementById('boutonAnnuler').style.visibility = "hidden";
	} 
});

/*
 * function onLoad() { $('#r1').prop('disabled', true);
 * $('#r2').prop('disabled', true); $('#pseudo').prop('disabled', true);
 * $('#nom').prop('disabled', true); $('#prenom').prop('disabled', true);
 * $('#email').prop('disabled', true); $('#telephone').prop('disabled', true);
 * $('#dateNaissance').prop('disabled', true);
 * $('#description').prop('disabled', true);
 * document.getElementById('boutonAnnuler').style.visibility = "hidden"; }
 */

$('#boutonValide').on('click', function () {
	activerChamps();
	document.getElementById('boutonAnnuler').style.visibility = "visible";
});

/**
 * 
 * @returns
 */
function annuler() {
	if (document.getElementById('boutonAnnuler').value == "Annuler") {
		window.location.href = '/profilmembre';
	}
}

/**
 * 
 * @returns
 */
function activerChamps() {

	document.getElementById('boutonValide').value = "Valider";
	$('#r1').prop('disabled', false);
	$('#r2').prop('disabled', false);
	$('#pseudo').prop('disabled', false);
	$('#nom').prop('disabled', false);
	$('#prenom').prop('disabled', false);
	$('#email').prop('disabled', false);
	$('#telephone').prop('disabled', false);
	$('#dateNaissance').prop('disabled', false);
	$('#description').prop('disabled', false);
}
