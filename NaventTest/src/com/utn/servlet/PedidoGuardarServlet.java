package com.utn.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.utn.dao.PedidoDao;
import com.utn.modelo.Pedido;

/**
 * Servlet implementation class PedidoGuardarServlet
 */
public class PedidoGuardarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PedidoGuardarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Pedido p = new Pedido(request.getParameter("nombre"), Integer.parseInt(request.getParameter("monto")), Integer.parseInt(request.getParameter("descuento")));
		PedidoDao pd = new PedidoDao();
		pd.insert(p);
		response.getWriter().println("Se ha guardado el objeto pedido");
		response.getWriter().println(p);
		response.getWriter().println("por favor ir a la accion /pedido/obtener?id=indice en numeros");
		

	}

}
