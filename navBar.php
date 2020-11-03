<!-- Categories nav. -->

<div id="CategNav" class="overlay">
	<!-- Button to close the overlay navigation -->
	<a href="javascript:void(0)" class="closeButton" onclick="closeNav()">&times;</a>
	<div class="overlay-content">
		<a href="actionPage.php">Action</a>
		<a href="#">Sport</a>
		<a href="#">Strategy</a>
		<a href="#">Simulation</a>
		<a href="#">Racing</a>
		<a href="#">Adventure</a>
		<a href="#">Online</a>
	</div>
</div>

<!-- Header -->
<!-- A navigacios sav: -->

<div class="Header">
			
	<div>
		<a href="mainPage.php" id="mainPage"><button id="home_button">GAMINGDb</button></a>
	</div>
			
	<div>
		<!--<span style="font-size:30px;cursor:pointer" onclick="openNav()">Categories</span>-->
		<span onclick="openNav()">Categories</span>
	</div>

	<div>
		<form class="searchBar" action="mainPage.php">
			<input type="text" placeholder="Search.." name="search">
			<button type="submit"><i class="fa fa-search"></i></button>
		</form>
	</div>

	<div class="logIn_button">
		<button onclick="document.getElementById('id01').style.display='block'" style="width:auto;">Login</button>
	</div>
</div>

<!-- A login szerkezete: -->

<div id="id01" class="modal">
  
	<form class="modal-content animate" action="mainPage.html" method="post">
		<div class="imgcontainer">
			<span onclick="document.getElementById('id01').style.display='none'" class="close" title="Close Modal">&times;</span>
			<img src="img/avatar2.png" alt="Avatar" class="avatar">
		</div>
		  
		<div class="container">
			<label for="uname"><b>Username</b></label>
			<input type="text" placeholder="Enter Username" name="uname">
		  
			<label for="psw"><b>Password</b></label>
			<input type="password" placeholder="Enter Password" name="psw">
				  
			<button type="submit">Login</button>
			
			<input type="checkbox" id="check" checked="checked" name="remember">
			<label for="check">Remember me</label>
			
		</div>
		  
		<div class="container" style="background-color:#f1f1f1">
			<button type="button" onclick="document.getElementById('id01').style.display='none'" class="cancelbtn">Cancel</button>
			<button type="button" onclick="location.href='registerPage.php'" class="regbtn">Register</button>
			<span class="psw"><a href="forgotPasswd.php">Forgot password?</a></span>
		</div>
	</form>
</div>