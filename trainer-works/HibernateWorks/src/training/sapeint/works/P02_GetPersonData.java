package training.sapeint.works;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import training.sapient.beans.Person;
import training.sapient.util.HibernateUtil;

public class P02_GetPersonData {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		Person p1 = session.get(Person.class, 1);

		System.out.println(p1);

	}
}
