package com.riccardonoviello.jinject.test;

import com.riccardonoviello.commons.jinject.annotations.ComponentScan;
import com.riccardonoviello.commons.jinject.annotations.PropertiesScan;
import com.riccardonoviello.commons.jinject.core.Application;


@ComponentScan({"com.riccardonoviello.jinject.app","com.riccardonoviello.jinject.test"})
@PropertiesScan({ "src/main/resources/app.properties", "src/main/resources/db.properties" })
public class MyTestApp extends Application<MyTestApp> {	

}
