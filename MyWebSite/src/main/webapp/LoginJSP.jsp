<html>
<head>
<title>Login Page</title>
<style type="text/css">

.MainDiv{
background-color:lightblue;
border: 2px solid #000 ; 
padding: 10px;
position:absolute;
top: 50%;
right: 20%;
width: 400px;
text-align: center;
border-radius: 20%;
}

table{


}

td{
width: 100px;

}
</style>
</head>
<body>
<form method="post" action="MainLogin">
<div class="MainDiv">

<table>

<tr>
<td></td>
<td style="text-align: center;">Login</td>
<td></td>
</tr>

<tr>
<td>Username:</td>
<td><input type="text"  id="username"></td>

</tr>

<tr>
<td>Password:</td>
<td><input type="password" id="password"></td>


</tr>

<tr>
<td></td>
<td>
<input type="reset" value="Reset">
<input type="submit" value="Login">
</td>
</tr>

</table>



</div>

</form>
</body>
</html>
