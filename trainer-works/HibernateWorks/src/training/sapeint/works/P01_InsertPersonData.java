package training.sapeint.works;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import training.sapient.beans.Person;
import training.sapient.util.HibernateUtil;

public class P01_InsertPersonData {
	public static void main(String[] args) throws ParseException {
		Person p = new Person(); 
		
		p.setId(101);
		p.setName("Chris");
		p.setHeight(5.1);
		p.setAge(23); 
		
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy"); 
		p.setBirthDate(sdf.parse("20-04-2010"));
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory(); 
		
		// create a new session 
		// which represents the DB connection and which 
		// can help to do CRUD operations 
		
		Session session =  sessionFactory.openSession(); 
		
		// perform CRUD Operation 
		// 1. Begin Transaction 
		
		Transaction transaction = session.beginTransaction(); 
		
		// 2. INSERT / UPDATE /DELETE  Operations 
		
		session.save(p);
		
//		3. to save to data base 
		transaction.commit(); 
		
		
		session.close();
		
		System.out.println("Data Stored Successfully... ");
		
		
		
		
		
	}
}
