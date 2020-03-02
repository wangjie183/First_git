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
		//����һ���������ݵı���
		req.setCharacterEncoding("UTF-8");
		//��Servlet��ȥ����Service�е�����
		UserService us =new UserServiceimpl();
		Users user =new Users();
		//���ҳ���ϵ�����
		String name=req.getParameter("name");
		//�����ݽ���ǿת
		int age=Integer.parseInt(req.getParameter("age"));
		user.setName(name);
		//����ʵ�����е�setter����˽�е����Ը�ֵ
		user.setAge(age);
		us.sava(user);
	}
	
}