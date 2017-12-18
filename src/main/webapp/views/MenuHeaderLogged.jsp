<!-- taglibs a inclure dans toutes les pages -->
<%@include file="/views/taglibs.jsp"%>
<div id="logoEnTete">
	<a href="index.html"><img
		src="images/isotype_logo_openOutings_1.6.1_60x60_petitLogoEnTete.png"
		title="Page d'Accueil" /></a>
</div>
<div id="marecherche" title="Rechercher">
	<p>
		<img src="images/iconeMainMenu_loupe_EnTete_orange32x32.png" /> <input
			type="search" id="zonerecherche" title="Votre recherche ici...">
	</p>
	<div id="divbdeconnexion">
	<a href="signIn"><button id="bdeconnexion"  title="Déconexion">DECONNEXION</button></a>
	</div>
	<div id="divbprofil">
		<a href="editprofilmembre"><button id="bprofil"
				title="Edition profil" /></button>
				<!-- Username --> 
			<br>${personSession.pseudoUser}</a>
	</div>
</div>
<div id="BoutonMenuEnTete">
	<a href="menu"><img
		src="images/icone mainMenu_60x60orange_EnTete.png"
		title="Accéder au menu" /></a>
</div>