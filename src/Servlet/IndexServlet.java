package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.UserService;
import Service.impl.UserServiceimpl;
import entity.Users;
@WebServlet("/Add")
public class IndexServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//设置一个请求数据的编码
		req.setCharacterEncoding("UTF-8");
		//在Servlet中去访问Service中的数据
		UserService us =new UserServiceimpl();
		Users user =new Users();
		//获得页面上的数据
		String name=req.getParameter("name");
		//对数据进行强转
		int age=Integer.parseInt(req.getParameter("age"));
		user.setName(name);
		//调用实体类中的setter方法私有的属性赋值
		user.setAge(age);
		us.sava(user);
	}
	
}
