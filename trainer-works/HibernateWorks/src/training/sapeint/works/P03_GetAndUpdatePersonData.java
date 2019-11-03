package training.sapeint.works;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import training.sapient.beans.Person;
import training.sapient.util.HibernateUtil;

public class P03_GetAndUpdatePersonData {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();
		
		Person person = session.get(Person.class, 2); 
		System.out.println("Current Object " + person );
		
		person.setName("Himanshu IT");
		
		session.merge(person);
		
		session.beginTransaction();
		
		session.getTransaction().commit();
		
		System.out.println("Object Updated... ");

	}
}
