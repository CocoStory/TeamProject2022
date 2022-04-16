package edu.study.dao;

import java.util.List;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.study.vo.Community_BoardVO;
import edu.study.vo.MemberVO;
import edu.study.vo.MyContentVO;
import edu.study.vo.MyQnaVO;
import edu.study.vo.SearchVO;
import edu.study.vo.Store_reviewVO;
import edu.study.vo.OrderListVO;

@Repository //
public class MypageDAO {

	@Autowired // 
	private SqlSession sqlSession;
	
	private static final String Namespace = "edu.study.mapper.mypageMapper";
	
	
	
	 public List<MemberVO> list(SearchVO vo) throws Exception{ 
		 return sqlSession.selectList(Namespace+".listMember",vo); 
	 }
	 
	
	public MemberVO detail(int midx) throws Exception{
		return sqlSession.selectOne(Namespace+".detailMember",midx);
	}
	
	public MemberVO checkPwd(MemberVO vo) throws Exception{
		return sqlSession.selectOne(Namespace+".checkPwd",vo);
	}
	
	public int update(MemberVO vo) throws Exception{
		return sqlSession.update(Namespace+".modifyMember",vo);
		
	}
	

	public int updatePwd(MemberVO vo) throws Exception{
		return sqlSession.update(Namespace+".updatePwd",vo);
	}
	

	public int updateAddr(MemberVO vo) throws Exception{
		return sqlSession.update(Namespace+".updateAddr",vo);
	}
	
	
	public int insert(MemberVO vo) throws Exception{
		return sqlSession.insert(Namespace+".insertMember",vo);
	}
	
	
	public int delete(MemberVO vo) throws Exception{
		return sqlSession.update(Namespace+".deleteMember",vo);
	}

	public List<OrderListVO> orderList(OrderListVO vo) throws Exception{
		return sqlSession.selectList(Namespace+".orderList",vo);
	} 
	
	public List<OrderListVO> orderList2(MemberVO vo) throws Exception{
		return sqlSession.selectList(Namespace+".orderList",vo);
	} 
	 
	
	public int ReviewCount(Store_reviewVO vo) throws Exception{ 
		return sqlSession.selectOne(Namespace+".ReviewCount",vo);
	}
	
	public int count(OrderListVO vo) throws Exception{ 
		return sqlSession.selectOne(Namespace+".comcount",vo);
	}

	public List<OrderListVO> delState(OrderListVO vo) throws Exception{ 
		return sqlSession.selectList(Namespace+".delState",vo);
	}
	
	public List<Community_BoardVO> viewStory(Community_BoardVO vo) throws Exception{ 
		return sqlSession.selectList(Namespace+".viewStory",vo);
	}
	
	public List<OrderListVO> detailOrder(OrderListVO vo) throws Exception{ 
		return sqlSession.selectList(Namespace+".detailOrder",vo);
	}
	
	public List<MyContentVO> mycomment(MyContentVO vo) throws Exception{ 
		return sqlSession.selectList(Namespace+".mycomment",vo);
	}
	
	public List<MyQnaVO> myquestion(MyQnaVO vo) throws Exception{ 
		return sqlSession.selectList(Namespace+".myquestion",vo);
	}
	
	public List<Store_reviewVO> myreview(Store_reviewVO vo) throws Exception{ 
		return sqlSession.selectList(Namespace+".myreview",vo);
	}
	
}








