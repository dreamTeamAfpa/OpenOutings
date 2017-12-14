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
	<form action="addEvent">
		<div id="titleEventEdit">
			<div id="zoneEventTitle">
				<h2>Création d'évenement</h2>
				<div class="part">
					<input type="text" id="eventTitle"
						title="donner un titre à votre sortie"
						placeholder="Nom de la sortie">
				</div>
				<div id="eventImg">
					<img src="images/022-crowd-of-users-red-60x60.png">
				</div>
			</div>
				<div id="eventEdit">
					<div id="bodyLeft">
						<div class="part">
							Choisissez le thème de l'activité <br />
							<select id="iChoixTheme">
									<option value="Themes">choix du thème</option>
									<c:forEach var="theme" items="${themes}">
										<option><c:out value="${theme.nameTheme}" />
										</option>
									</c:forEach>
							</select> <br /> <br /> Nombre de Participants maximum <br /> <input
								type="number" id="eventMaxOuters"> <br /> <br />
							<select id="iChoixEdit" value="MENU">
									<option value="Menu">MENU</option>
									<option value="Modifier">Modifier</option>
									<option value="Supprimer">Supprimer</option>
							</select> <br /> <br />


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
							<fieldset id="eventDescription" contenteditable="true">
								<legend>DESCRIPTION </legend>
								<br />
							</fieldset>

							<div class="part"></div>

							<div class="part">
								OÙ ?
										<select id="iChoixLieux">
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
									<p>Quand ?</p>
									<input type="date" class="datePicker" name="eventDate">

									<br />
								</div>
								<div class="part">
									<p>A partir de quelle heure ?</p>
									<input type="time" name="eventTime"> <br />
								</div>
								<br />
							</div>
							<div id="validate">
								<input type="button" class="eventButton" value="Valider"
									id="createEvent"> <span></span> <input type="button"
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
	<script src="script/index.js"></script>
		<footer>
		<%@include file="/views/footer.jsp"%>
	</footer>
</body>
</html>