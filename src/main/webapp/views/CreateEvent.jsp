<!-- taglibs a inclure dans toutes les pages -->
<%@include file="/views/taglibs.jsp"%>
<%@ page pageEncoding="UTF-8"%>

<!DOCTYPE html >
<html>
<head>
        <meta charset="utf-8">
        <title>Open Outings</title>
         <link rel="stylesheet" type="text/css" href="css/style.css">
        <link rel="stylesheet" type="text/css" href="css/rechercheEvent.css">
        <link rel="stylesheet" href="jquery-ui-1.12.1.custom/jquery-ui.min.css">
        <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
    </head>

    <body>
        <header>
            <div id="blockheader">
                <a href="index.html">
                    <div id="logoEnTete"><img src="images/isotype_logo_openOutings_1.6.1_52x52_petitLogoEnTete.png" title="Page d'Accueil"/></div>
                </a>
                <div id="marecherche" title="Rechercher">
                    <img src="images/iconeMainMenu_loupe_EnTete_orange32x32.png" />
                    <input type="search" id="zonerecherche" title="saisissez votre recherche ici..." placeholder="rechercher">
                    <a href="signIn.html"><input type="button" id="bconnexion"></a>
                    <a href="signUp.html"><input type="button" id="binscription"></a>
                </div>
                <div id="BoutonMenuEnTete">
                    <a href="menu.html"><img src="images/iconeMainMenu_60x60orange_EnTete.png" title="Accéder au menu"/></a>
                </div>
            </div>
        </header>

        <div id="bodyContainer">

            <div id="bodyLeft">
                <img src="images/sport1.jpg"/>
                <img src="images/goOut1.png"/>
                <img src="images/culture1.jpg"/>
                <img src="images/culture2.jpg"/>
            </div>
            <div id="bodyLeft2">
                <img class="images" src="images/culture4.jpg"/>
                <img class="images" src="images/sport4.jpg"/>
                <img class="images" src="images/goOut2.jpg"/>
                <img class="images" src="images/sport3.jpg"/>
            </div>
            <div id="bodyCenter">
                <div class="content">

                    <span>
                        <p id="iPar1" > MONTPELLIER   FOOTBALL   02/09</p>
                        <p id="iPar2" > MONTPELLIER   GO OUT     03/09</p>
                    </span>
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
                    <input type="text" class="date datePicker" name="dateEvenement" id="iChoixDate">
                    <th class="choix"><select id="iChoixThemes">
                        <option value="Themes">THEMES</option>
                        <option  value="Sport">SPORT</option>
                        <option value="Culture">CULTURE</option>
                        <option value="GoOut">GO OUT</option>
                        </select></th>

                    <br/>
                    <input type="button" name="valider" value="Valider" id="vBoutton">
                </div>
            </div>
            <div id="bodyRight">  
                <img src="images/sport7.jpg"/>
                <img src="images/culture3.jpg"/>
                <img src="images/sport6.jpg"/>
                <img src="images/culture1.jpg"/>
            </div>
            <div id="bodyRight2">
                <img src="images/sport5.jpg"/>
                <img src="images/sport8.jpg"/>
                <img src="images/goOut4.jpg"/> 
                <img src="images/goOut2.jpg"/>
            </div>

        </div>

        <script src="jquery-ui-1.12.1.custom/external/jquery/jquery.js"></script>
        <script src="jquery-ui-1.12.1.custom/jquery-ui.min.js"></script>
        <script src="jquery-ui-1.12.1.custom/jquery-ui.js"></script>
        <script src="script/index.js"></script>
</body>
</html>