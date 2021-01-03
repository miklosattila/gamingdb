function openNav() {
	document.getElementById("CategNav").style.height = "100%";
}
	
function closeNav() {
	document.getElementById("CategNav").style.height = "0%";
}

// Get the modal
// itt vannak a login funkcioi:
var modal = document.getElementById('id01');
// When the user clicks anywhere outside of the modal, close it
// ha az elougrott ablakon kivul kattint akkor bezarul
window.onclick = function(event) {
    if (event.target == modal) {
    	modal.style.display = "none";
    }
}
