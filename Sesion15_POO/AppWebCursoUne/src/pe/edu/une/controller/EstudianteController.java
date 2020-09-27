package pe.edu.une.controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pe.edu.une.dao.EstudianteImpl;
import pe.edu.une.dao.PersonaInterface;
import pe.edu.une.entity.Estudiante;

@WebServlet("/EstudianteController")
public class EstudianteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String listarEstudiantes = "/listaEstudiantes.jsp";
	public static final String insertarEditar = "/estudiante.jsp";   
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
		}else if(accion.equalsIgnoreCase("insertar")) {
			redireccion=insertarEditar;
		}else if(accion.equalsIgnoreCase("eliminar")) {
			redireccion=listarEstudiantes;
			//capturar el dni del objeto a eliminar
			String dni=request.getParameter("dni");
			//Hacer uso del método eliminar
			dao.eliminar(dni);
			request.setAttribute("estudiantes", dao.buscarTodos());
		}else if(accion.equalsIgnoreCase("editar")) {
			redireccion=insertarEditar;
			//capturar el dni del objeto a editar
			String dni=request.getParameter("dni");
			//Hacer uso del método buscarPersona
			Estudiante est = dao.buscarPersona(dni);
			request.setAttribute("estudiante", est);
		}
		
		//Vista permite asociar a una redirección
		RequestDispatcher vista = request.getRequestDispatcher(redireccion);
		//Enviar la redirección
		vista.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PersonaInterface dao = new EstudianteImpl();
		//Crear una una instancia de la clase estudiante
		Estudiante est = new Estudiante();
		//Forma el objetos estudiante con los datos que llega al método doPost
		est.setDni(request.getParameter("dni"));
		est.setApellidos(request.getParameter("apellidos"));
		est.setNombres(request.getParameter("nombres"));
		est.setFechaNac(LocalDate.parse(request.getParameter("fechanac")));
		est.setCorreo(request.getParameter("correo"));
		est.setTelefono(request.getParameter("telefono"));
		est.setDireccion(request.getParameter("direccion"));
		est.setEstado(1);
		String dni=request.getParameter("dni");
		Estudiante est2=new Estudiante();
		est2=dao.buscarPersona(dni);
		if(est2.getDni()==null) {
			//Guardar el dato
			dao.guardar(est);
		}else {
			dao.editar(est);
		}
		
		//Vista permite asociar a una redirección
		RequestDispatcher vista = request.getRequestDispatcher(listarEstudiantes);
		request.setAttribute("estudiantes", dao.buscarTodos());
		//Enviar la redirección
		vista.forward(request, response);
	}

}
