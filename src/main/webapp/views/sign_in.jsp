
<%@include file="/views/taglibs.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<link rel="stylesheet" href="/css/animate.css">
<link rel="stylesheet" href="/css/signIn.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/index.css" />
</head>

<body>
	<header>
		<div id="blockheader">
			<a href="../ImplementationHomePage/index(1).html">
				<div id="logoEnTete">
					<img
						src="images/isotype_logo_openOutings_1.6.1_52x52_petitLogoEnTete.png"
						title="Page d'Accueil" />
				</div>

				<div id="BoutonMenuEnTete">
					<a href="../Implementation Menu/page_menuV1.3.html"><img
						src="images/iconeMainMenu_60x60orange_EnTete.png"
						title="Accéder au menu" /></a>
				</div>
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

			<form class="form" method="get" action="validateSignIn">
				<label for="username">Nom d'utilisateur</label> <br> 
				<input type="text" id="username" required="" autofocus=""> <br>
				<label for="password">Mot de passe</label> <br> 
				<input type="password" id="password" required=""> <br>
				<p ${messageReturn}>
				<button type="submit" id="connectBtn">Se connecter</button>
				<br> <a href="#"><p class="small">Mot de passe perdu?</p></a>
			</form>
		</div>
		
		<!-- on inclut la bibliothèque depuis les serveurs de Google -->
		<script	src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
		<script src="/script/OO_signIn.js"></script>
		
	<%@include file="/views/footer.jsp"%>

</body>

</html>