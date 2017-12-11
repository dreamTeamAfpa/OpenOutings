
<%@include file="/views/taglibs.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Page de connexion</title>
<link rel="stylesheet" href="/css/animate.css">
<link rel="stylesheet" href="/css/signIn.css">
<link rel="stylesheet" type="text/css" href="css/index.css">
</head>

<body>
	<header>
		<div id="logoEnTete">
			<a href="index"><img
				src="images/isotype_logo_openOutings_1.6.1_52x52_petitLogoEnTete.png"
				title="Page d'Accueil" /></a>
		</div>
		<div id="BoutonMenuEnTete">
			<a href="index"><img
				src="images/icone mainMenu_60x60orange_EnTete_close.png" /></a>
		</div>
	</header>

	<div class="container">
		<div class="top">
			<h1 id="title" class="hidden"></h1>
		</div>
		<div class="login-box animated fadeInUp">
			<div class="box-header">
				<h2>Connexion</h2>
			</div>

			<form class="form" method="post" action="connexion">
				<label for="username">Nom d'utilisateur</label> <br> <input
					type="text" id="username" name="username"> <br> <label
					for="password">Mot de passe</label> <br> <input
					type="password" id="password" name="password"> <br>
				<button type="submit" id="connectBtn">Se connecter</button>
				<p>
					<a href="#" class="small">Mot de passe perdu?</a>
				</p>
			</form>
		</div>
	</div>
	<!-- on inclut la bibliothèque depuis les serveurs de Google -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
	<script src="/script/OO_signIn.js"></script>

	<%@include file="/views/footer.jsp"%>

</body>

</html>