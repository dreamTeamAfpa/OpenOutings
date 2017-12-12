<!-- taglibs a inclure dans toutes les pages -->
<%@include file="/views/taglibs.jsp"%>
<%@ page pageEncoding="UTF-8"%>
<!-- taglibs a inclure dans toutes les pages -->
<%@include file="/views/taglibs.jsp"%>
<!DOCTYPE html >
<html>
<head>
        <meta charset="utf-8">
        <title>Open Outings</title>
        <link rel="stylesheet" type="text/css" href="css/createEvent.css">
        <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
        <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
    </head>

    <body>
        <header>
			<!-- Menu header -->
				<%@include file="/views/MenuHeader.jsp"%>

        </header>

        <div id="bodyContainer">
            <div id="titleEventEdit">
                <div id="zoneEventTitle">
                    <h2> Création d'événement</h2>
                    <div class="part">
                        <input type="text" id="eventTitle" title="donner un titre à votre sortie" placeholder="Nom de la sortie">
                    </div>
                    <div id="themeEvent">
                        <img src="images/022-crowd-of-users-red-60x60.png">
                    </div>
                </div>
                <div id="eventEdit">
                    <div id="bodyLeft">
                        <div class="part">
                            Choisissez le thème de l'activité
                            <br/>
                            <th class="edit"><select id="iChoixTheme">
                                <option value="Theme">THEME</option>
                                <option  value="Sport">Sport</option>
                                <option value="Culture">Culture</option>
                                <option value="GoOut">Go Out</option>
                                </select></th>
                            <br/>
                            <br/>
                            Nombre de Participants maximum
                            <br/>
                            <input type="number" id="eventMaxOuters">
                            <br/>
                            <br/>
                            <th class="edit"><select id="iChoixEdit" value="MENU">
                                <option value="Menu">MENU</option>
                                <option  value="Modifier">Modifier</option>
                                <option value="Sete">Supprimer</option>
                                </select></th>
                            <br/>
                            <br/>


                        </div>
                    </div>

                    <div id="bodyCenter">
                        <div id="imageEvent">
                            <div class="roundCornerPics">
                                <img src="images/chasseAuxPapillons.jpg" id="imageEvent" >
                            </div>
                            <input type="button" name="ajout" value="Ajouter photo" id="ajoutPhotoBoutton"/>            
                        </div>
                        <div id="contentCenter">
                            <fieldset id="eventDescription" contenteditable="true">
                                <legend>DESCRIPTION </legend>
                                <br/>
                            </fieldset>

                            <div class="part">

                            </div>

                            <div class="part">
                                Où ?
                                <th class="edit"><select id="iChoixLieux" value="Lieux">
                                    <option value="Lieux">LIEUX</option>
                                    <option  value="Montpellier">Montpellier</option>
                                    <option value="Sete">Sete</option>
                                    <option value="Nimes">Nimes</option>
                                    <option value="Paris">Paris</option>
                                    <option value="Marseille">Marseille</option>
                                    <option value="Lille">Lille</option>
                                    </select></th>
                            </div>
                            <div id="eventTiming">
                                <div class="part">
                                    <p>Quand ? </p>
                                    <input type="text" class="datePicker" name="eventDate">

                                    <br/>
                                </div>
                                <div class="part">
                                    <p>A partir de quelle heure ? </p>
                                    <input type="time" name="eventTime">
                                    <br/>
                                </div>
                                <br/>
                            </div>
                            <div id="validate">
                                <input type="button" class="eventButton" value="Valider" id="createEvent">
                                <span></span>
                                <input type="button" class="eventButton" value="Annuler" id="cancel">

                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div id="bodyRight">
                <img src="images/sport8.jpg"/>
                <img src="images/goOut4.jpg"/>
                <img src="images/sport7.jpg"/>
                <img src="images/culture4.jpg"/>
            </div>


        </div>

        <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  		<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
        <script src="script/index.js"></script>
    </body>

</html>