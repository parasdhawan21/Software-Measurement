<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="Home.css">
<title>Descriptive Statistics</title>
</head>
<body onload="setNumberCountDropDown()">

	<h3>Descriptive Statistics</h3>
	<div id="containerMain">
		<div id="containerItems">
			<form id="form1" name="form1" method="get" action="LoginServlet">
				<h3 id=numGen>Statistics Form</h3>
				<p id="numbersP" class="numbersPValues">
					Number of Random Numbers: <select id="dropdownNumbers"
						name="dropdownNumbers" onclick="">
					</select>
				</p>
				<p id="genButtonP" class="genButtonP">
					<input id="submitButton" class="genBut" type="submit"
						value="Generate Descriptive Statistics"><br>
					<br>
					<br>
				</p>
				<p id="randomNoBox" class="numbersPValues">
					Random Numbers :<br>
					<textarea id="randomNoText" class="randomNoText" readonly></textarea>
					<br>
					<br>
					<br>
				</p>
				<p id="meanBox" class="numbersPValues">
					Mean : <input id="meanText" class="statsText" type="text" readonly><br>
					<br>
					<br>
				</p>
				<p id="meadianBox" class="numbersPValues">
					Median : <input id="meadianText" class="statsText" type="text"><br>
					<br>
					<br>
				</p>
				<p id="modeBox" class="numbersPValues">
					Mode :
					<textarea id="modeText" class="textMode" readonly></textarea>
					<br>
					<br>
					<br>
				</p>
				<p id="maxBox" class="numbersPValues">
					Maximum : <input id="maxText" class="statsText" type="text" readonly><br>
					<br>
					<br>
				</p>
				<p id="minBox" class="numbersPValues">
					Minimum : <input id="minText" class="statsText" type="text" readonly><br>
					<br>
					<br>
				</p>
				<p id="stdBox" class="numbersPValues">
					Standard Deviation : <input id="stdText" class="statsText" type="text" readonly><br>
					<br>
					<br>
				</p>
			</form>
		</div>
	</div>

	<script type="text/javascript" src="javascript/jquery-3.2.1.js"></script>
	<script>
		function setNumberCountDropDown() {
			var element = document.getElementById("dropdownNumbers");
			for (i = 200; i > 2; i--) {
				var option = document.createElement('option');
				option.text = option.value = i;
				element.add(option, 0);
			}
			document.getElementById("dropdownNumbers").selectedIndex = "97"
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