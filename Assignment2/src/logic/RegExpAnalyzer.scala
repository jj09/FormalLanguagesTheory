package logic

import parser._

class RegExpAnalyzer {
  
  def check(regEx1: String, regEx2: String): String = {
    if(regEx1.isEmpty()) {
      throw new IllegalArgumentException("RegEx 1 cannot be empty!");
    }
    if(regEx2.isEmpty()) {
      throw new IllegalArgumentException("RegEx 2 cannot be empty!");
    }
    var dfa1 = getDfa(regEx1)
    var dfa2 = getDfa(regEx2)
    return RegExCompiler.getUnion(dfa1, dfa2)
  }
  
  def getDfa(regEx: String): Dfa = {
    return RegExCompiler.getDfa(regEx)    
  }

}