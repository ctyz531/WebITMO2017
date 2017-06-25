package com;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class MyProjectServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {

		resp.setContentType("text/html;charset=UTF-8");

		int task = Integer.parseInt(req.getParameter("task"));
		
		switch (task) {
		case 1:
			final double Z = 10.0;
			String var1 = req.getParameter("var1");
			double a = Double.parseDouble(var1);

			String var2 = req.getParameter("var2");
			double b = Double.parseDouble(var2);
			resp.getWriter().println(Math.abs(a - Z) > Math.abs(b - Z) ? b : a);

			break;

		case 2:

			String var3 = req.getParameter("var3");
			double k1 = Double.parseDouble(var3);

			String var4 = req.getParameter("var4");
			double k2 = Double.parseDouble(var4);

			String var5 = req.getParameter("var5");
			double k3 = Double.parseDouble(var5);

			double d;

			d = Math.pow(k2, 2) - 4 * k1 * k3;
			if (d < 0) {
				resp.getWriter().println("Нет корней");
			} else {
				resp.getWriter().println(
						((-k2 + Math.sqrt(d)) / 2 / k1) + " "
								+ ((-k2 - Math.sqrt(d)) / 2 / k1));
			}
			break;
			
		case 3:
			
			int m = 8, n = 5, max = 99, min = 10;
	        int[][] arr3Test = new int[m][n];
	        resp.getWriter().println("<b>");
	        for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	                arr3Test[i][j] = (int) min + (int) (Math.random() * (max - min + 1));
	                resp.getWriter().print(arr3Test[i][j] + " ");
	            }
	            resp.getWriter().println("<br>");
	        }
	        resp.getWriter().println("</b>");
	        break;
	        
		case 4:
			
			m = 5;
	        n = 8;
	        int[][] arr4Test = new int[m][n];
	        int minEl = 100;

	        min = -99;
	        max = 99;
	        resp.getWriter().println("<b>");
	        for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	                arr4Test[i][j] = (int) min + (int) (Math.random() * (max - min + 1));
	                if (arr4Test[i][j] < minEl) {
	                    minEl = arr4Test[i][j];
	                }
	                resp.getWriter().println(arr4Test[i][j] + " ");
	            }
	            resp.getWriter().println("<br>");
	        }
	        resp.getWriter().println(minEl);
	        resp.getWriter().println("</b>");
	     break;

		}
		

	}
}
