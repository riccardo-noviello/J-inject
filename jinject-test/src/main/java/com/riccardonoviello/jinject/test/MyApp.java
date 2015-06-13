package com.riccardonoviello.jinject.test;


import com.riccardonoviello.commons.jinject.annotations.ComponentScan;
import com.riccardonoviello.commons.jinject.annotations.PropertiesScan;
import com.riccardonoviello.commons.jinject.core.Application;
import com.riccardonoviello.jinject.test.components.HelloComponent;

@ComponentScan("com.riccardonoviello.jinject.test")
@PropertiesScan({ "src/main/resources/app.properties", "src/main/resources/db.properties" })
public class MyApp extends Application<MyApp> {	

}
