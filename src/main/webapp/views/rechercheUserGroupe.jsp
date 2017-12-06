<%@include file="/views/taglibs.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>recherche utilisateurs et groupes</title>
 <link rel="stylesheet" type="text/css" href="css/rechercheUserGroupe.css">
</head>
<body>
<header>
<%@include file="/views/MenuHeader.jsp"%>
</header>
<div id="bodyContainer">

 <div id="bodyLeft">
    <img class="images" src="images/culture1.jpg"/>
    <img class="images" src="images/goOut1.png"/>
    <img class="images" src="images/sport1.jpg"/>
    <img class="images" src="images/goOut3.jpg"/>
</div>
<div id="bodyLeft2">
    <img class="images" src="images/sport3.jpg"/>
    <img class="images" src="images/culture2.jpg"/>
    <img class="images" src="images/sport4.jpg"/>
    <img class="images" src="images/goOut2.jpg"/>
    
</div>
<div id="bodyCenter">
    <div id="content" >
    <c:forEach var="myGroup" items="${nameGroup}">
    <span class="titleMain"><a href="Groupe.Html"><c:out value="${myGroup.nameGroup}"/><img id="imagePlus" src="images/022-crowd-of-users-red-60x60.png"/></a></span>
       </c:forEach>
    </div>
    <div class="parent">
    <form name="rechercheGroup" action="<c:url value='rechercheUserGroupe'/>"
					method="get">
       <select name ="iChoixLieux" id="iChoixLieux">
            <option value="Lieux">LIEUX</option>
            <option  value="Montpellier">MONTPELLIER</option>
            <option value="Sete">SETE</option>
            <option value="Nimes">NIMES</option>
            <option value="Paris">PARIS</option>
            <option value="Marseille">MARSEILLE</option>
            <option value="Lille">LILLE</option>
        </select>
        <select name ="iChoixGroupe"id="iChoixGroupe">
            <option value="Groupe">GROUPES</option>
            <option  value="Sport">SPORT</option>
            <option value="Culture">CULTURE</option>
            <option value="GoOut">GO OUT</option>
        </select>
        </form>
        <br/>
        <input type="text" name="Pseudo" placeholder="Pseudo ou Details recherche" class="choix"/>
        <br/>
        <br/>
        <input type="button" name="valider" value="Valider" id="vBoutton" onclick="document.rechercheGroup.submit()"/>
    </div>
</div>
<div id="bodyRight"> 
    <img src="images/culture4.jpg"/>
    <img src="images/sport8.jpg"/>
    <img src="images/goOut4.jpg"/>
    <img src="images/sport7.jpg"/>
</div>
<div id="bodyRight2">
    <img src="images/culture3.jpg"/>
    <img src="images/sport6.jpg"/>
    <img src="images/sport5.jpg"/>
    <img src="images/goOut1.png"/> 
</div>
</div>
<footer>
	<%@include file="/views/footer.jsp"%>
</footer>
</body>
</html>