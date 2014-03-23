package logic
import scala.collection.mutable.ArrayBuffer

class DfaUnion {
  var start: DfaUnionNode = null
  var end: DfaUnionNode = null

  var nodes = new ArrayBuffer[DfaUnionNode]

  def getNode(node1: DfaNode, node2: DfaNode): DfaUnionNode = {
    for (node <- nodes) {
      if (node.node1 == node1 && node.node2 == node2) {
        return node;
      }
    }
    return null;
  }

}