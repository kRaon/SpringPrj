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

import com.my.biz.service.CommentsService;
import com.my.biz.vo.CommentsVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class CommentsDAO_Test {
	
	@Autowired
	@Qualifier("CommentsService")
	CommentsService service;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	//@Test
	public void add() {
		CommentsVO vo = new CommentsVO();
		vo.setAccept(0);
		vo.setBoard_id("2018java02");
		vo.setContents("휴가비");
		vo.setId("java02");
		service.insertComment(vo);
	}
	
	//@Test
	public void selectAll() {
		List<CommentsVO> list = service.selectAllComments();
		for(CommentsVO vo:list) {
			System.out.println(vo);
		}
	}
	
	//@Test
	public void selectBoard() {
		System.out.println(service.selectComments("2018java02"));
	}
	
	//@Test
	public void delete() {
		service.deleteComment(4);
	}
	
	//@Test
	public void update() {
		CommentsVO vo = new CommentsVO();
		vo.setContents("영화감상");
		vo.setIndexnumber(5);
		service.updateComment(vo);
		
	}
}
