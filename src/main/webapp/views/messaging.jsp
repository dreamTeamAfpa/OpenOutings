<!-- taglibs a inclure dans toutes les pages -->
<%@include file="/views/taglibs.jsp"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/messaging.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/index.css" />
<title>Messagerie Open Outings</title>
</head>
<body>
	<header>
		<%@include file="/views/MenuHeaderLogged.jsp"%>
	</header>
	<div id="grandcontener">
		<div id="leftcontener">
			<span>VOS GROUPES : <span>${nbgroupe}</span></span>
			<div id="boutonGroup">
				<form method="post" action="choixgroupe">
					<c:forEach var="groupe" items="${listGroupeUser}">
						<input type="submit" class="buttongroup1" id="buttongroup1"
							name="nomgroupe" title="${groupe.nameGroup}"
							value="${groupe.nameGroup}">
					</c:forEach>
				</form>
			</div>
			<span>OUTERS : <span>${nbperson}</span></span>
			<div id="affichageListeUser">
				<form method="post" action="choixperson">
					<c:forEach var="person" items="${listUserGroupe}">
						<input type="submit" class="buttonperson" name="nomgroupe"
							title="${person.pseudoUser}" value="${person.pseudoUser}">
					</c:forEach>
				</form>
			</div>
		</div>
		<div id="centralcontener">

			<div id="affichageUser">
				<a href="profiluser"> <!-- Username and Profil's picture --> <img
					src="images/006-social-2-red.png" id="photoProfil" /> <br>
					${personSession.pseudoUser}
				</a>
			</div>
			<form action="sendmessage" method="post">
				<input type="text" name="zonetextmessage" id="zonetextmessage">
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
							<button class="Bbump" id="bjoindre" title="joindre fichier"></button>
					</a>
						<ul>
							<li><input type="file" name="fichier" accept="image/*"
								onChange="inserimage(this)" /></li>
						</ul></li>
				</ul>
				<input type="submit" class="Bbump" id="benvoyer" value="Envoyer" />
			</form>
		</div>
		<div id="rightcontener">
			<span>HISTORIQUE DE CONVERSATION</span>
			<div id="zonetexthistorique">
				<c:forEach var="message" items="${messagehistory}">
					<div class="bullediscut" id="bullediscut">
						<c:out value="${message.localdatetime}"/><br>
						<c:out value="${message.messagetxt}" />
					</div>
				</c:forEach>
			</div>
		</div>
	</div>


	<footer> </footer>
</body>
<script src="script/Messaging.js"></script>
</html>
