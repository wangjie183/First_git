package Dao.impl;

import java.util.ArrayList;

import Dao.userDao;
import entity.Users;

public class userDaoimpl implements userDao {

	@Override
	public void sava(Users user) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				java.util.List<Users> list=new ArrayList<Users>();
				list.add(user);
				for( Users user2:list) {
					System.out.println(user2.getName()+","+user2.getAge());
				}
	}

}
