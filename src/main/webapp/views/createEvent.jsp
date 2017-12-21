<!-- taglibs a inclure dans toutes les pages -->
<%@include file="/views/taglibs.jsp"%>
<html>
<head>
<title>Open Outings</title>
<link rel="stylesheet" type="text/css" href="css/createEvent.css">
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link href="https://fonts.googleapis.com/css?family=Montserrat"
	rel="stylesheet">
</head>
<body>
	<header>
		<!-- Menu header -->
		<%@include file="/views/MenuHeader.jsp"%>
	</header>

	<!-- <form class="form" method="post" action="inscription">
	<label for="username">Nom d'utilisateur</label> <br> <input
		type="text" id="username" name="username"> <br> <label
		for="password">Mot de passe</label> <br> <input
		type="password" id="password" name="password"> <br> <label
		for="passwordVerif">Confirmer mot de passe</label> <br> <input
		type="password" id="passwordVerif" name="passwordVerif"> <br>
	<label for="password">Adresse email</label> <br> <input
		type="email" id="email" name="email"> <br>
	<button type="submit" id="connectBtn">S'inscrire</button>
</form> -->
	<div id="bodyContainer">
		<form action="addEvent" id="menuEvent" method="post">
			<input type="hidden" id="idEvent" value="${event.idEvent}"/>
			<select id="iChoixEdit">
				<option value="Menu">MENU</option>
				<option value="Creer">Nouvel Evénement</option>
				<option value="Modifier">Modifier</option>
				<option value="Supprimer">Supprimer</option>
			</select> <br /> <br />
			<div id="titleEventEdit">

				<div id="zoneEventTitle">
					<h2>
						Evénement <br />
						<br />
					</h2>

					<div class="part">
						<input type="text" name="titleEvent" id="eventTitle" title="donner un titre à votre sortie"
							value="<c:out value='${event.titleEvent}' default='Entrez le titre de la sortie'/>" onFocus='value=""' >
					</div>
					<div id="eventImg">
						<img src="images/022-crowd-of-users-red-60x60.png">
					</div>
				</div>
				<div id="eventEdit">
					<div id="bodyLeft">

						<div class="choices">
							<div class="part">
							Thème <br /> <select name="iChoixTheme" id="iChoixTheme">
								<option value="Themes">choix du thème</option>
								<c:forEach var="theme" items="${themes}">
									<option value=<c:out value="${theme.nameTheme}" />><c:out value="${theme.nameTheme}" />
									</option>
								</c:forEach>
							</select> <br /> 
							</div>
							<div class="part">
								Lieu <br />
								<select id="iChoixLieux" name="iChoixLieux">
									<option value="Lieux">choix du lieu</option>
									<c:forEach var="myGeo" items="${geo}">
										<option value="${myGeo.nameArea}"><c:out
												value="${myGeo.nameArea}" />
										</option>
									</c:forEach>
								</select>
							</div>
							<div id="eventTiming">
								<div class="part">
									<p>Date</p>
									<input type="date" class="datePicker" id="eventDate"> <br />
								</div>
								<div class="part">
									<p>Heure</p>
									<input type="time" id="eventTime"> <br />
								</div>
								<br />
							</div>
							<br /> <br />Participants maximum <br /> <input type="number"
								id="eventMaxOuters" name="maxParticipants"> <br /> <br />
						</div>
					</div>

					<div id="bodyCenter">
						<div id="imageEvent">
							<div class="roundCornerPics">
								<img src="images/chasseAuxPapillons.jpg" id="imageEvent">
							</div>
							<input type="button" name="ajout" value="Ajouter photo"
								id="ajoutPhotoBoutton" />
						</div>
						<div id="contentCenter">
							<fieldset id="eventDescription" var="${eventDescription}" name="eventDescription" class="part">
								<legend>Petite description </legend>
								<br />
								<c:out value="${event.resumeEvent}" />
							</fieldset>
							<fieldset id="eventDetails" class="part">
								<legend>Details </legend>
								<br />
								<c:out value="${event.detailsEvent}" />
							</fieldset>
							<div class="part"></div>
							<div id="validate">
								<input type="submit" class="eventButton" value="Valider"> <span></span> 
								<input type="button"
									class="eventButton" value="Annuler" id="cancel">
							</div>
						</div>
					</div>
				</div>
			</div>
		</form>
		<div id="bodyRight">
			<img src="images/sport8.jpg" /> <img src="images/goOut4.jpg" /> <img
				src="images/sport7.jpg" /> <img src="images/culture4.jpg" />
		</div>
	</div>
	<script src="https://code.jquery.com/jquery-3.2.1.js"></script>
	<!-- <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script> -->
	<script src="script/event.js"></script>
	<footer>
		<%@include file="/views/footer.jsp"%>
	</footer>
</body>
</html>