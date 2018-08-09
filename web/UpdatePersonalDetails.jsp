<%-- 
    Document   : update
    Created on : Sep 29, 2015, 8:56:26 AM
    Author     : Gulshan
--%>
<%@page import="com.ctc.smis.vo.PersonalDetailsVO"%>
<%@page import="com.ctc.smis.dao.GetPersonalDetailsDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Personal Details</title>
    </head>
    <body>
        <h1 style="text-align:center">Personal Details</h1>
        <form action="UpdatePersonalDetailController">
        <table>
            
        <%
            GetPersonalDetailsDAO updatedetaildao = new GetPersonalDetailsDAO();
            session.setAttribute("studentid", request.getParameter("studentid"));
            PersonalDetailsVO detail = updatedetaildao.getPersonalDetails(request.getParameter("studentid"));
            if(detail != null){
                String bgroup = detail.getBgroup();
                String category = detail.getCategory();    
                String domicile = detail.getDomicile();            
                String gender = detail.getGender();
                String pstate = detail.getPstate();
                String tstate = detail.getTstate();                             
            %>
                   <tr>
			    <td>Student's Name</td>
                            <td><input type="text" value="<%=detail.getStudentname()%>" name="fullname"></td>
			</tr>
			<tr>
			    <td>Father's Name</td>
			    <td><input type="text" value="<%=detail.getFathername()%>" name="fname"></td>
			</tr>
			<tr>
			    <td>Mother's Name</td>
			    <td><input type="text" value="<%=detail.getMothername()%>" name="mname"></td>
			</tr>
   			<tr>
			    <td>Date Of Birth</td>
			    <td><input type="date" value="<%=detail.getDob()%>" name="dob"></td>
			</tr>
   			<tr>
			    <td>Permanent Address</td>
			    <td></td>
			</tr>
   			<tr>
			    <td>Address Line 1</td>
			    <td><input type="text" value="<%=detail.getPline1()%>" name="pl1"></td>
			</tr>
   			<tr>
			    <td>Address Line 2</td>
			    <td><input type="text" value="<%=detail.getPline2()%>" name="pl2"></td>
			</tr>
   			<tr>
			    <td>City</td>
			    <td><input type="text" value="<%=detail.getPcity()%>" name="pcname"></td>
			</tr>
   			<tr>
			    <td>District</td>
			    <td><input type="text" value="<%=detail.getPdistrict()%>" name="pdname"></td>
			</tr>
                        <tr>
			    <td>State</td>
                            <td><select name="pstate">
                                    <option value="Andhra Pradesh" <%if(pstate.equals("Andhra Pradesh")){%>selected<%}%>>Andhra Pradesh</option>
					<option value="Arunachal Pradesh" <%if(pstate.equals("Andhra Pradesh")){%>selected<%}%>>Arunachal Pradesh</option>
					<option value="Assam" <%if(pstate.equals("Assam")){%>selected<%}%>>Assam</option>
					<option value="Bihar" <%if(pstate.equals("Bihar")){%>selected<%}%>>Bihar</option>
					<option value="Chandigarh" <%if(pstate.equals("Chandigarh")){%>selected<%}%>>Chandigarh</option>  
                                        <option value="Chhattisgarh" <%if(pstate.equals("Chhattisgarh")){%>selected<%}%>>Chhattisgarh</option>
					<option value="Delhi" <%if(pstate.equals("Delhi")){%>selected<%}%>>Delhi</option>
					<option value="Goa" <%if(pstate.equals("Goa")){%>selected<%}%>>Goa</option>
					<option value="Gujarat" <%if(pstate.equals("Gujarat")){%>selected<%}%>>Gujarat</option>
					<option value="Haryana" <%if(pstate.equals("Haryana")){%>selected<%}%>>Haryana</option>
					<option value="Himachal Pradesh" <%if(pstate.equals("Himachal Pradesh")){%>selected<%}%>>Himchal Pradesh</option>
					<option value="Jammu & Kashmir" <%if(pstate.equals("Jammu & Kashmir")){%>selected<%}%>>Jammu & Kashmir</option>
					<option value="Jharkhand" <%if(pstate.equals("Jharkhand")){%>selected<%}%>>Jharkhand</option>
					<option value="Karnataka" <%if(pstate.equals("Karnataka")){%>selected<%}%>>Karnataka</option>
					<option value="Kerala" <%if(pstate.equals("Andhra Pradesh")){%>selected<%}%>>Kerala</option>
					<option value="Madhya Pradesh" <%if(pstate.equals("Madhya Pradesh")){%>selected<%}%>>Madhya Pradesh</option>
					<option value="Maharashtra" <%if(pstate.equals("Maharashtra")){%>selected<%}%>>Maharashtra</option>
					<option value="Manipur" <%if(pstate.equals("Manipur")){%>selected<%}%>>Manipur</option>
					<option value="Meghalaya" <%if(pstate.equals("Meghalaya")){%>selected<%}%>>Meghalaya</option>
					<option value="Mizoram" <%if(pstate.equals("Mizoram")){%>selected<%}%>>Mizoram</option>
					<option value="Nagaland" <%if(pstate.equals("Nagaland")){%>selected<%}%>>Nagaland</option>
					<option value="Orrisa" <%if(pstate.equals("Orrisa")){%>selected<%}%>>Orrisa</option>
					<option value="Punjab" <%if(pstate.equals("Punjab")){%>selected<%}%>>Punjab</option>
					<option value="Rajasthan" <%if(pstate.equals("Rajasthan")){%>selected<%}%>>Rajasthan</option>
					<option value="Sikkim" <%if(pstate.equals("Sikkim")){%>selected<%}%>>Sikkim</option>
					<option value="Tamil Nadu" <%if(pstate.equals("Tamil Nadu")){%>selected<%}%>>Tamil Nadu</option>
					<option value="Telangana" <%if(pstate.equals("Telangana")){%>selected<%}%>>Telangana</option>
					<option value="Tripura" <%if(pstate.equals("Tripura")){%>selected<%}%>>Tripura</option>
					<option value="Uttar Pradesh" <%if(pstate.equals("Uttar Pradesh")){%>selected<%}%>>Uttar Pradesh</option>
					<option value="Uttarakhand" <%if(pstate.equals("Uttarakhand")){%>selected<%}%>>Uttarakhand</option>
					<option value="West Bengal" <%if(pstate.equals("West Bengal")){%>selected<%}%>>West Bengal</option
                                </select>
			    </td>
			</tr>
   			<tr>
			    <td>Pin Code</td>
                            <td><input type="text" value="<%=detail.getPpincode()%>" name="ppcode"></td>
			</tr>
			<tr>
			    <td>Present Address</td>
			    <td></td>
			</tr>
   			<tr>
			    <td>Address Line 1</td>
                            <td><input type="text" value="<%=detail.getTline1()%>" name="tl1"></td>
			</tr>
   			<tr>
			    <td>Address Line 2</td>
			    <td><input type="text" value="<%=detail.getTline2()%>" name="tl2"></td>
			</tr>
   			<tr>
			    <td>City</td>
			    <td><input type="text" value="<%=detail.getTcity()%>" name="tcname"></td>
			</tr>
   			<tr>
			    <td>District</td>
			    <td><input type="text" value="<%=detail.getTdistrict()%>" name="tdname"></td>
			</tr>
   			<tr>
			    <td>State</td>
			    <td><select name="tstate">
					<option value="Andhra Pradesh" <%if(tstate.equals("Andhra Pradesh")){%>selected<%}%>>Andhra Pradesh</option>
					<option value="Arunachal Pradesh" <%if(tstate.equals("Andhra Pradesh")){%>selected<%}%>>Arunachal Pradesh</option>
					<option value="Assam" <%if(tstate.equals("Assam")){%>selected<%}%>>Assam</option>
					<option value="Bihar" <%if(tstate.equals("Bihar")){%>selected<%}%>>Bihar</option>
					<option value="Chandigarh" <%if(tstate.equals("Chandigarh")){%>selected<%}%>>Chandigarh</option>  
                                        <option value="Chhattisgarh" <%if(tstate.equals("Chhattisgarh")){%>selected<%}%>>Chhattisgarh</option>
					<option value="Delhi" <%if(tstate.equals("Delhi")){%>selected<%}%>>Delhi</option>
					<option value="Goa" <%if(tstate.equals("Goa")){%>selected<%}%>>Goa</option>
					<option value="Gujarat" <%if(tstate.equals("Gujarat")){%>selected<%}%>>Gujarat</option>
					<option value="Haryana" <%if(tstate.equals("Haryana")){%>selected<%}%>>Haryana</option>
					<option value="Himachal Pradesh" <%if(tstate.equals("Himachal Pradesh")){%>selected<%}%>>Himchal Pradesh</option>
					<option value="Jammu & Kashmir" <%if(tstate.equals("Jammu & Kashmir")){%>selected<%}%>>Jammu & Kashmir</option>
					<option value="Jharkhand" <%if(tstate.equals("Jharkhand")){%>selected<%}%>>Jharkhand</option>
					<option value="Karnataka" <%if(tstate.equals("Karnataka")){%>selected<%}%>>Karnataka</option>
					<option value="Kerala" <%if(tstate.equals("Andhra Pradesh")){%>selected<%}%>>Kerala</option>
					<option value="Madhya Pradesh" <%if(tstate.equals("Madhya Pradesh")){%>selected<%}%>>Madhya Pradesh</option>
					<option value="Maharashtra" <%if(tstate.equals("Maharashtra")){%>selected<%}%>>Maharashtra</option>
					<option value="Manipur" <%if(tstate.equals("Manipur")){%>selected<%}%>>Manipur</option>
					<option value="Meghalaya" <%if(tstate.equals("Meghalaya")){%>selected<%}%>>Meghalaya</option>
					<option value="Mizoram" <%if(tstate.equals("Mizoram")){%>selected<%}%>>Mizoram</option>
					<option value="Nagaland" <%if(tstate.equals("Nagaland")){%>selected<%}%>>Nagaland</option>
					<option value="Orrisa" <%if(tstate.equals("Orrisa")){%>selected<%}%>>Orrisa</option>
					<option value="Punjab" <%if(tstate.equals("Punjab")){%>selected<%}%>>Punjab</option>
					<option value="Rajasthan" <%if(tstate.equals("Rajasthan")){%>selected<%}%>>Rajasthan</option>
					<option value="Sikkim" <%if(tstate.equals("Sikkim")){%>selected<%}%>>Sikkim</option>
					<option value="Tamil Nadu" <%if(tstate.equals("Tamil Nadu")){%>selected<%}%>>Tamil Nadu</option>
					<option value="Telangana" <%if(tstate.equals("Telangana")){%>selected<%}%>>Telangana</option>
					<option value="Tripura" <%if(tstate.equals("Tripura")){%>selected<%}%>>Tripura</option>
					<option value="Uttar Pradesh" <%if(tstate.equals("Uttar Pradesh")){%>selected<%}%>>Uttar Pradesh</option>
					<option value="Uttarakhand" <%if(tstate.equals("Uttarakhand")){%>selected<%}%>>Uttarakhand</option>
					<option value="West Bengal" <%if(tstate.equals("West Bengal")){%>selected<%}%>>West Bengal</option
                                </select>
			    </td>
			</tr>
   			<tr>
			    <td>Pin Code</td>
                            <td><input type="text" value="<%=detail.getTpincode()%>" name="tpcode"></td>
			</tr>
   			<tr>
			    <td>Contact Number</td>
			    <td><input type="text" value="<%=detail.getCnumber()%>" name="cnumber"></td>
			</tr>
   			<tr>
			    <td>Parents Contact Number</td>
			    <td><input type="text" value="<%=detail.getPcnumber()%>" name="pcnumber"></td>
			</tr>
   			<tr>
			    <td>Alternate Contact Number</td>
			    <td><input type="text" value="<%=detail.getAcnumber()%>" name="acnumber"></td>
			</tr>
   			<tr>
			    <td>E-Mail Id</td>
                            <td><input type="email" value="<%=detail.getEmail()%>" name="emid"></td>
			</tr>
   			<tr>
			    <td>Blood Group</td>
			    <td><select name="bgroup">
					<option value="A positive" <%if(bgroup.equals("A positive")){%>selected<%}%>>A+</option>
					<option value="A negative" <%if(bgroup.equals("A negative")){%>selected<%}%>>A-</option>
					<option value="B positive" <%if(bgroup.equals("B positive")){%>selected<%}%>>B+</option>
					<option value="B negative" <%if(bgroup.equals("B negative")){%>selected<%}%>>B-</option>
					<option value="O positive" <%if(bgroup.equals("O positive")){%>selected<%}%>>O+</option>
					<option value="O negative" <%if(bgroup.equals("O negative")){%>selected<%}%>>O-</option>
					<option value="AB positive" <%if(bgroup.equals("AB positive")){%>selected<%}%>>AB+</option>
					<option value="AB negative" <%if(bgroup.equals("AB negative")){%>selected<%}%>>AB-</select>
			    </td>
			</tr>
   			<tr>
			    <td>Gender</td>
			    <td><input type="radio" name="sex" value="Male" <%if(gender.equals("Male")){%>checked<%}%>>Male  
                                <input type="radio" name="sex" value="Female" <%if(gender.equals("Female")){%>checked<%}%>>Female</td>
			</tr>
   			<tr>
			    <td>Category</td>
			    <td><select name="category">
					<option value="General" <%if(category.equals("General")){%>selected<%}%>>General</option>
					<option value="SC" <%if(category.equals("SC")){%>selected<%}%>>SC</option>
					<option value="ST" <%if(category.equals("ST")){%>selected<%}%>>ST</option>
					<option value="OBC" <%if(category.equals("OBC")){%>selected<%}%>>OBC</option>
					<option value="Other" <%if(category.equals("Other")){%>selected<%}%>>Other</option>
                                </select>
			    </td>
                            <td>If Other <input type="text" name="oname" value="<%=detail.getOther()%>"></td>
			</tr>
   			<tr>
			    <td>Nationality</td>
                            <td><input type="text" name="nationality" value="<%=detail.getNationality()%>"></td>
			</tr>
   			<tr>
			    <td>Domicile</td>
			    <td><select name="domicile">
					<option value="Andhra Pradesh" <%if(domicile.equals("Andhra Pradesh")){%>selected<%}%>>Andhra Pradesh</option>
					<option value="Arunachal Pradesh" <%if(domicile.equals("Andhra Pradesh")){%>selected<%}%>>Arunachal Pradesh</option>
					<option value="Assam" <%if(domicile.equals("Assam")){%>selected<%}%>>Assam</option>
					<option value="Bihar" <%if(domicile.equals("Bihar")){%>selected<%}%>>Bihar</option>
					<option value="Chandigarh" <%if(domicile.equals("Chandigarh")){%>selected<%}%>>Chandigarh</option>  
                                        <option value="Chhattisgarh" <%if(domicile.equals("Chhattisgarh")){%>selected<%}%>>Chhattisgarh</option>
					<option value="Delhi" <%if(domicile.equals("Delhi")){%>selected<%}%>>Delhi</option>
					<option value="Goa" <%if(domicile.equals("Goa")){%>selected<%}%>>Goa</option>
					<option value="Gujarat" <%if(domicile.equals("Gujarat")){%>selected<%}%>>Gujarat</option>
					<option value="Haryana" <%if(domicile.equals("Haryana")){%>selected<%}%>>Haryana</option>
					<option value="Himachal Pradesh" <%if(domicile.equals("Himachal Pradesh")){%>selected<%}%>>Himchal Pradesh</option>
					<option value="Jammu & Kashmir" <%if(domicile.equals("Jammu & Kashmir")){%>selected<%}%>>Jammu & Kashmir</option>
					<option value="Jharkhand" <%if(domicile.equals("Jharkhand")){%>selected<%}%>>Jharkhand</option>
					<option value="Karnataka" <%if(domicile.equals("Karnataka")){%>selected<%}%>>Karnataka</option>
					<option value="Kerala" <%if(domicile.equals("Andhra Pradesh")){%>selected<%}%>>Kerala</option>
					<option value="Madhya Pradesh" <%if(domicile.equals("Madhya Pradesh")){%>selected<%}%>>Madhya Pradesh</option>
					<option value="Maharashtra" <%if(domicile.equals("Maharashtra")){%>selected<%}%>>Maharashtra</option>
					<option value="Manipur" <%if(domicile.equals("Manipur")){%>selected<%}%>>Manipur</option>
					<option value="Meghalaya" <%if(domicile.equals("Meghalaya")){%>selected<%}%>>Meghalaya</option>
					<option value="Mizoram" <%if(domicile.equals("Mizoram")){%>selected<%}%>>Mizoram</option>
					<option value="Nagaland" <%if(domicile.equals("Nagaland")){%>selected<%}%>>Nagaland</option>
					<option value="Orrisa" <%if(domicile.equals("Orrisa")){%>selected<%}%>>Orrisa</option>
					<option value="Punjab" <%if(domicile.equals("Punjab")){%>selected<%}%>>Punjab</option>
					<option value="Rajasthan" <%if(domicile.equals("Rajasthan")){%>selected<%}%>>Rajasthan</option>
					<option value="Sikkim" <%if(domicile.equals("Sikkim")){%>selected<%}%>>Sikkim</option>
					<option value="Tamil Nadu" <%if(domicile.equals("Tamil Nadu")){%>selected<%}%>>Tamil Nadu</option>
					<option value="Telangana" <%if(domicile.equals("Telangana")){%>selected<%}%>>Telangana</option>
					<option value="Tripura" <%if(domicile.equals("Tripura")){%>selected<%}%>>Tripura</option>
					<option value="Uttar Pradesh" <%if(domicile.equals("Uttar Pradesh")){%>selected<%}%>>Uttar Pradesh</option>
					<option value="Uttarakhand" <%if(domicile.equals("Uttarakhand")){%>selected<%}%>>Uttarakhand</option>
					<option value="West Bengal" <%if(domicile.equals("West Bengal")){%>selected<%}%>>West Bengal</option
                                </select>
			    </td>
			</tr>
   			<tr>
			    <td>Photo</td>
                            <td><input type="text" name="photo" value="<%=detail.getPhoto()%>"></td>
			</tr>
   			<tr>
			    <td><button type="submit" value="Submit">Submit</button></td>
			    <td><button type="reset" value="reset">Reset</button></td>
			</tr>
              </form>
             </table>
                 
                   <%
            }
               else{%>
                   <form>
                       <b>Error Personal Details Of StudentID : <%=request.getParameter("studentid")%> Is Not Found.</b><br>
                       <input action="action" type="button" value="Search Again" onclick="history.go(-1);"/>
                     </form>
                     <%
               }
             %>
        
    </body>
</html>
