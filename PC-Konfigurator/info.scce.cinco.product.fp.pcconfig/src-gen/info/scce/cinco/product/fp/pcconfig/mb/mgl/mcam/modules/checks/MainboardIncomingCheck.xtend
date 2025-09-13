package info.scce.cinco.product.fp.pcconfig.mb.mgl.mcam.modules.checks;


import de.jabc.cinco.meta.core.mgl.model.constraints.ConnectionConstraint
import graphmodel.Node
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard

class MainboardIncomingCheck extends MainboardCheck {

	override getName() { "IncomingCheck" }
	
	override check(Mainboard model) {
		adapter.entityIds.map[element].filter(Node).forEach[check]
	}

	def void check(Node node) {
		for (it : node.incomingConstraints) {
			if (!checkLowerBound(node))
				node.addError("at least " + lowerBound + " of INCOMING [" + edgeTypes.map[simpleName].join(', ') + "] required")
			if (!checkUpperBound(node))
				node.addError("maximum of " + upperBound + " [" + edgeTypes.map[simpleName].join(', ') + "] allowed")
		}
	}

	def void print(ConnectionConstraint it) {
		println("(" + edgeTypes + " [" + lowerBound + "," + upperBound + "]" + ")");
	}

}
