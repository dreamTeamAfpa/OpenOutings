
<%@include file="/views/taglibs.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Sign Up Page</title>
<link rel="stylesheet" href="/css/animate.css">
<link rel="stylesheet" href="/css/signIn.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/index.css" />
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
		<div class="login-box animated fadeInUp" style="top: -20px;">
			<div class="box-header">
				<h2>Inscription</h2>
			</div>
			<!-- formulaire d'inscription -->
			<form class="form" method="post" action="inscription">
				<label for="username">Nom d'utilisateur</label> <br> <input
					type="text" id="username" name="username"> <br> <label
					for="password">Mot de passe</label> <br> <input
					type="password" id="password" name="password"> <br> <label
					for="passwordVerif">Confirmer mot de passe</label> <br> <input
					type="password" id="passwordVerif" name="passwordVerif"> <br>
				<label for="password">Adresse email</label> <br> <input
					type="email" id="email" name="email"> <br>
				<button type="submit" id="connectBtn">S'inscrire</button>
			</form>
			<div id='messageRetour'>${message}</div>
		</div>
	</div>
	<!-- on inclut la bibliothèque depuis les serveurs de Google -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
	<script src="OO_signUp.js">

                </script>
	<!-- pied de page a inclure dans les pages -->
	<%@include file="/views/footer.jsp"%>
</body>
</html>