<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset='UTF-8'>
	
	<title>PRT TOOL Beta</title>
	
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.4.4/jquery.js"></script>
    <link rel="stylesheet" type="text/css" href="<c:url value = "/CSS/style.css" />" /> 
	
	<!--[if !IE]><!-->
	<style>
	* { 
	margin: 0; 
	padding: 0; 
}
body { 
	font: 14px/1.4 Georgia, Serif; 
}
#page-wrap {
	margin: 50px;
}
p {
	margin: 20px 0; 
}

	/* 
	Generic Styling, for Desktops/Laptops 
	*/
	table { 
		width: 100%; 
		border-collapse: collapse; 
	}
	/* Zebra striping */
	tr:nth-of-type(odd) { 
		background: #eee; 
	}
	th { 
		background: #333; 
		color: white; 
		font-weight: bold; 
	}
	td, th { 
		padding: 6px; 
		border: 1px solid #ccc; 
		text-align: left; 
	}
	
	/* 
	Max width before this PARTICULAR table gets nasty
	This query will take effect for any screen smaller than 760px
	and also iPads specifically.
	*/
	@media 
	only screen and (max-width: 760px),
	(min-device-width: 768px) and (max-device-width: 1024px)  {
	
		/* Force table to not be like tables anymore */
		table, thead, tbody, th, td, tr { 
			display: block; 
		}
		
		/* Hide table headers (but not display: none;, for accessibility) */
		thead tr { 
			position: absolute;
			top: -9999px;
			left: -9999px;
		}
		
		tr { border: 1px solid #ccc; }
		
		td { 
			/* Behave  like a "row" */
			border: none;
			border-bottom: 1px solid #eee; 
			position: relative;
			padding-left: 50%; 
		}
		
		td:before { 
			/* Now like a table header */
			position: absolute;
			/* Top/left values mimic padding */
			top: 6px;
			left: 6px;
			width: 45%; 
			padding-right: 10px; 
			white-space: nowrap;
		}
		
		/*
		Label the data
		*/
		td:nth-of-type(1):before { content: "appName"; }
		td:nth-of-type(2):before { content: "scheduledDate"; }
		td:nth-of-type(3):before { content: "dateApproved"; }
		td:nth-of-type(4):before { content: "snapshot"; }
		td:nth-of-type(5):before { content: "environmentName"; }
		td:nth-of-type(6):before { content: "releaseName"; }
		td:nth-of-type(7):before { content: "status"; }
	}
	
	/* Smartphones (portrait and landscape) ----------- */
	@media only screen
	and (min-device-width : 320px)
	and (max-device-width : 480px) {
		body { 
			padding: 0; 
			margin: 0; 
			width: 320px; }
		}
	
	/* iPads (portrait and landscape) ----------- */
	@media only screen and (min-device-width: 768px) and (max-device-width: 1024px) {
		body { 
			width: 495px; 
		}
	}
	
	</style>
	<!--<![endif]-->
	<script>
	function exportTableToExcel(tableID, filename = ''){
	    var downloadLink;
	    var dataType = 'application/vnd.ms-excel';
	    var tableSelect = document.getElementById(tableID);
	    var tableHTML = tableSelect.outerHTML.replace(/ /g, '%20');
	    
	    // Specify file name
	    filename = filename?filename+'.xls':'excel_data.xls';
	    
	    // Create download link element
	    downloadLink = document.createElement("a");
	    
	    document.body.appendChild(downloadLink);
	    
	    if(navigator.msSaveOrOpenBlob){
	        var blob = new Blob(['\ufeff', tableHTML], {
	            type: dataType
	        });
	        navigator.msSaveOrOpenBlob( blob, filename);
	    }else{
	        // Create a link to the file
	        downloadLink.href = 'data:' + dataType + ', ' + tableHTML;
	    
	        // Setting the file name
	        downloadLink.download = filename;
	        
	        //triggering the function
	        downloadLink.click();
	    }
	}

	$(document).ready(function(){
	    $('#tblData td.y_n').each(function(){
	        if ($(this).text() == 'Passed Validation') {
	            $(this).css('background-color','#00FF00');
	        }
	        if ($(this).text() == 'Failed Validation') {
	            $(this).css('background-color','#f00');
	        }
	    });
	});

	</script>

</head>

<body>
	<div id="page-wrap">

	<h1>Release Data</h1><br>
	<button onclick="exportTableToExcel('tblData')">Export Table Data To Excel File</button><br>
	<br>
	<table id="tblData">
		<thead>
		<tr>
			<th>appName</th>
			<th>scheduledDate</th>
			<th>dateApproved</th>
			<th>snapshot</th>
			<th>environmentName</th>
			<th>releaseName</th>
			<th>status</th>
		</tr>
		</thead>
		<c:if test="${not empty lists}">
			<c:forEach var="listValue" items="${lists}">
		<tr>
		  <td>${listValue.appName}</td>
		  <td>${listValue.scheduledDate}</td>
		  <td>${listValue.dateApproved}</td>
		  <td>${listValue.snapshot}</td>
		  <td>${listValue.environmentName}</td>
		  <td>${listValue.releaseName}</td>
		  <td id="status" class="y_n">${listValue.status}</td>
		</tr>
			</c:forEach>
	       </c:if>
		</tbody>
	</table>
	</div>
		
</body>

</html>