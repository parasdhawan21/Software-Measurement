<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="Home.css">
<title>Descriptive Statistics</title>
</head>
<body  onload="setNumberCountDropDown()">

<h3> Descriptive Statistics</h3>
	<div id="containerMain">
		<div id="containerItems">
  			 <form id="form1" name="form1" method="get" action="LoginServlet">
			 <h3 id=numGen>Statistics Form</h3>
			 <p id="numbersP" class="numbersPValues"> No of Random Numbers: 
  			 <select id="dropdownNumbers" name="dropdownNumbers" onclick="">
			 </select>
  			 </p>
  			 <p id="genButtonP" class="genButtonP"> 
  			 <input id="submitButton" class ="genBut" type="submit" value="Generate Descriptive Statistics" ><br><br><br>	
  			 </p>
  			 <p id="randomNoBox" class="numbersPValues"> Random Nos :<br>
  			 <textarea  id="randomNoText"  class="randomNoText" ></textarea><br><br><br>	
  			 </p>
  			 <p id="meanBox" class="numbersPValues"> Mean :
  			 <input id="meanText" class ="statsText" type="text" ><br><br><br>	
  			 </p>
  			 <p id="meadianBox" class="numbersPValues"> Median :
  			 <input id="meadianText" class ="statsText" type="text" ><br><br><br>	
  			 </p>
  			 <p id="modeBox" class="numbersPValues"> Mode :
  			 <input id="modeText" class ="statsText" type="text" ><br><br><br>	
  			 </p>
  			 <p id="maxBox" class="numbersPValues"> Max :
  			 <input id="maxText" class ="statsText" type="text" ><br><br><br>	
  			 </p>
  			 <p id="minBox" class="numbersPValues"> Min :
  			 <input id="minText" class ="statsText" type="text" ><br><br><br>	
  			 </p>
  			 <p id="stdBox" class="numbersPValues"> STD :
  			 <input id="stdText" class ="statsText" type="text" ><br><br><br>	
  			 </p>
			</form>
		</div>
	</div>
	
<script type="text/javascript" src="javascript/jquery-3.2.1.js"></script>	
<script>
	function setNumberCountDropDown() {
   	  var element=document.getElementById("dropdownNumbers");   	  
   		for (i = 100; i > 2; i--) {
   	   	   var option = document.createElement('option');
   	   	    option.text = option.value = i;
   	        element.add(option, 0);
   		}  		
   		document.getElementById("dropdownNumbers").selectedIndex = "97"
   }
	
	
	$('#form1').submit(function () {
		 dataString = $("#form1").serialize();
		 
	$.ajax({
	type: "GET",
	url: "LoginServlet",
	data: dataString,
	dataType: "json",
	
	success: function (data) {
			$('#randomNoText').val(data.stats.randomNumbers);
			$('#meanText').attr("value",data.stats.mean);
			$('#meadianText').attr("value",data.stats.meadian);
			$('#modeText').attr("value",data.stats.mode);
			$('#maxText').attr("value",data.stats.max);
			$('#minText').attr("value",data.stats.min);
			$('#stdText').attr("value",data.stats.standardDeviation);
		},
	
	
	/*beforeSend: function(jqXHR, settings){
        //disable the button until we get the response
        $('#submitButton').attr("disabled", true);
    }*/
	
	
	});
	 
	return false;
	});
   	 	
</script>
	
</body>
</html>