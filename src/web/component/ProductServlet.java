package web.component;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.db.product.ProductBiz;
import com.db.vo.Product;
import com.oreilly.servlet.MultipartRequest;

import web.dispatcher.Util;

@WebServlet({ "/ProductServlet", "/product" })
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final Product Product = null;
       
   ProductBiz biz;
	private Logger data_log=
			Logger.getLogger("data");

   
   
   
    public ProductServlet() {
    	super();
        biz = new ProductBiz();
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String view = request.getParameter("view");
		String next = "main.jsp";
		String center = "product/center";
		if(view !=null){
			if(view.equals("add")){
				center = "product/add";
				request.setAttribute("center", "product/add");
			}
		}else{
			String db = request.getParameter("db");
			if(db.equals("add")){
				//file upload
				String dir = "C:\\hive\\big\\web\\img";
				int maxSize = 1024*1024*1024;
				MultipartRequest mpr = 
						new MultipartRequest(request, dir, maxSize, "EUC-KR");
				//name, price, img_name
				String name = mpr.getParameter("name");
				int price = Integer.parseInt( 
						mpr.getParameter("price"));
				String img = mpr.getOriginalFileName("img");
				//DB에 입력
				Product p = new Product(name,price,img);
			
				try {
					biz.register(p);
					request.setAttribute("addproduct", p);
					center ="product/addok";
				} catch (Exception e) {
					// TODO Auto-generated catch block
					center ="product/addfail";
					e.printStackTrace();
				}
			
				
			}else if(db.equals("search")){
				ArrayList<Object> list = null;
				
				try{
				list =biz.get();
				
				}catch(Exception e){
					e.printStackTrace();
				}
				request.setAttribute("plist", list);
				center="product/list";
				
			}else if(db.equals("delete")){
				
	             int id=Integer.parseInt(
	                      request.getParameter("id"));
	               //biz를 통해 삭제요청한다
	              
	               try {
	               biz.remove(id);
	                request.setAttribute("deletepid", id);
	             
	                //삭제가 완료되면 삭제완료 페이지로 이동
	                center ="product/deleteok";
	                
	               } catch (Exception e) {
	               
	               e.printStackTrace();
	            }	
	
				
				
			}else if(db.equals("updateview")){
				 int id=Integer.parseInt(
	                      request.getParameter("id"));
	               Product product= null;
	               try {
	               product=(Product) biz.get(id);
	               /*start log*/
	               data_log.debug(product.getId()
	               				+","
	               				+product.getPrice()
	               				+","
	               				+product.getPrice());
	              
	               /*end log*/
	                request.setAttribute("updateproduct", product);  
	               center="product/update";
	                  
	               } catch (Exception e) {
	               
	               e.printStackTrace();
	            
	               }
				
				
			}else if(db.equals("update")){
				 String dir ="C:\\hive\\big\\web\\img";
	              int maxSize = 1024*1024*1024;  //특정파일 다운로드
	              MultipartRequest mpr =
	                    new MultipartRequest(request, 
	                          dir, 
	                          maxSize, 
	                          "EUC-KR");
	              
	              //name, price, img_name
	              int id =Integer.parseInt(
	                    mpr.getParameter("id"));
	              String name = mpr.getParameter("name");
	              int price = Integer.parseInt(
	                        mpr.getParameter("price") );
	              String date =mpr.getParameter("date");
	              String img = mpr.getParameter("img");
	              String newimg = mpr.getOriginalFileName("newimg");
	              
	                
	                name = Util.convertKr(name);
	                Product p=new Product(id, name, price, img);
	             try {
	               biz.modify(p);
	               next = "product.big?db=detail&id="+id;   
	            } catch (Exception e) {
	               
	               e.printStackTrace();
	            }   
	            
	              
				
			}else if(db.equals("detail")){
				 int id=Integer.parseInt(
	                      request.getParameter("id"));
	               Product product= null;
	               try {
	               product=(Product) biz.get(id);
	                request.setAttribute("detailproduct", product);  
	               center="product/detail";
	                  
	               } catch (Exception e) {
	               
	               e.printStackTrace();
	            
	               }
				
				
				
				
				
				
			}
			
		}//end if else
		request.setAttribute("center", center);
		RequestDispatcher rd =   //next로 이동시켜주는 역할을 하는 것
				request.getRequestDispatcher(next);
				rd.forward(request, response);
	}

}
