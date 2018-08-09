package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PersonalDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Personal Details</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1 style=\"text-align:center\">Personal Details</h1>\n");
      out.write("        <form action=\"PersonalDetail\">\n");
      out.write("\t\t<table>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t    <td>Student's Name</td>\n");
      out.write("\t\t\t    <td><input type=\"text\" name=\"fullname\"></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t    <td>Father's Name</td>\n");
      out.write("\t\t\t    <td><input type=\"text\" name=\"fname\"></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t    <td>Mother's Name</td>\n");
      out.write("\t\t\t    <td><input type=\"text\" name=\"mname\"></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("   \t\t\t<tr>\n");
      out.write("\t\t\t    <td>Date Of Birth</td>\n");
      out.write("\t\t\t    <td><input type=\"date\" name=\"dob\"></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("   \t\t\t<tr>\n");
      out.write("\t\t\t    <td>Permanent Address</td>\n");
      out.write("\t\t\t    <td></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("   \t\t\t<tr>\n");
      out.write("\t\t\t    <td>Address Line 1</td>\n");
      out.write("\t\t\t    <td><input type=\"text\" name=\"pl1\"></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("   \t\t\t<tr>\n");
      out.write("\t\t\t    <td>Address Line 2</td>\n");
      out.write("\t\t\t    <td><input type=\"text\" name=\"pl2\"></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("   \t\t\t<tr>\n");
      out.write("\t\t\t    <td>City</td>\n");
      out.write("\t\t\t    <td><input type=\"text\" name=\"pcname\"></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("   \t\t\t<tr>\n");
      out.write("\t\t\t    <td>District</td>\n");
      out.write("\t\t\t    <td><input type=\"text\" name=\"pdname\"></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("   \t\t\t<tr>\n");
      out.write("\t\t\t    <td>State</td>\n");
      out.write("\t\t\t    <td><select name=\"pstate\">\n");
      out.write("\t\t\t\t\t<option value=\"Andhra Pradesh\">Andhra Pradesh</option>\n");
      out.write("\t\t\t\t\t<option value=\"Arunachal Pradesh\">Arunachal Pradesh</option>\n");
      out.write("\t\t\t\t\t<option value=\"Assam\">Assam</option>\n");
      out.write("\t\t\t\t\t<option value=\"Bihar\">Bihar</option>\n");
      out.write("\t\t\t\t\t<option value=\"Chandigarh\">Chandigarh</option>\n");
      out.write("\t\t\t\t\t<option value=\"Chhattisgarh\">Chhattisgarh</option>\n");
      out.write("\t\t\t\t\t<option value=\"Delhi\">Delhi</option>\n");
      out.write("\t\t\t\t\t<option value=\"Goa\">Goa</option>\n");
      out.write("\t\t\t\t\t<option value=\"Gujarat\">Gujarat</option>\n");
      out.write("\t\t\t\t\t<option value=\"Haryana\">Haryana</option>\n");
      out.write("\t\t\t\t\t<option value=\"Himachal Pradesh\">Himchal Pradesh</option>\n");
      out.write("\t\t\t\t\t<option value=\"Jammu & Kashmir\">Jammu & Kashmir</option>\n");
      out.write("\t\t\t\t\t<option value=\"Jharkhand\">Jharkhand</option>\n");
      out.write("\t\t\t\t\t<option value=\"Karnataka\">Karnataka</option>\n");
      out.write("\t\t\t\t\t<option value=\"Kerala\">Kerala</option>\n");
      out.write("\t\t\t\t\t<option value=\"Madhya Pradesh\">Madhya Pradesh</option>\n");
      out.write("\t\t\t\t\t<option value=\"Maharashtra\">Maharashtra</option>\n");
      out.write("\t\t\t\t\t<option value=\"Manipur\">Manipur</option>\n");
      out.write("\t\t\t\t\t<option value=\"Meghalaya\">Meghalaya</option>\n");
      out.write("\t\t\t\t\t<option value=\"Mizoram\">Mizoram</option>\n");
      out.write("\t\t\t\t\t<option value=\"Nagaland\">Nagaland</option>\n");
      out.write("\t\t\t\t\t<option value=\"Orrisa\">Orrisa</option>\n");
      out.write("\t\t\t\t\t<option value=\"Punjab\">Punjab</option>\n");
      out.write("\t\t\t\t\t<option value=\"Rajasthan\">Rajasthan</option>\n");
      out.write("\t\t\t\t\t<option value=\"Sikkim\">Sikkim</option>\n");
      out.write("\t\t\t\t\t<option value=\"Tamil Nadu\">Tamil Nadu</option>\n");
      out.write("\t\t\t\t\t<option value=\"Telangana\">Telangana</option>\n");
      out.write("\t\t\t\t\t<option value=\"Tripura\">Tripura</option>\n");
      out.write("\t\t\t\t\t<option value=\"Uttar Pradesh\">Uttar Pradesh</option>\n");
      out.write("\t\t\t\t\t<option value=\"Uttarakhand\">Uttarakhand</option>\n");
      out.write("\t\t\t\t\t<option value=\"West Bengal\">West Bengal</option\n");
      out.write("                                </select>\n");
      out.write("\t\t\t    </td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("   \t\t\t<tr>\n");
      out.write("\t\t\t    <td>Pin Code</td>\n");
      out.write("\t\t\t    <td><input type=\"text\" name=\"ppcode\"></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t    <td>Present Address</td>\n");
      out.write("\t\t\t    <td></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("   \t\t\t<tr>\n");
      out.write("\t\t\t    <td>Address Line 1</td>\n");
      out.write("\t\t\t    <td><input type=\"text\" name=\"tl1\"></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("   \t\t\t<tr>\n");
      out.write("\t\t\t    <td>Address Line 2</td>\n");
      out.write("\t\t\t    <td><input type=\"text\" name=\"tl2\"></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("   \t\t\t<tr>\n");
      out.write("\t\t\t    <td>City</td>\n");
      out.write("\t\t\t    <td><input type=\"text\" name=\"tcname\"></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("   \t\t\t<tr>\n");
      out.write("\t\t\t    <td>District</td>\n");
      out.write("\t\t\t    <td><input type=\"text\" name=\"tdname\"></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("   \t\t\t<tr>\n");
      out.write("\t\t\t    <td>State</td>\n");
      out.write("\t\t\t    <td><select name=\"tstate\">\n");
      out.write("\t\t\t\t\t<option value=\"Andhra Pradesh\">Andhra Pradesh</option>\n");
      out.write("\t\t\t\t\t<option value=\"Arunachal Pradesh\">Arunachal Pradesh</option>\n");
      out.write("\t\t\t\t\t<option value=\"Assam\">Assam</option>\n");
      out.write("\t\t\t\t\t<option value=\"Bihar\">Bihar</option>\n");
      out.write("\t\t\t\t\t<option value=\"Chandigarh\">Chandigarh</option>\n");
      out.write("\t\t\t\t\t<option value=\"Chhattisgarh\">Chhattisgarh</option>\n");
      out.write("\t\t\t\t\t<option value=\"Delhi\">Delhi</option>\n");
      out.write("\t\t\t\t\t<option value=\"Goa\">Goa</option>\n");
      out.write("\t\t\t\t\t<option value=\"Gujarat\">Gujarat</option>\n");
      out.write("\t\t\t\t\t<option value=\"Haryana\">Haryana</option>\n");
      out.write("\t\t\t\t\t<option value=\"Himachal Pradesh\">Himchal Pradesh</option>\n");
      out.write("\t\t\t\t\t<option value=\"Jammu & Kashmir\">Jammu & Kashmir</option>\n");
      out.write("\t\t\t\t\t<option value=\"Jharkhand\">Jharkhand</option>\n");
      out.write("\t\t\t\t\t<option value=\"Karnataka\">Karnataka</option>\n");
      out.write("\t\t\t\t\t<option value=\"Kerala\">Kerala</option>\n");
      out.write("\t\t\t\t\t<option value=\"Madhya Pradesh\">Madhya Pradesh</option>\n");
      out.write("\t\t\t\t\t<option value=\"Maharashtra\">Maharashtra</option>\n");
      out.write("\t\t\t\t\t<option value=\"Manipur\">Manipur</option>\n");
      out.write("\t\t\t\t\t<option value=\"Meghalaya\">Meghalaya</option>\n");
      out.write("\t\t\t\t\t<option value=\"Mizoram\">Mizoram</option>\n");
      out.write("\t\t\t\t\t<option value=\"Nagaland\">Nagaland</option>\n");
      out.write("\t\t\t\t\t<option value=\"Orrisa\">Orrisa</option>\n");
      out.write("\t\t\t\t\t<option value=\"Punjab\">Punjab</option>\n");
      out.write("\t\t\t\t\t<option value=\"Rajasthan\">Rajasthan</option>\n");
      out.write("\t\t\t\t\t<option value=\"Sikkim\">Sikkim</option>\n");
      out.write("\t\t\t\t\t<option value=\"Tamil Nadu\">Tamil Nadu</option>\n");
      out.write("\t\t\t\t\t<option value=\"Telangana\">Telangana</option>\n");
      out.write("\t\t\t\t\t<option value=\"Tripura\">Tripura</option>\n");
      out.write("\t\t\t\t\t<option value=\"Uttar Pradesh\">Uttar Pradesh</option>\n");
      out.write("\t\t\t\t\t<option value=\"Uttarakhand\">Uttarakhand</option>\n");
      out.write("\t\t\t\t\t<option value=\"West Bengal\">West Bengal</option>\n");
      out.write("                                </select>\n");
      out.write("\t\t\t    </td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("   \t\t\t<tr>\n");
      out.write("\t\t\t    <td>Pin Code</td>\n");
      out.write("\t\t\t    <td><input type=\"text\" name=\"tpcode\"></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("   \t\t\t<tr>\n");
      out.write("\t\t\t    <td>Contact Number</td>\n");
      out.write("\t\t\t    <td><input type=\"text\" name=\"cnumber\"></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("   \t\t\t<tr>\n");
      out.write("\t\t\t    <td>Parents Contact Number</td>\n");
      out.write("\t\t\t    <td><input type=\"text\" name=\"pcnumber\"></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("   \t\t\t<tr>\n");
      out.write("\t\t\t    <td>Alternate Contact Number</td>\n");
      out.write("\t\t\t    <td><input type=\"text\" name=\"acnumber\"></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("   \t\t\t<tr>\n");
      out.write("\t\t\t    <td>E-Mail Id</td>\n");
      out.write("\t\t\t    <td><input type=\"email\" name=\"emid\"></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("   \t\t\t<tr>\n");
      out.write("\t\t\t    <td>Blood Group</td>\n");
      out.write("\t\t\t    <td><select name=\"bgroup\">\n");
      out.write("\t\t\t\t\t<option value=\"A positive\">A+</option>\n");
      out.write("\t\t\t\t\t<option value=\"A negative\">A-</option>\n");
      out.write("\t\t\t\t\t<option value=\"B positive\">B+</option>\n");
      out.write("\t\t\t\t\t<option value=\"B negative\">B-</option>\n");
      out.write("\t\t\t\t\t<option value=\"O positive\">O+</option>\n");
      out.write("\t\t\t\t\t<option value=\"O negative\">O-</option>\n");
      out.write("\t\t\t\t\t<option value=\"AB positive\">AB+</option>\n");
      out.write("\t\t\t\t\t<option value=\"AB negative\">AB-</option>\n");
      out.write("\t\t\t\t</select>\n");
      out.write("\t\t\t    </td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("   \t\t\t<tr>\n");
      out.write("\t\t\t    <td>Gender</td>\n");
      out.write("\t\t\t    <td><input type=\"radio\" name=\"sex\" value=\"Male\">Male  <input type=\"radio\" name=\"sex\" value=\"Female\">Female</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("   \t\t\t<tr>\n");
      out.write("\t\t\t    <td>Category</td>\n");
      out.write("\t\t\t    <td><select name=\"category\">\n");
      out.write("\t\t\t\t\t<option value=\"General\">General</option>\n");
      out.write("\t\t\t\t\t<option value=\"SC\">SC</option>\n");
      out.write("\t\t\t\t\t<option value=\"ST\">ST</option>\n");
      out.write("\t\t\t\t\t<option value=\"OBC\">OBC</option>\n");
      out.write("\t\t\t\t\t<option value=\"Other\">Other</option>\n");
      out.write("                                </select>\n");
      out.write("\t\t\t    </td>\n");
      out.write("\t\t\t    <td>If Other <input type=\"text\" name=\"oname\"></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("   \t\t\t<tr>\n");
      out.write("\t\t\t    <td>Nationality</td>\n");
      out.write("\t\t\t    <td><input type=\"text\" name=\"nationality\"></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("   \t\t\t<tr>\n");
      out.write("\t\t\t    <td>Domicile</td>\n");
      out.write("\t\t\t    <td><select name=\"domicile\">\n");
      out.write("\t\t\t\t\t<option value=\"Andhra Pradesh\">Andhra Pradesh</option>\n");
      out.write("\t\t\t\t\t<option value=\"Arunachal Pradesh\">Arunachal Pradesh</option>\n");
      out.write("\t\t\t\t\t<option value=\"Assam\">Assam</option>\n");
      out.write("\t\t\t\t\t<option value=\"Bihar\">Bihar</option>\n");
      out.write("\t\t\t\t\t<option value=\"Chandigarh\">Chandigarh</option>\n");
      out.write("\t\t\t\t\t<option value=\"Chhattisgarh\">Chhattisgarh</option>\n");
      out.write("\t\t\t\t\t<option value=\"Delhi\">Delhi</option>\n");
      out.write("\t\t\t\t\t<option value=\"Goa\">Goa</option>\n");
      out.write("\t\t\t\t\t<option value=\"Gujarat\">Gujarat</option>\n");
      out.write("\t\t\t\t\t<option value=\"Haryana\">Haryana</option>\n");
      out.write("\t\t\t\t\t<option value=\"Himachal Pradesh\">Himchal Pradesh</option>\n");
      out.write("\t\t\t\t\t<option value=\"Jammu & Kashmir\">Jammu & Kashmir</option>\n");
      out.write("\t\t\t\t\t<option value=\"Jharkhand\">Jharkhand</option>\n");
      out.write("\t\t\t\t\t<option value=\"Karnataka\">Karnataka</option>\n");
      out.write("\t\t\t\t\t<option value=\"Kerala\">Kerala</option>\n");
      out.write("\t\t\t\t\t<option value=\"Madhya Pradesh\">Madhya Pradesh</option>\n");
      out.write("\t\t\t\t\t<option value=\"Maharashtra\">Maharashtra</option>\n");
      out.write("\t\t\t\t\t<option value=\"Manipur\">Manipur</option>\n");
      out.write("\t\t\t\t\t<option value=\"Meghalaya\">Meghalaya</option>\n");
      out.write("\t\t\t\t\t<option value=\"Mizoram\">Mizoram</option>\n");
      out.write("\t\t\t\t\t<option value=\"Nagaland\">Nagaland</option>\n");
      out.write("\t\t\t\t\t<option value=\"Orrisa\">Orrisa</option>\n");
      out.write("\t\t\t\t\t<option value=\"Punjab\">Punjab</option>\n");
      out.write("\t\t\t\t\t<option value=\"Rajasthan\">Rajasthan</option>\n");
      out.write("\t\t\t\t\t<option value=\"Sikkim\">Sikkim</option>\n");
      out.write("\t\t\t\t\t<option value=\"Tamil Nadu\">Tamil Nadu</option>\n");
      out.write("\t\t\t\t\t<option value=\"Telangana\">Telangana</option>\n");
      out.write("\t\t\t\t\t<option value=\"Tripura\">Tripura</option>\n");
      out.write("\t\t\t\t\t<option value=\"Uttar Pradesh\">Uttar Pradesh</option>\n");
      out.write("\t\t\t\t\t<option value=\"Uttarakhand\">Uttarakhand</option>\n");
      out.write("\t\t\t\t\t<option value=\"West Bengal\">West Bengal</option>\n");
      out.write("                                </select>\n");
      out.write("\t\t\t    </td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("   \t\t\t<tr>\n");
      out.write("\t\t\t    <td>Photo</td>\n");
      out.write("\t\t\t    <td><input type=\"text\" name=\"photo\"></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("   \t\t\t<tr>\n");
      out.write("\t\t\t    <td><button type=\"submit\" value=\"Submit\">Submit</button></td>\n");
      out.write("\t\t\t    <td><button type=\"reset\" value=\"reset\">Reset</button></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t</table>\n");
      out.write("\t\t</form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
