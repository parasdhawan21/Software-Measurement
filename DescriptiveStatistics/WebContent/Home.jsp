<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="Home.css">
<title>Descriptive Statistics</title>
</head>
<body>

	<h3 id=mainHeading>Descriptive Statistics</h3>
	<div id="containerMain">
		<div id="containerItems">
			<form id="form1" name="form1" method="get" action="LoginServlet">
				<h3 id=numGen>Statistics Form</h3>
				<p id="numbersP" class="numbersPValues">
					No of Random Numbers: <input type="text" maxlength="4"
						onkeypress="return validateInput(event);" id="dropdownNumbers"
						name="dropdownNumbers"></input>

				</p>
				<p id="genButtonP" class="genButtonP">
					<input id="submitButton" class="genBut" type="submit"
						value="Generate Descriptive Statistics"
						onclick="return isEmpty();"><br> <br> <br>
				</p>
				<p id="randomNoBox" class="numbersPValues">
					Random Nos :<br>
					<textarea id="randomNoText" class="randomNoText" readonly></textarea>
					<br> <br> <br>
				</p>
				<div id="upperDiv">
					<span id="meanBox" class="numbersPValues"> Mean : <input
						id="meanText" class="statsText" type="text" readonly> <span
						class="spaceSpan"></span> Median : <input id="meadianText"
						type="text"> <span class="spaceSpan"></span> Mode : <textarea
							id="modeText" class="textMode" readonly></textarea>
					</span>
				</div>

				<div id="lowerDiv">
					<span id="maxBox" class="numbersPValues"> Max : <input
						id="maxText" class="statsText" type="text" readonly> <span
						class="spaceSpan"></span> <span class="spaceSpan"></span> Min : <input
						id="minText" class="statsText" type="text" readonly><span
						class="spaceSpan"></span> Standard Deviation : <input id="stdText"
						class="statsText" type="text" readonly>
					</span>
				</div>
				<br> <br>
			</form>
		</div>
	</div>

	<script type="text/javascript" src="javascript/jquery-3.2.1.js"></script>
	<script>
		function validateInput(evt) {
			evt = (evt) ? evt : window.event;
			var charCode = (evt.which) ? evt.which : evt.keyCode;
			if ((charCode < 48) || (charCode > 57)) {
				return false;
			}
			return true;
		}

		function isEmpty() {
			var element = document.getElementById("dropdownNumbers").value;
			if (element.length<1 || element=="0") {
				alert("Please provide the valid count. (1-9999)");
				return false;
			}
			return true;
		}

		$('#form1').submit(function() {
			dataString = $("#form1").serialize();

			$.ajax({
				type : "GET",
				url : "LoginServlet",
				data : dataString,
				dataType : "json",

				success : function(data) {
					$('#randomNoText').val(data.stats.randomNumbers);
					$('#meanText').attr("value", data.stats.mean);
					$('#meadianText').attr("value", data.stats.median);
					$('#modeText').val(data.stats.mode);
					$('#maxText').attr("value", data.stats.max);
					$('#minText').attr("value", data.stats.min);
					$('#stdText').attr("value", data.stats.standardDeviation);
				},

			});

			return false;
		});
	</script>

</body>
</html>