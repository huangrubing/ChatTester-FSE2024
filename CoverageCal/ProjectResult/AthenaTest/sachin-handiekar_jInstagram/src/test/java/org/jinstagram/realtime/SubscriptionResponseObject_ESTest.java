/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 05:03:32 GMT 2024
 */
package org.jinstagram.realtime;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.realtime.SubscriptionResponseObject;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class SubscriptionResponseObject_ESTest extends SubscriptionResponseObject_ESTest_scaffolding {
    @Test 
    public void testSetSubscriptionId() throws Exception { 
    SubscriptionResponseObject subscriptionResponseObject = new SubscriptionResponseObject();
    subscriptionResponseObject.setSubscriptionId("subscriptionId");
    }
    
    
    @Test 
    public void testSetObjectId() throws Exception { 
    SubscriptionResponseObject subscriptionResponseObject = new SubscriptionResponseObject();
    subscriptionResponseObject.setObjectId("123");
    assertEquals("123", subscriptionResponseObject.getObjectId());
    }
    
    
    @Test 
    public void testSetObject() throws Exception { 
    SubscriptionResponseObject subscriptionResponseObject = new SubscriptionResponseObject();
    subscriptionResponseObject.setObject(null);
    assertEquals(null, subscriptionResponseObject.getObject());
    }
    
    
    @Test 
    public void testSetEpochTime() throws Exception { 
    SubscriptionResponseObject subscriptionResponseObject = new SubscriptionResponseObject();
    subscriptionResponseObject.setEpochTime(1L);
    assertEquals(1L, subscriptionResponseObject.getEpochTime());
    }
    
    
    @Test 
    public void testGetEpochTime() throws Exception { 
    SubscriptionResponseObject subscriptionResponseObject = new SubscriptionResponseObject();
    assertEquals(0, subscriptionResponseObject.getEpochTime());
    }
    
    
    @Test 
    public void testSetChangedAspect() throws Exception { 
    SubscriptionResponseObject subscriptionResponseObject = new SubscriptionResponseObject();
    subscriptionResponseObject.setChangedAspect(null);
    assertEquals(null, subscriptionResponseObject.getChangedAspect());
    }
    
}