package DAO_TEST;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.my.biz.service.Asset_activityService;
import com.my.biz.vo.ActivityCategoriesVO;
import com.my.biz.vo.Asset_CounselorVO;
import com.my.biz.vo.Asset_activityVO;
import com.my.biz.vo.ChartVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
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

	// @Test
	public void insert() {
		Asset_activityVO vo = new Asset_activityVO();
		// vo.setIndexnumber(2);
		vo.setId("java01");
		vo.setCategory_num(1);
		vo.setA_date(new Date(2018 - 1900, 9, 15));
		vo.setA_type("0");
		vo.setFixed("0");
		vo.setAmount(10000);
		vo.setContents("gdgd");
		service.insertActivity(vo);
	}

	// @Test
	public void delete() {
		service.deleteActivity(2);
	}

	// @Test
	public void selectAll() {
		List<Asset_activityVO> list = service.selectAllActivities();
		for (Asset_activityVO vo : list) {
			System.out.println(vo);
		}
	}

	// @Test
	public void selectAllAC() {
		List<ActivityCategoriesVO> list2 = service.selectAllActivityCatrgories();
		for (ActivityCategoriesVO vo : list2) {
			System.out.println(vo);
		}
	}

	// @Test
	public void chartest() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("id", "java01");
		map.put("fromdate", "20160101");
		map.put("todate", "20190301");
		List<ChartVO> list = service.selectBarChart(map);
		String tmp[] = new String[9];
		int i = 0;
		System.out.println(list.size());
		Gson gson = new Gson();
		JsonObject obj = new JsonObject();
		JsonObject obj2 = new JsonObject();
		JsonObject obj3 = new JsonObject();
		JsonObject obj4 = new JsonObject();
		JsonObject obj5 = new JsonObject();
		JsonObject obj6 = new JsonObject();
		JsonArray arr = new JsonArray();
		JsonArray arr2 = new JsonArray();
		JsonArray arr3 = new JsonArray();
		JsonArray arr4 = new JsonArray();
		String[] month;
		for (ChartVO vo : list) {
			arr.add(vo.getMonth());
			arr2.add(vo.getAmount());
		}
		obj2.add("labels", arr);

		obj4.add("data", arr2);
		String[] color = { "#007bff", "#dc3545", "#ffc107", "#28a745" };
		for (String d : color) {
			arr3.add(d);
		}
		obj4.add("backgroundColor", arr3);
		arr4.add(obj4);
		obj2.add("datasets", arr4);

		obj.add("data", obj2);
		System.out.println(obj.toString());

	}

	// @Test
	public void selectAllACid() {
		List<ActivityCategoriesVO> list2 = service.selectAllActivityCatrgories_id("qwq713");
		for (ActivityCategoriesVO vo : list2) {
			System.out.println(vo);
		}
	}

	// @Test
	public void update() {
		Asset_activityVO vo = new Asset_activityVO();
		vo.setCategory_num(1);
		vo.setFixed("고정");
		vo.setA_date(new Date(2018 - 1900, 9, 15));
		vo.setA_type("지출");
		vo.setIndexnumber(2);
		service.updateActivity(vo);
	}
	
	@Test
		public void getcouns() {
			Asset_CounselorVO vo=service.selectAsset_data("qwq713");
			System.out.println(vo.getBirth_date());
			System.out.println(vo.getAmount());
		}
}
