package pe.edu.une.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pe.edu.une.dao.UsuarioDao;
import pe.edu.une.entity.Usuario;

@WebServlet("/UsuarioController")
public class UsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String mensaje;
    public UsuarioController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Capturar los datos enviados desde el formulario
		String correo=request.getParameter("correo");
		String clave=request.getParameter("clave");
		//Crear un objeto del tipo usuario con los datos capturados
		Usuario user = new Usuario(correo, clave);
		//Crear una instancia de la clase UsuarioDao
		UsuarioDao dao = new UsuarioDao();
		//Verificar si existe el objeto en la base datos
		if(dao.verificarUsuario(user)==true) {
			mensaje="Sesión Iniciada: ";
			//Crear una sesión
			HttpSession sesion = request.getSession();
			sesion.setAttribute("correouser", correo);
			request.getSession().setAttribute("mensaje", mensaje);
			response.sendRedirect("index.jsp");
		}else {
			request.setAttribute("mensaje", "Error al ingresar usuario y/o contraseña");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

}
