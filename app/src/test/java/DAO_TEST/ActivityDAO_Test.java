package DAO_TEST;

import java.sql.Date;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.my.biz.service.Asset_activityService;
import com.my.biz.vo.ActivityCategoriesVO;
import com.my.biz.vo.Asset_activityVO;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class ActivityDAO_Test {
	@Autowired 
	@Qualifier("ActivityService")
	Asset_activityService service;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	//@Test
	public void insert() {
		Asset_activityVO vo = new Asset_activityVO();
		//vo.setIndexnumber(2);
		vo.setId("java01");
		vo.setCategory_num(1);
		vo.setA_date(new Date(2018-1900,9,15));
		vo.setA_type("0");
		vo.setFixed("0");
		vo.setAmount(10000);
		vo.setContents("gdgd");
		service.insertActivity(vo);
	}
	
	//@Test
	public void delete() {
		service.deleteActivity(2);
	}
	
	//@Test
	public void selectAll() {
		List<Asset_activityVO> list = service.selectAllActivities();
		for(Asset_activityVO vo : list) {
			System.out.println(vo);
		}
	}
	//	@Test
		public void selectAllAC() {
			List<ActivityCategoriesVO> list2 = service.selectAllActivityCatrgories();
			for(ActivityCategoriesVO vo : list2) {
				System.out.println(vo);
			}
	}
	
	@Test
	public void selectAllACid() {
		List<ActivityCategoriesVO> list2 = service.selectAllActivityCatrgories_id("qwq713");
		for(ActivityCategoriesVO vo : list2) {
			System.out.println(vo);
		}
}
		
	//@Test
	public void update() {
		Asset_activityVO vo = new Asset_activityVO();
		vo.setCategory_num(1);
		vo.setFixed("고정");
		vo.setA_date(new Date(2018-1900,9,15));
		vo.setA_type("지출");
		vo.setIndexnumber(2);
		service.updateActivity(vo);
	}
}
