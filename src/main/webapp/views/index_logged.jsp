<!-- taglibs a inclure dans toutes les pages -->
<%@include file="/views/taglibs.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/index.css" />
<title>Accueil Open Outings</title>
</head>
<body>
	<header>
		<%@include file="/views/MenuHeaderLogged.jsp"%>
	</header>
	
	<div id="grandlogo">
		<img src="images/logo_openOutings_1.6.1.png" />
	</div>
	<div id="titrelogo">Open Outings</div>
	<div id="contener">
		<div>
			<a href="createEvent"><button id="bPROPOSER"
					title="Proposer une sortie !"></button></a>
		</div>
		<div>
			<a href="rechercheEvent"><button id="bTROUVER"
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