<%-- 
    Document   : AdmissionDetails
    Created on : Sep 26, 2015, 5:45:23 PM
    Author     : Gulshan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admission Details</title>
    </head>
    <body>
        <h1 style="text-align:center">Admission Details</h1>
		<form action="AdmissionDetailController">
		<table>
			<tr>
			    <td>Year Of Admission</td>
			    <td><select name="admissionyear">
					<option value="2015">2015</option>
					<option value="2016">2016</option>
					<option value="2017">2017</option>
					<option value="2018">2018</option>
					<option value="2019">2019</option>
					<option value="2020">2020</option>
					<option value="2021">2021</option>
					<option value="2022">2022</option>
					<option value="2023">2023</option>
					<option value="2024">2024</option>
					<option value="2025">2025</option>
					<option value="2026">2026</option>
					<option value="2027">2027</option>
					<option value="2028">2028</option>
					<option value="2029">2029</option>
					<option value="2030">2030</option>
					<option value="2031">2031</option>
					<option value="2032">2032</option>
					<option value="2033">2033</option>
					<option value="2034">2034</option>
					<option value="2035">2035</option>
					<option value="2036">2036</option>
					<option value="2037">2037</option>
					<option value="2038">2038</option>
					<option value="2039">2039</option>
					<option value="2040">2040</option>
					<option value="2041">2041</option>
					<option value="2042">2042</option>
					<option value="2043">2043</option>
					<option value="2044">2044</option>
					<option value="2045">2045</option>
					<option value="2046">2046</option>
					<option value="2047">2047</option>
					<option value="2048">2048</option>
					<option value="2049">2049</option>
					<option value="2050">2050</option>

				</select>
                            </td>
			</tr>
			<tr>
			    <td>Admission Through</td>
			    <td><input type="text" name="admissionthrough"></td>
			</tr>
			<tr>
			    <td>Branch</td>
			    <td><select name="branch">
					<option value="ME">ME (Mechanical Engineering)</option>
					<option value="CE">CE (Civil Engineering)</option>
					<option value="CS">CS (Computer Science)</option>
					<option value="EL">EL (Electrical Engineering)</option>
					<option value="EE">EE (Electrical & Electronics)</option>
					<option value="EI">EI (Electronics & Instrumentation)</option>
					<option value="IT">IT (Information Technology)</option>
					</select>
			</td>
			</tr>
			<tr>
			    <td>Academic Gap</td>
			    <td><select name="gap">
					<option value="No">None</option>
					<option value="1 Year">1 Year</option>
					<option value="2 Years">2 Years</option>
					<option value="3 Years">3 Years</option>
				</select>
			</td>
			</tr>
   			<tr>
			    <td>Document Submitted</td>
			    <td><input type="checkbox" name="migration" value="101">Migration <input type="checkbox" name="10result" value="102">1oth Result<br>
  			        <input type="checkbox" name="12result" value="103">12th Result <input type="checkbox" name="domicile" value="104">Domicile Certificate<br>
				<input type="checkbox" name="caste" value="105">Caste Certificate <input type="checkbox" name="petscore" value="106">PET Score Card<br></td>
			</tr>
   			<tr>
			    <td><button type="submit" value="Submit">Submit</button></td>
			    <td><button type="reset" value="reset">Reset</button></td>
			</tr>
                </table>
                </form>
    </body>
</html>
