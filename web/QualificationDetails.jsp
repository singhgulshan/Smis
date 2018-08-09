<%-- 
    Document   : QD
    Created on : Sep 25, 2015, 3:09:29 PM
    Author     : Gulshan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Qualification Details</title>
    </head>
    <body>
        <h1 style="text-align:center">Qualification Details</h1>
             <form action="QualificationDetailController">
		<table>
   			<tr>
			    <td><b><font size="5">10th</font></b></td>
			</tr>
   			<tr>
			    <td>School</td>
			    <td><input type="text" name="tscname"></td>
			</tr>
   			<tr>
			    <td>Board</td>
			    <td><input type="text" name="tbrname"></td>
			</tr>
      			<tr>
			    <td>Year Of Passing</td>
			    <td><input type="text" name="tyop"></td>
			</tr>
   			<tr>
			    <td>Percentage/Grade</td>
			    <td><input type="text" name="tpgname"></td>
			</tr>
   			<tr>
			    <td></td>
			</tr>
   			<tr>
			    <td></td>
			</tr>
   			<tr>
			    <td><b><font size="5">12th</font></b></td>
			</tr>
   			<tr>
			    <td>School</td>
			    <td><input type="text" name="twscname"></td>
			</tr>
   			<tr>
			    <td>Board</td>
			    <td><input type="text" name="twbrname"></td>
			</tr>
   			<tr>
			    <td>Year Of Passing</td>
			    <td><input type="text" name="twyop"></td>
			</tr>
   			<tr>
			    <td>Percentage/Grade</td>
			    <td><input type="text" name="twpgname"></td>
			</tr>
   			<tr>
			    <td></td>
			</tr>
   			<tr>
			    <td></td>
			</tr>
   			<tr>
			    <td></td>
			</tr>
                        <tr>
			    <td></td>
			</tr>
   			<tr>
			    <td></td>
			</tr>
   			<tr>
			    <td></td>
			</tr>
   			<tr>
			    <td><button type="submit" value="Submit">Submit</button></td>
			    <td><button type="reset" value="reset">Reset</button></td>
			</tr>                        
		</table>
	    </form>
    </body>
</html>
