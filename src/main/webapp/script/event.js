/**
 * 
 */
/*Unuse
var title = document.getElementById("eventTitle");
var maxparticipants = document.getElementById("eventMaxOuters");
var theme = document.getElementById("iChoixTheme");
var description = document.getElementById("eventDescription");
var details = document.getElementById("eventDetails");
var rate = document.getElementById("eventRate");
var location = document.getElementById("iChoixLieux");
var group = document.getElementById("eventGroup");
var date = document.getElementById("eventDate");
var time = document.getElementById("eventTime");
*/

function getEventDetails(idEvent) {
	viewEventDatas(event);
	
}
/** Display event datas in createEvent.jsp
 * @param event
 * @returns
 */
function viewEventDatas(event) {
	if (event.length != 0) {
		$('#eventTitle').attr({value : event.title_event});
		
	}
}