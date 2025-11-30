
/*
 * Teachers: WARNING - this file is generated automatically, please do not
 * make changes directly in this file, instead communicate needed changes
 * to the person responsable for the Tester.
 *
 * Students: you are welcome to make changes to this file if it helps
 * you to better debug your programs. Just REMEMBER that any changes made
 * by you will not change the Tester program used for the 'entrega system'.
 *
 */

//////////////////////////////////////////////////////////////////////
//
// File generated at: 2025/11/24 -- 18:3:43
// Seed: {1764,3822,797081}
//
//////////////////////////////////////////////////////////////////////



package aed.treap;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.CountDownLatch;
import java.lang.reflect.*;
import es.upm.aedlib.Entry;
import es.upm.aedlib.Pair;
import es.upm.aedlib.Position;
import es.upm.aedlib.graph.*;
import es.upm.aedlib.indexedlist.*;
import es.upm.aedlib.map.*;
import es.upm.aedlib.positionlist.*;
import es.upm.aedlib.tree.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.*;
import java.lang.management.ManagementFactory;
import java.lang.reflect.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.function.*;
import java.util.function.Function;
import java.util.stream.Stream;



/**
 * The main tester class which contains JUnit5 tests.
 */
@SuppressWarnings({"unused","deprecation"})
public class TesterLab5 {

  
    

  @BeforeAll
  public static void init () 
  {
    TestUtils.reportPid() ;
    TestData.setIndividualTimeout(10) ;
    TestData.setGlobalTimeout(60) ;
    ResultsHandler.init() ;
    ResultsHandler.setNumTestsRemaining(58,TestData.getGlobalTimeout()) ;
    TestData.setTesterType(true) ;
    TestUtils.ensureAedlibVersion(2,13,0) ;
  }
  
  @AfterAll
  public static void reportResults () 
  {
    ResultsHandler.report_results() ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_01 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_01") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_01")) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_01")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_02 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_02") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_02")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_02")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_03 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_03") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_03")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_03")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_04 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_04") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_04")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Contains(v_1,12).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,0).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_04")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_05 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_05") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_05")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,0).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,16).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_05")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_06 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_06") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_06")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,4).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,10).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_06")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_07 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_07") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_07")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,15).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,0).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,13).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_07")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_08 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_08") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_08")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new ReturnIterable(v_1).doCall().checkResult(new Integer[] {  }) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_08")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_09 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_09") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_09")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Contains(v_1,null).doCall().checkResult(new IllegalArgumentException()) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,0).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(0) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_09")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_10 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_10") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_10")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,null).doCall().checkResult(new IllegalArgumentException()) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,0).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(0) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_10")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_11 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_11") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_11")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(1) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_11")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_12 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_12") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_12")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,null).doCall().checkResult(new IllegalArgumentException()) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,0).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(0) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_12")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_13 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_13") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_13")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,0).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new ReturnIterable(v_1).doCall().checkResult(new Integer[] { 0 }) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,12).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(2) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_13")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_14 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_14") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_14")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,10).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new ReturnIterable(v_1).doCall().checkResult(new Integer[] { 10 }) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,2).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new ReturnIterable(v_1).doCall().checkResult(new Integer[] { 10 }) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_14")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_15 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_15") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_15")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,18).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,12).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,8).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Contains(v_1,1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_15")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_16 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_16") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_16")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,6).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(2) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,10).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,11).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_16")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_17 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_17") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_17")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,14).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,5).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,16).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,18).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,0).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_17")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_18 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_18") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_18")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,16).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,5).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new ReturnIterable(v_1).doCall().checkResult(new Integer[] { 5,16 }) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,10).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,19).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,16).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_18")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_19 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_19") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_19")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,4).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,20).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,4).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,20).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,13).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,14).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_19")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_20 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_20") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_20")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new ReturnIterable(v_1).doCall().checkResult(new Integer[] {  }) ;
if (ok_sofar)
  ok_sofar = new Contains(v_1,17).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,0).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,13).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Contains(v_1,4).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(1) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,4).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_20")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_21 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_21") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_21")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,18).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,12).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,15).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,2).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,13).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,6).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,15).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,6).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_21")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_22 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_22") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_22")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,18).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,10).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,9).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,14).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,8).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,15).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,4).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,5).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_22")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_23 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_23") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_23")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,14).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,0).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Contains(v_1,5).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,0).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Contains(v_1,5).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,0).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,2).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new ReturnIterable(v_1).doCall().checkResult(new Integer[] { 2 }) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,14).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,17).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,14).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_23")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_24 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_24") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_24")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,2).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,4).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,5).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,6).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,6).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(6) ;
if (ok_sofar)
  ok_sofar = new Contains(v_1,1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,6).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Contains(v_1,6).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,6).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_24")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_25 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_25") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_25")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,6).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,5).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,2).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,4).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,6).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(6) ;
if (ok_sofar)
  ok_sofar = new Contains(v_1,1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,6).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Contains(v_1,6).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,6).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_25")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_26 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_26") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_26")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,6).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,5).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,4).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,2).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,6).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(6) ;
if (ok_sofar)
  ok_sofar = new Contains(v_1,1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,6).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Contains(v_1,6).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,6).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_26")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_27 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_27") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_27")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,13).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,17).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,9).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,19).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,4).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,16).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,6).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,15).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,6).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,17).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,6).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_27")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_28 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_28") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_28")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,5).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,4).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(2) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,2).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new ReturnIterable(v_1).doCall().checkResult(new Integer[] { 4,5 }) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,17).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,8).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,16).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,6).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_28")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_29 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_29") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_29")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Contains(v_1,3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,0).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Contains(v_1,3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,0).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,16).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,18).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,9).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,17).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,13).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,6).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,16).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,6).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_29")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_30 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_30") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_30")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Contains(v_1,12).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,0).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,0).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,18).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Contains(v_1,8).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,9).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(3) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,13).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,11).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,19).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,6).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,10).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_30")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_31 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_31") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_31")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Contains(v_1,20).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,0).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,8).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(1) ;
if (ok_sofar)
  ok_sofar = new Contains(v_1,1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,9).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,2).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,10).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,8).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,19).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,6).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_31")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_32 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_32") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_32")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,19).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,0).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,9).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,6).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,12).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,20).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(3) ;
if (ok_sofar)
  ok_sofar = new Contains(v_1,8).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,8).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,9).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,17).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,5).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_32")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_33 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_33") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_33")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Contains(v_1,2).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Contains(v_1,10).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(1) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,20).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,19).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,20).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,11).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,11).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,16).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,5).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_33")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_34 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_34") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_34")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,12).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,4).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,11).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,10).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,6).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,18).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,18).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,20).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,6).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,10).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_34")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_35 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_35") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_35")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(0) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,19).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,12).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,12).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,16).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,6).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,7).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,6).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,15).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,10).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,7).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,5).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_35")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_36 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_36") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_36")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,2).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,10).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(3) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,10).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(2) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(1) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,2).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,0).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(0) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_36")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_37 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_37") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_37")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,14).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,2).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,15).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,20).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,9).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,19).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,6).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,19).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,6).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,12).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,19).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new ReturnIterable(v_1).doCall().checkResult(new Integer[] { 2,9,12,14,15,19,20 }) ;
if (ok_sofar)
  ok_sofar = new Contains(v_1,1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,13).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,2).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_37")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_38 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_38") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_38")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,12).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,17).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(2) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,13).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Contains(v_1,7).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,20).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,4).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,18).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,6).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,11).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,13).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,11).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,19).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_38")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_39 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_39") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_39")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new ReturnIterable(v_1).doCall().checkResult(new Integer[] {  }) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,7).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,18).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,9).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,17).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,10).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,16).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,16).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(3) ;
if (ok_sofar)
  ok_sofar = new ReturnIterable(v_1).doCall().checkResult(new Integer[] { 1,7,17 }) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,5).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,13).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_39")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_40 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_40") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_40")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,2).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,19).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(2) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,4).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,15).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,15).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,9).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new ReturnIterable(v_1).doCall().checkResult(new Integer[] { 2,4,9,15,19 }) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,15).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,8).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,6).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,10).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,8).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,11).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,9).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,9).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,6).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,10).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_40")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_41 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_41") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_41")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,4).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,19).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,12).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new ReturnIterable(v_1).doCall().checkResult(new Integer[] { 4,12,19 }) ;
if (ok_sofar)
  ok_sofar = new Contains(v_1,20).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,17).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,20).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,4).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Contains(v_1,1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Contains(v_1,6).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,5).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,6).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(6) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,18).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new ReturnIterable(v_1).doCall().checkResult(new Integer[] { 4,5,12,17,18,19,20 }) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,2).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,8).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_41")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_42 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_42") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_42")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,8).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,2).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new ReturnIterable(v_1).doCall().checkResult(new Integer[] { 2,8 }) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,15).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,14).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,4).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,6).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,17).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,15).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,14).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,7).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,8).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(8) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,16).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,9).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_42")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_43 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_43") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_43")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,15).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,13).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Contains(v_1,18).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,17).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,16).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,14).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,20).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,6).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,14).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,6).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,13).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,6).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,2).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,15).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,14).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,8).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,8).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,8).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_43")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_44 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_44") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_44")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new ReturnIterable(v_1).doCall().checkResult(new Integer[] {  }) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,13).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,18).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,0).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,5).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,12).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,6).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Contains(v_1,11).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,6).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,20).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,17).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,8).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Contains(v_1,6).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,8).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,8).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,9).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,7).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,10).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,6).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,11).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(11) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_44")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_45 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_45") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_45")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,5).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,10).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Contains(v_1,12).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,19).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(4) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,2).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,9).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,10).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,18).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,6).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,4).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,4).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,8).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Contains(v_1,20).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,8).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,9).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,12).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,8).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_45")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_46 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_46") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_46")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,18).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,0).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,15).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,15).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,16).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,2).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Contains(v_1,9).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Contains(v_1,15).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,4).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,11).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,6).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(6) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(6) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_46")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_47 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_47") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_47")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,20).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,6).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,13).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,15).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,8).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,15).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,8).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,20).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,8).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,8).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,8).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,17).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,6).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,11).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,15).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,8).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,20).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Contains(v_1,13).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_47")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_48 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_48") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_48")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,0).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,0).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,7).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,17).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,8).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,14).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,5).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,6).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,10).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(7) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,5).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,9).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,8).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,8).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,6).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,9).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,11).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,10).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(10) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,12).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,11).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,19).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,12).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,5).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,12).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,8).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,12).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_48")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_49 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_49") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_49")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,18).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,5).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,20).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new ReturnIterable(v_1).doCall().checkResult(new Integer[] { 5,18,20 }) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(3) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,15).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,17).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,6).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(7) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,7).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,8).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,16).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,9).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,4).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,10).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,19).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,11).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,0).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,12).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(12) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,6).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,13).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,12).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,14).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,7).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,14).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,4).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,14).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_49")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_50 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_50") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_50")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,10).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,12).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,13).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,9).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,4).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,6).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,6).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,2).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,5).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,8).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Contains(v_1,6).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,8).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,15).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,8).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(8) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,2).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,8).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,4).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,8).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,6).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,8).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,14).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,9).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Contains(v_1,19).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,9).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,20).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,10).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(10) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,15).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,11).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_50")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_51 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_51") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_51")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,4).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,0).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,0).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,9).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,8).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,5).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,16).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,6).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,12).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,8).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,4).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,8).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,0).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,8).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,12).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,0).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,6).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,8).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,6).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,18).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,2).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,8).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,7).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,9).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Contains(v_1,14).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,9).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(9) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,10).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,10).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(10) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,18).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,10).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new ReturnIterable(v_1).doCall().checkResult(new Integer[] { 2,3,4,5,7,8,9,10,16,18 }) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_51")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_52 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_52") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_52")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,17).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Contains(v_1,0).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,5).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,16).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,6).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(4) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,14).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(4) ;
if (ok_sofar)
  ok_sofar = new Contains(v_1,5).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,9).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,11).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,6).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,9).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,6).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,14).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,8).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,14).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,8).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,10).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,9).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,18).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,10).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,2).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,11).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,20).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,12).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,8).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,13).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,14).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,13).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,7).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,14).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_52")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_53 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_53") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_53")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,18).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Contains(v_1,1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,9).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,8).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,2).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,7).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,6).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,6).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(6) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,14).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new ReturnIterable(v_1).doCall().checkResult(new Integer[] { 2,6,7,8,9,14,18 }) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,18).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,12).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,8).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,19).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,9).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,8).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,9).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,18).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,9).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,14).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,9).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,17).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,10).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,6).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,10).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,14).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,10).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,12).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,10).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,4).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,11).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,10).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,12).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,14).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,12).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,19).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,12).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_53")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_54 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_54") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_54")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,12).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,0).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,9).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,18).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new ReturnIterable(v_1).doCall().checkResult(new Integer[] { 0,9,12,18 }) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,16).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,14).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,6).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,18).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,6).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,11).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,8).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,10).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,9).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,16).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,9).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,10).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,9).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,7).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,10).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(10) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,9).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,10).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,18).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,10).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,0).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,10).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,8).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,11).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,17).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,11).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,5).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,12).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(12) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,15).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,13).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,19).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,14).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,19).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,14).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,0).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,14).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,14).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,14).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,7).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,14).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_54")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_55 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_55") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_55")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,20).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,8).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,0).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,5).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new ReturnIterable(v_1).doCall().checkResult(new Integer[] { 0,5,8,20 }) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,12).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,11).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,6).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,14).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,14).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,9).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,8).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,7).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,9).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,6).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,10).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,9).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,9).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new ReturnIterable(v_1).doCall().checkResult(new Integer[] { 0,5,6,7,8,11,12,14,20 }) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,5).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,9).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,17).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,10).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,7).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,10).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,11).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(11) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,16).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,11).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new ReturnIterable(v_1).doCall().checkResult(new Integer[] { 0,3,5,6,7,8,11,12,14,17,20 }) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,7).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,11).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,4).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,12).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,19).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,13).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,14).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_55")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_56 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_56") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_56")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,18).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,9).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,17).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,16).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,16).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(4) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(4) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,7).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,13).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,6).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,10).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(7) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,16).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,14).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,8).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Contains(v_1,8).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,8).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,2).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,9).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,12).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,10).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,6).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,11).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,5).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,12).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,8).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,13).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,14).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,13).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,14).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,13).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,16).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,13).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,4).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,14).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,18).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,14).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Contains(v_1,19).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,14).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,5).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,14).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,7).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,15).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,15).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,14).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,14).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(14) ;
if (ok_sofar)
  ok_sofar = new Contains(v_1,9).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,14).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,14).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,14).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,2).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,14).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,20).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,15).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_56")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_57 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_57") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_57")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Contains(v_1,8).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,0).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,2).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,10).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,14).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,8).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,9).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,6).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,17).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,9).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,8).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,20).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,8).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,20).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,8).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,17).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,8).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,18).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,9).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,9).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,12).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,9).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(9) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(9) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,18).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,9).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,10).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,9).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,7).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,10).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,5).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,11).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,19).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,12).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,11).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,13).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,5).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,12).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,15).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,13).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,8).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,13).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,19).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,13).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,19).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,13).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,6).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,14).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,4).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,15).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,6).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,15).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,14).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,15).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,1).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,16).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,6).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,16).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,11).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,16).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,20).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,16).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,14).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,16).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_57")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("treapSet")
  public void test_treapSet_58 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TestResult<Treap<Integer>,Void> v_0 = null ;
Treap<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_treapSet_58") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_treapSet_58")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Add(v_1,19).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,15).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,9).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,0).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,4).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,13).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,6).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(6) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,14).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,6).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,16).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,0).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Contains(v_1,6).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,17).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,8).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(8) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,4).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,8).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,9).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Contains(v_1,15).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,9).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,14).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,10).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,14).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,10).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,15).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,10).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,12).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,11).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,11).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,20).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,12).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,6).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,13).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,11).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,14).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,14).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,13).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,17).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,13).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Contains(v_1,10).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,13).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,8).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,14).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(14) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,15).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,14).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,4).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,13).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new ReturnIterable(v_1).doCall().checkResult(new Integer[] { 0,3,6,8,9,11,12,13,15,16,17,19,20 }) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,7).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,14).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,9).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,13).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,8).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,13).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,19).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,13).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,0).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,13).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,9).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,14).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,12).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,14).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,5).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,15).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,0).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,15).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,18).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,16).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new Add(v_1,8).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new TreapOk(v_1,16).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_treapSet_58")) ;
    ResultsHandler.add_result(new String("treapSet"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  


static class Tests {
  static String tester = "TesterLab5";
}
static class TreapUtils {
  public static void resetPrinter() {
  }

  public static String printer(Object obj) {
    if (obj instanceof Treap) {
      return "treap";
    } else {
      return TestUtils.printer(obj, x -> printer(x));
    }
  }

  public static boolean treapOk(Treap<Integer> treap, Integer expectedSize) {
    if (treap.size() < expectedSize) {
      TestUtils.printError
        (TestUtils.ExecutionTime.AFTER,
         "\nthe treap should have size "+expectedSize+
         " but is of size "+treap.size());
    }

    BinaryTree<Pair<Integer,Integer>> t = null;
    try {
      Field f;
      f = treap.getClass().getDeclaredField("treap");
      f.setAccessible(true);
      t = (BinaryTree<Pair<Integer,Integer>>) f.get(treap);
    } catch ( Throwable exc ) {
      TestUtils.printError
        (TestUtils.ExecutionTime.AFTER,
         "no puede acceder al campo treap dentro Treap");
      return false;
    }
    boolean isOk = checkHeapOrderProperty(t);
    isOk = isOk && checkSearchTree(t);
    return isOk;
  }
  
  static boolean checkHeapOrderProperty(BinaryTree<Pair<Integer,Integer>> t) {
    return checkHeapOrderProperty(t, t.root());
  }

  static boolean checkHeapOrderProperty(BinaryTree<Pair<Integer,Integer>> t, Position<Pair<Integer,Integer>> pos) {
    if (pos != null) {
      if (!t.isRoot(pos)) {
        Pair<Integer,Integer> pair = pos.element();
        if (pair == null) {
          TestUtils.printError
            (TestUtils.ExecutionTime.AFTER,
             "El arbol tiene una posicion cuyo elemento es null. El arbol: \n"+t);
          return false;
        }
        Integer key = pair.getRight();
        if (key == null) {
          TestUtils.printError
            (TestUtils.ExecutionTime.AFTER,
             "El arbol tiene una key que es null. El arbol: \n"+t);
          return false;
        }
        Position<Pair<Integer,Integer>> parentPos = t.parent(pos);
        Pair<Integer,Integer> parentPair = parentPos.element();
        if (parentPair == null) {
          TestUtils.printError
            (TestUtils.ExecutionTime.AFTER,
             "El arbol tiene una posicion cuyo elemento es null. El arbol: \n"+t);
          return false;
        }
        Integer parentKey = parentPair.getRight();
        if (parentKey == null) {
          TestUtils.printError
            (TestUtils.ExecutionTime.AFTER,
             "El arbol tiene una clave que es null. El arbol: \n"+t);
          return false;
        }
        if (parentKey > key) {
          TestUtils.printError
            (TestUtils.ExecutionTime.AFTER,
             "El arbol no cumple con la propiedad de ser un heap.\n"+
             "El nodo "+pos+" tiene una clave menor que la clave de su padre "+
             parentPos+". El arbol: \n"+t);
          return false;
        }
      }
      if (checkHeapOrderProperty(t, t.left(pos)))
        return checkHeapOrderProperty(t, t.right(pos));
      else
        return false;
    }
    return true;
  }

  static boolean checkSearchTree(BinaryTree<Pair<Integer,Integer>> t) {
    return checkSearchTree(t, t.root(), null, null);
  }

  static boolean checkSearchTree(BinaryTree<Pair<Integer,Integer>> t, Position<Pair<Integer,Integer>> pos, Integer min, Integer max) {
    if (pos == null) return true;
    else {
      Pair<Integer,Integer> pair = pos.element();
      if (pair == null) {
          TestUtils.printError
            (TestUtils.ExecutionTime.AFTER,
             "El arbol tiene una posicion cuyo elemento es null. El arbol: \n"+t);
          return false;
      }
      Integer key = pair.getLeft();
      Integer prio = pair.getRight();
      if (key == null) {
        TestUtils.printError
          (TestUtils.ExecutionTime.AFTER,
           "El arbol tiene una clave que es null. El arbol: \n"+t);
        return false;
      }
      if (prio == null) {
        TestUtils.printError
          (TestUtils.ExecutionTime.AFTER,
           "El arbol tiene una prioridad que es null. El arbol: \n"+t);
        return false; 
     }
      if ((min != null) && (key < min)) {
        TestUtils.printError
          (TestUtils.ExecutionTime.AFTER,
           "El arbol no es arbol de busqueda; tiene una clave "+key+" fuera de rango. El arbol:\n"+t); 
        return false;
      }
      if ((max != null) && (key > max)) {
        TestUtils.printError
          (TestUtils.ExecutionTime.AFTER,
           "El arbol no es arbol de busqueda; tiene una clave "+key+" fuera de rango. El arbol:\n"+t); 
        return false;
      }
      boolean isOk = true;
      if (t.hasLeft(pos))
        isOk = checkSearchTree(t, t.left(pos), min, key-1);
      if (t.hasRight(pos))
        isOk = checkSearchTree(t, t.right(pos), key+1, max);
      return isOk;
    }
  }
  
}





























static class TestUtils {
  enum ExecutionTime { AFTER, LAST, DURING, UNRELATED }

  static String print(Object obj) {
    return TesterCode.printer(obj);
  }

  static String standardPrinter(Object obj) {
    return printer(obj, x -> standardPrinter(x));
  }

  static String printer(Object obj, Function<Object,String> print) {
    if (obj == null)
      return "null";
    if (obj instanceof String) {
      return("\""+obj.toString()+"\"");
    } else if (obj instanceof Position<?>) {
      return obj.toString();
    } else if (obj instanceof Pair<?,?>) {
      Pair<?,?> p = (Pair<?,?>) obj;
      return "Pair("+print.apply(p.getLeft())+","+print.apply(p.getRight())+")";
    } else if (obj instanceof java.util.Set<?>) {
      Iterable<?> l = (Iterable<?>) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("{");
      boolean first = true;
      for (Object lobj : l) {
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(lobj));
      }
      buf.append("}");
      return buf.toString();
    } else if (obj instanceof Map<?,?>) {
      Map<?,?> m = (Map<?,?>) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (Entry<?,?> lobj : m.entries()) {
        if (first) first=false;
        else buf.append(",");
        buf.append("("+print.apply(lobj.getKey())+","+print.apply(lobj.getValue())+")");
      }
      buf.append("]");
      return buf.toString();
    } else if (obj instanceof Tree<?>) {
      Tree<?> t = (Tree<?>) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("\n");
      buf.append(t.toString());
      buf.append("\n");
      return buf.toString();
    } else if (obj instanceof Iterable<?>) {
      Iterable<?> l = (Iterable<?>) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (Object lobj : l) {
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(lobj));
      }
      buf.append("]");
      return buf.toString();
    } else if (obj instanceof Object[]) {
      Object[] arr = (Object[]) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (int i=0; i<arr.length; i++) {
        Object aobj = arr[i];
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(aobj));
      }
      buf.append("]");
      return buf.toString();
    } else if (obj instanceof int[]) {
      int[] arr = (int[]) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (int i=0; i<arr.length; i++) {
        int aobj = arr[i];
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(aobj));
      }
      buf.append("]");
      return buf.toString();
    } else if(obj instanceof char[]) {
      char[] arr = (char[]) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (int i=0; i<arr.length; i++) {
        char aobj = arr[i];
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(aobj));
      }
      buf.append("]");
      return buf.toString();
    }
    else
      return obj.toString();
  }

  static void printWarning(String TestName) {
      TestData.message("\n*** Warning in "+(TestName==null?"":TestName)+":");
  }

  static void printError(String TestName) {
      TestData.message("\n\n***********************************************");
      TestData.message("*** Error in "+(TestName==null?"":TestName)+":");
  }

  static void terminateErrorPrint() {
      TestData.message("\n***********************************************\n\n");
  }

  static boolean compare(Object o1, Object o2) {
      if (o1==null) return o2==null;
      else return o1.equals(o2);
  }

  static void printCallException(ExecutionTime time, String msg, Throwable exc) {
    printError(TestData.testName);

      int traceLength = TestData.numCommands();

      if (traceLength > 0) {
        TestData.message("\n"+callSeqString(traceLength,time)+"\n");
        TestData.message(TestData.getTrace());
      }

      switch (time) {
      case AFTER:
          TestData.message("the call to "+msg+" raised the exception "+exc+
                             " although it should not have");
          break;
      default:
          TestData.message(" -- the exception "+exc+" was raised although it "+
                             "should not have been\n"+msg);
          break;
      }
      TestData.message(getStackTrace(exc));
      terminateErrorPrint();
    }

  static String getStackTrace(Throwable throwable) {
    filterStackTrace(throwable);
    StringWriter errors = new StringWriter();
    throwable.printStackTrace(new PrintWriter(errors));
    return errors.toString();
  }

  static void filterStackTrace(Throwable throwable) {
    StackTraceElement[] stackTrace = throwable.getStackTrace();
    ArrayList<StackTraceElement> l = new ArrayList<StackTraceElement>();
    for (int i=0; i<stackTrace.length; i++) {
      String className = stackTrace[i].getClassName();
      if (className.startsWith("jdk.internal")
          || className.startsWith("org.junit")) break;
      l.add(stackTrace[i]);
    }
    StackTraceElement[] cutStackTrace = new StackTraceElement[l.size()];
    throwable.setStackTrace(l.toArray(cutStackTrace));
  }

  static void printCallException(String msg, Throwable exc) {
    printCallException(ExecutionTime.AFTER,msg,exc);
  }

  static void printCallException(Throwable exc) {
    printCallException(ExecutionTime.LAST,"",exc);
  }

  static void printCallException(Throwable exc, Supplier<String> msg) {
    printCallException(ExecutionTime.LAST,msg.get(),exc);
  }

  static void printWarning(ExecutionTime time, String msg) {
    TestData.message("\n\n***********************************************");
    if (TestData.testName != "") {
      TestData.message("\n*** Warning for "+TestData.testName+": ");
    } else
      TestData.message("\n*** Warning:");

    if (time != TestUtils.ExecutionTime.UNRELATED) {
      int traceLength = TestData.numCommands();

      if (traceLength > 0) {
        TestData.message(callSeqString(traceLength,time));
        TestData.message(TestData.getTrace());
      }
    }
    TestData.message(msg);
    terminateErrorPrint();
  }

  static void printError(ExecutionTime time, String msg) {
    printError(TestData.testName);

    if (time != TestUtils.ExecutionTime.UNRELATED) {
      int traceLength = TestData.numCommands();

      if (traceLength > 0) {
        TestData.message("\n"+callSeqString(traceLength,time));
        TestData.message(TestData.getTrace());
      }
    }

    TestData.message(msg);
    terminateErrorPrint();
  }

  static String callSeqString(int traceLength, ExecutionTime time) {
    if (traceLength < 2)
      return "while executing the call ";
    else {
      switch(time) {
      case AFTER:
          return "after executing the call sequence ";
      case LAST:
          return "while executing the last statement of call sequence ";
      case DURING:
          return "while executing the call sequence ";
      case UNRELATED:
          return "";
      }
      return "";
    }
  }

  static <E> boolean checkNull(TestCall<E,Boolean> call,
                               TestResult<E,Boolean> result,
                               Boolean expected) {
    if (expected) return call.nonNull();
    else return call.isNull();
  }

  // Checks that results, which may not be an exception nor null
  // (needs prior checks), which are iterables, return the same
  // set of elements.
  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E extends Iterable<?>,F extends Iterable<?>>
    boolean sameSet(TestCall<E,F> call,
                    TestResult<E,F> result,
                    F expected) {
    return sameSet(call,result.getValue(),expected);
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E extends Iterable<?>,F extends Iterable<?>>
    boolean sameSet(TestCall<?,?> call, E value, F expected) {

    HashSet<Object> s1 = new HashSet<Object>();
    HashSet<Object> s2 = new HashSet<Object>();
    for (Object e : value)
      s1.add(e);
    for (Object f : expected)
      s2.add(f);
    if (!s1.equals(s2)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value which contained the elements\n  "+TestUtils.print(s1)+
         "\nwhich differs from the expected elements\n  "+TestUtils.print(s2));
      return false;
    }
    return true;
  }

  // Checks that results, which are basic arrays, are equal
  static <E,F> boolean eqArrays(TestCall<int[],int[]> call,
                                TestResult<int[],int[]> result,
                                int[] expected) {
    if (!call.noException())
      return false;
    if (!call.nonNull())
      return false;

    return eqArrays(call, result.getValue(), expected);
  }

  static boolean eqArrays(TestCall<int[],int[]> call, int[] value, int[] expected) {
    boolean ok_sofar = value.length == expected.length;

    if (ok_sofar) {
      for (int i=0; i<value.length && ok_sofar; i++) {
        ok_sofar = ok_sofar && (value[i] == expected[i]);
      }
    }

    if (!ok_sofar) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned an array "+printArray(value)+
         " which differs from the expected array "+printArray(expected));
    }
    return ok_sofar;
  }

  // Checks that the result is a member of the iterable
  static <E,F> boolean memberElements(TestCall<E,F> call,
                                     TestResult<E,F> result,
                                     F expected) {
    if (!call.noException())
      return false;
    if (!call.nonNull())
      return false;

    boolean checkResult = memberElements(call,result.getValue(),expected);
    if (!checkResult)
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value "+TestUtils.print(result.getValue())+
         "\nwhich was not included among the expected values\n"+
         TestUtils.print(expected));
    return checkResult;
  }

  static <E,F> boolean memberElements(TestCall<E,F> call,
                                    E value,
                                    F expected) {

    if (!memberElements(value,expected)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value\n  "+TestUtils.print(value)+
         "\nwhich is not included among the expected elements\n  "+TestUtils.print(expected));
      return false;
    }
    return true;
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  public static <E,F>
    boolean memberElements(E value, F expectedP) {
    if (expectedP instanceof Iterable<?>) {
      Iterable<?> expected = (Iterable<?>) expectedP;

      HashSet<Object> s = new HashSet<Object>();
      for (Object e : expected) {
        s.add(e);
      }
      return s.contains(value);
    } else {
      System.out.println
        ("*** Error: expected of type "+expectedP.getClass()+" does not implement Iterable");
      throw new RuntimeException();
    }
  }

  // Checks that results, which are iterables, return the same
  // elements, regardless of the order.
  static <E,F> boolean sameElements(TestCall<E,F> call,
                                    TestResult<E,F> result,
                                    F expected) {
    if (!call.noException())
      return false;
    if (!call.nonNull())
      return false;

    return sameElements(call,result.getValue(),expected);
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...

  static <E,F> boolean sameElements(TestCall<E,F> call,
                                    E value,
                                    F expected) {

    if (!sameElements(value,expected)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value which contained the elements\n  "+TestUtils.print(value)+
         "\nwhich differs from the expected elements\n  "+TestUtils.print(expected));
      return false;
    }
    return true;
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E,F>
    boolean sameElements(E valueP, F expectedP) {
    if ((valueP instanceof Iterable<?>) &&
        (expectedP instanceof Iterable<?>)) {
      Iterable<?> value = (Iterable<?>) valueP;
      Iterable<?> expected = (Iterable<?>) expectedP;

      HashMap<Object,Integer> s1 = new HashMap<Object,Integer>();
      HashMap<Object,Integer> s2 = new HashMap<Object,Integer>();
      for (Object e : value) {
        Integer si = s1.get(e);
        if (si == null) si = 0;
        s1.put(e,si+1);
      }
      for (Object f : expected) {
        Integer si = s2.get(f);
        if (si == null) si = 0;
        s2.put(f,si+1);
      }
      if (!s1.equals(s2))
        return false;
      else
        return true;
    } else {
      if (!(valueP instanceof Iterable<?>))
        System.out.println
          ("*** Error: result of type "+valueP.getClass()+" does not implement Iterable");
      if (!(expectedP instanceof Iterable<?>))
        System.out.println
          ("*** Error: expected of type "+expectedP.getClass()+" does not implement Iterable");
      throw new RuntimeException();
    }
  }



  // Checks that results, which are iterables, return the same
  // elements, preserving the order.
  static <E,F> boolean sameElementsInOrder(TestCall<E,F> call,
                                    TestResult<E,F> result,
                                    F expected) {
    if (!call.noException())
      return false;
    if (!call.nonNull())
      return false;

    return sameElementsInOrder(call,result.getValue(),expected);
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...

  static <E,F> boolean sameElementsInOrder(TestCall<E,F> call,
                                    E value,
                                    F expected) {

    if (!sameElementsInOrder(value,expected)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value which contained the elements\n  "+TestUtils.print(value)+
         "\nwhich differs from the expected elements\n  "+TestUtils.print(expected));
      return false;
    }
    return true;
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E,F>
    boolean sameElementsInOrder(E valueP, F expectedP) {
    if ((valueP instanceof Iterable<?>) &&
        (expectedP instanceof Iterable<?>)) {
      Iterable<?> value = (Iterable<?>) valueP;
      Iterable<?> expected = (Iterable<?>) expectedP;

      Iterator<?> it1 = value.iterator();
      Iterator<?> it2 = expected.iterator();

      if (it1 == null) return false;

      while (it1.hasNext() && it2.hasNext()) {
        Object e2 = it2.next();
        Object e1 = null;
        try { e1 = it1.next(); }
        catch (Throwable exc) {
          return false;
        }
        if (e2 == null && e1 != null) return false;
        if (!e2.equals(e1)) return false;
      }

      if (it1.hasNext() != it2.hasNext())
        return false;
      return true;

    } else {
      if (!(valueP instanceof Iterable<?>))
        System.out.println
          ("*** Error: result of type "+valueP.getClass()+" does not implement Iterable");
      if (!(expectedP instanceof Iterable<?>))
        System.out.println
          ("*** Error: expected of type "+expectedP.getClass()+" does not implement Iterable");
      throw new RuntimeException();
    }
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // equals which does not fail upon finding
  // null values...
  static <E> boolean wellSorted(TestCall<?,?> call,
                                IndexedList<E> value,
                                ArrayIndexedList<ArrayIndexedList<E>> expected) {

    int i = 0;
    IndexedList<E> eqClass = null;
    for (E e : value) {
      if (eqClass == null) {
        if (i < expected.size())
          eqClass = new ArrayIndexedList<E>(expected.get(i));
        else {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list: "+value+
             " which isn't sorted correctly. The correct sort order is "+expected);
          return false;
        }
      }
      if (!eqClass.remove(e)) {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list: "+value+
             " which isn't sorted correctly. The correct sort order is "+expected);
          return false;
      }
      if (eqClass.size() == 0) {
        eqClass = null;
        i++;
      }
    }
    if (eqClass != null || i < expected.size()) {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list: "+value+
             " which isn't sorted correctly. The correct sort order is "+expected);
          return false;
    }
    return true;
  }


  static <E> boolean wellSorted(TestCall<?,?> call,
                                PositionList<E> value,
                                PositionList<E> expected,
                                Function<Pair<E,E>,Boolean> isSame) {

    PositionList<E> expectedCopy = new NodePositionList<E>(expected);

    if (value.size() != expected.size()) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a list:\n  "+value+
         "\nwhich contains the wrong number of elements.\n"+
         "The correct list (modulo order of equal elements) is\n  "+
         expectedCopy);
      return false;
    }

    Position<E> valuePos = value.first();

    while (valuePos != null) {
      E valueE = valuePos.element();

      if (valueE == null) {
        if (value.size() != expected.size()) {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list:\n  "+value+
             "\nwhich contains a null element.\n"+
             "The correct list (modulo order of equal elements) is\n  "+
             expectedCopy);
          return false;
        }
      }

      Position<E> expectedPos = expected.first();
      boolean found = false;
      boolean equals = true;

      while (expectedPos != null && !found && equals) {
        E expectedE = expectedPos.element();
        if (valueE.equals(expectedE)) {
          found = true;
          expected.remove(expectedPos);
        } else if (!isSame.apply(new Pair<E,E>(valueE,expectedE)))
          equals = false;

        if (!found && equals) {
          expectedPos = expected.next(expectedPos);
        }
      }

      if (!found) {
        printError
          (ExecutionTime.DURING,
           "the call "+call.toString()+
           " returned a list:\n  "+value+
           "\nwhich contains elements either incorrect elements or elements in the wrong order."+
           "\nThe correct list (modulo order of equal elements) is\n  "+
           expectedCopy);
        return false;
      }

      valuePos = value.next(valuePos);
    }
    return true;
  }


  static <E> PositionList<E> extractElementsFromIterable(String callString, Iterable<E> i) {
    if (i == null) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString+
         " returned an null iterable");
      return null;
    }

    PositionList<E> l = null;

    try {
      java.util.Iterator<E> it = i.iterator();
      l = extractElementsFromIterator(it);
    } catch (Throwable exc) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString+
         " returned an iterable which when used raised the exception "+
         exc+"\n"+getStackTrace(exc));
      return null;
    }
    return l;
  }

  static <E> PositionList<E> extractElementsFromIterator(java.util.Iterator<E> it) {
    PositionList<E> l = new NodePositionList<E>();
    while (it.hasNext()) {
      l.addLast(it.next());
    }
    return l;
  }

  static <E,F> boolean unorderedIterableCorrect
    (TestCall<Iterable<E>,F[]> call,
     TestResult<Iterable<E>,F[]> result,
     F[] expected) {
    java.util.Iterator<E> it = null;

    try {
      it = result.getValue().iterator();
      if (it == null) {
        printError
          (ExecutionTime.DURING,
           "the call "+call.toString()+
           " returned an iterable which returned a null iterator");
        return false;
      }
      else return unorderedIteratorCorrect(() -> call.toString(), it, expected);
    } catch (Throwable exc) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned an iterable which when used raised the exception "+
         exc+"\n"+getStackTrace(exc));
      return false;
    }
  }

  static <E,F> boolean unorderedIteratorCorrect
    (TestCall<java.util.Iterator<E>,F[]> call,
     TestResult<java.util.Iterator<E>,F[]> result,
     F[] expected) {
    java.util.Iterator<E> it = result.getValue();
    return unorderedIteratorCorrect(() -> call.toString(), it, expected);
  }

  static <E,F> boolean unorderedIteratorCorrect
    (Supplier<String> callString,
     java.util.Iterator<E> it,
     F[] expected) {

    PositionList<E> l = null;

    try { l = extractElementsFromIterator(it); }
    catch ( Throwable exc ) {
      TestUtils.printCallException(exc);
      return false;
    }

    if (l == null) return false;

    boolean correct = (expected.length == l.size());

    if (correct) {
      PositionList<F> expectedList = new NodePositionList<F>();
      for (int j=0; j<expected.length; j++) {
        expectedList.addLast(expected[j]);
      }
      HashSet<Object> s1 = new HashSet<Object>();
      HashSet<Object> s2 = new HashSet<Object>();
      for (Object e : l)
        s1.add(e);
      for (Object f : expectedList)
        s2.add(f);
      if (!s1.equals(s2)) {
        printError
          (ExecutionTime.DURING,
           "the call "+callString.get()+
           " returned an iterator which returned the elements "+TestUtils.print(s1)+
           " which differs from the expected elements "+TestUtils.print(s2));
        return false;
      }
    }

    if (!correct) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString.get()+
         " returned an iterator with the elements "+TestUtils.print(l)+
         " but should have returned the elements "+TestUtils.print(expected));
      return false;
    } else return true;
  }

  static <E,F> boolean iterableCorrect
    (TestCall<Iterable<E>,F[]> call,
     TestResult<Iterable<E>,F[]> result,
     F[] expected) {
    java.util.Iterator<E> it = null;

    try {
      it = result.getValue().iterator();
      if (it == null) {
        printError
          (ExecutionTime.DURING,
           "the call "+call.toString()+
           " returned an iterable which returned a null iterator");
        return false;
      }
      else return iterableCorrect(call.toString(), expected, result.getValue());
    } catch (Throwable exc) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned an iterable which when used raised the exception "+
         exc+"\n"+getStackTrace(exc));
      return false;
    }
  }

  static <E,F> boolean iterableCorrect(String callString, F[] original, Iterable<E> i) {
    PositionList<E> l = extractElementsFromIterable(callString, i);
    if (l == null) return false;

    boolean correct = (original.length == l.size());

    if (correct) {
      Position<E> cursor = l.first();
      for (int j=0; j<original.length; j++) {
        if (original[j] == null) {
          correct = correct && (cursor.element() == null);
        }
        correct = correct && original[j].equals(cursor.element());
        if (!correct) break;
        cursor = l.next(cursor);
      }
    }

    if (!correct) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString+
         " returned an iterable with the elements "+TestUtils.print(l)+
         " but should have returned the elements "+TestUtils.print(original));
      return false;
    } else return true;
  }

  static <E,F> boolean iterableCorrect
    (TestCall<Iterable<E>,PositionList<F>> call,
     TestResult<Iterable<E>,PositionList<F>> result,
     Iterable<F> expected) {
    java.util.Iterator<E> it = null;
    java.util.Iterator<F> exp = expected.iterator();

    try {
      it = result.getValue().iterator();
      if (it == null) {
        printError
          (ExecutionTime.DURING,
           "the call "+call.toString()+
           " returned an iterable which returned a null iterator");
                                return false;
      }
      else return iterableCorrect(call.toString(), expected, result.getValue());
    } catch (Throwable exc) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned an iterable which when used raised the exception "+
         exc+"\n"+getStackTrace(exc));
      return false;
    }
  }

  static <E,F> boolean iterableCorrect(String callString, Iterable<F> original, Iterable<E> i) {
    PositionList<E> l = extractElementsFromIterable(callString, i);
    PositionList<F> e = extractElementsFromIterable(callString, original);
    if (l == null) return false;

    boolean correct = (e.size() == l.size());

    if (correct) {
      Position<E> cursor = l.first();
      Position<F> cursorE = e.first();
      for (int j=0; j<e.size(); j++) {
        if (cursorE.element() == null) {
          correct = correct && (cursor.element() == null);
        }
        correct = correct && cursorE.element().equals(cursor.element());
        if (!correct) break;
        cursor = l.next(cursor);
                                cursorE = e.next(cursorE);
      }
    }

    if (!correct) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString+
         " returned an iterable with the elements "+TestUtils.print(l)+
         " but should have returned the elements "+TestUtils.print(e));
      return false;
    } else return true;
  }

  static <E> boolean unchanged(String callString, E[] original, PositionList<E> l) {
      boolean ok_sofar = true;

      if (l.size() != original.length) {
          ok_sofar = false;
      }

      Position<E> lPos = l.first();
      int i=0;
      while (ok_sofar && lPos != null) {
          E elem = lPos.element();

          if (elem == null) ok_sofar = (original[i] == null);
          else ok_sofar = elem.equals(original[i]);

          lPos = l.next(lPos);
          ++i;
      }

      if (!ok_sofar) {
          printError
            (ExecutionTime.DURING,
               "the call "+callString+
               " has modified the input list "+TestUtils.print(original)+
             "; it has now the elements "+TestUtils.print(l));
          return ok_sofar;
      }
      return ok_sofar;
  }

  static <E> boolean unchanged(String callString, E[] original, E[] newer) {
      boolean ok_sofar = true;

      if (newer.length != original.length) {
          ok_sofar = false;
      }

      for (int i=0; i<newer.length; i++) {
          if (newer[i] == null) ok_sofar = (original[i] == null);
          else ok_sofar = newer[i].equals(original[i]);
      }

      if (!ok_sofar) {
          printError
              (ExecutionTime.DURING,
               "the call "+callString+
               " has modified the input array "+TestUtils.print(original)+
               "; it has now the elements "+TestUtils.print(newer));
          return ok_sofar;
      }
      return ok_sofar;
  }

  static <E> Iterable<E> returnIterable(Iterable<E> iterable) {
    return iterable;
  }

  static String printArray(Object[] arr) {
      if (arr == null) return "null";
      else {
          StringBuilder arrString = new StringBuilder("[");

          for (int i = 0; i < arr.length; i++) {
              arrString.append(arr[i]);
              if (i < arr.length-1)
                  arrString.append(", ");
          }
          arrString.append("]");
          return arrString.toString();
      }
  }

  static String printArray(int[] arr) {
      if (arr == null) return "null";
      else {
          StringBuilder arrString = new StringBuilder("[");

          for (int i = 0; i < arr.length; i++) {
              arrString.append(arr[i]);
              if (i < arr.length-1)
                  arrString.append(", ");
          }
          arrString.append("]");
          return arrString.toString();
      }
  }

  static String printArray(char[] arr) {
      if (arr == null) return "null";
      else {
          StringBuilder arrString = new StringBuilder("[");

          for (int i = 0; i < arr.length; i++) {
              arrString.append(arr[i]);
              if (i < arr.length-1)
                  arrString.append(", ");
          }
          arrString.append("]");
          return arrString.toString();
      }
  }

  public static <T> PositionList<T> toPositionList(T[] arr) {
    NodePositionList<T> l = new NodePositionList<T>();
    for (int i=0; i<arr.length; i++)
      l.addLast(arr[i]);
    return l;
  }

  public static <T> IndexedList<T> toIndexedList(T[] arr) {
    ArrayIndexedList<T> l = new ArrayIndexedList<T>();
    for (int i=0; i<arr.length; i++)
      l.add(0,arr[i]);
    return l;
  }

  public static Object accessAttribute(String fieldName, Object obj) {
    try {
      Field field;
      field = obj.getClass().getDeclaredField(fieldName);
      field.setAccessible(true);
      return field.get(obj);
    } catch ( Throwable exc ) {
      TestUtils.printCallException
        (TestUtils.ExecutionTime.LAST,
         "cannot access the field "+fieldName+": ",
         exc);
      return null;
    }
  }

  public static void reportPid() {
    try {
      String[] ids = ManagementFactory.getRuntimeMXBean().getName().split("@");
      BufferedWriter bw = new BufferedWriter(new FileWriter("pid"));
      bw.write(ids[0]);
      bw.close();
    } catch (Exception e) {
      System.out.println("Avisa al profesor de fallo sacando el PID");
    }
  }

  @SafeVarargs
  @SuppressWarnings("varargs")
  public static <T> T[] toGenericArray(T ... elems) {
    return elems;
  }

  public static boolean ensureAedlibVersion(int major, int minor, int patchlevel) {
    boolean isOk = true;
    int aedlibMajor = 0, aedlibMinor = 0, aedlibPatchlevel = 0;

    try {
      Class<?> aedlibVersion = Class.forName("es.upm.aedlib.Version");
      Method majorMethod = aedlibVersion.getDeclaredMethod("major");
      Method minorMethod = aedlibVersion.getDeclaredMethod("minor");
      Method patchlevelMethod = aedlibVersion.getDeclaredMethod("patchlevel");

      aedlibMajor =
        (Integer) majorMethod.invoke(null);
      aedlibMinor =
        (Integer) minorMethod.invoke(null);
      aedlibPatchlevel =
        (Integer) patchlevelMethod.invoke(null);

      isOk =
        ((aedlibMajor > major)
         || ((aedlibMajor == major) &&
             ((aedlibMinor > minor)
              || ((aedlibMinor == minor) &&
                  (aedlibPatchlevel >= patchlevel)))));
    } catch (Throwable exc) {
      System.out.println
        ("*** WARNING: cannot check aedlib version number due to "+exc);
      exc.printStackTrace();
    }

    if (!isOk) {
      String errorMessage =
        "*** ERROR: aedlib is too old. Minimum version needed is "+
        major+"."+minor+"."+patchlevel+"; your version is "+
        aedlibMajor+"."+aedlibMinor+"."+aedlibPatchlevel+
        ". Please download a new version of aedlib from moodle\n";
      System.out.println(errorMessage);
      throw new RuntimeException(errorMessage);
    } else return true;
  }

  @SuppressWarnings("unchecked")
  public static es.upm.aedlib.Entry<es.upm.aedlib.graph.Vertex<Integer>,Integer> es_upm_aedlib_map_Entry_refl_cnstr(Object... params) {
    return (es.upm.aedlib.Entry<es.upm.aedlib.graph.Vertex<Integer>,Integer>) reflectionNew("es.upm.aedlib.map.HashEntry",params);
  }

  public static Object reflectionNew(String className, Object... params) {
    try {
      Class<?> cl = Class.forName(className);
      for (java.lang.reflect.Constructor<?> cnstr : cl.getConstructors()) {
        Class<?>[] parameterTypes = cnstr.getParameterTypes();
        if (parameterTypes.length == params.length) {
          boolean equals = true;
          for (int i=0; i<parameterTypes.length && equals; i++) {
            if (!parameterTypes[i].isInstance(params[i]))
              equals = false;
          }
          if (equals) {
            cnstr.setAccessible(true);
            return cnstr.newInstance(params);
          }
        }
      }
    } catch (ClassNotFoundException exc) {
      System.out.println
        ("*** Warning: could not access class "+className);
      throw new RuntimeException();
    } catch (InstantiationException exc) {
      System.out.println
        ("*** Warning: could not instantiate "+className);
      throw new RuntimeException();
    } catch (IllegalAccessException exc) {
      System.out.println
        ("*** Warning: could not access "+className);
      throw new RuntimeException();
    } catch (InvocationTargetException exc) {
      System.out.println
        ("*** Warning: constructor "+className+" raised an exception");
      throw new RuntimeException();
    }
    throw new RuntimeException();
  }
}

interface TestResult<E,F> {
  boolean isException();
  Throwable getException();
  E getValue();
  boolean checkResult(F expected);
}

static class Result<E,F> implements TestResult<E,F> {
  private boolean isException;
  private Throwable exception;
  private E value;
  Call<E,F> call;

  public static <E,F> Result<E,F> result(E e, Call<E,F> call) {
    Result<E,F> result = new Result<E,F>();
    result.isException = false;
    result.value = e;
    result.call = call;
    return result;
  }

  public static <E,F> Result<E,F> exception(Throwable exception, Call<E,F> call) {
    Result<E,F> result = new Result<E,F>();
    result.isException = true;
    result.exception = exception;
    result.call = call;
    return result;
  }

  public boolean isException() {
    return isException;
  }

  public Throwable getException() {
    if (!isException()) {
      TestData.message("*** Internal model error: calling getException() without exception");
      throw new RuntimeException();
    }
    return exception;
  }

  public E getValue() {
    if (isException())
      throw new RuntimeException();
    return value;
  }

  Call<E,F> getCall() {
    return call;
  }

  public boolean checkResult(F expected) {
    try {
      return getCall().checkResult(expected);
    } catch (Throwable exc) {
      System.out.println("\n\n\n*** Internal testing error: checkResult("+expected+") raised exception "+exc);
      exc.printStackTrace();
      TestData.message("\n\n\n*** Internal testing error: checkResult("+expected+") raised exception "+exc);
      TestUtils.printCallException(exc);
      TestData.message("\n");
      throw new RuntimeException();
    }
  }

  public String toString() {
    String callString = getCall().toString();
    if (!callString.equals("")) {
      if (isException())
        return callString + "  =>  " + getException();
      else
        {
          String valueString = TesterCode.printer(getValue());
          return callString + "  =>  " + format_value(valueString);
        }
    } else return callString;
  }

  private String format_value(String msg) {
    String[] lines = msg.split("\\r?\\n");
    if (lines.length == 1) return msg;
    else {
      StringBuffer resultString = new StringBuffer();
      for (String line : lines) {
        resultString.append("\n    ");
        resultString.append(line);
      }
      return resultString.toString();
    }
  }
}

interface Call<E,F> {
  TestResult<E,F> doCall();
  String toString();
  boolean checkResult(F expected);
}

static abstract class TestCall<E,F> implements Call<E,F> {
  TestResult<E,F> result;
  boolean hasCalled;
  boolean voidReturn = false;

  public TestResult<E,F> doCall() {
    if (hasCalled())
      throw new RuntimeException();

    hasCalled = true;
    TestData.addCallToTrace(this.toString());

    try {
      E e = call();
      result = Result.result(e,this);
    } catch (Throwable exception) {
      result = Result.exception(exception,this);
    }

    if (result.isException() || !voidReturn)
      TestData.modifyLastCallInTrace(TesterCode.printer(result));

    return result;
  }

  abstract E call() throws Exception;

  boolean hasCalled() {
    return hasCalled;
  }

  boolean noException() {
    if (result.isException()) {
      Throwable throwable = result.getException();
      TestUtils.printCallException(throwable);
      return false;
    }
    return true;
  }

  boolean noException(Supplier<String> msg) {
    if (result.isException()) {
      Throwable throwable = result.getException();
      TestUtils.printCallException(throwable,msg);
      return false;
    }
    return true;
  }

  boolean throwsException(String expectedName) {
    if (!result.isException()) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+" should have thrown an exception "+expectedName+
         " but did not.");
      return false;
    }

    Throwable exception = result.getException();
    if (!expectedName.equals(exception.getClass().getCanonicalName())) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+" should have thrown the exception "+
         expectedName+
         ", but throwed the exception "+exception+"\n"+
         TestUtils.getStackTrace(exception));
      return false;
    }

    return true;
  }

  boolean nonNull() {
    if (!noException())
      return false;
    if (result.getValue() == null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned null but it should not have\n");
      return false;
    } else return true;
  }

  boolean nonNull(Supplier<String> msg) {
    if (!noException())
      return false;
    if (result.getValue() == null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned null but it should not have\n"+
         msg.get());
      return false;
    } else return true;
  }

  boolean isNull() {
    if (!noException())
      return false;
    if (result.getValue() != null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " should have returned null but did not\n");
      return false;
    } else return true;
  }

  boolean isNull(Supplier<String> msg) {
    if (!noException())
      return false;
    if (result.getValue() != null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " should have returned null but did not\n"+
         msg.get());
      return false;
    } else return true;
  }

  boolean fresh(Object obj) {
    return fresh(result.getValue(),obj);
  }

  boolean fresh(Object obj1, Object obj2) {
    if (obj1 != null && obj1 == obj2) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned an object\n  "+TestUtils.print(obj1)+
         "\nwhich is the same REFERENCE as an argument object; "+
         "a NEW object should have been returned\n");
      return false;
    } else return true;
  }

  boolean unchanged(Object obj1, Object obj2) {
    return report_unchanged(obj1.equals(obj2),obj1,obj2);
  }

  boolean report_unchanged(boolean result, Object obj1, Object obj2) {
    if (!result) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         "\nchanged a method parameter into\n  "+TestUtils.print(obj1)+
         "\nwhich used to be\n  "+TestUtils.print(obj2)+".\nIt should not have been changed.\n");
    }
    return result;
  }

  boolean unchanged_array(Object[] newer, Object[] original) {
      boolean ok_sofar = true;

      if (newer.length != original.length) {
          ok_sofar = false;
      }

      for (int i=0; i<newer.length && ok_sofar; i++) {
          if (newer[i] == null) ok_sofar = (original[i] == null);
          else ok_sofar = newer[i].equals(original[i]);
      }

      if (!ok_sofar) {
          TestUtils.printError
              (TestUtils.ExecutionTime.LAST,
               "the call to "+this+
               " has modified the input array "+TestUtils.printArray(original)+
               "; it has now the elements "+TestUtils.printArray(newer));
          return ok_sofar;
      }
      return ok_sofar;
  }

  boolean unchanged_array(int[] newer, int[] original) {
      boolean ok_sofar = true;

      if (newer.length != original.length) {
          ok_sofar = false;
      }

      for (int i=0; i<newer.length && ok_sofar; i++) {
          ok_sofar = newer[i] == original[i];
      }

      if (!ok_sofar) {
          TestUtils.printError
              (TestUtils.ExecutionTime.LAST,
               "the call to "+this+
               " has modified the input array "+TestUtils.printArray(original)+
               "; it has now the elements "+TestUtils.printArray(newer));
          return ok_sofar;
      }
      return ok_sofar;
  }

  boolean unchanged_array(char[] newer, char[] original) {
      boolean ok_sofar = true;

      if (newer.length != original.length) {
          ok_sofar = false;
      }

      for (int i=0; i<newer.length && ok_sofar; i++) {
          ok_sofar = newer[i] == original[i];
      }

      if (!ok_sofar) {
          TestUtils.printError
              (TestUtils.ExecutionTime.LAST,
               "the call to "+this+
               " has modified the input array "+TestUtils.printArray(original)+
               "; it has now the elements "+TestUtils.printArray(newer));
          return ok_sofar;
      }
      return ok_sofar;
  }

  boolean setsMatch(Object expected) {
    if (!noException())
      return false;

    if (!(expected instanceof Iterable<?>)) {
      TestData.message("Cannot iterate over expected value "+TestUtils.print(expected));
      throw new RuntimeException();
    }
    Iterable<?> ev = (Iterable<?>) expected;

    E value = result.getValue();
    if (!(value instanceof Iterable<?>)) {
      TestData.message("Cannot iterate over result value "+TestUtils.print(value));
      throw new RuntimeException();
    }
    Iterable<?> iv = (Iterable<?>) value;

    HashSet<Object> ts1 = new HashSet<Object>();
    HashSet<Object> ts2 = new HashSet<Object>();


    for (Object s1 : iv)
      ts1.add(s1);
    for (Object s2 : ev)
      ts2.add(s2);

    if (!ts1.equals(ts2)) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned a value\n"+TestUtils.print(value)+
         "\nwhich does not contain the same elements as the expected answer"+
         "\n"+expected);
      return false;
    }

    return true;
  }

  // For use in invariant checking code only -- does not report failure
  boolean silentCheckTrueResult() {
    if (result.isException()) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\n*** INTERNAL ERROR in tester: an invariant raised an exception\n");
      Throwable throwable = result.getException();
      TestUtils.printCallException(throwable);
      return false;
    }

    E value = result.getValue();

    if (value == null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\n*** INTERNAL ERROR in tester: an invariant returned a null object\n");
      return false;
    }

    return value.equals(true);
  }

  boolean equalsExpected(Object value, Object expected) {
    if (value == null) {
      if (expected != null) {
        TestUtils.printError
          (TestUtils.ExecutionTime.LAST,
           "\nthe call to "+this+" returned null, "+
           "but should have returned "+TestUtils.print(expected));
        return false;
      }
      else return true;
    }

    if (!equalsWithArrays(expected,value)) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+" returned\n  "+TestUtils.print(value)+
         "\n\nbut should have returned\n  "+TestUtils.print(expected));
      return false;
    } else return true;
  }

  boolean valuesMatch(Object expected) {
    if (result.isException()) {
      noException();
      return false;
    } else {
      E value = result.getValue();
      return equalsExpected(value, expected);
    }
  }

  private static boolean equalsWithArrays(Object expected, Object value) {
    if (expected == null) return value == null;
    if (value == null) return expected == null;
    if (expected.equals(value)) return true;
    if (expected instanceof Object[] && value instanceof Object[]) {
      Object[] obj_expected = (Object[]) expected;
      Object[] obj_value = (Object[]) value;
      return Arrays.deepEquals(obj_expected,obj_value);
    } else if (expected instanceof int[] && value instanceof int[]) {
      int[] obj_expected = (int[]) expected;
      int[] obj_value = (int[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof char[] && value instanceof char[]) {
      char[] obj_expected = (char[]) expected;
      char[] obj_value = (char[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof long[] && value instanceof long[]) {
      long[] obj_expected = (long[]) expected;
      long[] obj_value = (long[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof float[] && value instanceof float[]) {
      float[] obj_expected = (float[]) expected;
      float[] obj_value = (float[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof double[] && value instanceof double[]) {
      double[] obj_expected = (double[]) expected;
      double[] obj_value = (double[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof byte[] && value instanceof byte[]) {
      byte[] obj_expected = (byte[]) expected;
      byte[] obj_value = (byte[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof short[] && value instanceof short[]) {
      short[] obj_expected = (short[]) expected;
      short[] obj_value = (short[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof boolean[] && value instanceof boolean[]) {
      boolean[] obj_expected = (boolean[]) expected;
      boolean[] obj_value = (boolean[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else return false;
  }

  public boolean checkResult(F expected) {
    if (!hasCalled())
      throw new RuntimeException();

    return valuesMatch(expected);
  }
}

static class Constructor extends TestCall<Treap<Integer>,Void>
{
  String callString;
  
  public Constructor ()
  {
  }
  
  public String toString () 
  {
    if (callString == null)
    {
      StringBuilder output = new StringBuilder() ;
      output.append(new String("new Treap<Integer>")) ;
      output.append(new String("(")) ;
      output.append(new String(")")) ;
      callString = output.toString() ;
    }
    return callString ;
  }
  
  public Treap<Integer> call () 
  {
    return new Treap<Integer>() ;
  }
  
  public boolean checkResult (Void expected) 
  {
    if (!noException())
      return false ;
    return true ;
  }
  
}


static class Contains extends TestCall<Boolean,Object>
{
  Treap<Integer> x_1;
  Integer x_2;
  String callString;
  
  public Contains (Treap<Integer> x_1,Integer x_2)
  {
    this.x_1 = x_1 ;
    this.x_2 = x_2 ;
  }
  
  public String toString () 
  {
    if (callString == null)
    {
      StringBuilder output = new StringBuilder() ;
      output.append(TesterCode.printer(x_1)) ;
      output.append(new String(".contains")) ;
      output.append(new String("(")) ;
      output.append(TesterCode.printer(x_2)) ;
      output.append(new String(")")) ;
      callString = output.toString() ;
    }
    return callString ;
  }
  
  public Boolean call () 
  {
    return x_1.contains(x_2) ;
  }
  
  public boolean checkResult (Object expected) 
  {
    if (expected instanceof Throwable)
    {
      Throwable t = (Throwable) expected ;
      if (!throwsException(t.getClass().getCanonicalName()))
        return false ;
      return true ;
    }
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class Add extends TestCall<Boolean,Object>
{
  Treap<Integer> x_1;
  Integer x_2;
  String callString;
  
  public Add (Treap<Integer> x_1,Integer x_2)
  {
    this.x_1 = x_1 ;
    this.x_2 = x_2 ;
  }
  
  public String toString () 
  {
    if (callString == null)
    {
      StringBuilder output = new StringBuilder() ;
      output.append(TesterCode.printer(x_1)) ;
      output.append(new String(".add")) ;
      output.append(new String("(")) ;
      output.append(TesterCode.printer(x_2)) ;
      output.append(new String(")")) ;
      callString = output.toString() ;
    }
    return callString ;
  }
  
  public Boolean call () throws Exception
  {
    return x_1.add(x_2) ;
  }
  
  public boolean checkResult (Object expected) 
  {
    if (expected instanceof Throwable)
    {
      Throwable t = (Throwable) expected ;
      if (!throwsException(t.getClass().getCanonicalName()))
        return false ;
      return true ;
    }
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class Remove extends TestCall<Boolean,Object>
{
  Treap<Integer> x_1;
  Integer x_2;
  String callString;
  
  public Remove (Treap<Integer> x_1,Integer x_2)
  {
    this.x_1 = x_1 ;
    this.x_2 = x_2 ;
  }
  
  public String toString () 
  {
    if (callString == null)
    {
      StringBuilder output = new StringBuilder() ;
      output.append(TesterCode.printer(x_1)) ;
      output.append(new String(".remove")) ;
      output.append(new String("(")) ;
      output.append(TesterCode.printer(x_2)) ;
      output.append(new String(")")) ;
      callString = output.toString() ;
    }
    return callString ;
  }
  
  public Boolean call () throws Exception
  {
    return x_1.remove(x_2) ;
  }
  
  public boolean checkResult (Object expected) 
  {
    if (expected instanceof Throwable)
    {
      Throwable t = (Throwable) expected ;
      if (!throwsException(t.getClass().getCanonicalName()))
        return false ;
      return true ;
    }
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class Size extends TestCall<Integer,Integer>
{
  Treap<Integer> x_1;
  String callString;
  
  public Size (Treap<Integer> x_1)
  {
    this.x_1 = x_1 ;
  }
  
  public String toString () 
  {
    if (callString == null)
    {
      StringBuilder output = new StringBuilder() ;
      output.append(TesterCode.printer(x_1)) ;
      output.append(new String(".size")) ;
      output.append(new String("(")) ;
      output.append(new String(")")) ;
      callString = output.toString() ;
    }
    return callString ;
  }
  
  public Integer call () 
  {
    return x_1.size() ;
  }
  
  public boolean checkResult (Integer expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class ReturnIterable extends TestCall<Iterable<Integer>,Integer[]>
{
  Treap<Integer> x_1;
  String callString;
  
  public ReturnIterable (Treap<Integer> x_1)
  {
    this.x_1 = x_1 ;
  }
  
  public String toString () 
  {
    if (callString == null)
    {
      StringBuilder output = new StringBuilder() ;
      output.append(new String("TestUtils.returnIterable")) ;
      output.append(new String("(")) ;
      output.append(TesterCode.printer(x_1)) ;
      output.append(new String(")")) ;
      callString = output.toString() ;
    }
    return callString ;
  }
  
  public Iterable<Integer> call () 
  {
    return TestUtils.returnIterable(x_1) ;
  }
  
  public boolean checkResult (Integer[] expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!TestUtils.iterableCorrect(this,result,expected))
      return false ;
    return true ;
  }
  
}


static class IsEmpty extends TestCall<Boolean,Boolean>
{
  Treap<Integer> x_1;
  String callString;
  
  public IsEmpty (Treap<Integer> x_1)
  {
    this.x_1 = x_1 ;
  }
  
  public String toString () 
  {
    if (callString == null)
    {
      StringBuilder output = new StringBuilder() ;
      output.append(TesterCode.printer(x_1)) ;
      output.append(new String(".isEmpty")) ;
      output.append(new String("(")) ;
      output.append(new String(")")) ;
      callString = output.toString() ;
    }
    return callString ;
  }
  
  public Boolean call () 
  {
    return x_1.isEmpty() ;
  }
  
  public boolean checkResult (Boolean expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class TreapOk extends TestCall<Boolean,Boolean>
{
  Treap<Integer> x_1;
  Integer x_2;
  String callString;
  
  public TreapOk (Treap<Integer> x_1,Integer x_2)
  {
    this.x_1 = x_1 ;
    this.x_2 = x_2 ;
  }
  
  public String toString () 
  {
    if (callString == null)
      return new String("") ;
    return callString ;
  }
  
  public Boolean call () 
  {
    return TreapUtils.treapOk(x_1,x_2) ;
  }
  
  public boolean checkResult (Boolean expected) 
  {
    return silentCheckTrueResult() ;
  }
  
}







static class TestData {
  static String testName = "";
  static ArrayList<String> trace;
  static ArrayList<String> messages;
  static boolean isJunitTester;
  static int individualTimeout = 10;
  static int globalTimeout = 60;

  public static void initTrace() {
    trace = new ArrayList<String>();
    messages = new ArrayList<String>();
  }

  public static void setTesterType(boolean junitTesting) {
    isJunitTester = junitTesting;
  }

  public static boolean isJunitTester() {
    return isJunitTester;
  }

  public static int getIndividualTimeout() {
    return individualTimeout;
  }

  public static void setIndividualTimeout(int timeout) {
    individualTimeout = timeout;
  }

  public static int getGlobalTimeout() {
    return globalTimeout;
  }

  public static void setGlobalTimeout(int timeout) {
    globalTimeout = timeout;
  }

  public static void addCallToTrace(String callString) {
    if (!callString.equals(""))
      trace.add("  "+callString);
    else
      trace.add(callString);
  }

  public static void modifyLastCallInTrace(String callString) {
    if (trace.size() > 0) {
      trace.remove(trace.size()-1);
    if (!callString.equals(""))
      trace.add("  "+callString);
    else
      trace.add(callString);
    }
  }

  public static void message(String message) {
    messages.add(message);
  }

  public static int numCommands() {
    return trace.size();
  }

  private static String arrayToString(ArrayList<String> arr) {
    StringBuffer sb = new StringBuffer();

    for (int i=0; i<arr.size(); i++) {
      String item = arr.get(i);
      if (!item.equals("")) {
	sb.append(item+"\n");
      }
    }
    return sb.toString();
  }

  public static String getTrace() {
    return arrayToString(trace);
  }

  public static String getMessages() {
    return arrayToString(messages);
  }

  public static String getTestName() {
    return testName;
  }

  public static ArrayList<String> getRawTrace() {
    return trace;
  }

  public static void setTrace(ArrayList<String> setTrace) {
    trace = setTrace;
  }

  public static void setTestName(String setTestName) {
    testName = setTestName;
  }

  public static void setContext(String setTestName, ArrayList<String> setTrace) {
    setTestName(setTestName);
    setTrace(setTrace);
  }
}










static class ResultsHandler {
  public static volatile CountDownLatch waitForThreads = null;
  static LinkedHashMap<String,Boolean> results_sofar;
  static HashSet<String> runningTests;
  static int numTestsRemaining = 1000;
  static long endTime = 0;

  static void init() {
    if (results_sofar == null)
      results_sofar = new LinkedHashMap<String,Boolean>();
    if (runningTests == null)
      runningTests = new HashSet<String>();
  }

  static void setNumTestsRemaining(int numTestsToRun, int GlobalTimeoutInSeconds) {
    numTestsRemaining = numTestsToRun;
    endTime = System.currentTimeMillis() + GlobalTimeoutInSeconds*1000;
  }

  static boolean isTimedout() {
    return System.currentTimeMillis() > endTime;
  }

  static void startTest(String testName) {
    runningTests.add(testName);
  }

  static void stopTest(String testName) {
    runningTests.remove(testName);
    --numTestsRemaining;
  }

  static boolean results_ok_sofar() {
    for (String key : results_sofar.keySet())
      if (!results_sofar.get(key))
        return false;
    return true;
  }

  static boolean local_results_ok_sofar(String test_type) {
    Boolean result = results_sofar.get(test_type);
    return (result==null) || result;
  }

  static void add_result(String test_type, boolean result) {
    Boolean old_result = results_sofar.get(test_type);
    if ((old_result == null) || old_result)
      results_sofar.put(test_type,result);
  }

  static boolean results_ok() {
    if (results_sofar.size() == 0) {
      System.out.println("\n*** Error: no tests were run");
      return false;
    }

    if (runningTests.size() > 0) {
      System.out.println("\n*** Error: some tests "+runningTests+" are still running\n");
      return false;
    }

    for (String key : results_sofar.keySet())
      if (!results_sofar.get(key))
        return false;

    if (numTestsRemaining > 0) {
      System.out.println("\n*** Error: some tests ("+numTestsRemaining+") did not run\n");
      return false;
    }

    return true;
  }

  static int get_nota() {
    if (results_ok()) return 10;
    else return 0;
  }

  static void report_results() {
    System.out.println("\n\n++++++++++++++++++++++++++++++++++++++++++\n");

    for (String testName : results_sofar.keySet()) {
      System.out.print("Testing results for "+testName+": ");
      if (results_sofar.get(testName)) {
        System.out.println("succeeded");
      } else {
        System.out.println("failed");
      }
    }

    System.out.println("\n------------------------------------------");
    if (results_ok()) {
      System.out.println("\n"+Tests.tester+": Test finalizado correctamente.\n");
      System.out.println(readFile("aed_success_message.txt"));
    } else {
      System.out.println("\n"+Tests.tester+": errores detectados.\n\n");
    }
  }

  private static String readFile(String filePath)
  {
    StringBuilder sb = new StringBuilder();
    Path path = Paths.get(filePath);

    if (Files.isReadable(path)) {
      try (Stream<String> stream = Files.lines(path, StandardCharsets.UTF_8))
        {
          stream.forEach(s -> sb.append(s).append("\n"));
        }
      catch (IOException e) {};
    }

    return sb.toString();
  }

}

static class TesterCode
{
  
  public static void resetPrinter () 
  {
    TreapUtils.resetPrinter() ;
  }
  
  public static String printer (Object obj) 
  {
    return TreapUtils.printer(obj) ;
  }
  
}


}
