package DAO_TEST;

import java.util.List;

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
public class UserDAO_Test {
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
	public void add() {
		UsersVO vo = new UsersVO();
		vo.setAge(30);
		vo.setGender("female");
		vo.setId("java02");
		vo.setJob("회사원");
		vo.setPw("1234");		
		service.insertUsers(vo);
	}
	
	//@Test
	public void delete() {
		service.deleteUsers("java01");
		//정규화 위배 child record found
		//db설계 다시 고려해볼것.
	 }
	
	//@Test
	public void allUser() {
		List<UsersVO> list = service.selectAllUsers();
		for(UsersVO vo : list) {			
			System.out.println(vo);
		}
	}

}
