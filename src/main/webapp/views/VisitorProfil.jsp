<!-- taglibs a inclure dans toutes les pages -->
<%@include file="/views/taglibs.jsp"%>

<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Open Outings</title>
    <link rel="stylesheet" type="text/css" href="css/profilVisiteur.css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
</head>

<body>
    <header>
        <div id="logoEnTete">
            <a href="index.html"><img src="images/isotype_logo_openOutings_1.6.1_52x52_petitLogoEnTete.png" title="Page d'Accueil" /></a>
        </div>
        <div id="marecherche" title="Rechercher">
            <a href="rechercheEvent.html">
                <img src="images/iconeMainMenu_loupe_EnTete_orange32x32.png" /></a>
            <input type="search" id="zonerecherche" title="Votre recherche ici...">
            <a href="signIn.html"><input type="button" id="bconnexion"></a>
            <a href="signUp.html"><input type="button" id="binscription"></a>
        </div>
        <div id="BoutonMenuEnTete">
            <a href="menu.html"><img src="images/iconeMainMenu_60x60orange_EnTete.png" title="Accéder au menu" /></a>
        </div>
    </header>

    <div id="bodyContainer">

        <div id="bodyLeft">
            <input type="radio" class="radio" name="progress" value="five" id="five">
            <label for="five" class="label">5%</label>

            <input type="radio" class="radio" name="progress" value="twentyfive" id="twentyfive" checked>
            <label for="twentyfive" class="label">25%</label>

            <input type="radio" class="radio" name="progress" value="fifty" id="fifty">
            <label for="fifty" class="label">50%</label>

            <input type="radio" class="radio" name="progress" value="seventyfive" id="seventyfive">
            <label for="seventyfive" class="label">75%</label>

            <input type="radio" class="radio" name="progress" value="onehundred" id="onehundred">
            <label for="onehundred" class="label">100%</label>

            <div class="progress">
                <div class="progress-bar"></div>
            </div>
            <div class="navi">
                <ul>
                    <li id="pseudo"><a  href="">PSEUDO</a></li>
                    <li id="age"><a  href="">AGE</a></li>
                    <li id="ville"><a href="">VILLE</a></li>
                    <li>
                </ul>
            </div>

            <ul id="liste" class="drop">
                <li><a href="#">CENTRES d'INTERETS</a>
                    <ul>
                        <li><a href="#">SPORT</a></li>
                        <li><a href="#">CULTURE</a></li>
                        <li><a href="#">SORTIE</a></li>
                    </ul>
                </li>
            </ul>

           <div id="boutonGroup">
                <a href="groupe.html"> <button id="buttongroup1" title="bowling"> </button></a>
                <button id="buttongroup2" title="Restaurant"></button>
                <button id="buttongroup3" title="Cinema"></button>
            </div>


        </div>
        <div id="bodyCenter">

            <figure class="description">
               
                <figcaption>
                    <img src="images/the-big-lebowski-white-russian.jpeg" alt="picprofil" class="profile" />
                    <h2>MON PROFIL </h2>
                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. In blandit tincidunt orci tempor gravida. Nulla ac lectus ut metus tempor imperdiet. Fusce maximus dignissim neque, ut placerat nisl pellentesque ac. Suspendisse volutpat at massa quis malesuada. Cras sed pulvinar erat, et aliquam nisi. Proin vitae est velit. </p>

                </figcaption>
            </figure>
            <div id="buttonContact">
                <a href="Messaging.html">Me CONTACTER</a>
            </div>



        </div>

        <div id="bodyRight">
            <aside>
                <div class="artwork">

                    <h2>EVENTS</h2> <br />
                    <class="crop"><a href="eventdetailAfter.html"/></a><img id="img5" onclick="affiche(this)" src="" alt="description" title="event 1"></class>
                        <class="crop"> <a href="eventdetailAfter.html" /></a><img id="img5" onclick="affiche(this)" src="" alt="description" title="event 2"></class>
                            <class="crop"><a href="eventdetailAfter.html" /></a> <img id="img5" onclick="affiche(this)" src="" alt="description" title="event 3"></class>
                                <class="crop"><a href="eventdetailAfter.html" /></a> <img id="img5" onclick="affiche(this)" src="" alt="description" title="event 5"></class>

                </div>
            </aside>
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
