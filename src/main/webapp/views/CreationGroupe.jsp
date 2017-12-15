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
			<select id="iChoixEdit" >
						<option value="Menu">MENU</option>
						<option value="Modifier">Modifier</option>
						<option value="Sete">Supprimer</option>
				</select>
				<select id="iChoixTheme">
						<option value="Theme">THEME</option>
						<option value="Sport">Sport</option>
						<option value="Culture">Culture</option>
						<option value="GoOut">Go Out</option>
				</select>
				<select id="iChoixLieux" >
						<option value="Lieux">LIEUX</option>
						<option value="Montpellier">Montpellier</option>
						<option value="Sete">Sete</option>
						<option value="Nimes">Nimes</option>
						<option value="Paris">Paris</option>
						<option value="Marseille">Marseille</option>
						<option value="Lille">Lille</option>
				</select>
			</div>
		</div>
		<div id="bodyCenter">
			<input type="search" id="nomGroupe"
				title="saisissez votre nom de groupe.." placeholder="NOM GROUPE">
			<img src="images/sportPlanSportPlanLarge1.jpg" id="imageProfil">
			<input type="button" name="ajout" value="Ajouter photo"
				id="ajoutPhotoBoutton" />

			<div id="contentCenter">
				<div id="content">
					<span class="title"><br />DESCRIPTION</span>
					<p>
						Venez sur le playground pour un Basket sur la plage de carnon vers
						17h30 </br> parking a proximite , prendre des boissons pour l after
					</p>
				</div>



				<div id="content2">
					<span class="title">MEMBRES<img id="imagePlus"
						src="images/005-rounded-add-button-red.png" />
					</span> <span><img class="iconProfil"
						src="images/006-social-2-red.png" />Loulou</br></span> <span><img
						class="iconProfil" src="images/006-social-2-red.png" />Riri</br></span> <span><img
						class="iconProfil" src="images/006-social-2-red.png" />Fifi</br></span>
				</div>
			</div>
			<input type="button" name="valider" value="Valider Creation"
				id="vBoutton" />
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
	<footer>
		<%@include file="/views/footer.jsp"%>
	</footer>
</body>

</html>