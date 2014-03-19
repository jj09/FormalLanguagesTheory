package test.logic

import logic.RegExpAnalyzer
import org.junit.Assert._
import org.junit.Test

class TestRegExpAnalyzer {
  
  @Test def equalExp {
    val rea = new RegExpAnalyzer
    assertTrue(rea.compare("(0+1)*", "(0+1)*"))
  }
  
  @Test def notEqualExp {
    val rea = new RegExpAnalyzer
    assertFalse(rea.compare("(0+1)*", "(0+1+2)*"))
  }
  
  @Test def emptyExp {
    val rea = new RegExpAnalyzer
    assertTrue(rea.compare("", ""))
  }

}