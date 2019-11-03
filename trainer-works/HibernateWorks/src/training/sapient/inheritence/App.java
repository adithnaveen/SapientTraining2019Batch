package training.sapient.inheritence;

import org.hibernate.Session;

import training.sapient.util.HibernateUtil;

public class App {
	public static void main(String[] args) {
		Product products [] = {
				new Television(101, "TV", "SOME TV", 20000, "LCD", 21, "1024x1024"),
				new Television(102, "TV", "new  TV", 30000, "LED", 36, "2048x1786"),
				new CellPhone(333, "mobile", "its new  mobile", 40000, "Smart", "iOs", "GSM"), 
				new CellPhone(345, "mobile", "OnePlus", 40000, "Smart", "Android", "CDMA") 
		}; 
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		for(Product temp : products) {
			session.save(temp); 
		}
		
		session.beginTransaction().commit(); 
		
		System.out.println("Data Stored... ");
	}
}
