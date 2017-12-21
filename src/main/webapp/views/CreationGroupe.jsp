<%@include file="/views/taglibs.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Creation Groupe</title>
 <link rel="stylesheet" type="text/css" href="css/creationGroupe.css">
</head>
<body>
	<header>
		<%@include file="/views/MenuHeader.jsp"%>
	</header>
	<div id="bodyContainer">

		<div id="bodyLeft">
			<div class="parent">
			<select id="iChoixEdit" name="iChoixEdit" onchange="updateGroup(this.value)">
						<option value="Menu">MENU</option>
						<option value="Modifier">Modifier</option>
						<option value="Supprimer">Supprimer</option>
				</select>
				<input type="button" name="valide suppression" value="valider suppression"  onclick=" document.deleteGroup.submit();"
				id="deletButton" />
				<form action="deleteGroup" name="deleteGroup">
				<input id="ciblIdGroup" placeholder="id" name="ciblIdGroup" value="${groupe.idGroup}"
					type="hidden" size="20"> 
				</form>
				
				
				<select id="iChoixTheme" name="iChoixTheme">
						<option><c:out value="${groupe.interests}" />
							</option>
							<option></option>
							
				</select>
				<input id="txtCiblTheme"  name="txtCibltheme"
					value="${interest}" type="text" size="20">
				<select id="iChoixLieux" name= "iChoixTheme">
							<option><c:out value="${groupe.geographicalArea.nameArea}" />
							</option>
								<option></option>
				</select>
				<input id="txtCiblLieux" name="txtCiblLieux"
					value="${groupe.geographicalArea.nameArea}" type="text" size="20">
			</div>
		</div>
		<div id="bodyCenter">
			<input type="search" id="nomGroupe"
				title="saisissez votre nom de groupe.." value="${groupe.nameGroup}">
			<img src="images/sportPlanSportPlanLarge1.jpg" id="imageProfil">
			<input type="button" name="ajout" value="Ajouter photo"
				id="ajoutPhotoBoutton" />

			<div id="contentCenter">
				<div id="content">
					<div class="title" id="titreDescription"><br />Description</div>
					<textarea rows="10" cols="50" id="pDescription">${groupe.descriptionGroup}</textarea>
				</div>
	<div id="divForm">
		<form action="modifGroupe" name="modifGroup">
			<input id="txtCiblNomGroup" placeholder="nom" name="txtCiblNomGroup" value=""
					type="hidden" size="20"> 
					<input id="ciblIdGroup" placeholder="id" name="ciblIdGroup" value="${groupe.idGroup}"
					type="hidden" size="20"> 
					<input id="ciblInterest" placeholder="Interest" name="ciblInterest" value=""
					type="hidden" size="20"> 
					<input id="ciblLieux" placeholder="lieux" name="ciblLieux" value=""
					type="hidden" size="20"> 
				<input id="ciblDescr" placeholder="descr" name="ciblDescr" value=""
					type="hidden" size="140"> 
				
			<input type="button" name="valider" value="Valider"  onclick="getInfo(); document.modifGroup.submit();"
				id="vBoutton" />
				</form>

				</div>
				<div id="content2">
					<span class="title" id="titleContent2">MEMBRES<img id="imagePlus"
						src="images/005-rounded-add-button-red.png" />
					</span>
					<c:forEach var="person" items="${persons}">
							<span><img class="iconProfil"
						src="images/006-social-2-red.png" />${person.pseudoUser}</span>
						</c:forEach> 
				</div>
			
			</div>
			
		</div>

		<div id="bodyRight">
			<img src="images/sport8.jpg" /> <img src="images/goOut4.jpg" /> <img
				src="images/sport7.jpg" /> <img src="images/culture4.jpg" />
		</div>
		<div id="bodyRight2">
			<img src="images/culture3.jpg" /> <img src="images/sport6.jpg" /> <img
				src="images/sport5.jpg" /> <img src="images/goOut1.png" />
		</div>

	</div>
	<script type="text/javascript"
		src="script/creationGroup.js"></script>
	<footer>
		<%@include file="/views/footer.jsp"%>
	</footer>
</body>

</html>