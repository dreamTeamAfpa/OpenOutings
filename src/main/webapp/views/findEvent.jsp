<!-- taglibs a inclure dans toutes les pages -->
<%@include file="/views/taglibs.jsp"%>
<head>
<title>Open Outings</title>
<link rel="stylesheet" type="text/css" href="css/rechercheEvent.css">
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

	<div id="bodyContainer">
		<div id="bodyLeft">
			<img src="images/sport1.jpg" /> <img src="images/goOut1.png" /> <img
				src="images/culture1.jpg" /> <img src="images/culture2.jpg" />
		</div>

		<div id="bodyCenter">
			<!-- Sélection des items pour filtrer les événements -->
			<div class="parent">
				<select id="iChoixLieux">
					<option value="Lieux">choix du lieu</option>
					<c:forEach var="myGeo" items="${geo}">
						<option value="${myGeo.nameArea}"><c:out
								value="${myGeo.nameArea}" />
						</option>
					</c:forEach>
				</select> <input type="date" class="datePicker" name="dateEvenement"
					id="iChoixDate"> <select id="iChoixThemes">
					<option value="Themes">choix du thème</option>
					<c:forEach var="theme" items="${themes}">
						<option><c:out value="${theme.nameTheme}" />
						</option>
					</c:forEach>
				</select> <br /> <input type="button" name="valider" value="Valider"
					id="vBoutton">
			</div>
			<!-- Affichage des événements -->
			<div class="content">
				<span class="titleMain"><c:forEach var="event"
						items="${events}">
						<option value="${event.getIdEvent()}"><c:out
								value="${event.getTitleEvent()}" /></option>
					</c:forEach> </span>
			</div>
		</div>
		<div id="bodyRight">
			<img src="images/sport7.jpg" /> <img src="images/culture3.jpg" /> <img
				src="images/sport6.jpg" /> <img src="images/culture1.jpg" />
		</div>

	</div>

	<script src="https://code.jquery.com/jquery-3.2.1.js"></script>
	<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	<script src="script/index.js"></script>
	<footer>
		<%@include file="/views/footer.jsp"%>
	</footer>
</body>

</html>