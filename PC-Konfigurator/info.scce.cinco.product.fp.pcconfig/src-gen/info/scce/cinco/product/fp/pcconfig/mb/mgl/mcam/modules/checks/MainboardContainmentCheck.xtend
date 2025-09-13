package info.scce.cinco.product.fp.pcconfig.mb.mgl.mcam.modules.checks;


import de.jabc.cinco.meta.core.mgl.model.constraints.ContainmentConstraint
import graphmodel.Container
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard
import graphmodel.GraphModel


class MainboardContainmentCheck extends MainboardCheck {

	override getName() { "ContainmentCheck" }
	
	override check(Mainboard model) {
		adapter.entityIds.map[element].filter(Container).forEach[check]
		adapter.entityIds.map[element].filter(GraphModel).forEach[checkModel]
	}
	
	def checkModel(GraphModel model) {
		for (it : model.internalContainerElement.containmentConstraints) {
			if (!checkLowerBound(model))
				model.addError("at least " + lowerBound + " of [" + types.map[simpleName].join(', ') + "] required")
			if (!checkUpperBound(model))
				model.addError("maximum of " + upperBound + " [" + types.map[simpleName].join(', ') + "] allowed")	
		}
	}

	def check(Container container) {
		for (it : container.internalContainerElement.containmentConstraints) {
			if (!checkLowerBound(container))
				container.addError("at least " + lowerBound + " of [" + types.map[simpleName].join(', ') + "] required")
			if (!checkUpperBound(container))
				container.addError("maximum of " + upperBound + " [" + types.map[simpleName].join(', ') + "] allowed")
		}
	}

	def print(ContainmentConstraint it) {
		println("(" + types + " [" + lowerBound + "," + upperBound + "]" + ")");
	}

}
