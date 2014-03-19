import logic.RegExpAnalyzer

object Assignment2 {

  def main(args: Array[String]): Unit = {
    print("Enter E1: ")
    val e1 = readLine()
    
    print("Enter E2: ")
    val e2 = readLine()
    
    val rea = new RegExpAnalyzer
    
    if (rea.compare(e1,e2)) {
      println("yes")
    } else {
      println("no")
    }
  }

}