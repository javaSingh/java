/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.42
 * Generated at: 2014-10-26 17:50:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.*;
import java.sql.*;
import com.*;

public final class trackdoc_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("   <head>\r\n");
      out.write("      <title>MinorProject-OfficeMgmt</title>\r\n");
      out.write("      <meta name='viewport' content='width=device-width, initial-scale=1.0'>\r\n");
      out.write("      <!-- Bootstrap -->\r\n");
      out.write("      <link href='css/bootstrap.min.css' rel='stylesheet'>\r\n");
      out.write("\t  <!--my css-->\r\n");
      out.write("\t  <link href='css/a.css' rel='stylesheet'>\r\n");
      out.write("\t  \t  <link href='css/test.css' rel='stylesheet'>\r\n");
      out.write("      <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media \r\n");
      out.write("         queries -->\r\n");
      out.write("      <!-- WARNING: Respond.js doesn't work if you view the page \r\n");
      out.write("         via file:// -->\r\n");
      out.write("      <!--[if lt IE 9]>\r\n");
      out.write("         <script src='https://oss.maxcdn.com/libs/html5shiv/3.7.0/\r\n");
      out.write("            html5shiv.js'></script>\r\n");
      out.write("         <script src='https://oss.maxcdn.com/libs/respond.js/1.3.0/\r\n");
      out.write("            respond.min.js'></script>\r\n");
      out.write("      <![endif]-->\r\n");
      out.write("\t  <!--font awesome. for icons used in top of page-->\r\n");
      out.write("\t  <link href=\"http://maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\t  \r\n");
      out.write("\t  \r\n");
      out.write("\t  \r\n");
      out.write("\t  \r\n");
      out.write("\t  \r\n");
      out.write("\t  \r\n");
      out.write("\t  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t  \r\n");
      out.write("\t  \r\n");
      out.write("\t  \r\n");
      out.write("\t  \r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class='container'>\r\n");
      out.write("\t<div class=\"scroll-top-wrapper \">\r\n");
      out.write("    <span class=\"scroll-top-inner\">\r\n");
      out.write("    <i class=\"fa fa-2x fa-arrow-circle-up\"></i>\r\n");
      out.write("    </span>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<nav role='navigation' class='navbar navbar-inverse'>\r\n");
      out.write("    <!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("    <div class='navbar-header'>\r\n");
      out.write("        <button type='button' data-target='#navbarCollapse' data-toggle='collapse' class='navbar-toggle'>\r\n");
      out.write("            <span class='sr-only'>Toggle navigation</span>\r\n");
      out.write("            <span class='icon-bar'></span>\r\n");
      out.write("            <span class='icon-bar'></span>\r\n");
      out.write("            <span class='icon-bar'></span>\r\n");
      out.write("        </button>\r\n");
      out.write("        <a href='index.html' class='navbar-brand'>MinorProject</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Collection of nav links and other content for toggling -->\r\n");
      out.write("    <div id='navbarCollapse' class='collapse navbar-collapse'>\r\n");
      out.write("        <ul class='nav navbar-nav'>\r\n");
      out.write("            <li><a href='#'>Admin </a></li>\r\n");
      out.write("            <li><a href='#'>Documents </a></li>\r\n");
      out.write("\t\t\t<li><a href='#'>Visitors </a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("        <ul class='nav navbar-nav navbar-right'>\r\n");
      out.write("            <li><a href='jackie.html'>Login</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>\r\n");
      out.write("<div class='top'></div>\r\n");
      out.write("<div class='row'>\r\n");
      out.write("<div class='col-md-2'></div>\r\n");
      out.write("<div class='col-md-8'>\r\n");
      out.write("<div id='ada' class='jumbotron'>\r\n");
      out.write("\t  <p>\r\n");
      out.write("\t  trackHere\r\n");
      out.write("\t  </p>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t  <div class='col-md-2'></div>\r\n");
      out.write("\t  \r\n");
      out.write("\t  \r\n");
      out.write("\t    <table class='table table-hover table-bordered'>\r\n");
      out.write("        <thead>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th>DocId </th>\r\n");
      out.write("                <th>From</th>\r\n");
      out.write("                <th>In Dept</th>\r\n");
      out.write("\t\t\t\t<th>Sent To</th>\r\n");
      out.write("\t\t\t\t<th>Received On</th>\r\n");
      out.write("\t\t\t\t<th>Sent On</th>\r\n");
      out.write("\t\t\t\t<th>Completed On.</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </thead>\r\n");
      out.write("        <tbody>\r\n");
      out.write("            \r\n");
      out.write("\t\t\t\r\n");
      out.write("\r\n");



String docid= request.getParameter("docid");
Control ctrl=new Control();
if(ctrl.con==null)
{
	application.setAttribute("message","Please Start Your Database Server");
	response.sendRedirect("message.jsp");
}
else if((docid==null)||docid.equals(""))
{
	response.sendRedirect("index.html");
}
else
{
	
		if(ctrl.idExists(Integer.parseInt(docid)))
		{
			//display the data of the docid
			//since id check has been done rs can never be null
			ResultSet rs=ctrl.selectStar(docid);
			try {
				while(rs.next())
				{
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr class='clickableRow' href=#>\r\n");
      out.write("\t\t\t\t\t");

					for(int i=1;i<=7;i++)
					{
						
						
					

      out.write("\r\n");
      out.write("\r\n");
      out.write("                <td>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");

				
				out.println(rs.getString(i));
				}
				
      out.write("\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t");

				
					//out.println("\n");
					
				}
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("Serv4 "+e);
				
				application.setAttribute("message","there has been some error. Please try again.");
			}
			
			
			
		}
		else
		{
			
			application.setAttribute("message","no such docId exists");
			response.sendRedirect("message.jsp");
		}
}

				
      out.write("\r\n");
      out.write("            </tr>\t\t\r\n");
      out.write("            \r\n");
      out.write("           \r\n");
      out.write("       \t\t</tbody>\r\n");
      out.write("    </table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class='below'></div>\r\n");
      out.write("<div class='row'>\r\n");
      out.write("<div class='col-md-12'>\r\n");
      out.write("<div class='myfooter'>\r\n");
      out.write("<nav role='navigation' class='navbar navbar-inverse'>\r\n");
      out.write("    <!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("    <div class='navbar-header'>\r\n");
      out.write("       \r\n");
      out.write("        <a href='index.html' class='navbar-brand'>MinorProject-Home</a>\r\n");
      out.write("    </div>\r\n");
      out.write("      \r\n");
      out.write("        \r\n");
      out.write("    </div>\r\n");
      out.write("</nav>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\t  \r\n");
      out.write("\t  \r\n");
      out.write("\t  \r\n");
      out.write("\t  \r\n");
      out.write("\t  \r\n");
      out.write("\t  \r\n");
      out.write("\t  <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("      <script src='https://code.jquery.com/jquery.js'></script>\r\n");
      out.write("      <!-- Include all compiled plugins (below), or include individual files \r\n");
      out.write("            as needed -->\r\n");
      out.write("      <script src='js/bootstrap.min.js'></script>\r\n");
      out.write("\t  <script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js\"></script>\r\n");
      out.write(" <script>\r\n");
      out.write(" \r\n");
      out.write("$(function(){\r\n");
      out.write(" \r\n");
      out.write("    $(document).on( 'scroll', function(){\r\n");
      out.write(" \r\n");
      out.write("        if ($(window).scrollTop() > 1) {\r\n");
      out.write("            $('.scroll-top-wrapper').addClass('show');\r\n");
      out.write("        } else {\r\n");
      out.write("            $('.scroll-top-wrapper').removeClass('show');\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("   <script>\r\n");
      out.write(" \r\n");
      out.write("$(function(){\r\n");
      out.write(" \r\n");
      out.write("    $(document).on( 'scroll', function(){\r\n");
      out.write(" \r\n");
      out.write("        if ($(window).scrollTop() > 1) {\r\n");
      out.write("            $('.scroll-top-wrapper').addClass('show');\r\n");
      out.write("        } else {\r\n");
      out.write("            $('.scroll-top-wrapper').removeClass('show');\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write(" \r\n");
      out.write("    $('.scroll-top-wrapper').on('click', scrollToTop);\r\n");
      out.write("});\r\n");
      out.write(" \r\n");
      out.write("function scrollToTop() {\r\n");
      out.write("    verticalOffset = typeof(verticalOffset) != 'undefined' ? verticalOffset : 0;\r\n");
      out.write("    element = $('body');\r\n");
      out.write("    offset = element.offset();\r\n");
      out.write("    offsetTop = offset.top;\r\n");
      out.write("    $('html, body').animate({scrollTop: offsetTop}, 200, 'linear');\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write(" </div> </body>\r\n");
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
