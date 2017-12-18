
var elem_zonetextmessage = document.getElementById("zonetextmessage");
var elem_benvoyer = document.getElementById("benvoyer");

//listener boutton envoyer
document.addEventListener('DOMContentLoaded', function () {
elem_benvoyer.addEventListener("click", envoitext, false);
});
//listener zonetextmessage
document.addEventListener('DOMContentLoaded', function () {
var elem_zonetextmessage = document.getElementById("zonetextmessage");
elem_zonetextmessage.addEventListener("onchange", envoitext, false);
}

//listener buttons choixgroupe
document.addEventListener('DOMContentLoaded',function () {
	var elem_buttongroupe = document.getElementById("buttongroup1");
	elem_buttongroupe.addEventListener("click",choixgroupe,false);
});

function choixgroupe() {
//	elem_benvoyer.
}

//inserer l'emoticon
function insereremoticon(monimage) {
    var oImg = document.createElement("IMG");
    oImg.id = "imgchild";
    oImg.height = "16";
    oImg.width = "16";
    oImg.src = monimage.src;
    var elem_montext = document.getElementById("zonetextmessage");
    var childtext = document.createTextNode(elem_montext);
    oImg.appendChild(childtext);
    elem_montext.appendChild(oImg);
}


//fonction insertion image
function inserimage(monimage) {
    var oImg = document.createElement("img");
    oImg.setAttribute("scr", monimage.value);
    oImg.setAttribute("id", "imgchild");
    oImg.height = "80";
    oImg.width = "80";   
    var elem_montext = document.getElementById('zonetextmessage');
    var childtext = document.createTextNode(elem_montext);
    oImg.appendChild(childtext);
    elem_montext.appendChild(oImg);
}

//choix aléatoire d'une couleur
//function choisircouleur() {
//    var monumcouleur = Math.floor((Math.random() * 9999) + 1);
//    macouleur = "#FF" + monumcouleur;
//}