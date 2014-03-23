package logic

class DfaUnionNode {
  var node1: DfaNode = null
  var node2: DfaNode = null

  var On0: DfaUnionNode = null
  var On1: DfaUnionNode = null
  var On2: DfaUnionNode = null

  def IsStart(): Boolean = {
    return node1.IsStart && node2.IsStart;
  }

  def IsFinal(): Boolean = {
    return node1.IsFinal && node2.IsFinal;
  }

  var inspected = false;
}