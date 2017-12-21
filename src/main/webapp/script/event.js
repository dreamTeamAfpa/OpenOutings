$(document).ready(function() {

$('.datePicker').datepicker({
    autoclose: true, 
    format: 'dd/mm/yyyy'
    });

});

disabledInput();
// TODO Implement an event listener on the list
$('#iChoixEdit').change(function() {
	eventAction();
});
/**
 * @param value
 * @returns
 */
function eventAction() {
	// it Get the value of the selected option
	var value = $('#iChoixEdit option:selected').val();
	if (value != null) {
		var idevent = $('#idEvent').val();
		switch (value) {
		case 'Supprimer':
			return removeEvent(idevent);
			break;
		case 'Modifier':
			modifyEvent(idEvent);
			break;
		case 'Creer':
			createEvent();
			break;
		default:
			disabledInput();
		}
	}
}

function disabledInput() {
	/*$('#eventDescription').attr('disabled', 'disabled');*/
	$('fieldset').removeAttr('enabled');
	$('fieldset').attr('disabled', 'disabled');
	$('#eventTitle').attr('disabled', 'disabled');
	$('#iChoixEdit>option[value="'+Menu+'"]').attr('selected', true);
}
function removeEvent(idevent) {
	window.alert("remove ?");
}

function modifyEvent(idevent) {
	window.alert("modify ?");
	
}

function createEvent() {
	$('#eventTitle').removeAttr('disabled');
	$('#fieldset').attr('disabled', false);
	$('#eventDetails').removeAttr('disabled');
}


/**
 * Display event datas in createEvent.jsp
 * 
 * @param event
 * @returns
 */
function viewEventDatas(event) {
	if (event.length != 0) {
		$('#eventTitle').attr({
			value : event.title_event
		});

	}
}