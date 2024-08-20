<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
<html lang="en">
<head>
	<title>Blockchain</title>
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<meta charset="UTF-8">
	<link href="https://fonts.googleapis.com/css?family=Encode+Sans+Expanded:400,600,700" rel="stylesheet">
	<link href="plugin-frameworks/bootstrap.css" rel="stylesheet">
	<link href="fonts/ionicons.css" rel="stylesheet">
	<link href="common/styles.css" rel="stylesheet">
	 <style>
        body {
            /* Background image */
            background-image: url('data:image/jpeg;base64,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'); /* Replace 'background.jpg' with your image path */
            background-size: cover; /* Cover the entire viewport */
            background-attachment: fixed; /* Fix the background image */
        }
    </style>
</head>
<body>
	<%
	if(request.getParameter("invalid")!=null)
	{
	out.println("<script>alert('Invalid input Credential ...!')</script>");	
	}
   %>
	<header>		
		<div class="container">
			<a class="logo" href="#"><jsp:include page="titlepage.jsp"></jsp:include></a>
			<a class="menu-nav-icon" data-menu="#main-menu" href="#"><i class="ion-navicon"></i></a>
			<ul class="main-menu" id="main-menu">
			
				<li><a href="RegisterPage.jsp">REGISTER PAGE</a></li>
				<li><a href="LoginPage.jsp" class="current">LOGIN PAGE</a></li>
				
			</ul>
			<div class="clearfix"></div>
		</div>
	</header>

	<section class="ptb-0">
	<div class="mb-30 brdr-ash-1 opacty-5"></div>
		<div class="container"><br><br><br>
		 <div class="row">
		  <div class="col-sm-12 col-md-8">
			<div class="row">
				<table align="center">
				<tr>
					<td><img src="img/admin.jpg" width="10" height="250">
				</tr>
				<tr>
					<td><span style="font-size:22px; color: red">Register</span></td>
				</tr>
            </table>			
		
			<form action="AddRegister" method="post" class="form-block form-bold form-mb-20 form-h-35 form-brdr-b-grey pr-50 pr-sm-0">
				<table align="center" border="0"  cellpadding="5" cellspacing="5">
					
					<tr>
						<td><b>Select Roll:</b></td>
						<td><select style="width: 100%; height: 30px"
										id="username" name="roll" required="required">
											<option selected="selected">Select Roll</option>
											<option value="Farmer">Farmer</option>
											<option value="User">User</option>
											<option value="Distribute">Distribute</option>
							</select></td>
					</tr>
					<tr>
						<td><b>UserName</b></td>
						<td><input type="text" name="username" required pattern="[A-Za-z].{1,}" title="Minimum Two  Characters  are Required For UserName" placeholder="Eg.Om"/></td>
					</tr>
					<tr>
						<td><b>Email_ID</b></td>
						<td><input type="text" name="email" required placeholder="mysupermail@mail.com" /></td>
					</tr>
					<tr>
						<td><b>Password</b></td>
						<td><input type="password" name="password" required pattern="^(?=.*[A-Za-z])(?=.*\d)(?=.*[@$!%*#?&])[A-Za-z\d@$!%*#?&]{6,}$" 
						title="Must contain at least one number and one uppercase and lowercase letter, and at least 6 or more characters" placeholder="eg. X8df!90EO"/></td>
					</tr>
					<tr>
						<td><b>Contact No.</b></td>
						<td><input type="text" name="MbNo" pattern="[7-9]{1}[0-9]{9}" maxlength="10" required placeholder="eg. 7777777777"/></td>
					</tr>
					<tr>
				     	<td colspan="2" align="center"><input class="input-rounded-button" type="submit" value="Sign Up" style="height: 30px;width: 80px;"/></td>
				    </tr>
				</table>
			</form>	
				</div>
				</div>
				
				<div class="col-sm-12 col-md-4">
					<img src="images/M.jpg" alt="">
				</div>
			</div>
		</div>
	</section><br><br><br><br><br><br>
	
	<footer class="bg-191 color-ccc">
			<div class="brdr-ash-1 opacty-2"></div>
			<div class="oflow-hidden color-ash font-9 text-sm-center ptb-sm-5"><br>
			<p class="color-ash">
				Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="ion-heart" aria-hidden="true"></i> by <a href="#" target="_blank">Digital Certificate on Blockchain</a>
			</p><br>
			</div>
	</footer>
	<script src="plugin-frameworks/jquery-3.2.1.min.js"></script>	
	<script src="plugin-frameworks/tether.min.js"></script>	
	<script src="plugin-frameworks/bootstrap.js"></script>	
	<script src="common/scripts.js"></script>	
</body>
</html>
					