package info.scce.cinco.product.fp.pcconfig.pc.mgl.factory

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PcPackage
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.impl.PcFactoryImpl
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalFactory
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPackage

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.adapter.*

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

class PCFactory extends PcFactoryImpl {
	
	final extension InternalFactory = InternalFactory.eINSTANCE
	public static PCFactory eINSTANCE = PCFactory.init
	
	extension de.jabc.cinco.meta.runtime.xapi.WorkbenchExtension = new de.jabc.cinco.meta.runtime.xapi.WorkbenchExtension
	
	static def PCFactory init() {
		try {
			val fct = EPackage::Registry.INSTANCE.getEFactory(PcPackage.eNS_URI) as PCFactory
			if (fct != null)
				return fct as PCFactory
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		new PCFactory
	}
	
	/**
	 * This method creates an PC with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createPC(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createPC => [ 
			setID(ID)
			internal = ime ?: createInternalPC => [
				setID(ID + "_INTERNAL")
				eAdapters.add(new info.scce.cinco.product.fp.pcconfig.pc.mgl.adapter.PCEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an PC with the given id. Post create hook won't be triggered.
	 */
	def createPC(String ID){
		createPC(ID,null,null,false)
	}
	
	/**
	 * This method creates an PC with the given id. Post create hook will be triggered.
	 */
	def createPC(InternalModelElementContainer parent){
		createPC(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an PC with the given id. Post create hook will be triggered.
	 */
	def createPC(String ID, InternalModelElementContainer parent){
		createPC(ID,null,parent,true)
	}
	
	def createPC(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createPC(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an PC with the given id. Post create hook won't be triggered.
	 */
	def createPC(InternalModelElement ime) {
		createPC(generateUUID,ime,null,false)
	}
	
	override createPC() {
		createPC(generateUUID)
	}
	/**
	 * This method creates an PSUNode with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createPSUNode(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createPSUNode => [
			setID(ID)
			internal = ime ?: createInternalPSUNode => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.fp.pcconfig.pc.mgl.adapter.PSUNodeEContentAdapter)
			]
			if (hook) postCreates
		]
		
	}
	
	/**
	 * This method creates an PSUNode with the given id. Post create hook won't be triggered.
	 */
	def createPSUNode(String ID){
		createPSUNode(ID,null,null,false)
	}
	
	/**
	 * This method creates an PSUNode with the given id. Post create hook will be triggered.
	 */
	def createPSUNode(InternalModelElementContainer parent){
		createPSUNode(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an PSUNode with the given id. Post create hook will be triggered.
	 */
	def createPSUNode(String ID, InternalModelElementContainer parent){
		createPSUNode(ID,null,parent,true)
	}
	
	def createPSUNode(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createPSUNode(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an PSUNode with the given id. Post create hook won't be triggered.
	 */
	def createPSUNode(InternalModelElement ime) {
		createPSUNode(generateUUID,ime,null,false)
	}
	
	override createPSUNode() {
		createPSUNode(generateUUID)
	}
	/**
	 * This method creates an PCCPUNode with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createPCCPUNode(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createPCCPUNode => [
			setID(ID)
			internal = ime ?: createInternalPCCPUNode => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.fp.pcconfig.pc.mgl.adapter.PCCPUNodeEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an PCCPUNode with the given id. Post create hook won't be triggered.
	 */
	def createPCCPUNode(String ID){
		createPCCPUNode(ID,null,null,false)
	}
	
	/**
	 * This method creates an PCCPUNode with the given id. Post create hook will be triggered.
	 */
	def createPCCPUNode(InternalModelElementContainer parent){
		createPCCPUNode(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an PCCPUNode with the given id. Post create hook will be triggered.
	 */
	def createPCCPUNode(String ID, InternalModelElementContainer parent){
		createPCCPUNode(ID,null,parent,true)
	}
	
	def createPCCPUNode(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createPCCPUNode(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an PCCPUNode with the given id. Post create hook won't be triggered.
	 */
	def createPCCPUNode(InternalModelElement ime) {
		createPCCPUNode(generateUUID,ime,null,false)
	}
	
	override createPCCPUNode() {
		createPCCPUNode(generateUUID)
	}
	/**
	 * This method creates an PSUContainer with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createPSUContainer(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createPSUContainer => [
			setID(ID)
			internal = ime ?: createInternalPSUContainer => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.fp.pcconfig.pc.mgl.adapter.PSUContainerEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an PSUContainer with the given id. Post create hook won't be triggered.
	 */
	def createPSUContainer(String ID){
		createPSUContainer(ID,null,null,false)
	}
	
	/**
	 * This method creates an PSUContainer with the given id. Post create hook will be triggered.
	 */
	def createPSUContainer(InternalModelElementContainer parent){
		createPSUContainer(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an PSUContainer with the given id. Post create hook will be triggered.
	 */
	def createPSUContainer(String ID, InternalModelElementContainer parent){
		createPSUContainer(ID,null,parent,true)
	}
	
	def createPSUContainer(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createPSUContainer(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an PSUContainer with the given id. Post create hook won't be triggered.
	 */
	def createPSUContainer(InternalModelElement ime) {
		createPSUContainer(generateUUID,ime,null,false)
	}
	
	override createPSUContainer() {
		createPSUContainer(generateUUID)
	}
	/**
	 * This method creates an DriveNode with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createDriveNode(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createDriveNode => [
			setID(ID)
			internal = ime ?: createInternalDriveNode => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.fp.pcconfig.pc.mgl.adapter.DriveNodeEContentAdapter)
			]
			if (hook) postCreates
		]
		
	}
	
	/**
	 * This method creates an DriveNode with the given id. Post create hook won't be triggered.
	 */
	def createDriveNode(String ID){
		createDriveNode(ID,null,null,false)
	}
	
	/**
	 * This method creates an DriveNode with the given id. Post create hook will be triggered.
	 */
	def createDriveNode(InternalModelElementContainer parent){
		createDriveNode(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an DriveNode with the given id. Post create hook will be triggered.
	 */
	def createDriveNode(String ID, InternalModelElementContainer parent){
		createDriveNode(ID,null,parent,true)
	}
	
	def createDriveNode(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createDriveNode(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an DriveNode with the given id. Post create hook won't be triggered.
	 */
	def createDriveNode(InternalModelElement ime) {
		createDriveNode(generateUUID,ime,null,false)
	}
	
	override createDriveNode() {
		createDriveNode(generateUUID)
	}
	/**
	 * This method creates an PCGPUNode with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createPCGPUNode(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createPCGPUNode => [
			setID(ID)
			internal = ime ?: createInternalPCGPUNode => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.fp.pcconfig.pc.mgl.adapter.PCGPUNodeEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an PCGPUNode with the given id. Post create hook won't be triggered.
	 */
	def createPCGPUNode(String ID){
		createPCGPUNode(ID,null,null,false)
	}
	
	/**
	 * This method creates an PCGPUNode with the given id. Post create hook will be triggered.
	 */
	def createPCGPUNode(InternalModelElementContainer parent){
		createPCGPUNode(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an PCGPUNode with the given id. Post create hook will be triggered.
	 */
	def createPCGPUNode(String ID, InternalModelElementContainer parent){
		createPCGPUNode(ID,null,parent,true)
	}
	
	def createPCGPUNode(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createPCGPUNode(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an PCGPUNode with the given id. Post create hook won't be triggered.
	 */
	def createPCGPUNode(InternalModelElement ime) {
		createPCGPUNode(generateUUID,ime,null,false)
	}
	
	override createPCGPUNode() {
		createPCGPUNode(generateUUID)
	}
	/**
	 * This method creates an DriveContainer with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createDriveContainer(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createDriveContainer => [
			setID(ID)
			internal = ime ?: createInternalDriveContainer => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.fp.pcconfig.pc.mgl.adapter.DriveContainerEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an DriveContainer with the given id. Post create hook won't be triggered.
	 */
	def createDriveContainer(String ID){
		createDriveContainer(ID,null,null,false)
	}
	
	/**
	 * This method creates an DriveContainer with the given id. Post create hook will be triggered.
	 */
	def createDriveContainer(InternalModelElementContainer parent){
		createDriveContainer(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an DriveContainer with the given id. Post create hook will be triggered.
	 */
	def createDriveContainer(String ID, InternalModelElementContainer parent){
		createDriveContainer(ID,null,parent,true)
	}
	
	def createDriveContainer(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createDriveContainer(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an DriveContainer with the given id. Post create hook won't be triggered.
	 */
	def createDriveContainer(InternalModelElement ime) {
		createDriveContainer(generateUUID,ime,null,false)
	}
	
	override createDriveContainer() {
		createDriveContainer(generateUUID)
	}
	/**
	 * This method creates an PCRAMSlot with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createPCRAMSlot(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createPCRAMSlot => [
			setID(ID)
			internal = ime ?: createInternalPCRAMSlot => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.fp.pcconfig.pc.mgl.adapter.PCRAMSlotEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an PCRAMSlot with the given id. Post create hook won't be triggered.
	 */
	def createPCRAMSlot(String ID){
		createPCRAMSlot(ID,null,null,false)
	}
	
	/**
	 * This method creates an PCRAMSlot with the given id. Post create hook will be triggered.
	 */
	def createPCRAMSlot(InternalModelElementContainer parent){
		createPCRAMSlot(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an PCRAMSlot with the given id. Post create hook will be triggered.
	 */
	def createPCRAMSlot(String ID, InternalModelElementContainer parent){
		createPCRAMSlot(ID,null,parent,true)
	}
	
	def createPCRAMSlot(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createPCRAMSlot(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an PCRAMSlot with the given id. Post create hook won't be triggered.
	 */
	def createPCRAMSlot(InternalModelElement ime) {
		createPCRAMSlot(generateUUID,ime,null,false)
	}
	
	override createPCRAMSlot() {
		createPCRAMSlot(generateUUID)
	}
	/**
	 * This method creates an PCRAMNode with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createPCRAMNode(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createPCRAMNode => [
			setID(ID)
			internal = ime ?: createInternalPCRAMNode => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.fp.pcconfig.pc.mgl.adapter.PCRAMNodeEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an PCRAMNode with the given id. Post create hook won't be triggered.
	 */
	def createPCRAMNode(String ID){
		createPCRAMNode(ID,null,null,false)
	}
	
	/**
	 * This method creates an PCRAMNode with the given id. Post create hook will be triggered.
	 */
	def createPCRAMNode(InternalModelElementContainer parent){
		createPCRAMNode(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an PCRAMNode with the given id. Post create hook will be triggered.
	 */
	def createPCRAMNode(String ID, InternalModelElementContainer parent){
		createPCRAMNode(ID,null,parent,true)
	}
	
	def createPCRAMNode(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createPCRAMNode(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an PCRAMNode with the given id. Post create hook won't be triggered.
	 */
	def createPCRAMNode(InternalModelElement ime) {
		createPCRAMNode(generateUUID,ime,null,false)
	}
	
	override createPCRAMNode() {
		createPCRAMNode(generateUUID)
	}
	/**
	 * This method creates an CaseContainer with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createCaseContainer(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createCaseContainer => [
			setID(ID)
			internal = ime ?: createInternalCaseContainer => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.fp.pcconfig.pc.mgl.adapter.CaseContainerEContentAdapter)
			]
			if (hook) postCreates
		]
		
	}
	
	/**
	 * This method creates an CaseContainer with the given id. Post create hook won't be triggered.
	 */
	def createCaseContainer(String ID){
		createCaseContainer(ID,null,null,false)
	}
	
	/**
	 * This method creates an CaseContainer with the given id. Post create hook will be triggered.
	 */
	def createCaseContainer(InternalModelElementContainer parent){
		createCaseContainer(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an CaseContainer with the given id. Post create hook will be triggered.
	 */
	def createCaseContainer(String ID, InternalModelElementContainer parent){
		createCaseContainer(ID,null,parent,true)
	}
	
	def createCaseContainer(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createCaseContainer(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an CaseContainer with the given id. Post create hook won't be triggered.
	 */
	def createCaseContainer(InternalModelElement ime) {
		createCaseContainer(generateUUID,ime,null,false)
	}
	
	override createCaseContainer() {
		createCaseContainer(generateUUID)
	}
	/**
	 * This method creates an PCMainboardContainer with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createPCMainboardContainer(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createPCMainboardContainer => [
			setID(ID)
			internal = ime ?: createInternalPCMainboardContainer => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.fp.pcconfig.pc.mgl.adapter.PCMainboardContainerEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an PCMainboardContainer with the given id. Post create hook won't be triggered.
	 */
	def createPCMainboardContainer(String ID){
		createPCMainboardContainer(ID,null,null,false)
	}
	
	/**
	 * This method creates an PCMainboardContainer with the given id. Post create hook will be triggered.
	 */
	def createPCMainboardContainer(InternalModelElementContainer parent){
		createPCMainboardContainer(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an PCMainboardContainer with the given id. Post create hook will be triggered.
	 */
	def createPCMainboardContainer(String ID, InternalModelElementContainer parent){
		createPCMainboardContainer(ID,null,parent,true)
	}
	
	def createPCMainboardContainer(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createPCMainboardContainer(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an PCMainboardContainer with the given id. Post create hook won't be triggered.
	 */
	def createPCMainboardContainer(InternalModelElement ime) {
		createPCMainboardContainer(generateUUID,ime,null,false)
	}
	
	override createPCMainboardContainer() {
		createPCMainboardContainer(generateUUID)
	}
	/**
	 * This method creates an MainboardNode with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createMainboardNode(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createMainboardNode => [
			setID(ID)
			internal = ime ?: createInternalMainboardNode => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.fp.pcconfig.pc.mgl.adapter.MainboardNodeEContentAdapter)
			]
			if (hook) postCreates
		]
		
	}
	
	/**
	 * This method creates an MainboardNode with the given id. Post create hook won't be triggered.
	 */
	def createMainboardNode(String ID){
		createMainboardNode(ID,null,null,false)
	}
	
	/**
	 * This method creates an MainboardNode with the given id. Post create hook will be triggered.
	 */
	def createMainboardNode(InternalModelElementContainer parent){
		createMainboardNode(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an MainboardNode with the given id. Post create hook will be triggered.
	 */
	def createMainboardNode(String ID, InternalModelElementContainer parent){
		createMainboardNode(ID,null,parent,true)
	}
	
	def createMainboardNode(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createMainboardNode(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an MainboardNode with the given id. Post create hook won't be triggered.
	 */
	def createMainboardNode(InternalModelElement ime) {
		createMainboardNode(generateUUID,ime,null,false)
	}
	
	override createMainboardNode() {
		createMainboardNode(generateUUID)
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
	* This method creates a new PC object with an underlying org.eclipse.emf.ecore.resource.Resource. Thus you can 
	* simply call the PC's save method to save your changes.
	*/
	def info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC createPC(java.lang.String path, java.lang.String fileName) {
		var filePath = new org.eclipse.core.runtime.Path(path).append(fileName).addFileExtension("pc");
		var uri = org.eclipse.emf.common.util.URI.createPlatformResourceURI(filePath.toOSString(), true);
		var res = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl().createResource(uri);
		var graph = info.scce.cinco.product.fp.pcconfig.pc.mgl.factory.PCFactory.eINSTANCE.createPC();
		
		org.eclipse.emf.ecore.util.EcoreUtil.setID(graph, org.eclipse.emf.ecore.util.EcoreUtil.generateUUID());

		res.getContents().add(graph.internalElement);
		
		try {
			res.save(null);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}

		return graph;
	}
	
	
	def postCreates(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer me) {
		me.transact [
			new info.scce.cinco.product.fp.pcconfig.pc.hook.CaseContainerPostCreate().postCreate(me)
		]
	}
	
	def postCreates(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode me) {
		me.transact [
			new info.scce.cinco.product.fp.pcconfig.pc.hook.DriveNodePostCreate().postCreate(me)
		]
	}
	
	def postCreates(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode me) {
		me.transact [
			new info.scce.cinco.product.fp.pcconfig.pc.hook.PSUNodePostCreate().postCreate(me)
		]
	}
	
	def postCreates(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode me) {
		me.transact [
			new info.scce.cinco.product.fp.pcconfig.pc.hook.MainboardNodePostCreate().postCreate(me)
		]
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
