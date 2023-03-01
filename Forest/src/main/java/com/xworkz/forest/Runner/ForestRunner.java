


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.web.context.request.WebRequestInterceptor;

public class ForestRunner {

	public static void main(String[] args) {

		EntityManagerFactory foctory = Persistence.createEntityManagerFactory("com.xworkz");
         
		EntityManager manager = foctory.createEntityManager();
         
		Query query = manager.createNamedQuery("findByname");
		/*
		 * Query query1 = manager.createNamedQuery("findByState");
		 * 
		 * Query query2 = manager.createNamedQuery("findByNameAndStateAndArea"); Query
		 * query3 = manager.createNamedQuery("findAreaByName"); Query query4 =
		 * manager.createNamedQuery("findIdByNameAndState"); Query query5 =
		 * manager.createNamedQuery("findNameById"); Query query6
		 * =manager.createNamedQuery("findStateByNameAndArea"); Query query7 =
		 * manager.createNamedQuery("findCount"); Query query7
		 * =manager.createNamedQuery("findMaxArea");
		 */

		Object obj=query.getSingleResult();
		String name=(String) obj;
		System.out.println(name);
		
		
		/*
		 * Object obj1=query1.getSingleResult(); String name2=(String)obj1;
		 * System.out.println(name2);
		 */
		manager.close();
		
	}
}
