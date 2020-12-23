<!DOCTYPE html>
<html>
<head>
    <title>Forgot Password</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="css/main.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>

<body>
    <?php
        require('navBar.php');
    ?>

    <form action="/forgotPasswd.php">
        <div class="forgotPasswd_container">
            <h1>Forgot password?</h1>
            <p>Please write your email.</p>
            <hr>

            <label for="email"><b>Email</b></label>
            <input type="text" placeholder="Enter Email" name="email" id="email" required>
            <hr>
            <button type="submit" class="passwdbtn">Enter</button>

        </div>
    </form>

</body>

<script type="text/javascript" src="functions.js"></script>

</html>