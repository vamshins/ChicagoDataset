package org.chicagopolice.controller;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.chicagopolice.model.RetrieveBlock;

@WebServlet("/BlockLatAndLong")
public class BlockLatAndLongServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BlockLatAndLongServlet() {
		super();
	}

	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String block = request.getParameter("blockresultsselect");

		System.out.println(block);

		List blockresults = RetrieveBlock.getBlocks(block);

		Iterator<String> iterator = blockresults.iterator();
		while (iterator.hasNext()) {
			String next = (String) iterator.next();
			System.out.println(next);
		}
		request.setAttribute("blockresults", blockresults);
		RequestDispatcher rd = request.getRequestDispatcher("Marker.jsp");
		rd.forward(request, response);
	}
}
