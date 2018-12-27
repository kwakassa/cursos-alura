package br.com.alura.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="AluraServlet" , urlPatterns = {"/aluraServlet"})
public class TestServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	private static final String conteudoHtml = "<html>\n  <body>\n    <h1>Pagina de teste de Servlet</h1>\n  </body>\n</html>";
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println(conteudoHtml);
	}
}
