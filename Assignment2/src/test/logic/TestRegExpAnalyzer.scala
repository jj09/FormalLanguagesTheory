package test.logic

import logic.RegExpAnalyzer
import org.junit.Assert._
import org.junit.Test
import org.junit._

class TestRegExpAnalyzer {
  
  @Test def e1ContainedInE2 {
    val rea = new RegExpAnalyzer
    assertEquals("true", rea.check("(0+1)*", "(0+1)*"))
  }
  
  @Test def e1NotContainedInE2 {
    val rea = new RegExpAnalyzer
    assertNotEquals("true", rea.check("(0+1+2)*", "(0+1)*"))
  }
  
  @Test  def emptyExp {
    val rea = new RegExpAnalyzer
    try {
      rea.check("", "")   
      fail()
    } catch {
      case e: IllegalArgumentException => //Ecpected
    }
  }

}