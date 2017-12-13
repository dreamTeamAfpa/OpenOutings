

<!-- taglibs a inclure dans toutes les pages -->
<%@include file="/views/taglibs.jsp"%>


<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Open Outings</title>
    <link rel="stylesheet" type="text/css" href="css/profilMembre2.css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
    <link rel="stylesheet" href="css/jquery.flexdatalist.min.css">
    
</head>

<body>
    <header>
            <div id="logoEnTete"><a href="index.html"><img src="images/isotype_logo_openOutings_1.6.1_60x60_petitLogoEnTete.png" title="Page d'Accueil" /></a></div>
            <div id="marecherche" title="Rechercher">
                <p><img src="images/iconeMainMenu_loupe_EnTete_orange32x32.png" />
                <input type="search" id="zonerecherche" title="Votre recherche ici...">
                </p>
                <a href="signIn.html"><button id="bdeconnexion">DECONNEXION</button></a>
                <a href="editprofilmembre.html"><button id="bprofil"></button></a>
            </div>
            <div id="BoutonMenuEnTete">
                <a href="menu.html"><img src="images/icone mainMenu_60x60orange_EnTete.png" title="Accéder au menu" /></a>
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
                    <li id="pseudo"><a target="_blank" href="">PSEUDO</a></li>
                    <li id="age"><a target="_blank" href="">AGE</a></li>
                    <li id="ville"><a target="_blank" href="">VILLE</a></li>
                    </ul>
                  
            </div>
              <a href="#">CENTRES d'INTERETS</a>
             <div id="searchbar">
        
            <form action="" class="formulaire">
			<input class="flexdatalist" type="text" name="recherche" list="listInterest"
				autocomplete="off" placeholder="Choisir int�r�t(s)" required data-min-length ="0" multiple ="multiple" data-selection-required='1'>
			<datalist  id="listInterest">
				
				<c:forEach var="interest" items="${interests}">
					<option value="${interest}"/></option> 	
					</c:forEach>	
					
			</datalist>
			
		</form>
		
		</div> 
	
		<input class="bouton" type="submit" value="valider" /><input
				type="reset" value="Effacer" id="reset" name="reset" />
            <div id="boutonGroup">
                <a href="groupe.html"><button id="buttongroup1" title="Bowling"></button></a>
                <button id="buttongroup2"></button>
                <button id="buttongroup3"></button>
            </div>


        </div>
        <div id="bodyCenter">
            <figure class="description">
                
                <figcaption>
                    <img src="" alt="picprofil" class="profile" />
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
                    <div id="zonehistorique">
                    <class="crop"><a href="eventdetailBefore.html" /></a><img id="img5" onclick="affiche(this)" src="" alt="description" title="event 1"></class>
                        <class="crop"> <a href="eventdetailBefore.html" /></a><img id="img5" onclick="affiche(this)" src="" alt="description" title="event 2"></class>
                            <class="crop"><a href="eventdetailBefore.html" /></a> <img id="img5" onclick="affiche(this)" src="" alt="description" title="event 3"></class>
                                <class="crop"><a  href="eventdetailBefore.html" /></a> <img id="img5" onclick="affiche(this)" src="" alt="description" title="event 4"></class>
                    </div>           
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

<script src="script/editProfilMembre.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery-flexdatalist/2.2.2/jquery.flexdatalist.js"></script>
<script src="https://code.jquery.com/jquery-3.2.1.js"></script>
<script src="script/jquery.flexdatalist.min.js"></script>
</body>

</html>
