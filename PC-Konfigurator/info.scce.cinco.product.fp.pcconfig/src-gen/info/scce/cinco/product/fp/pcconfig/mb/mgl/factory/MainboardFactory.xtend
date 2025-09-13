package info.scce.cinco.product.fp.pcconfig.mb.mgl.factory

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardPackage
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.impl.MainboardFactoryImpl
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalFactory
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalPackage

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.adapter.*

import graphmodel.internal.InternalModelElement
import graphmodel.internal.InternalModelElementContainer
import graphmodel.internal.InternalGraphModel
import graphmodel.internal.InternalContainer
import graphmodel.internal.InternalNode
import graphmodel.internal.InternalEdge
import graphmodel.internal.InternalType
import graphmodel.internal.InternalIdentifiableElement
import graphmodel.ModelElement
import graphmodel.IdentifiableElement
import graphmodel.GraphModel
import graphmodel.Type

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.plugin.EcorePlugin

class MainboardFactory extends MainboardFactoryImpl {
	
	final extension InternalFactory = InternalFactory.eINSTANCE
	public static MainboardFactory eINSTANCE = MainboardFactory.init
	
	extension de.jabc.cinco.meta.runtime.xapi.WorkbenchExtension = new de.jabc.cinco.meta.runtime.xapi.WorkbenchExtension
	
	static def MainboardFactory init() {
		try {
			val fct = EPackage::Registry.INSTANCE.getEFactory(MainboardPackage.eNS_URI) as MainboardFactory
			if (fct != null)
				return fct as MainboardFactory
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		new MainboardFactory
	}
	
	/**
	 * This method creates an Mainboard with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createMainboard(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createMainboard => [ 
			setID(ID)
			internal = ime ?: createInternalMainboard => [
				setID(ID + "_INTERNAL")
				eAdapters.add(new info.scce.cinco.product.fp.pcconfig.mb.mgl.adapter.MainboardEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an Mainboard with the given id. Post create hook won't be triggered.
	 */
	def createMainboard(String ID){
		createMainboard(ID,null,null,false)
	}
	
	/**
	 * This method creates an Mainboard with the given id. Post create hook will be triggered.
	 */
	def createMainboard(InternalModelElementContainer parent){
		createMainboard(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an Mainboard with the given id. Post create hook will be triggered.
	 */
	def createMainboard(String ID, InternalModelElementContainer parent){
		createMainboard(ID,null,parent,true)
	}
	
	def createMainboard(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createMainboard(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an Mainboard with the given id. Post create hook won't be triggered.
	 */
	def createMainboard(InternalModelElement ime) {
		createMainboard(generateUUID,ime,null,false)
	}
	
	override createMainboard() {
		createMainboard(generateUUID)
	}
	/**
	 * This method creates an CPUNode with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createCPUNode(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createCPUNode => [
			setID(ID)
			internal = ime ?: createInternalCPUNode => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.fp.pcconfig.mb.mgl.adapter.CPUNodeEContentAdapter)
			]
			if (hook) postCreates
		]
		
	}
	
	/**
	 * This method creates an CPUNode with the given id. Post create hook won't be triggered.
	 */
	def createCPUNode(String ID){
		createCPUNode(ID,null,null,false)
	}
	
	/**
	 * This method creates an CPUNode with the given id. Post create hook will be triggered.
	 */
	def createCPUNode(InternalModelElementContainer parent){
		createCPUNode(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an CPUNode with the given id. Post create hook will be triggered.
	 */
	def createCPUNode(String ID, InternalModelElementContainer parent){
		createCPUNode(ID,null,parent,true)
	}
	
	def createCPUNode(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createCPUNode(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an CPUNode with the given id. Post create hook won't be triggered.
	 */
	def createCPUNode(InternalModelElement ime) {
		createCPUNode(generateUUID,ime,null,false)
	}
	
	override createCPUNode() {
		createCPUNode(generateUUID)
	}
	/**
	 * This method creates an GPUNode with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createGPUNode(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createGPUNode => [
			setID(ID)
			internal = ime ?: createInternalGPUNode => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.fp.pcconfig.mb.mgl.adapter.GPUNodeEContentAdapter)
			]
			if (hook) postCreates
		]
		
	}
	
	/**
	 * This method creates an GPUNode with the given id. Post create hook won't be triggered.
	 */
	def createGPUNode(String ID){
		createGPUNode(ID,null,null,false)
	}
	
	/**
	 * This method creates an GPUNode with the given id. Post create hook will be triggered.
	 */
	def createGPUNode(InternalModelElementContainer parent){
		createGPUNode(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an GPUNode with the given id. Post create hook will be triggered.
	 */
	def createGPUNode(String ID, InternalModelElementContainer parent){
		createGPUNode(ID,null,parent,true)
	}
	
	def createGPUNode(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createGPUNode(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an GPUNode with the given id. Post create hook won't be triggered.
	 */
	def createGPUNode(InternalModelElement ime) {
		createGPUNode(generateUUID,ime,null,false)
	}
	
	override createGPUNode() {
		createGPUNode(generateUUID)
	}
	/**
	 * This method creates an MainboardContainer with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createMainboardContainer(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createMainboardContainer => [
			setID(ID)
			internal = ime ?: createInternalMainboardContainer => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.fp.pcconfig.mb.mgl.adapter.MainboardContainerEContentAdapter)
			]
			if (hook) postCreates
		]
		
	}
	
	/**
	 * This method creates an MainboardContainer with the given id. Post create hook won't be triggered.
	 */
	def createMainboardContainer(String ID){
		createMainboardContainer(ID,null,null,false)
	}
	
	/**
	 * This method creates an MainboardContainer with the given id. Post create hook will be triggered.
	 */
	def createMainboardContainer(InternalModelElementContainer parent){
		createMainboardContainer(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an MainboardContainer with the given id. Post create hook will be triggered.
	 */
	def createMainboardContainer(String ID, InternalModelElementContainer parent){
		createMainboardContainer(ID,null,parent,true)
	}
	
	def createMainboardContainer(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createMainboardContainer(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an MainboardContainer with the given id. Post create hook won't be triggered.
	 */
	def createMainboardContainer(InternalModelElement ime) {
		createMainboardContainer(generateUUID,ime,null,false)
	}
	
	override createMainboardContainer() {
		createMainboardContainer(generateUUID)
	}
	/**
	 * This method creates an CPUSlot with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createCPUSlot(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createCPUSlot => [
			setID(ID)
			internal = ime ?: createInternalCPUSlot => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.fp.pcconfig.mb.mgl.adapter.CPUSlotEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an CPUSlot with the given id. Post create hook won't be triggered.
	 */
	def createCPUSlot(String ID){
		createCPUSlot(ID,null,null,false)
	}
	
	/**
	 * This method creates an CPUSlot with the given id. Post create hook will be triggered.
	 */
	def createCPUSlot(InternalModelElementContainer parent){
		createCPUSlot(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an CPUSlot with the given id. Post create hook will be triggered.
	 */
	def createCPUSlot(String ID, InternalModelElementContainer parent){
		createCPUSlot(ID,null,parent,true)
	}
	
	def createCPUSlot(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createCPUSlot(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an CPUSlot with the given id. Post create hook won't be triggered.
	 */
	def createCPUSlot(InternalModelElement ime) {
		createCPUSlot(generateUUID,ime,null,false)
	}
	
	override createCPUSlot() {
		createCPUSlot(generateUUID)
	}
	/**
	 * This method creates an GPUSlot with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createGPUSlot(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createGPUSlot => [
			setID(ID)
			internal = ime ?: createInternalGPUSlot => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.fp.pcconfig.mb.mgl.adapter.GPUSlotEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an GPUSlot with the given id. Post create hook won't be triggered.
	 */
	def createGPUSlot(String ID){
		createGPUSlot(ID,null,null,false)
	}
	
	/**
	 * This method creates an GPUSlot with the given id. Post create hook will be triggered.
	 */
	def createGPUSlot(InternalModelElementContainer parent){
		createGPUSlot(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an GPUSlot with the given id. Post create hook will be triggered.
	 */
	def createGPUSlot(String ID, InternalModelElementContainer parent){
		createGPUSlot(ID,null,parent,true)
	}
	
	def createGPUSlot(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createGPUSlot(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an GPUSlot with the given id. Post create hook won't be triggered.
	 */
	def createGPUSlot(InternalModelElement ime) {
		createGPUSlot(generateUUID,ime,null,false)
	}
	
	override createGPUSlot() {
		createGPUSlot(generateUUID)
	}
	/**
	 * This method creates an RAMSlot with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createRAMSlot(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createRAMSlot => [
			setID(ID)
			internal = ime ?: createInternalRAMSlot => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.fp.pcconfig.mb.mgl.adapter.RAMSlotEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an RAMSlot with the given id. Post create hook won't be triggered.
	 */
	def createRAMSlot(String ID){
		createRAMSlot(ID,null,null,false)
	}
	
	/**
	 * This method creates an RAMSlot with the given id. Post create hook will be triggered.
	 */
	def createRAMSlot(InternalModelElementContainer parent){
		createRAMSlot(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an RAMSlot with the given id. Post create hook will be triggered.
	 */
	def createRAMSlot(String ID, InternalModelElementContainer parent){
		createRAMSlot(ID,null,parent,true)
	}
	
	def createRAMSlot(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createRAMSlot(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an RAMSlot with the given id. Post create hook won't be triggered.
	 */
	def createRAMSlot(InternalModelElement ime) {
		createRAMSlot(generateUUID,ime,null,false)
	}
	
	override createRAMSlot() {
		createRAMSlot(generateUUID)
	}
	/**
	 * This method creates an RAMNode with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createRAMNode(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createRAMNode => [
			setID(ID)
			internal = ime ?: createInternalRAMNode => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.fp.pcconfig.mb.mgl.adapter.RAMNodeEContentAdapter)
			]
			if (hook) postCreates
		]
		
	}
	
	/**
	 * This method creates an RAMNode with the given id. Post create hook won't be triggered.
	 */
	def createRAMNode(String ID){
		createRAMNode(ID,null,null,false)
	}
	
	/**
	 * This method creates an RAMNode with the given id. Post create hook will be triggered.
	 */
	def createRAMNode(InternalModelElementContainer parent){
		createRAMNode(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an RAMNode with the given id. Post create hook will be triggered.
	 */
	def createRAMNode(String ID, InternalModelElementContainer parent){
		createRAMNode(ID,null,parent,true)
	}
	
	def createRAMNode(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createRAMNode(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an RAMNode with the given id. Post create hook won't be triggered.
	 */
	def createRAMNode(InternalModelElement ime) {
		createRAMNode(generateUUID,ime,null,false)
	}
	
	override createRAMNode() {
		createRAMNode(generateUUID)
	}
	
	private def <T extends IdentifiableElement> setInternal(T elm, InternalIdentifiableElement internal) {
		elm => [
			if (id.isNullOrEmpty)
				ID = generateUUID
			switch elm {
				GraphModel: elm.internalElement = internal as InternalGraphModel
				ModelElement: elm.internalElement = internal as InternalModelElement
				Type: elm.internalElement = internal as InternalType
			}
		]
	}
	
	/**
	* This method creates a new Mainboard object with an underlying org.eclipse.emf.ecore.resource.Resource. Thus you can 
	* simply call the Mainboard's save method to save your changes.
	*/
	def info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard createMainboard(java.lang.String path, java.lang.String fileName) {
		var filePath = new org.eclipse.core.runtime.Path(path).append(fileName).addFileExtension("mainboard");
		var uri = org.eclipse.emf.common.util.URI.createPlatformResourceURI(filePath.toOSString(), true);
		var res = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl().createResource(uri);
		var graph = info.scce.cinco.product.fp.pcconfig.mb.mgl.factory.MainboardFactory.eINSTANCE.createMainboard();
		
		org.eclipse.emf.ecore.util.EcoreUtil.setID(graph, org.eclipse.emf.ecore.util.EcoreUtil.generateUUID());

		res.getContents().add(graph.internalElement);
		
		try {
			res.save(null);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}

		return graph;
	}
	
	
	def postCreates(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer me) {
		me.transact [
			new info.scce.cinco.product.fp.pcconfig.mb.hook.MainboardContainerPostCreate().postCreate(me)
		]
	}
	
	def postCreates(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode me) {
		me.transact [
			new info.scce.cinco.product.fp.pcconfig.mb.hook.CPUNodePostCreate().postCreate(me)
		]
	}
	
	def postCreates(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode me) {
		me.transact [
			new info.scce.cinco.product.fp.pcconfig.mb.hook.RAMNodePostCreate().postCreate(me)
		]
	}
	
	def postCreates(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode me) {
		me.transact [
			new info.scce.cinco.product.fp.pcconfig.mb.hook.GPUNodePostCreate().postCreate(me)
		]
	}
	
}
