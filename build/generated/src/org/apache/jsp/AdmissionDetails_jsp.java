package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdmissionDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Admission Details</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1 style=\"text-align:center\">Admission Details</h1>\n");
      out.write("\t\t<form action=\"AdmissionDetailController\">\n");
      out.write("\t\t<table>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t    <td>Year Of Admission</td>\n");
      out.write("\t\t\t    <td><select name=\"admissionyear\">\n");
      out.write("\t\t\t\t\t<option value=\"2015\">2015</option>\n");
      out.write("\t\t\t\t\t<option value=\"2016\">2016</option>\n");
      out.write("\t\t\t\t\t<option value=\"2017\">2017</option>\n");
      out.write("\t\t\t\t\t<option value=\"2018\">2018</option>\n");
      out.write("\t\t\t\t\t<option value=\"2019\">2019</option>\n");
      out.write("\t\t\t\t\t<option value=\"2020\">2020</option>\n");
      out.write("\t\t\t\t\t<option value=\"2021\">2021</option>\n");
      out.write("\t\t\t\t\t<option value=\"2022\">2022</option>\n");
      out.write("\t\t\t\t\t<option value=\"2023\">2023</option>\n");
      out.write("\t\t\t\t\t<option value=\"2024\">2024</option>\n");
      out.write("\t\t\t\t\t<option value=\"2025\">2025</option>\n");
      out.write("\t\t\t\t\t<option value=\"2026\">2026</option>\n");
      out.write("\t\t\t\t\t<option value=\"2027\">2027</option>\n");
      out.write("\t\t\t\t\t<option value=\"2028\">2028</option>\n");
      out.write("\t\t\t\t\t<option value=\"2029\">2029</option>\n");
      out.write("\t\t\t\t\t<option value=\"2030\">2030</option>\n");
      out.write("\t\t\t\t\t<option value=\"2031\">2031</option>\n");
      out.write("\t\t\t\t\t<option value=\"2032\">2032</option>\n");
      out.write("\t\t\t\t\t<option value=\"2033\">2033</option>\n");
      out.write("\t\t\t\t\t<option value=\"2034\">2034</option>\n");
      out.write("\t\t\t\t\t<option value=\"2035\">2035</option>\n");
      out.write("\t\t\t\t\t<option value=\"2036\">2036</option>\n");
      out.write("\t\t\t\t\t<option value=\"2037\">2037</option>\n");
      out.write("\t\t\t\t\t<option value=\"2038\">2038</option>\n");
      out.write("\t\t\t\t\t<option value=\"2039\">2039</option>\n");
      out.write("\t\t\t\t\t<option value=\"2040\">2040</option>\n");
      out.write("\t\t\t\t\t<option value=\"2041\">2041</option>\n");
      out.write("\t\t\t\t\t<option value=\"2042\">2042</option>\n");
      out.write("\t\t\t\t\t<option value=\"2043\">2043</option>\n");
      out.write("\t\t\t\t\t<option value=\"2044\">2044</option>\n");
      out.write("\t\t\t\t\t<option value=\"2045\">2045</option>\n");
      out.write("\t\t\t\t\t<option value=\"2046\">2046</option>\n");
      out.write("\t\t\t\t\t<option value=\"2047\">2047</option>\n");
      out.write("\t\t\t\t\t<option value=\"2048\">2048</option>\n");
      out.write("\t\t\t\t\t<option value=\"2049\">2049</option>\n");
      out.write("\t\t\t\t\t<option value=\"2050\">2050</option>\n");
      out.write("\n");
      out.write("\t\t\t\t</select>\n");
      out.write("                            </td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t    <td>Admission Through</td>\n");
      out.write("\t\t\t    <td><input type=\"text\" name=\"admissionthrough\"></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t    <td>Branch</td>\n");
      out.write("\t\t\t    <td><select name=\"branch\">\n");
      out.write("\t\t\t\t\t<option value=\"ME\">ME (Mechanical Engineering)</option>\n");
      out.write("\t\t\t\t\t<option value=\"CE\">CE (Civil Engineering)</option>\n");
      out.write("\t\t\t\t\t<option value=\"CS\">CS (Computer Science)</option>\n");
      out.write("\t\t\t\t\t<option value=\"EL\">EL (Electrical Engineering)</option>\n");
      out.write("\t\t\t\t\t<option value=\"EE\">EE (Electrical & Electronics)</option>\n");
      out.write("\t\t\t\t\t<option value=\"EI\">EI (Electronics & Instrumentation)</option>\n");
      out.write("\t\t\t\t\t<option value=\"IT\">IT (Information Technology)</option>\n");
      out.write("\t\t\t\t\t</select>\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t    <td>Academic Gap</td>\n");
      out.write("\t\t\t    <td><select name=\"gap\">\n");
      out.write("\t\t\t\t\t<option value=\"No\">None</option>\n");
      out.write("\t\t\t\t\t<option value=\"1 Year\">1 Year</option>\n");
      out.write("\t\t\t\t\t<option value=\"2 Years\">2 Years</option>\n");
      out.write("\t\t\t\t\t<option value=\"3 Years\">3 Years</option>\n");
      out.write("\t\t\t\t</select>\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("   \t\t\t<tr>\n");
      out.write("\t\t\t    <td>Document Submitted</td>\n");
      out.write("\t\t\t    <td><input type=\"checkbox\" name=\"migration\" value=\"101\">Migration <input type=\"checkbox\" name=\"10result\" value=\"102\">1oth Result<br>\n");
      out.write("  \t\t\t        <input type=\"checkbox\" name=\"12result\" value=\"103\">12th Result <input type=\"checkbox\" name=\"domicile\" value=\"104\">Domicile Certificate<br>\n");
      out.write("\t\t\t\t<input type=\"checkbox\" name=\"caste\" value=\"105\">Caste Certificate <input type=\"checkbox\" name=\"petscore\" value=\"106\">PET Score Card<br></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("   \t\t\t<tr>\n");
      out.write("\t\t\t    <td><button type=\"submit\" value=\"Submit\">Submit</button></td>\n");
      out.write("\t\t\t    <td><button type=\"reset\" value=\"reset\">Reset</button></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("                </table>\n");
      out.write("                </form>\n");
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
