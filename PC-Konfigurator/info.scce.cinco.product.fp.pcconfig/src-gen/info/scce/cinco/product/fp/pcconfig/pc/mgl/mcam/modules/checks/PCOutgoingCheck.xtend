package info.scce.cinco.product.fp.pcconfig.pc.mgl.mcam.modules.checks;


import de.jabc.cinco.meta.core.mgl.model.constraints.ConnectionConstraint
import graphmodel.Node
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC

class PCOutgoingCheck extends PCCheck {

	override getName() { "OutgoingCheck" }
	
	override check(PC model) {
		adapter.entityIds.map[element].filter(Node).forEach[check]
	}

	def check(Node node) {
		for (it : node.outgoingConstraints) {
			if (!checkLowerBound(node))
				node.addError("at least " + lowerBound + " of OUTGOING [" + edgeTypes.map[simpleName].join(', ') + "] required")
			if (!checkUpperBound(node))
				node.addError("maximum of " + upperBound + " [" + edgeTypes.map[simpleName].join(', ') + "] allowed")
		}
	}

	def print(ConnectionConstraint it) {
		println("(" + edgeTypes + " [" + lowerBound + "," + upperBound + "]" + ")");
	}

}
