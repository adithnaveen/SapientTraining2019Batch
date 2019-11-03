package training.sapient.aop.model;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LogingAspectAfter {

	@After(value="execution(public * get*())")
	public void afterAllGetters() {
		System.out.println("Aspect called after... getter... ");
	}
}
