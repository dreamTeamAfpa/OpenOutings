document.getElementById('txtCiblTheme').style.visibility = "hidden";
document.getElementById('txtCiblLieux').style.visibility = "hidden";
document.getElementById('deletButton').style.visibility = "hidden";
document.getElementById('pDescription').disabled = true;

	
function updateGroup(mode){
	if (mode =="Modifier"){
			console.log("modif");
			document.getElementById('pDescription').disabled = false;
			document.getElementById('txtCiblTheme').style.visibility = "visible";
			document.getElementById('txtCiblLieux').style.visibility = "visible";
			document.getElementById('iChoixTheme').style.visibility = "hidden";
			document.getElementById('iChoixLieux').style.visibility = "hidden";
	}else if (mode ="Supprimer"){
		document.getElementById('deletButton').style.visibility = "visible";
		console.log("suppr");
	}else if (mode ="MENU"){
		console.log("rien");
	}
}

function getIdGroup(id){
	document.getElementById('txtCibl').value = id;
}
function getInfo(){
	document.getElementById('ciblInterest').value = document.getElementById('txtCiblTheme').value ;
	document.getElementById('ciblLieux').value = document.getElementById('txtCiblLieux').value ;
	document.getElementById('ciblDescr').value = document.getElementById('pDescription').value ;
	document.getElementById('txtCiblNomGroup').value = document.getElementById('nomGroupe').value ;
	
	
}