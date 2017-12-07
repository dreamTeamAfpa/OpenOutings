<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<%@include file="/views/taglibs.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Login Page</title>

<link href="/css/animate.css" type="text/css" rel="stylesheet">
<link href="/css/signIn.css" type="text/css" rel="stylesheet">
<link href="/css/index.css" type="text/css" rel="stylesheet" />
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
			<form method="POST" action="${contextPath}/login" class="form-signin">
				<h2 class="form-heading">Log in</h2>

				<div class="form-group ${error != null ? 'has-error' : ''}">
					<span>${message}</span>
					<input name="username" type="text" class="form-control" placeholder="Username"
						autofocus="true" />
					<input name="password" type="password" class="form-control" placeholder="Password" />
					<span>${error}</span>
					<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />

					<button class="btn btn-lg btn-primary btn-block" type="submit">LogIn</button>
					<h4 class="text-center"><a href="${contextPath}/registration">Create an account</a></h4>
				</div>

			</form>
			
			<%-- <form class="form" method="get" action="validateSignIn">
				<label for="username">Nom d'utilisateur</label> <br> 
				<input type="text" id="username" required="" autofocus=""> <br>
				<label for="password">Mot de passe</label> <br> 
				<input type="password" id="password" required=""> <br>
				<p ${messageReturn}>
				<button type="submit" id="connectBtn">Se connecter</button>
				<br> <a href="#"><p class="small">Mot de passe perdu?</p></a>
			</form> --%>
			
		</div>
		<!-- /container -->
		<!-- on inclut la bibliothèque depuis les serveurs de Google -->
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
		<script src="/script/OO_signIn.js"></script>
		<%@include file="/views/footer.jsp"%>
</body>

</html>