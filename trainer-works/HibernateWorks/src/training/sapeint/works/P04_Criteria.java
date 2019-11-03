package training.sapeint.works;
 

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import training.sapient.beans.Person;
import training.sapient.util.HibernateUtil;

public class P04_Criteria {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
//		 selectAll(session);
//		selectWithPredicate(session);
		
		
		Criteria cr = session.createCriteria(Person.class);

		Criterion age = Restrictions.gt("age", 22);
		Criterion height = Restrictions.gt("height", 4.5);
		
		// and / or
		
		LogicalExpression andCondition = Restrictions.and(age, height); 
		
		cr.add(andCondition);
		
		List<Person> person = cr.list();
		
		person.forEach(System.out ::println);
		
		
		
		
		
	}

	private static void selectWithPredicate(Session session) {
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder(); 
		
		CriteriaQuery<Object[]> query  = criteriaBuilder.createQuery(Object[].class); 
		Root<Person> root = query.from(Person.class); 
		
		// selection (where clause) 
		javax.persistence.criteria.Predicate greaterThanAge = 
				criteriaBuilder.greaterThan(root.get("age"), 23); 
		
		
		
		// projection 
		query.multiselect(root.get("name"), root.get("height"), root.get("id"))
			.where(greaterThanAge).getOrderList(); 
		
		
		// if you want to order by 
		query.orderBy(criteriaBuilder.asc(root.get("name"))); 
		// multiple orders can go here 
		
		List<Object[]> list = session.createQuery(query).getResultList() ; 
		
		
		for(Object[]  tmp : list) {
			System.out.println(
					"Name " + tmp[0] +
					", Height" + tmp[1] +
					", ID  " + tmp[2] );
		}
	}

	private static void selectAll(Session session) {
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder(); 
		
		CriteriaQuery<Person> query = criteriaBuilder.createQuery(Person.class); 
		
		Root<Person> root = query.from(Person.class); 
		
		query.select(root); 
		
		Query<Person> personQuery = session.createQuery(query); 
		
		personQuery.getResultList().forEach(System.out ::println);
	}
}









