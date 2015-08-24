package com.riccardonoviello.jinject.app;


import com.riccardonoviello.commons.jinject.annotations.ComponentScan;
import com.riccardonoviello.commons.jinject.annotations.PropertiesScan;
import com.riccardonoviello.commons.jinject.core.Application;
import com.riccardonoviello.jinject.app.service.PersonService;

@ComponentScan("com.riccardonoviello.jinject.app")
@PropertiesScan({ "src/main/resources/app.properties", "src/main/resources/db.properties" })
public class MyApp extends Application<MyApp> {	

}
