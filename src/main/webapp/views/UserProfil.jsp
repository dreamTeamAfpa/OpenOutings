

<!-- taglibs a inclure dans toutes les pages -->
<%@include file="/views/taglibs.jsp"%>


<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Open Outings</title>
<link rel="stylesheet" type="text/css" href="css/profilMembre2.css">
<link href="https://fonts.googleapis.com/css?family=Montserrat"
	rel="stylesheet">
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="css/jquery.flexdatalist.min.css">

</head>

<body>
	<header>
		<!-- include for have same headerlogged as logged on on profil page -->
		<%@include file="/views/MenuHeaderLogged.jsp"%>
	</header>

	<form action="profilmembre" id="formulaire"
		name="profilmembre">
		<div id="bodyContainer">

			<div id="bodyLeft">
				<aside>
					<input type="radio" class="radio" name="progress" value="five"
						id="five"> <label for="five" class="label">5%</label> <input
						type="radio" class="radio" name="progress" value="twentyfive"
						id="twentyfive" checked> <label for="twentyfive"
						class="label">25%</label> <input type="radio" class="radio"
						name="progress" value="fifty" id="fifty"> <label
						for="fifty" class="label">50%</label> <input type="radio"
						class="radio" name="progress" value="seventyfive" id="seventyfive">
					<label for="seventyfive" class="label">75%</label> <input
						type="radio" class="radio" name="progress" value="onehundred"
						id="onehundred"> <label for="onehundred" class="label">100%</label>

					<div class="progress">
						<div class="progress-bar"></div>
					</div>

					<div class="navi">
					
					<input type="hidden"
							name="id" id="id" type="text"
							value="${personSession.idUser}" 
							>
						<a>Genre</a> <abbr title="Ce champ est obligatoire">*</abbr> <br>

						<input type="radio" required name="titre" id="r1"
							value="${personSession.genderUser}"><label for="r1">Mr</label>
						<input type="radio" required name="titre" id="r2"
							value="${personSession.genderUser}"><label for="r2">Mme</label>
						<br> <label for="pseudo">PSEUDO</label><abbr
							title="Ce champ est obligatoire">*</abbr> <br> <input
							name="pseudo" id="pseudo" type="text"
							value="${personSession.pseudoUser}" name="pseudo"
							placeholder="Saisissez votre Pseudo" required pattern=".{3,}"
							title=" Minimum trois lettres "></input> <br> <label
							for="prenom">PRENOM</label> <abbr
							title="Ce champ est obligatoire">*</abbr> <input id="prenom"
							type="text" placeholder="Saisissez votre Prénom"
							autocomplete="off" required pattern=".{3,}"
							title=" Minimum trois lettres " name="prenom"
							value="${personSession.firstNameUser}"></input> <br> <a>NOM</a>
						<abbr title="Ce champ est obligatoire">*</abbr> <br> <input
							id="nom" type="text" name="nom" placeholder="Saisissez votre Nom"
							autocomplete="off" required pattern=".{3,}"
							title=" Minimum trois lettres "
							value="${personSession.lastNameUser}"></input> <br> <a>E-MAIL</a>
						<abbr title="Ce champ est obligatoire">*</abbr> <input id="email"
							type="email" id="email" disabled="disabled"
							placeholder="Saisissez votre E-mail" name='email'
							value="${personSession.emailUser}"></input> <br> <a>TELEPHONE</a>
						<input id="telephone" type="tel" disabled="disabled"
							placeholder="Saisissez  Téléphone" pattern="[0-9]{10}" name="telephone"
							value="0${personSession.phoneUser}"></input> <a>DATE DE
							NAISSANCE</a> <abbr title="Ce champ est obligatoire">*</abbr> <input
							type="date" class="datePicker" id="dateNaissance" name="dateNaissance" required
							value="${personSession.dobUser}"> <br> <a>VILLE
							(Code Postal)</a> <abbr title="Ce champ est obligatoire">*</abbr> <input
							class="flexdatalist" type="search" name="rechercheVille"
							id="ville" list="listLocation" autocomplete="off" required
							placeholder="Votre ville" data-min-length="0"
							data-selection-required='1' required
							value="${personSession.location}">
						<datalist id="listLocation">

							<c:forEach var="location" items="${locations}">
								<option value="${location}" /></option>
							</c:forEach>

						</datalist>
						<a>CENTRE(S) D'INTERET(S)</a> <input class="flexdatalist"
							type="text" name="rechercheInterêt" list="listInterest"
							id="interet" autocomplete="off" required data-min-length="0"
							multiple="multiple" data-selection-required='1'
							value="${personSession.interests}">
						<datalist id="listInterest">

							<c:forEach var="interest" items="${interests}">
								<option value="${interest}" /></option>
							</c:forEach>

						</datalist>

					</div>
				</aside>
			</div>


			<div id="bodyCenter">
				<figure class="description">

					<figcaption>

						<input type="file" name="fic" size=50 /> <input type="button"
							value="Envoyer" />

						<h2>MON PROFIL</h2>
						<input value="${personSession.descriptionPerson }"
							id="description"></input>

					</figcaption>
				</figure>
				<div id="buttonContact">
					<a href="Messaging.html">Me CONTACTER</a>
				</div>


				<br>
				<div id="buttonValReset">
					<input type="submit" id="boutonValide" class="boutonSubmit"
						role="button" value="Modifier" aria-disabled="false"> <input
						type="button" id="boutonAnnuler" class="boutonSubmit"
						role="button" aria-disabled="false" type="text"
						title="Annuler modifications" value="Annuler" onClick="annuler();"></input>
				</div>
				<div id="boutonGroup">
					<a>GROUPES</a><br>
					<c:forEach var="groupe" items="${groupes}">
						<input id="groupeList" type="button" name="rechercheGroupes"
							value="${groupe.nameGroup}">

						<option value="${groupe}"></option>


					</c:forEach>

				</div>
			</div>


			<div id="bodyRight">
				<aside>
					<div class="artwork">

						<h2>EVENTS</h2>
						<br />
						<table id="zonehistorique">
							<tr>
								<c:forEach var="event" items="${events}">
									<img src="images/sport1.jpg" title="${event}" />
								</c:forEach>
							</tr>
						</table>
					</div>
				</aside>
			</div>

		</div>

	</form>

	<footer id="citation">
		"Le bonheur est la seule chose qui se multiplie quand il se partage."
		<br />Paulo Cuelho
		<!-- pied de page a inclure dans les pages -->
		<%@include file="/views/footer.jsp"%>
	</footer>
	<script src="https://code.jquery.com/jquery-3.2.1.js"></script>
	<script src="script/jquery.flexdatalist.min.js"></script>
	<script type="text/javascript" src="script/ProfilMembre.js"></script>




</body>

</html>
