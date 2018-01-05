<%@include file="/views/taglibs.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>recherche utilisateurs et groupes</title>
<link rel="stylesheet" type="text/css"
	href="css/rechercheUserGroupe.css">
</head>
<body>
	<header>
		<%@include file="/views/MenuHeader.jsp"%>
	</header>
	<div id="bodyContainer">

		<div id="bodyLeft">
			<img class="images" src="images/culture1.jpg" /> <img class="images"
				src="images/goOut1.png" /> <img class="images"
				src="images/sport1.jpg" /> <img class="images"
				src="images/goOut3.jpg" />
		</div>
		<div id="bodyLeft2">
			<img class="images" src="images/sport3.jpg" /> <img class="images"
				src="images/culture2.jpg" /> <img class="images"
				src="images/sport4.jpg" /> <img class="images"
				src="images/goOut2.jpg" />

		</div>
		<div id="bodyCenter">
			<div id="content">
				<c:forEach var="myGroup" items="${nameGroup}" varStatus="status">
					<span class="titleMain"><a
						href="CreationGroupe?idGroup=
						${myGroup.idGroup}"><c:out
								value="${myGroup.nameGroup} " /> <img id="imagePlus"
							src="images/022-crowd-of-users-red-60x60.png" /></a></span>
					<table>
						<c:forEach var="person" items="${myGroup.getUsersGroupe()}">
							<tr>
								<td><c:out value="${person.pseudoUser}" /></td>
							</tr>
						</c:forEach>

					</table>

				</c:forEach>
				<span class="titleMain"><a
					href="CreationGroupe?idGroup=
						${idOneGroup}"><c:out
							value="${nameOneGroup}" /> <c:set var="mode"
							value="${nameOneGroup}" /> <c:if test="${nameOneGroup!= null}">
							<img id="imagePlus" src="images/022-crowd-of-users-red-60x60.png" />
						</c:if></a></span> <span class="titleMain"><a
					href="UserProfil?idUser=
						${idOnePerson}"><c:out
							value="${nameOnePerson}" /> <c:set var="mode"
							value="${nameOnePerson}" /> <c:if test="${nameOnePerson!= null}">
							<img id="imagePlus" src="images/006-social-2-red.png" />
						</c:if></a></span>
			</div>
			<div class="parent">
				<form name="rechercheGroup" action="validFormGroup" method="post">
					<select name="iChoixLieux" id="iChoixLieux">
						<option value="noLieux">Lieux</option>
						<c:forEach var="myGeo" items="${geo}">
							<option><c:out value="${myGeo.nameArea}" />
							</option>
						</c:forEach>
					</select> <select name="iChoixGroupe" id="iChoixGroupe">
						<option value="noTheme">Themes</option>
						<c:forEach var="myInterest" items="${interests}">
							<option><c:out value="${myInterest.nameInterest}" />
							</option>
						</c:forEach>
					</select> <br /> <input type="text" name="pseudo"
						placeholder="Pseudo ou Details recherche" class="choix" /> <br />
				</form>
				<br /> <input type="button" name="valider" value="Valider"
					id="vBoutton" onclick="document.rechercheGroup.submit()" />
			</div>
		</div>
		<div id="bodyRight">
			<img src="images/culture4.jpg" /> <img src="images/sport8.jpg" /> <img
				src="images/goOut4.jpg" /> <img src="images/sport7.jpg" />
		</div>
		<div id="bodyRight2">
			<img src="images/culture3.jpg" /> <img src="images/sport6.jpg" /> <img
				src="images/sport5.jpg" /> <img src="images/goOut1.png" />
		</div>
	</div>
	<footer>
		<%@include file="/views/footer.jsp"%>
	</footer>
</body>
</html>