package gestion_bu;

import java.util.ArrayList;

import gestion_bu.model.User;
import gestion_bu.model.DAOModel.UserDAO;

public class testUserDAO {
	public void testCrud() {
		// find
		UserDAO udao = new UserDAO();
		User u = udao.find(3);
		System.out.println(u);

		// update
		u.setFirst_name("Frederic");
		u.setLast_name("BadLieutenant");
		udao.update(u);
		System.out.println(u);

		// create
		User u2 = new User();
		u2.setLast_name("Christ");
		u2.setFirst_name("jesus");
		u2.setEmail("jc@mail.com");
		u2.setPasswd("foo");
		u2.setIs_admin(1);
		
		User u3 = udao.create(u2);
		System.out.println(u3);

		// delete
		// deletion successful
		// udao.delete(u);
		ArrayList<User> users = udao.findAll();
		for(User user : users) {
			System.out.println(user);
		}
			
	}
	
}
