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

/*
function getData(){
		const response = await fetch('localhost:8091/api/hello/test/recomandation');
		const data = await response.json();
		const {name, genre} = data;
		
		document.getElementById(nam).textContent=name;
		document.getElementById(gen).textContent=genre;
}
*/