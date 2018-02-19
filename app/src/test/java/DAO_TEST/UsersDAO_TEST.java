package DAO_TEST;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.my.biz.service.UsersService;
import com.my.biz.vo.UsersVO;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class UsersDAO_TEST {
	
	@Autowired
	@Qualifier("UsersService")
	UsersService service;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	//@Test
	public void insert() {
		UsersVO vo=new UsersVO();
	}
	@Test
	public void test() {
		UsersVO vo=new UsersVO();
		
		vo.setId("java02");
		vo.setPw("1234");
		vo.setAge(23);
		vo.setGender("male");
		vo.setJob("cooker");
		vo.setPoint(1);		
		service.insertUsers(vo);
	}
	//@Test
	public void list() {
		for(UsersVO data  :service.selectAllUsers()) {
			System.out.println(data);
	}
	}
	//@Test
	public void delete() {
	     int row =service.deleteUsers("java02");
	     if(row == 0) {
	    	 System.out.println("java02�궘�젣 X");
	     }
	}
	
}