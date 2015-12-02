# J-inject
Simple lightweight (&lt;20Kb) Dependency Injection library for non-pretencious Java projects

# usage

First of all you need a main application configuration class:

```java
@ComponentScan("com.riccardonoviello.jinject.app")
@PropertiesScan({ "src/main/resources/app.properties", "src/main/resources/db.properties" })
public class MyApp extends Application<MyApp> {	

}
```
As you can notice above, the configuration class specifies tha package to scan and the property files to import. This way you can easely inject properties values just using annotations. For example let's create a Service class:


```java
public class PersonService {
	
	@Inject(property="test.person.name")
	private String injectedName;
	
	@Inject
	PersonDao personDao;
	
	@Inject
	FileService fileService;
		
	public void savePerson(){
		personDao.savePerson();
	}
	
}
```
with @Inject you can inject classes or properties. As you can see above 	
```java
@Inject(property="test.person.name")
```
will provide the value 
```
test.person.name=riccardo
```

to the local member "injectedName"

whilst 
```java
	@Inject
	PersonDao personDao;
```

	will just provide you with a Singleton component instance of PersonDao.


#maven

```xml
<repositories>
  <repository>
    <id>rik-snapshots</id>
    <url>https://github.com/rik86/rik-mvn-repo/raw/master/snapshots</url>
  </repository>
</repositories>

...
<dependency>
         <artifactId>jinject</artifactId>
         <groupId>com.riccardonoviello</groupId>
         <version>1.0</version>
</dependency>


```
