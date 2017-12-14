<!-- taglibs a inclure dans toutes les pages -->
<%@include file="/views/taglibs.jsp"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/index.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/messaging.css" />
<title>Messagerie Open Outings</title>
</head>
<body>
	<header>
		<%@include file="/views/MenuHeaderLogged.jsp"%>
	</header>
	<div id="grandcontener">
		<div id="leftcontener">
			<div id="boutonGroup">
				<button id="buttongroup1"></button>
				<button id="buttongroup2"></button>
				<button id="buttongroup3"></button>
			</div>
			<span id="outers">OUTERS : <span>XX</span></span>
			<div id="affichageListeUser">
				<a href=""><img src="images/006-social-2-red.png"
					id="photoProfil" />Jean<br /></a> <a href=""><img
					src="images/006-social-2-red.png" id="photoProfil" />Pierrette<br /></a>

			</div>
		</div>
		<div id="centralcontener">
			<div id="affichageUser">
				UserName<span><img src="images/006-social-2-red.png"
					id="photoProfil" /></span>
			</div>

			<div id="zonetextmessage" contenteditable="true"></div>
			<div id="mesemoticons">
				<img id="tete1" src="images/Chocked.png" alt="Chocked"
					title="Chocked" ONCLICK="insereremoticon(this)"> <img
					id="tete2" src="images/Smyle.png" alt="Smyle" title="Smyle"
					ONCLICK="insereremoticon(this)"> <img id="tete3"
					src="images/Hurt.png" alt="Hurt" title="Hurt"
					ONCLICK="insereremoticon(this)"> <img id="tete4"
					src="images/Sunglasses.png" alt="Sunglasses" title="Sunglasses"
					ONCLICK="insereremoticon(this)"> <img id="tete5"
					src="images/Cry.png" alt="Cry" title="Cry"
					ONCLICK="insereremoticon(this)"> <img id="tete5"
					src="images/Lovekiss.png" alt="Lovekiss" title="Lovekiss"
					ONCLICK="insereremoticon(this)">

			</div>
			<ul id="nav">
				<li><a href="#">
						<button id="bjoindre" title="joindre fichier"></button>
				</a>
					<ul>
						<li><input type="file" name="fichier" accept="image/*"
							onChange="inserimage(this)" /></li>
					</ul></li>
			</ul>
			<input type="button" id="benvoyer" value="Envoyer" />
		</div>

		<div id="rightcontener">
			<span>HISTORIQUE DE CONVERSATION</span>
			<div id="zonetexthistorique"></div>
		</div>
	</div>


	<footer> </footer>
</body>
<script src="script/Messaging.js"></script>
</html>
