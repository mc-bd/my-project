package web.component;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import com.hive.Predict;

@WebServlet({ "/PredictServlet", "/predict1" })
public class PredictServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PredictServlet() {
        super();
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("predict1");
		String aa=request.getParameter("totalincome");
		String bb=request.getParameter("food");
		String cc=request.getParameter("transportation");
		String dd=request.getParameter("education");
		String next="main.jsp";
		String center="center.jsp";
		int a=Integer.parseInt(aa);
		int b=Integer.parseInt(bb);
		int c=Integer.parseInt(cc);
		int d=Integer.parseInt(dd);
	
		try{
			Predict pre =new Predict();
			long result = (long) pre.getGraph(a, b, c, d);
			request.setAttribute("pre1",result);
			request.setAttribute("aa1", aa);
			request.setAttribute("bb1", bb);
			request.setAttribute("cc1", cc);
			request.setAttribute("dd1", dd);
				center = "predict1";
		} catch (Exception e1){
			e1.printStackTrace();
		}
		request.setAttribute("center", center);
		response.setCharacterEncoding("EUC-KR");
		RequestDispatcher rd =
				(RequestDispatcher) request.getRequestDispatcher(next);
		rd.forward(request, response);
				
			
			
			
		}
	
	}

	