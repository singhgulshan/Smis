<%-- 
    Document   : UpdateQualificationDetails
    Created on : Oct 5, 2015, 9:42:24 AM
    Author     : Gulshan
--%>

<%@page import="com.ctc.smis.vo.QualificationDetailsVO"%>
<%@page import="com.ctc.smis.dao.GetQualificationDetailsDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Qualification Details</title>
    </head>
    <body>
        <h1 style="text-align:center">Qualification Details</h1>
             <form action="UpdateQualificationDetailController">
		<table>
                    <%
                        String studentid = (String) session.getAttribute("studentid");
                        GetQualificationDetailsDAO updatedetaildao =  new GetQualificationDetailsDAO();
                        QualificationDetailsVO detail = updatedetaildao.getQualificationDetails(studentid);
                        
                        if(detail != null){                                                           
                    %>
   			<tr>
			    <td><b><font size="5">10th</font></b></td>
			</tr>
   			<tr>
			    <td>School</td>
                            <td><input type="text" value="<%=detail.getTenschool()%>" name="tscname"></td>
			</tr>
   			<tr>
			    <td>Board</td>
                            <td><input type="text" value="<%=detail.getTenboard()%>" name="tbrname"></td>
			</tr>
      			<tr>
			    <td>Year Of Passing</td>
			    <td><input type="text" value="<%=detail.getTenyop()%>" name="tyop"></td>
			</tr>
   			<tr>
			    <td>Percentage/Grade</td>
			    <td><input type="text" value="<%=detail.getTenprgrade()%>" name="tpgname"></td>
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
			    <td><input type="text" value="<%=detail.getTwelveschool()%>" name="twscname"></td>
			</tr>
   			<tr>
			    <td>Board</td>
			    <td><input type="text" value="<%=detail.getTwelveboard()%>" name="twbrname"></td>
			</tr>
   			<tr>
			    <td>Year Of Passing</td>
			    <td><input type="text" value="<%=detail.getTwelveyop()%>" name="twyop"></td>
			</tr>
   			<tr>
			    <td>Percentage/Grade</td>
			    <td><input type="text" value="<%=detail.getTwelvepergrade()%>" name="twpgname"></td>
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
                        <%
            }
               else{%>
                   <form>
                       <b>Error Qualification Details Of StudentID : <%=request.getParameter("studentid")%> Is Not Found.</b><br>
                       <input action="action" type="button" value="Search Again" onclick="history.go(-2);"/>
                     </form>
                     <%
               }
             %>
    </body>
</html>
