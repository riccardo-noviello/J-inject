package jinject;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import jinject.testpackage.Car;
import jinject.testpackage.Person;
import jinject.testpackage2.House;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.riccardonoviello.commons.jinject.core.ApplicationContext;

public class ApplicationContextTest {

	String[] packages = {"jinject.testpackage"};
	int ncomponents = 2;
	String[] properties = {};
	ApplicationContext context;
	
	@Before
	public void setup(){
		try {
			context = ApplicationContext.getInstance(packages, properties);
		} catch (IllegalArgumentException | IllegalAccessException
				| InstantiationException e) {
			e.printStackTrace();
		}
	}
	
	@After
	public void tearDown(){
		context = null;		
	}
	
	@Test
	public void addInstanceToMapTest_OneInstance(){
		try {			
			Car component1 = (Car) context.getComponentByClassName(jinject.testpackage.Car.class);
			Person component2 = (Person) context.getComponentByClassName(jinject.testpackage.Person.class);
			
			assertNotNull(component1);
			assertNotNull(component2);
			assertTrue(context.getComponentsSize()==ncomponents);
			
		} catch (IllegalAccessException | InstantiationException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void addInstanceToMapTest_OneInstance_Singleton(){
		try {
			context.addInstanceToMap(jinject.testpackage.Car.class);
			context.addInstanceToMap(jinject.testpackage.Car.class);
			context.addInstanceToMap(jinject.testpackage.Car.class);
			context.addInstanceToMap(jinject.testpackage.Car.class);
			context.addInstanceToMap(jinject.testpackage.Car.class);
			
			assertTrue(context.getComponentsSize()==ncomponents);
			
			
		} catch (IllegalAccessException | InstantiationException e) {
			e.printStackTrace();
		}
		
	}
	
	
	@Test
	public void addInstanceToMapTest_ExtraInstances(){
		try {
			context.addInstanceToMap(jinject.testpackage2.House.class);
			House component = (House) context.getComponentByClassName(jinject.testpackage2.House.class);
			
			assertNotNull(component);
			assertTrue(context.getComponentsSize()==(ncomponents+1));
			
		} catch (IllegalAccessException | InstantiationException e) {
			e.printStackTrace();
		}
		
	}
}
