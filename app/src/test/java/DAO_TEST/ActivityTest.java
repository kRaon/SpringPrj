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

import com.my.biz.service.ActivityService;
import com.my.biz.vo.ActivityVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class ActivityTest {
	@Autowired 
	@Qualifier("ActivityService")
	ActivityService service;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void insert() {
		ActivityVO vo = new ActivityVO();
		vo.setIndexnumber(2);
		vo.setId("java01");
		vo.setCategory_num(1);
		vo.setA_date(new Date(2018-1900,9,15));
		vo.setA_type("1");
		vo.setFixed("1");
		service.insertActivity(vo);
	}

	/*@Override
	public int deleteActivity(ActivityVO vo) {
		// TODO Auto-generated method stub
		return mapper.deleteActivity(vo);
	}

	@Override
	public int updateActivity(ActivityVO vo) {
		// TODO Auto-generated method stub
		return mapper.updateActivity(vo);
	}

	@Override
	public List<ActivityVO> selectAllActivities() {
		// TODO Auto-generated method stub
		return mapper.selectAllActivities();
	}

	
	@Test
	public void test() {
		service.
	}*/

}
