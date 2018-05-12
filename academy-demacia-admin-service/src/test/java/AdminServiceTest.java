import java.util.List;
import java.util.ArrayList;

import com.ptteng.demacia.model.Admin;
import com.ptteng.demacia.service.AdminService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Ignore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.Before;
import java.rmi.Naming;



import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
@Ignore
public class AdminServiceTest {

	private static final Log log = LogFactory.getLog(AdminServiceTest.class);
	
	private AdminService adminService;
	
	
	@Before
	    public void setUp() throws Exception{
		
		
		    //dao
	        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/applicationContext-server.xml");
	        adminService = (AdminService) context.getBean("adminService");
			//local server
			/**
			adminService = (AdminService)  Naming.lookup("//localhost:20246/AdminRMIService");
			**/
			
			/** test client
			ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/spring/applicationContext-sca.xml");
	    	 adminService = (AdminService) context.getBean("adminService");
			
			**/
			
			
			
	    }
	
	
		
		
		
	

		
	@Test
	public void testCRUD() throws ServiceException, ServiceDaoException{
	
	 // 1.����
	 
	  	  Admin admin  = new Admin();


		admin.setAdminName("lllll");

//		admin.setAdminPassword("fdfdfdf非");
//
//		admin.setLastTimeLogIn(2L);

		admin.setCreateBy("addd");

		admin.setUpdateBy("liu");

		admin.setUpdateAt(1L);

		admin.setCreateAt(1L);








		Long id= this.adminService.insert(admin);

      admin = this.adminService.getObjectById(id);

	  Admin admin2=this.adminService.getObjectById(id);
	    Assert.assertNotNull(admin2);
	  
		// 2. ���� 
				 		 				 					 				 					 				 					 				 					 				 					 				 		 				 		 				boolean success=this.adminService.update(admin);		
//		Assert.assertEquals(true, success);
//		 Admin admin3=this.adminService.getObjectById(id);
//				 		 				             		 				             		 				             		 				             		 				             		 				 		 				 		 				//3.ɾ��
////		boolean successDelete=this.adminService.delete(id);
////		Assert.assertEquals(true, success);
////		Admin admin4=this.adminService.getObjectById(id);
////		Assert.assertNull(admin4);
//
//		//4.batchInsert
//		 List<Admin> list=new ArrayList<Admin>();
//	  	  Admin admin5  = new Admin();
//
//
//
//
//
//
//
//
//			   	    list.add(admin5);
//	  	  Admin admin6  = new Admin();
//
//
//
//
//
//
//
//
//			   	   list.add(admin6);
//	   List<Admin> insertResults= this.adminService.insertList(list);
//	   Assert.assertEquals(2,insertResults.size());
//	   //5.batchGet
//	   List<Long> ids=new ArrayList<Long>();
//		for(Admin o: insertResults){
//		   ids.add(o.getId());
//		}
//
//	    List<Admin> getResults= this.adminService.getObjectsByIds(ids);
//		Assert.assertEquals(2,getResults.size());
//
//
//		 for(Admin o :insertResults){
//			this.adminService.delete(o.getId());
//}
			
		//6.batchUpdate

		}
	
	
	
		
//		@Test
	public void  testNULL()throws ServiceException, ServiceDaoException{
		
		
		System.out.println(adminService.getObjectById(1L));
		};
}

