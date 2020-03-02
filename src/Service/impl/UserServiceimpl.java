package Service.impl;

import Dao.userDao;
import Dao.impl.userDaoimpl;
import Service.UserService;
import entity.Users;

public class UserServiceimpl implements UserService {
	userDao dao=new userDaoimpl();
	@Override
	public void sava(Users user) {
		// TODO Auto-generated method stub
		dao.sava(user);
	}

}
