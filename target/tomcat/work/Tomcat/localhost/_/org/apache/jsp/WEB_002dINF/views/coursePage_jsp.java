/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-09-10 18:16:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import osama.atyponfinalproject.model.bean.Course;
import osama.atyponfinalproject.model.bean.User;

public final class coursePage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>Home Page</title>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<h1> This is Courses page </h1>\r\n");
      out.write("\t\t<h3>Displaying Courses List</h3>\r\n");
      out.write("\t\t<font color=\"green\">\r\n");
      out.write("\t\t\t");
 
				String error = request.getParameter("error");
				if(error != null){
					out.print(error);
				}
			
      out.write("\r\n");
      out.write("\t\t</font>\r\n");
      out.write("      \t<table border =\"1\" width=\"500\" align=\"center\">\r\n");
      out.write("     \t\t<tr bgcolor=\"00FF7F\">\r\n");
      out.write("          \t\t<th><b>Course Name</b></th>\r\n");
      out.write("         \t</tr> \r\n");
      out.write("        ");

        ArrayList<Course> courses = 
            (ArrayList<Course>)request.getAttribute("courseList");
        for(Course c:courses){
        
      out.write("\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td><a href=\"/studentByCourse?courseId=");
      out.print(c.getCourseName());
      out.write('"');
      out.write('>');
      out.print(c.getCourseName());
      out.write("</a></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        ");

            }
        
      out.write("\r\n");
      out.write("        </table> \r\n");
      out.write("        <br><br>\r\n");
      out.write("        ");
 
        User user = (User)request.getSession().getAttribute("user");
			
		if(user.getRole().equals("admin")){
      out.write("\r\n");
      out.write("        <form action=\"/course\" method=\"POST\">        \r\n");
      out.write("        \t<label> Course Name : <input type=\"text\" name=\"coursename\"/></label><br><br>\r\n");
      out.write("\r\n");
      out.write("        \t<input type=\"submit\" value=\"Add course\">\r\n");
      out.write("        </form>\r\n");
      out.write("        ");
 } 
      out.write("\r\n");
      out.write("        <hr/>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
