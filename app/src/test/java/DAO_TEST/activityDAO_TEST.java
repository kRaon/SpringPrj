package DAO_TEST;


import java.sql.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.my.biz.activity.dao.ActivityDAO;
import com.my.biz.activity.service.ActivityService;
import com.my.biz.vo.activityVO;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class activityDAO_TEST {
	
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
	public void test() {
		activityVO vo=new activityVO();
		Date temp=new Date(2018-1900,11,20);
		System.out.println(temp);
		
		vo.setCategory_num(1);
		vo.setCon_date(temp);
		vo.setFixed(1);
		vo.setId("qwq713");
		vo.setIndexnumber(3);
		vo.setA_type(1);
		service.activityInsert(vo);
	}

}
