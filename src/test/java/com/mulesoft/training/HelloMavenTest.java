package com.mulesoft.training;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;
import org.mule.tck.junit4.rule.DynamicPort;

public class HelloMavenTest extends FunctionalTestCase {

	@Rule 
	public DynamicPort dynamicPort = new DynamicPort("http.port");
	
    @Test
    public void mavenFlowReturnsHelloMaven() throws Exception {
    	System.out.println("Parveen  Dynamic port is : " +dynamicPort.getNumber());
        runFlowAndExpect("mavensetupFlow", "Hello Maven");
    }
    
    @Override
    protected String[] getConfigFiles() {
    	String[] files = {"mavensetup.xml", "global.xml"};
        return files;
    }

}
