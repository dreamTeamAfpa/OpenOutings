<%@include file="/views/taglibs.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>recherche utilisateurs et groupes</title>
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
    <div id="content" ><span class="titleMain"><a href="Groupe.Html"> Montpellier Bowling <img id="imagePlus" src="images/022-crowd-of-users-red-60x60.png"/></a></span>
       
        <span class="title"><a href="ProfilMembre.Html" ><img class="iconProfil" src="images/006-social-2-red.png"/>The Dude</a></br></span>
        <span class="title"><img class="iconProfil" src="images/006-social-2-red.png"/>Riri</br></span>
        <span class="title"><img class="iconProfil" src="images/006-social-2-red.png"/>Fifi</br></span>
        <span class="titleMain">Montpellier Musique <img id="imagePlus" src="images/022-crowd-of-users-red-60x60.png"/> </span>
        <span class="title"><img class="iconProfil" src="images/006-social-2-red.png"/>Titi</br></span>
        <span class="title"><img class="iconProfil" src="images/006-social-2-red.png"/>Tutu</br></span>
        <span class="title"><img class="iconProfil" src="images/006-social-2-red.png"/>Toto</br></span>
        
    </div>
    <div class="parent">
        <th class="choix"><select id="iChoixLieux">
            <option value="Lieux">LIEUX</option>
            <option  value="Montpellier">MONTPELLIER</option>
            <option value="Sete">SETE</option>
            <option value="Nimes">NIMES</option>
            <option value="Paris">PARIS</option>
            <option value="Marseille">MARSEILLE</option>
            <option value="Lille">LILLE</option>
        </select></th>
        <th class="choix"><select id="iChoixGroupe">
            <option value="Groupe">GROUPES</option>
            <option  value="Sport">SPORT</option>
            <option value="Culture">CULTURE</option>
            <option value="GoOut">GO OUT</option>
        </select></th>
        <br/>
        <input type="text" name="Pseudo" placeholder="Pseudo ou Details recherche" class="choix"/>
        <br/>
        <br/>
        <input type="button" name="valider" value="Valider" id="vBoutton"/>
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