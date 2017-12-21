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
	<noscript>
		<h2>Sorry! Your browser doesn't support Javascript</h2>
	</noscript>
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
			<img id="uploadedImage" name="uploadedImage" />
<!-- 			<form method="post" action="uploadFile" enctype="multipart/form-data"
				enctype="multipart/form-data">
				<input id="imagefile" name="imagefile" type="file"
					onchange="onFileSelected()" accept="image/*" /> <input
					type="submit" value="Envoyer Image">
			</form> -->

			<form action="sendmessage" method="post">
				<input type="text" name="zonetextmessage" id="zonetextmessage"
					onchange="onchangetext()"/>
					<input type="submit" class="Bbump" id="benvoyer" value="Envoyer" disabled="disabled" />
			</form>

		</div>
		<div id="rightcontener">
			<span>HISTORIQUE DE CONVERSATION</span>
			<div id="zonetexthistorique">

				<c:forEach var="message" items="${messagehistory}">

					<c:if
						test="${message.person.getPseudoUser().equals(personSession.getPseudoUser())}">
						<div id="mybullediscut">
							<strong><c:out value="Vous - " /></strong>
							<c:out value="${message.localdatetime}" />
							<br>
							<i>"<c:out value="${message.messagetxt}" />"</i>
						</div>
					</c:if>
					<c:if
						test="${!message.person.getPseudoUser().equals(personSession.getPseudoUser())}">
						<div id="bullediscut">
						<strong><c:out value="${message.person.getPseudoUser()} - " /></strong>
							<c:out value="${message.localdatetime}" />
							<br>
							<i>"<c:out value="${message.messagetxt}" />"</i>
						</div>
					</c:if>



				</c:forEach>
			</div>
		</div>
	</div>

	<footer> </footer>
	<script src="script/Messaging.js"></script>

</body>

</html>
