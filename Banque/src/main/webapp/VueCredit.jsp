<%@ page import="Web.CreditModel"%>
<!-- sa script lait c'est de code java code java  -->
<%
CreditModel model = (CreditModel) request.getAttribute("creditModel");
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Credit Bancaire</title>
<meta charset="utf-8">
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
<link rel="stylsheet" type="text/css" href="css/Style.css" />
</head>
<body>
	<p></p>
	<div class="container">
		<div class="col-md-6 col-xm-12 cal-sm-6 col-md-offset-3"></div>
		<div class="card">
			<div class="panel panel -primary">
				<div class="card-header">Similation Du Credit Banque</div>
				
				
				<div class="card-body">
					<form action="calculerMentieliterCredit.do" method="Post">
						<div class="form-group">
							<label> Montant:</label> <input class="form-control" type="text" name="montant" value="<%=model.getMontant()%>" />
						 </div>

						<div class="form-group">
							<label> Tax:</label> <input class="form-control" type="text" name="tax" value="<%=model.getTax()%>" />
						</div>


						<div class="form-group">
						
							<label> Duree:</label> <input class="form-control" type="text"
								name="duree" value="<%=model.getDuree()%>" />
						</div>

						<button class="btn btn-success" type="submit">Calculer</button>

					</form>
					<div class="spacer">

						<label>Mentielité =<%=model.getMontialiter()%>
						</label>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>