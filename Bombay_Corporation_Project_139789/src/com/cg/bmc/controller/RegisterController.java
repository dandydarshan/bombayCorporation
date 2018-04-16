package com.cg.bmc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.bmc.bean.UserBean;
import com.cg.bmc.exception.FirmException;
import com.cg.bmc.service.IRegisterService;
import com.cg.bmc.service.RegisterServiceImpl;


/**
 * Servlet implementation class RegisterController
 */
@WebServlet({"/Home", "/RegisterFirm"
	, "/Activate", "/register", "/active"})
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String path=request.getServletPath();
		HttpSession session=request.getSession(true);
		String target="";
		if(path.equals("/Home"))
		{
			target="pages/home.jsp";
		}
		else if(path.equals("/RegisterFirm"))
		{
			target="pages/register.jsp";
		}
		else if(path.equals("/Activate"))
		{
			target="pages/activate.jsp";
		}
		else if(path.equals("/register"))
		{
			String middle=request.getParameter("middle");
			String name="";
			if(middle==null)
			{
				name=request.getParameter("first")+" "+request.getParameter("last");
			}
			else
			{
				name=request.getParameter("first")+" "+request.getParameter("middle")
						+" "+request.getParameter("last");
			}
			String business=request.getParameter("business");
			String email=request.getParameter("email");
			String phone=request.getParameter("phone");
			UserBean userBean=new UserBean();
			userBean.setName(name);
			userBean.setBusiness(business);
			userBean.setEmail(email);
			userBean.setPhone(phone);
			int random=0;
			IRegisterService iRegisterService=new RegisterServiceImpl();
			try {
				int flag=iRegisterService.addDetails(userBean);
				if(flag>0)
				{
					random=10000+(int)(Math.random()*10000); 
					session.setAttribute("email",email);
					String actNum=Integer.toString(random);
					session.setAttribute("actNum",actNum);
					target="pages/success.jsp";
				}
			} catch (FirmException e) {
				request.setAttribute("errMsg", e.getMessage());
				target="pages/errorPage.jsp";
			}
		}
		else if(path.equals("/active"))
		{
			String actNum=(String)session.getAttribute("actNum");
			String email=(String)session.getAttribute("email");
			String userEmail=request.getParameter("email");
			String useractNum=request.getParameter("actNum");
			if(userEmail.equals(email) && useractNum.equals(actNum))
			{
				IRegisterService iRegisterService=new RegisterServiceImpl();
				try {
					if(iRegisterService.activateAccount(email))
					{
						target="pages/activated.jsp";
					}
					else
					{
						request.setAttribute("errMsg", "Sorry!! your activation is failed");
						target="pages/errorPage.jsp";
					}
				} catch (FirmException e) {
					request.setAttribute("errMsg", e.getMessage());
					target="pages/errorPage.jsp";
				}
			}
			else
			{
				request.setAttribute("errMsg", "Entered details is not correct please check the details");
				target="pages/errorPage.jsp";
			}
		}
		RequestDispatcher disp=request.getRequestDispatcher(target);
		disp.forward(request, response);
	}

}
