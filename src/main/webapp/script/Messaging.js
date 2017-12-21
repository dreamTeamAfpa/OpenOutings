var elem_zonetextmessage = document.getElementById("zonetextmessage");
var elem_benvoyer = document.getElementById("benvoyer");
var elem_imagefile = document.getElementById("imagefile");
var elem_pathfile = document.getElementById("pathfile");
window.onload = elem_zonetextmessage.focus();


// listener boutton envoyer
document.addEventListener('DOMContentLoaded', function() {
	elem_benvoyer.addEventListener("click", envoitext, false);
});

// listener zonetextmessage
document.addEventListener('DOMContentLoaded', function() {
	elem_zonetextmessage.addEventListener("onchange", onchangetext, false);
});

// listener buttons choixgroupe
document.addEventListener('DOMContentLoaded', function() {
	var elem_buttongroupe = document.getElementById("buttongroup1");
	elem_buttongroupe.addEventListener("click", choixgroupe, false);
});

// //listener input file
// document.addEventListener('DOMContentLoaded',function () {
// elem_imagefile.addEventListener("onchange",onFileSelected,false);
// });

function envoitext() {
	
}

function choixgroupe() {
}

function onchangetext() {
	if (elem_zonetextmessage.value != null) {		
		elem_benvoyer.disabled = false;
	} else {
		alert("veuillez Taper un message !!")
		elem_benvoyer.disabled = true;
	}
}

// //inserer l'emoticon
// function insereremoticon(monimage) {
// var oImg = document.createElement("IMG");
// oImg.id = "imgchild";
// oImg.height = "16";
// oImg.width = "16";
// oImg.src = monimage.src;
// var elem_montext = document.getElementById("zonetextmessage");
// var childtext = document.createTextNode(elem_montext);
// oImg.appendChild(childtext);
// elem_montext.appendChild(oImg);
// }

// //fonction insertion image
// function onFileSelected() {
// elem_pathfile.value = elem_imagefile.value;
// }

// //choix aléatoire d'une couleur
// var monumcouleur = Math.floor((Math.random() * 9999) + 1);
// macouleur = "#FF" + monumcouleur;
