/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.23
 * Generated at: 2020-06-25 00:35:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class app_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.sql.ResultSet");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<style type=\"text/css\">\n");
      out.write("   .submit-button{\n");
      out.write("    align-items: center;\n");
      out.write("    justify-content: flex-start;\n");
      out.write("    flex-wrap: wrap;\n");
      out.write("    font-family: sans-serif;\n");
      out.write("    display: block;\n");
      out.write("    font-size: 18px;\n");
      out.write("    pointer-events: none;\n");
      out.write("    left: 30px;\n");
      out.write("    top: 10px;\n");
      out.write("    padding: 6px 50px;\n");
      out.write("    text-align: center;\n");
      out.write("    background: linear-gradient(to bottom, #3f7add 0%,#71acf7 100%);\n");
      out.write("    color: #fff;\n");
      out.write("    border-top: 1px solid #b4b5b9;\n");
      out.write("    border-bottom: 1px solid #b4b5b9;\n");
      out.write("    border-right: 1px solid #b4b5b9;\n");
      out.write("    }\n");
      out.write("    /* form starting stylings ------------------------------- */\n");
      out.write("    .group {\n");
      out.write("      position: relative;\n");
      out.write("      margin-bottom: 30px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .input {\n");
      out.write("      font-size: 16px;\n");
      out.write("      padding: 10px;\n");
      out.write("      display: block;\n");
      out.write("      width: 200px;\n");
      out.write("      border: none;\n");
      out.write("      border-bottom: 1px solid #ccc;\n");
      out.write("    }\n");
      out.write("    .input-button{\n");
      out.write("    background: linear-gradient(to bottom, #3f7add 0%,#71acf7 100%);\n");
      out.write("    }\n");
      out.write("    .input:focus {\n");
      out.write("      outline: none;\n");
      out.write("    }\n");
      out.write("    /* LABEL ======================================= */\n");
      out.write("    label {\n");
      out.write("      color: #999;\n");
      out.write("      font-size: 18px;\n");
      out.write("      position: absolute;\n");
      out.write("      pointer-events: none;\n");
      out.write("      left: 10px;\n");
      out.write("      top: 10px;\n");
      out.write("      transition: 0.2s ease all;\n");
      out.write("      -moz-transition: 0.2s ease all;\n");
      out.write("      -webkit-transition: 0.2s ease all;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    /* active state */\n");
      out.write("    .input:focus ~ label, input:valid ~ label {\n");
      out.write("      top: -15px;\n");
      out.write("      font-size: 14px;\n");
      out.write("      color: #5264AE;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    /* BOTTOM BARS ================================= */\n");
      out.write("    .bar {\n");
      out.write("      position: relative;\n");
      out.write("      display: block;\n");
      out.write("      width: 200px;\n");
      out.write("    }\n");
      out.write("    .bar:before, .bar:after {\n");
      out.write("      content: \"\";\n");
      out.write("      height: 2px;\n");
      out.write("      width: 0;\n");
      out.write("      bottom: 0;\n");
      out.write("      position: absolute;\n");
      out.write("      background: #5264AE;\n");
      out.write("      transition: 0.2s ease all;\n");
      out.write("      -moz-transition: 0.2s ease all;\n");
      out.write("      -webkit-transition: 0.2s ease all;\n");
      out.write("    }\n");
      out.write("    .bar:before {\n");
      out.write("      left: 50%;\n");
      out.write("    }\n");
      out.write("    .bar:after {\n");
      out.write("      right: 50%;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    /* active state */\n");
      out.write("    input:focus ~ .bar:before,\n");
      out.write("    input:focus ~ .bar:after {\n");
      out.write("      width: 50%;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("   table {\n");
      out.write("   font-family: \"Lucida Sans Unicode\", \"Lucida Grande\", Sans-Serif;\n");
      out.write("   font-size: 13px;\n");
      out.write("   text-align: left;\n");
      out.write("   border-collapse: collapse;\n");
      out.write("   border-radius: 20px;\n");
      out.write("   box-shadow: 0 0 0 10px #F2906B;\n");
      out.write("   color: #452F21;\n");
      out.write("   }\n");
      out.write("   th {\n");
      out.write("   padding: 10px 8px;\n");
      out.write("   background: white;\n");
      out.write("   }\n");
      out.write("   table th:first-child {\n");
      out.write("   border-top-left-radius: 20px;\n");
      out.write("   }\n");
      out.write("   table th:last-child {\n");
      out.write("   border-top-right-radius: 20px;\n");
      out.write("   }\n");
      out.write("   td {\n");
      out.write("   width: 30px;\n");
      out.write("   border-top: 10px solid #F2906B;\n");
      out.write("   padding: 8px;\n");
      out.write("   background: white;\n");
      out.write("   }\n");
      out.write("   table td:first-child {\n");
      out.write("   border-bottom-left-radius: 20px;\n");
      out.write("   }\n");
      out.write("   table td:last-child {\n");
      out.write("   border-bottom-right-radius: 20px;\n");
      out.write("   }\n");
      out.write("   caption {\n");
      out.write("   padding: 10px\n");
      out.write("   }\n");
      out.write("  </style>\n");
      out.write("<title>JSP</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h1>APP</h1>\n");
      out.write("    <form action=app method=\"post\" accept-charset=\"utf-8\">\n");
      out.write("      <span style=\"font-weight:bold\">Введите данные пользователя:</span><br><br>\n");
      out.write("      <div>\n");
      out.write("         <div class=\"group\">\n");
      out.write("            <input class=\"input\" type=\"text\" name=\"name\" autocomplete=\"off\" required>\n");
      out.write("            <span class=\"bar\"></span>\n");
      out.write("            <label>Имя</label>\n");
      out.write("         </div>\n");
      out.write("         <div class=\"group\">\n");
      out.write("            <input class=\"input\" type=\"text\" name=\"surname\" autocomplete=\"off\" required>\n");
      out.write("            <span class=\"bar\"></span>\n");
      out.write("            <label>Фамилия</label>\n");
      out.write("         </div>\n");
      out.write("         <div class=\"group\">\n");
      out.write("            <input class=\"input\" type=\"text\" name=\"age\" autocomplete=\"off\" required>\n");
      out.write("            <span class=\"bar\"></span>\n");
      out.write("            <label>Возраст</label>\n");
      out.write("         </div>\n");
      out.write("         <div class=\"group\">\n");
      out.write("            <input class=\"input\" type=\"text\" name=\"growth\" autocomplete=\"off\" required>\n");
      out.write("            <span class=\"bar\"></span>\n");
      out.write("            <label>Рост</label>\n");
      out.write("         </div>\n");
      out.write("         <div class=\"group\">\n");
      out.write("            <input class=\"input input-button\" type=\"submit\" value=\"Добавить пользователя\">\n");
      out.write("         </div>\n");
      out.write("\n");
      out.write("          ");
 String message = (String) session.getAttribute("message");
             if (message == "text") { 
      out.write("\n");
      out.write("                <input type=\"text\" value=\"Некорректные данные!!!\">\n");
      out.write("             ");
 } else { 
      out.write(" <input type=\"hidden\" value=\"Некорректные данные!!!\">\n");
      out.write("             ");
 } 
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </form>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("\n");
      out.write("    <table>\n");
      out.write("    <caption>Пользователи</caption>\n");
      out.write("      <tr>\n");
      out.write("        <th>№</th>\n");
      out.write("        <th>Имя</th>\n");
      out.write("        <th>Фамилия</th>\n");
      out.write("        <th>Возраст</th>\n");
      out.write("        <th>Рост</th>\n");
      out.write("        <th></th>\n");
      out.write("      </tr>\n");
      out.write("      ");
 ResultSet resultSet = (ResultSet) request.getAttribute("resultSet");
           while (resultSet.next()){
               String id = resultSet.getString("id");
               String name = resultSet.getString("name");
               String surname = resultSet.getString("surname");
               String age = resultSet.getString("age");
               String growth = resultSet.getString("growth");
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                  <td> ");
      out.print( id );
      out.write(" </td>\n");
      out.write("                  <td onclick=\"handle(this)\" id=\"");
      out.print( id );
      out.write("\" number=\"1\" name=\"name\">");
      out.print( name );
      out.write(" </td>\n");
      out.write("                  <td onclick=\"handle(this)\" id=\"");
      out.print( id );
      out.write("\" name=\"surname\"> ");
      out.print( surname );
      out.write(" </td>\n");
      out.write("                  <td onclick=\"handle(this)\" id=\"");
      out.print( id );
      out.write("\" name=\"age\"> ");
      out.print( age );
      out.write(" </td>\n");
      out.write("                  <td onclick=\"handle(this)\" id=\"");
      out.print( id );
      out.write("\" name=\"growth\"> ");
      out.print( growth );
      out.write(" </td>\n");
      out.write("                  <td>\n");
      out.write("                      <form action=app method=\"post\" accept-charset=\"utf-8\">\n");
      out.write("                            <input type=\"hidden\" name=\"id\" value=\"");
      out.print( id );
      out.write("\">\n");
      out.write("                            <input type=\"hidden\" name=\"DELETE\" value=\"DELETE\">\n");
      out.write("                            <input type=\"image\" src=\"https://img.icons8.com/ios/500/000000/delete-sign.png\" alt=\"Submit\" width=\"25\" height=\"20\">\n");
      out.write("                      </form>\n");
      out.write("                  </td>\n");
      out.write("            </tr>\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("    </table>\n");
      out.write("    <form id=\"form\" action=app method=\"post\" accept-charset=\"utf-8\">\n");
      out.write("          <input type=\"text\" id=\"id\" name=\"id\" value=\"1\">\n");
      out.write("          <input type=\"text\" id=\"nik\" name=\"nik\" value=\"1\">\n");
      out.write("          <input type=\"text\" id=\"value\" name=\"value\" value=\"1\">\n");
      out.write("          <input type=\"hidden\" name=\"PUT\" value=\"PUT\">\n");
      out.write("    </form>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    function handle(object){\n");
      out.write("         var inp = document.createElement(\"input\");\n");
      out.write("         inp.type = \"text\";\n");
      out.write("         inp.size = 10;\n");
      out.write("         inp.value = object.innerText;\n");
      out.write("\n");
      out.write("         object.innerText = \"\";\n");
      out.write("         object.appendChild(inp);\n");
      out.write("\n");
      out.write("         var _event = object.onclick;\n");
      out.write("         object.onclick = null;\n");
      out.write("\n");
      out.write("         inp.onkeydown = function(e){\n");
      out.write("             if(e.keyCode === 13){\n");
      out.write("                   object.innerText = inp.value;\n");
      out.write("                   object.onclick = _event;\n");
      out.write("                   document.getElementById(\"id\").value = object.id;\n");
      out.write("                   document.getElementById(\"nik\").value = object.number;\n");
      out.write("                   document.getElementById(\"value\").value = object.innerText;\n");
      out.write("                   document.getElementById(\"form\").submit();\n");
      out.write("                   object.removeChild(inp);\n");
      out.write("             }\n");
      out.write("         };\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}