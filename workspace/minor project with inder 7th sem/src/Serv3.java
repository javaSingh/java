

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Serv3
 */
public class Serv3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Serv3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Control ctrl;
		int docid=0;
		int count=0;
		PrintWriter out=response.getWriter();
		Random rnd=new Random();
		ctrl=new Control();
		while(true)
		{
			count++;
			if(count>100)
			{
				//there could be an error on the Database side hence break;
				out.println("there could be an error with database. PleASE Check log or system.out.println()");
				break;
			
			}
			docid=rnd.nextInt(1000);
			if(docid==0)
				continue;
		
		if(!ctrl.idExists(docid))//id exixts =true implies that the docid cannnot be used for new doc
		{
			out.println("the docId is "+docid);
			break;
		}
		else
		{
			out.println("one");
			continue;
		}
		}
			
		// TODO Auto-generated method stub
	}

}