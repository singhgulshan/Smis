<%-- 
    Document   : UpdateInfo
    Created on : Sep 29, 2015, 3:28:28 PM
    Author     : Gulshan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Info</title>
    </head>
    <body>
        <h1 style="text-align:center">Update Student Details</h1>
        <form action="UpdatePersonalDetails.jsp">
            <table>
                <tr>
                    <td>Enter StudentID:</td>
                    <td><input type="text" name='studentid'</td>
                </tr>
                <tr>
                       <td><button type="submit" value="Submit">Submit</button></td>
	               <td><button type="reset" value="reset">Reset</button></td>
                </tr>
            </table> 
        </form>
    </body>
</html>
