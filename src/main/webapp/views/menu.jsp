
<!-- taglibs a inclure dans toutes les pages -->
<%@include file="/views/taglibs.jsp"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Page Menu</title>
 <link rel="stylesheet" type="text/css" href="css/menu.css">
</head>
<body>
	<header>
            <div id="logoEnTete"><img src="images/isotype_logo_openOutings_1.6.1_52x52_petitLogoEnTete.png" title="Page d'Accueil"/></div>

            <div id="marecherche" title="Rechercher">
                <img src="images/iconeMainMenu_loupe_EnTete_orange32x32.png" />
                <input type="search" id="zonerecherche" title="Votre recherche ici...">
            </div>
            <div id="BoutonMenuEnTete">
                <a href="page_acceuil"><img src="images/icone mainMenu_60x60orange_EnTete_close.png" /></a>
            </div>

    </header>
	<div class= "parent">
        <H1 class="menu" id="ilienRechEvt"><a href="page_recherche_evtV1.4.html">RECHERCHE EVENEMENTS</a></H1>
        <H1 class="menu" id="ilienCreationEvt"><a href="page_creation_evt">CREATION EVENEMENT</a></H1>
		<H1 class="menu" id="ilienProfil" ><a href="page_edit_profil">MON PROFIL</a></H1>
		<H1 class="menu" id="ilienOutters"><a href="page_recherche_userV1.3.html">OUTTERS</a></H1>
		<H1 class="menu" id="iliengroupe"><a href="page_recherche_groupe">GROUPES OUTTERS</a></H1>
		<H1 class="menu" id="ilienCreationGrp"><a href="creation_groupeV1.2.html">CREATION GROUPE</a></H1>
        <h1 class="menu" id="ilienMessagerie"><a href ="page_messagerie">MESSAGERIE</a></h1>
		

	</div>

<footer>
		<!-- pied de page a inclure dans les pages -->
		<%@include file="/views/footer.jsp"%>
	</footer>
</body>
</html>