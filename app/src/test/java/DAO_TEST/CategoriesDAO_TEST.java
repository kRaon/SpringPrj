package DAO_TEST;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.my.biz.service.CategoriesService;
import com.my.biz.vo.CategoriesVO;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class CategoriesDAO_TEST {

	@Autowired
	@Qualifier("CategoriesService")
	CategoriesService service;
		
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	//@Test
	public void insert() {
		CategoriesVO vo = new CategoriesVO();
		
		vo.setCategory_num(2);
		vo.setCategory_name("subway");
		service.insertCategories(vo);
		
	}
	@Test
		public void list() {
			for(CategoriesVO data  :service.selectAllcategories()) {
				System.out.println(data);
		}
		}
	//@Test
		public void delete() {
		     int row =service.deleteCategories(2);
		     if(row == 0) {
		    	 System.out.println("subway");
		     }
		}
}
