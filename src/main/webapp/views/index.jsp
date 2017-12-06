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
		<!-- Menu header -->
		<%@include file="/views/MenuHeader.jsp"%>
	</header>

	

 <div id="grandlogo"> <img src="images/logo_openOutings_1.6.1.png" /> </div>
    <div id="titrelogo">Open Outings</div>
    <div id="contener">
        <div>
            <a href="createEvent"><input type="button" id="bPROPOSER" title="Proposer une sortie !" /></a>
           
        </div>
        <div>
            <a href="findEvent"><input type="button" id="bTROUVER" title="Trouver une sortie !" /></a>
            
        </div>
    </div>
    
<!--     corps de page
	<div id="grandcontener">
		bloc de gauche
		<div id="leftcontener"></div>

		bloc central
		<div id="centralcontener"></div>

		bloc de droite
		<div id="rightcontener"></div>

	</div> 
-->

	<footer id="citation">
		"Le bonheur est la seule chose qui se multiplie quand il se partage."
		<br />Paulo Cuelho
		<!-- pied de page a inclure dans les pages -->
		<%@include file="/views/footer.jsp"%>
	</footer>
</body>
</html>