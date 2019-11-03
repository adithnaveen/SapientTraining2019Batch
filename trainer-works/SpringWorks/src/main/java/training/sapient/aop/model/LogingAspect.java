package training.sapient.aop.model;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogingAspect {

//	@Before(value="execution(public * get*())")
	
	
//	@Before(value="execution(public training.sapient.aop.model.SBAccount get*())")

	@Before(value="execution(public training.sapient.aop.model.* get*())")
	public void logginBeforeAdvice() {
		System.out.println("Before advise is called... ");
	}
	
}
