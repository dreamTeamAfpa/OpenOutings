var monheure;

//listener boutton envoyer
document.addEventListener('DOMContentLoaded', function () {
var elem_benvoyer = document.getElementById("benvoyer");
elem_benvoyer.addEventListener("click", envoitext, false);
});

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

//envoi le text dans la partie tchat
function envoitext() {
    var montextentier;
    var elem_montext = document.getElementById("zonetextmessage");
    zonetextmessage = elem_montext.innerHTML;
    if (zonetextmessage != "") {
        montime();
        montextentier = monheure + " -- moi : " + zonetextmessage;
        var elem_montextdarrivee = document.getElementById("montextdarrivee");
        var newDIV = document.createElement("DIV");
        newDIV.name = "childDivName";
        newDIV.innerHTML = montextentier;
        monExemplaire.appendChild(newDIV);
    }
}

//check de l'heure actuelle
function montime() {
    var date = new Date();
    var heure = date.getHours();
    var minutes = date.getMinutes();
    if (minutes < 10)
        minutes = "0" + minutes;
    monheure = heure + "h" + minutes;
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