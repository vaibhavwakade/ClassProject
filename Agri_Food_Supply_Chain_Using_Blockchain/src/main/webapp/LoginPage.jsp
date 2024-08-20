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
	if(request.getParameter("logout")!=null)
	{
		session.invalidate();
		Thread.sleep(2000);
		out.println("<script>alert('Logout Successfully')</script>");
	}
	if(request.getParameter("Done")!=null)
	{
	out.println("<script>alert('Congratulations....Profle Added Successfully ...!')</script>");	
	}
	else if(request.getParameter("invalid")!=null)
	{
	out.println("<script>alert('Invalid Login Credential ...!')</script>");	
	}
	else if(request.getParameter("succ")!=null)
	{
	out.println("<script>alert('Congratulations....Register Successfuly...!')</script>");	
	}
   %>
	<header>		
		<div class="container">
			<a class="logo" href="#"><jsp:include page="titlepage.jsp"></jsp:include></a>
			<a class="menu-nav-icon" data-menu="#main-menu" href="#"><i class="ion-navicon"></i></a>
			<ul class="main-menu" id="main-menu"><li><a href="RegisterPage.jsp">REGISTER PAGE</a></li>
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
						<td><img src="img/admin.jpg" width="10" height="240">
					</tr>
					<tr>
						<td colspan="2"><b>Login</b></td>
					</tr>
            	</table>			
		
						<form class="post_section" action="AddLogin" method="post">
							<table align="center" border="0"  cellpadding="5" cellspacing="5">
								<tr>
									<td colspan="2"><div class="cleaner" style="height: 20%">&nbsp;&nbsp;&nbsp;&nbsp;</div></td>
								</tr>
								<tr>
									<td><b>Select Roll:</b></td>
									<td><select style="width: 100%; height: 30px"
										id="username" name="roll" required="required">
											<option selected="selected">Select Roll</option>
											<option value="Farmer">Farmer</option>
							 				<option value="Distribute">Distribute</option>
											<option value="User">User</option>
											</select></td>
								</tr>
								<tr>
									<td><b>Email_ID:</b></td>
									<td><input type="text" name="email" placeholder="mymail@mail.com" required /></td>
								</tr>
								<tr>
									<td><b>Password</b></td>
									<td><input type="password" name="password" placeholder="eg. X8df!90EO" required /></td>
								</tr>
								<tr>
							     	<td colspan="1" align="center"><input class="input-rounded-button" type="submit" value="LogIn" style="height: 30px;width: 80px;"/></td>
							    	
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