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
  
  @Test def e1NotContainedInE2WithResultCheck {
    val rea = new RegExpAnalyzer
    assertEquals("00110", rea.check("(0(0+2)*+1)*+2", "(01+12+0+2)*(1)*"))
  }
  
  @Test def complicatedExpContainedInStringsExp {
    val rea = new RegExpAnalyzer
    assertEquals("true", rea.check("(0(0+2)*+1)*+2+12+(00+21)*+0000110102", "(0+1+2)*"))
  }
  
  @Test  def emptyExp {
    val rea = new RegExpAnalyzer
    try {
      rea.check("", "")   
      fail()
    } catch {
      case e: IllegalArgumentException => //Expected
    }
  }

}