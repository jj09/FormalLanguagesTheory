package logic

import scala.collection.mutable._

class Node {
  var on0 = new ListBuffer[Node]
  var on1 = new ListBuffer[Node]
  var on2 = new ListBuffer[Node]
  var onE = new ListBuffer[Node]
}