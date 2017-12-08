<!-- taglibs a inclure dans toutes les pages -->
<%@include file="/views/taglibs.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<header>
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
			<a href="signIn.html"><button id="bdeconnexion">DECONNEXION</button></a>
			<a href="editprofilmembre.html"><button id="bprofil"></button></a>
		</div>
		<div id="BoutonMenuEnTete">
			<a href="menu.html"><img
				src="images/icone mainMenu_60x60orange_EnTete.png"
				title="Accéder au menu" /></a>
		</div>
	</header>
	<div id="grandlogo">
		<img src="images/logo_openOutings_1.6.1.png" />
	</div>
	<div id="titrelogo">Open Outings</div>
	<div id="contener">
		<div>
			<a href="create-event.html"><button id="bPROPOSER"
					title="Proposer une sortie !"></button></a>
		</div>
		<div>
			<a href="rechercheEvent.html"><button id="bTROUVER"
					title="Trouver une sortie !"></button></a>
		</div>
	</div>

	<footer id="citation">
		"Le bonheur est la seule chose qui se multiplie quand il se partage."
		<br />Paulo Cuelho
		<!-- pied de page a inclure dans les pages -->
		<%@include file="/views/footer.jsp"%>
	</footer>
</body>
</html>