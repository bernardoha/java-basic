package pe.edu.une.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pe.edu.une.dao.EstudianteImpl;
import pe.edu.une.dao.PersonaInterface;

@WebServlet("/EstudianteController")
public class EstudianteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String listarEstudiantes = "/listaEstudiantes.jsp";
       
    public EstudianteController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PersonaInterface dao = new EstudianteImpl();
		String redireccion="";
		String accion=request.getParameter("accion");
		if(accion.equalsIgnoreCase("listar")) {
			redireccion=listarEstudiantes;
			//Estudiantes se asocia al método buscarTodos
			request.setAttribute("estudiantes", dao.buscarTodos());
		}
		
		//Vista permite asociar a una redirección
		RequestDispatcher vista = request.getRequestDispatcher(redireccion);
		//Enviar la redirección
		vista.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
