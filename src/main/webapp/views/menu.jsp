

<!-- taglibs a inclure dans toutes les pages -->
<%@include file="/views/taglibs.jsp"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Page Menu</title>
<link rel="stylesheet" type="text/css" href="css/index.css">
</head>
<body>
	<header>
		<div id="logoEnTete">
			<a href="index"><img
				src="images/isotype_logo_openOutings_1.6.1_52x52_petitLogoEnTete.png"
				title="Page d'Accueil" /></a>
		</div>
		<div id="BoutonMenuEnTete">
			<a href="index"><img
				src="images/icone mainMenu_60x60orange_EnTete_close.png" /></a>
		</div>
	</header>

	<div class="parent">
		<H1 class="menu" id="ilienRechEvt">
			<a href="findEvent">RECHERCHE EVENEMENTS</a>
		</H1>
		<H1 class="menu" id="ilienCreationEvt">
			<a href="createEvent">CREATION EVENEMENT</a>
		</H1>
		<H1 class="menu" id="ilienProfil">
			<a href="editprofilmembre">MON PROFIL</a>
		</H1>
		<H1 class="menu" id="ilienOutters">
			<a href="rechercheUserGroupe">OUTTERS</a>
		</H1>
		<H1 class="menu" id="ilienCreationGrp">
			<a href="groupe">CREATION GROUPE</a>
		</H1>
		<h1 class="menu" id="ilienMessagerie">
			<a href="messagerie">MESSAGERIE</a>
		</h1>
	</div>

	<footer>
		<!-- pied de page a inclure dans les pages -->
		<%@include file="/views/footer.jsp"%>
	</footer>
</body>

</html>