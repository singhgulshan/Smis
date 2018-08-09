<%-- 
    Document   : PD
    Created on : Sep 23, 2015, 3:13:36 PM
    Author     : Gulshan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Personal Details</title>
    </head>
    <body>
        <h1 style="text-align:center">Personal Details</h1>
        <form action="PersonalDetail">
		<table>
			<tr>
			    <td>Student's Name</td>
			    <td><input type="text" name="fullname"></td>
			</tr>
			<tr>
			    <td>Father's Name</td>
			    <td><input type="text" name="fname"></td>
			</tr>
			<tr>
			    <td>Mother's Name</td>
			    <td><input type="text" name="mname"></td>
			</tr>
   			<tr>
			    <td>Date Of Birth</td>
			    <td><input type="date" name="dob"></td>
			</tr>
   			<tr>
			    <td>Permanent Address</td>
			    <td></td>
			</tr>
   			<tr>
			    <td>Address Line 1</td>
			    <td><input type="text" name="pl1"></td>
			</tr>
   			<tr>
			    <td>Address Line 2</td>
			    <td><input type="text" name="pl2"></td>
			</tr>
   			<tr>
			    <td>City</td>
			    <td><input type="text" name="pcname"></td>
			</tr>
   			<tr>
			    <td>District</td>
			    <td><input type="text" name="pdname"></td>
			</tr>
   			<tr>
			    <td>State</td>
			    <td><select name="pstate">
					<option value="Andhra Pradesh">Andhra Pradesh</option>
					<option value="Arunachal Pradesh">Arunachal Pradesh</option>
					<option value="Assam">Assam</option>
					<option value="Bihar">Bihar</option>
					<option value="Chandigarh">Chandigarh</option>
					<option value="Chhattisgarh">Chhattisgarh</option>
					<option value="Delhi">Delhi</option>
					<option value="Goa">Goa</option>
					<option value="Gujarat">Gujarat</option>
					<option value="Haryana">Haryana</option>
					<option value="Himachal Pradesh">Himchal Pradesh</option>
					<option value="Jammu & Kashmir">Jammu & Kashmir</option>
					<option value="Jharkhand">Jharkhand</option>
					<option value="Karnataka">Karnataka</option>
					<option value="Kerala">Kerala</option>
					<option value="Madhya Pradesh">Madhya Pradesh</option>
					<option value="Maharashtra">Maharashtra</option>
					<option value="Manipur">Manipur</option>
					<option value="Meghalaya">Meghalaya</option>
					<option value="Mizoram">Mizoram</option>
					<option value="Nagaland">Nagaland</option>
					<option value="Orrisa">Orrisa</option>
					<option value="Punjab">Punjab</option>
					<option value="Rajasthan">Rajasthan</option>
					<option value="Sikkim">Sikkim</option>
					<option value="Tamil Nadu">Tamil Nadu</option>
					<option value="Telangana">Telangana</option>
					<option value="Tripura">Tripura</option>
					<option value="Uttar Pradesh">Uttar Pradesh</option>
					<option value="Uttarakhand">Uttarakhand</option>
					<option value="West Bengal">West Bengal</option
                                </select>
			    </td>
			</tr>
   			<tr>
			    <td>Pin Code</td>
			    <td><input type="text" name="ppcode"></td>
			</tr>
			<tr>
			    <td>Present Address</td>
			    <td></td>
			</tr>
   			<tr>
			    <td>Address Line 1</td>
			    <td><input type="text" name="tl1"></td>
			</tr>
   			<tr>
			    <td>Address Line 2</td>
			    <td><input type="text" name="tl2"></td>
			</tr>
   			<tr>
			    <td>City</td>
			    <td><input type="text" name="tcname"></td>
			</tr>
   			<tr>
			    <td>District</td>
			    <td><input type="text" name="tdname"></td>
			</tr>
   			<tr>
			    <td>State</td>
			    <td><select name="tstate">
					<option value="Andhra Pradesh">Andhra Pradesh</option>
					<option value="Arunachal Pradesh">Arunachal Pradesh</option>
					<option value="Assam">Assam</option>
					<option value="Bihar">Bihar</option>
					<option value="Chandigarh">Chandigarh</option>
					<option value="Chhattisgarh">Chhattisgarh</option>
					<option value="Delhi">Delhi</option>
					<option value="Goa">Goa</option>
					<option value="Gujarat">Gujarat</option>
					<option value="Haryana">Haryana</option>
					<option value="Himachal Pradesh">Himchal Pradesh</option>
					<option value="Jammu & Kashmir">Jammu & Kashmir</option>
					<option value="Jharkhand">Jharkhand</option>
					<option value="Karnataka">Karnataka</option>
					<option value="Kerala">Kerala</option>
					<option value="Madhya Pradesh">Madhya Pradesh</option>
					<option value="Maharashtra">Maharashtra</option>
					<option value="Manipur">Manipur</option>
					<option value="Meghalaya">Meghalaya</option>
					<option value="Mizoram">Mizoram</option>
					<option value="Nagaland">Nagaland</option>
					<option value="Orrisa">Orrisa</option>
					<option value="Punjab">Punjab</option>
					<option value="Rajasthan">Rajasthan</option>
					<option value="Sikkim">Sikkim</option>
					<option value="Tamil Nadu">Tamil Nadu</option>
					<option value="Telangana">Telangana</option>
					<option value="Tripura">Tripura</option>
					<option value="Uttar Pradesh">Uttar Pradesh</option>
					<option value="Uttarakhand">Uttarakhand</option>
					<option value="West Bengal">West Bengal</option>
                                </select>
			    </td>
			</tr>
   			<tr>
			    <td>Pin Code</td>
			    <td><input type="text" name="tpcode"></td>
			</tr>
   			<tr>
			    <td>Contact Number</td>
			    <td><input type="text" name="cnumber"></td>
			</tr>
   			<tr>
			    <td>Parents Contact Number</td>
			    <td><input type="text" name="pcnumber"></td>
			</tr>
   			<tr>
			    <td>Alternate Contact Number</td>
			    <td><input type="text" name="acnumber"></td>
			</tr>
   			<tr>
			    <td>E-Mail Id</td>
			    <td><input type="email" name="emid"></td>
			</tr>
   			<tr>
			    <td>Blood Group</td>
			    <td><select name="bgroup">
					<option value="A positive">A+</option>
					<option value="A negative">A-</option>
					<option value="B positive">B+</option>
					<option value="B negative">B-</option>
					<option value="O positive">O+</option>
					<option value="O negative">O-</option>
					<option value="AB positive">AB+</option>
					<option value="AB negative">AB-</option>
				</select>
			    </td>
			</tr>
   			<tr>
			    <td>Gender</td>
			    <td><input type="radio" name="sex" value="Male">Male  <input type="radio" name="sex" value="Female">Female</td>
			</tr>
   			<tr>
			    <td>Category</td>
			    <td><select name="category">
					<option value="General">General</option>
					<option value="SC">SC</option>
					<option value="ST">ST</option>
					<option value="OBC">OBC</option>
					<option value="Other">Other</option>
                                </select>
			    </td>
			    <td>If Other <input type="text" name="oname"></td>
			</tr>
   			<tr>
			    <td>Nationality</td>
			    <td><input type="text" name="nationality"></td>
			</tr>
   			<tr>
			    <td>Domicile</td>
			    <td><select name="domicile">
					<option value="Andhra Pradesh">Andhra Pradesh</option>
					<option value="Arunachal Pradesh">Arunachal Pradesh</option>
					<option value="Assam">Assam</option>
					<option value="Bihar">Bihar</option>
					<option value="Chandigarh">Chandigarh</option>
					<option value="Chhattisgarh">Chhattisgarh</option>
					<option value="Delhi">Delhi</option>
					<option value="Goa">Goa</option>
					<option value="Gujarat">Gujarat</option>
					<option value="Haryana">Haryana</option>
					<option value="Himachal Pradesh">Himchal Pradesh</option>
					<option value="Jammu & Kashmir">Jammu & Kashmir</option>
					<option value="Jharkhand">Jharkhand</option>
					<option value="Karnataka">Karnataka</option>
					<option value="Kerala">Kerala</option>
					<option value="Madhya Pradesh">Madhya Pradesh</option>
					<option value="Maharashtra">Maharashtra</option>
					<option value="Manipur">Manipur</option>
					<option value="Meghalaya">Meghalaya</option>
					<option value="Mizoram">Mizoram</option>
					<option value="Nagaland">Nagaland</option>
					<option value="Orrisa">Orrisa</option>
					<option value="Punjab">Punjab</option>
					<option value="Rajasthan">Rajasthan</option>
					<option value="Sikkim">Sikkim</option>
					<option value="Tamil Nadu">Tamil Nadu</option>
					<option value="Telangana">Telangana</option>
					<option value="Tripura">Tripura</option>
					<option value="Uttar Pradesh">Uttar Pradesh</option>
					<option value="Uttarakhand">Uttarakhand</option>
					<option value="West Bengal">West Bengal</option>
                                </select>
			    </td>
			</tr>
   			<tr>
			    <td>Photo</td>
			    <td><input type="text" name="photo"></td>
			</tr>
   			<tr>
			    <td><button type="submit" value="Submit">Submit</button></td>
			    <td><button type="reset" value="reset">Reset</button></td>
			</tr>
		</table>
		</form>
    </body>
</html>
