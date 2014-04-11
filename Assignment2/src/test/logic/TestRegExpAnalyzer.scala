package test.logic

import logic.RegExpAnalyzer
import org.junit.Assert._
import org.junit.Test
import org.junit._

class TestRegExpAnalyzer {
  
  @Test def e1ContainedInE2 {
    // Arrange
    val rea = new RegExpAnalyzer
    val regEx1 = "(0+1)*"
    val regEx2 = "(0+1)*"
    
    // Act
    val result = rea.check(regEx1, regEx2)
    
    // Assert
    assertEquals("true", result)
  }
  
  @Test def e1NotContainedInE2 {
    // Arrange
    val rea = new RegExpAnalyzer
    val regEx1 = "(0+1+2)*"
    val regEx2 = "(0+1)*"
      
    // Act
    val result = rea.check(regEx1, regEx2)
    
    // Assert
    assertNotEquals("true", result)
  }
  
  @Test def e1NotContainedInE2WithResultCheck {
    // Arrange
    val rea = new RegExpAnalyzer
    val regEx1 = "(0(0+2)*+1)*+2"
    val regEx2 = "(01+12+0+2)*(1)*"
      
    // Act
    val result = rea.check(regEx1, regEx2)
    
    // Assert
    assertEquals("00110", result)
  }
  
  @Test def complicatedExpContainedInStringsExp {
    // Arrange
    val rea = new RegExpAnalyzer
    val regEx1 = "(0(0+2)*+1)*+2+12+(00+21)*+0000110102"
    val regEx2 = "(0+1+2)*"
      
    // Act
    val result = rea.check(regEx1, regEx2)
    
    // Assert
    assertEquals("true", result)
  }
  
  @Test  def emptyExp {
    // Arrange
    val rea = new RegExpAnalyzer
    val regEx1 = ""
    val regEx2 = ""
    
    // Act
    try {
      rea.check(regEx1, regEx2)   
      fail()
    } catch {
      case e: IllegalArgumentException => //Expected
    }
    
    // Assert
  }

}