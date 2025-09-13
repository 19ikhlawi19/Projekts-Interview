package info.scce.cinco.product.fp.pcconfig.pc.mgl.factory;

import com.google.common.base.Objects;
import de.jabc.cinco.meta.runtime.xapi.WorkbenchExtension;
import graphmodel.GraphModel;
import graphmodel.IdentifiableElement;
import graphmodel.ModelElement;
import graphmodel.Type;
import graphmodel.internal.InternalGraphModel;
import graphmodel.internal.InternalIdentifiableElement;
import graphmodel.internal.InternalModelElement;
import graphmodel.internal.InternalModelElementContainer;
import graphmodel.internal.InternalType;
import info.scce.cinco.product.fp.pcconfig.mb.hook.CPUNodePostCreate;
import info.scce.cinco.product.fp.pcconfig.mb.hook.GPUNodePostCreate;
import info.scce.cinco.product.fp.pcconfig.mb.hook.MainboardContainerPostCreate;
import info.scce.cinco.product.fp.pcconfig.mb.hook.RAMNodePostCreate;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode;
import info.scce.cinco.product.fp.pcconfig.pc.hook.CaseContainerPostCreate;
import info.scce.cinco.product.fp.pcconfig.pc.hook.DriveNodePostCreate;
import info.scce.cinco.product.fp.pcconfig.pc.hook.MainboardNodePostCreate;
import info.scce.cinco.product.fp.pcconfig.pc.hook.PSUNodePostCreate;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.adapter.CaseContainerEContentAdapter;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.adapter.DriveContainerEContentAdapter;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.adapter.DriveNodeEContentAdapter;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.adapter.MainboardNodeEContentAdapter;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.adapter.PCCPUNodeEContentAdapter;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.adapter.PCEContentAdapter;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.adapter.PCGPUNodeEContentAdapter;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.adapter.PCMainboardContainerEContentAdapter;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.adapter.PCRAMNodeEContentAdapter;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.adapter.PCRAMSlotEContentAdapter;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.adapter.PSUContainerEContentAdapter;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.adapter.PSUNodeEContentAdapter;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMNode;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PcPackage;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.impl.PcFactoryImpl;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalCaseContainer;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalDriveContainer;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalDriveNode;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalFactory;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalMainboardNode;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPC;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPCCPUNode;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPCGPUNode;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPCMainboardContainer;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPCRAMNode;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPCRAMSlot;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPSUContainer;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPSUNode;
import java.io.IOException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class PCFactory extends PcFactoryImpl {
  @Extension
  private final InternalFactory _internalFactory = InternalFactory.eINSTANCE;
  
  public static PCFactory eINSTANCE = PCFactory.init();
  
  @Extension
  private WorkbenchExtension _workbenchExtension = new WorkbenchExtension();
  
  public static PCFactory init() {
    PCFactory _xblockexpression = null;
    {
      try {
        EFactory _eFactory = EPackage.Registry.INSTANCE.getEFactory(PcPackage.eNS_URI);
        final PCFactory fct = ((PCFactory) _eFactory);
        boolean _notEquals = (!Objects.equal(fct, null));
        if (_notEquals) {
          return ((PCFactory) fct);
        }
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
          final Exception exception = (Exception)_t;
          EcorePlugin.INSTANCE.log(exception);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      _xblockexpression = new PCFactory();
    }
    return _xblockexpression;
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
  public PC createPC(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    PC _createPC = super.createPC();
    final Procedure1<PC> _function = (PC it) -> {
      EcoreUtil.setID(it, ID);
      InternalIdentifiableElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalPC _createInternalPC = this._internalFactory.createInternalPC();
        _elvis = _createInternalPC;
      }
      final Procedure1<InternalIdentifiableElement> _function_1 = (InternalIdentifiableElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        EList<Adapter> _eAdapters = it_1.eAdapters();
        PCEContentAdapter _pCEContentAdapter = new PCEContentAdapter();
        _eAdapters.add(_pCEContentAdapter);
      };
      InternalIdentifiableElement _doubleArrow = ObjectExtensions.<InternalIdentifiableElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<PC>operator_doubleArrow(_createPC, _function);
  }
  
  /**
   * This method creates an PC with the given id. Post create hook won't be triggered.
   */
  public PC createPC(final String ID) {
    return this.createPC(ID, null, null, false);
  }
  
  /**
   * This method creates an PC with the given id. Post create hook will be triggered.
   */
  public PC createPC(final InternalModelElementContainer parent) {
    return this.createPC(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an PC with the given id. Post create hook will be triggered.
   */
  public PC createPC(final String ID, final InternalModelElementContainer parent) {
    return this.createPC(ID, null, parent, true);
  }
  
  public PC createPC(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createPC(ID, ime, parent, true);
  }
  
  /**
   * This method creates an PC with the given id. Post create hook won't be triggered.
   */
  public PC createPC(final InternalModelElement ime) {
    return this.createPC(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public PC createPC() {
    return this.createPC(EcoreUtil.generateUUID());
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
  public PSUNode createPSUNode(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    PSUNode _createPSUNode = super.createPSUNode();
    final Procedure1<PSUNode> _function = (PSUNode it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalPSUNode _createInternalPSUNode = this._internalFactory.createInternalPSUNode();
        _elvis = _createInternalPSUNode;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        PSUNodeEContentAdapter _pSUNodeEContentAdapter = new PSUNodeEContentAdapter();
        _eAdapters.add(_pSUNodeEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
      if (hook) {
        this.postCreates(it);
      }
    };
    return ObjectExtensions.<PSUNode>operator_doubleArrow(_createPSUNode, _function);
  }
  
  /**
   * This method creates an PSUNode with the given id. Post create hook won't be triggered.
   */
  public PSUNode createPSUNode(final String ID) {
    return this.createPSUNode(ID, null, null, false);
  }
  
  /**
   * This method creates an PSUNode with the given id. Post create hook will be triggered.
   */
  public PSUNode createPSUNode(final InternalModelElementContainer parent) {
    return this.createPSUNode(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an PSUNode with the given id. Post create hook will be triggered.
   */
  public PSUNode createPSUNode(final String ID, final InternalModelElementContainer parent) {
    return this.createPSUNode(ID, null, parent, true);
  }
  
  public PSUNode createPSUNode(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createPSUNode(ID, ime, parent, true);
  }
  
  /**
   * This method creates an PSUNode with the given id. Post create hook won't be triggered.
   */
  public PSUNode createPSUNode(final InternalModelElement ime) {
    return this.createPSUNode(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public PSUNode createPSUNode() {
    return this.createPSUNode(EcoreUtil.generateUUID());
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
  public PCCPUNode createPCCPUNode(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    PCCPUNode _createPCCPUNode = super.createPCCPUNode();
    final Procedure1<PCCPUNode> _function = (PCCPUNode it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalPCCPUNode _createInternalPCCPUNode = this._internalFactory.createInternalPCCPUNode();
        _elvis = _createInternalPCCPUNode;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        PCCPUNodeEContentAdapter _pCCPUNodeEContentAdapter = new PCCPUNodeEContentAdapter();
        _eAdapters.add(_pCCPUNodeEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<PCCPUNode>operator_doubleArrow(_createPCCPUNode, _function);
  }
  
  /**
   * This method creates an PCCPUNode with the given id. Post create hook won't be triggered.
   */
  public PCCPUNode createPCCPUNode(final String ID) {
    return this.createPCCPUNode(ID, null, null, false);
  }
  
  /**
   * This method creates an PCCPUNode with the given id. Post create hook will be triggered.
   */
  public PCCPUNode createPCCPUNode(final InternalModelElementContainer parent) {
    return this.createPCCPUNode(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an PCCPUNode with the given id. Post create hook will be triggered.
   */
  public PCCPUNode createPCCPUNode(final String ID, final InternalModelElementContainer parent) {
    return this.createPCCPUNode(ID, null, parent, true);
  }
  
  public PCCPUNode createPCCPUNode(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createPCCPUNode(ID, ime, parent, true);
  }
  
  /**
   * This method creates an PCCPUNode with the given id. Post create hook won't be triggered.
   */
  public PCCPUNode createPCCPUNode(final InternalModelElement ime) {
    return this.createPCCPUNode(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public PCCPUNode createPCCPUNode() {
    return this.createPCCPUNode(EcoreUtil.generateUUID());
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
  public PSUContainer createPSUContainer(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    PSUContainer _createPSUContainer = super.createPSUContainer();
    final Procedure1<PSUContainer> _function = (PSUContainer it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalPSUContainer _createInternalPSUContainer = this._internalFactory.createInternalPSUContainer();
        _elvis = _createInternalPSUContainer;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        PSUContainerEContentAdapter _pSUContainerEContentAdapter = new PSUContainerEContentAdapter();
        _eAdapters.add(_pSUContainerEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<PSUContainer>operator_doubleArrow(_createPSUContainer, _function);
  }
  
  /**
   * This method creates an PSUContainer with the given id. Post create hook won't be triggered.
   */
  public PSUContainer createPSUContainer(final String ID) {
    return this.createPSUContainer(ID, null, null, false);
  }
  
  /**
   * This method creates an PSUContainer with the given id. Post create hook will be triggered.
   */
  public PSUContainer createPSUContainer(final InternalModelElementContainer parent) {
    return this.createPSUContainer(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an PSUContainer with the given id. Post create hook will be triggered.
   */
  public PSUContainer createPSUContainer(final String ID, final InternalModelElementContainer parent) {
    return this.createPSUContainer(ID, null, parent, true);
  }
  
  public PSUContainer createPSUContainer(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createPSUContainer(ID, ime, parent, true);
  }
  
  /**
   * This method creates an PSUContainer with the given id. Post create hook won't be triggered.
   */
  public PSUContainer createPSUContainer(final InternalModelElement ime) {
    return this.createPSUContainer(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public PSUContainer createPSUContainer() {
    return this.createPSUContainer(EcoreUtil.generateUUID());
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
  public DriveNode createDriveNode(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    DriveNode _createDriveNode = super.createDriveNode();
    final Procedure1<DriveNode> _function = (DriveNode it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalDriveNode _createInternalDriveNode = this._internalFactory.createInternalDriveNode();
        _elvis = _createInternalDriveNode;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        DriveNodeEContentAdapter _driveNodeEContentAdapter = new DriveNodeEContentAdapter();
        _eAdapters.add(_driveNodeEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
      if (hook) {
        this.postCreates(it);
      }
    };
    return ObjectExtensions.<DriveNode>operator_doubleArrow(_createDriveNode, _function);
  }
  
  /**
   * This method creates an DriveNode with the given id. Post create hook won't be triggered.
   */
  public DriveNode createDriveNode(final String ID) {
    return this.createDriveNode(ID, null, null, false);
  }
  
  /**
   * This method creates an DriveNode with the given id. Post create hook will be triggered.
   */
  public DriveNode createDriveNode(final InternalModelElementContainer parent) {
    return this.createDriveNode(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an DriveNode with the given id. Post create hook will be triggered.
   */
  public DriveNode createDriveNode(final String ID, final InternalModelElementContainer parent) {
    return this.createDriveNode(ID, null, parent, true);
  }
  
  public DriveNode createDriveNode(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createDriveNode(ID, ime, parent, true);
  }
  
  /**
   * This method creates an DriveNode with the given id. Post create hook won't be triggered.
   */
  public DriveNode createDriveNode(final InternalModelElement ime) {
    return this.createDriveNode(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public DriveNode createDriveNode() {
    return this.createDriveNode(EcoreUtil.generateUUID());
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
  public PCGPUNode createPCGPUNode(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    PCGPUNode _createPCGPUNode = super.createPCGPUNode();
    final Procedure1<PCGPUNode> _function = (PCGPUNode it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalPCGPUNode _createInternalPCGPUNode = this._internalFactory.createInternalPCGPUNode();
        _elvis = _createInternalPCGPUNode;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        PCGPUNodeEContentAdapter _pCGPUNodeEContentAdapter = new PCGPUNodeEContentAdapter();
        _eAdapters.add(_pCGPUNodeEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<PCGPUNode>operator_doubleArrow(_createPCGPUNode, _function);
  }
  
  /**
   * This method creates an PCGPUNode with the given id. Post create hook won't be triggered.
   */
  public PCGPUNode createPCGPUNode(final String ID) {
    return this.createPCGPUNode(ID, null, null, false);
  }
  
  /**
   * This method creates an PCGPUNode with the given id. Post create hook will be triggered.
   */
  public PCGPUNode createPCGPUNode(final InternalModelElementContainer parent) {
    return this.createPCGPUNode(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an PCGPUNode with the given id. Post create hook will be triggered.
   */
  public PCGPUNode createPCGPUNode(final String ID, final InternalModelElementContainer parent) {
    return this.createPCGPUNode(ID, null, parent, true);
  }
  
  public PCGPUNode createPCGPUNode(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createPCGPUNode(ID, ime, parent, true);
  }
  
  /**
   * This method creates an PCGPUNode with the given id. Post create hook won't be triggered.
   */
  public PCGPUNode createPCGPUNode(final InternalModelElement ime) {
    return this.createPCGPUNode(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public PCGPUNode createPCGPUNode() {
    return this.createPCGPUNode(EcoreUtil.generateUUID());
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
  public DriveContainer createDriveContainer(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    DriveContainer _createDriveContainer = super.createDriveContainer();
    final Procedure1<DriveContainer> _function = (DriveContainer it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalDriveContainer _createInternalDriveContainer = this._internalFactory.createInternalDriveContainer();
        _elvis = _createInternalDriveContainer;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        DriveContainerEContentAdapter _driveContainerEContentAdapter = new DriveContainerEContentAdapter();
        _eAdapters.add(_driveContainerEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<DriveContainer>operator_doubleArrow(_createDriveContainer, _function);
  }
  
  /**
   * This method creates an DriveContainer with the given id. Post create hook won't be triggered.
   */
  public DriveContainer createDriveContainer(final String ID) {
    return this.createDriveContainer(ID, null, null, false);
  }
  
  /**
   * This method creates an DriveContainer with the given id. Post create hook will be triggered.
   */
  public DriveContainer createDriveContainer(final InternalModelElementContainer parent) {
    return this.createDriveContainer(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an DriveContainer with the given id. Post create hook will be triggered.
   */
  public DriveContainer createDriveContainer(final String ID, final InternalModelElementContainer parent) {
    return this.createDriveContainer(ID, null, parent, true);
  }
  
  public DriveContainer createDriveContainer(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createDriveContainer(ID, ime, parent, true);
  }
  
  /**
   * This method creates an DriveContainer with the given id. Post create hook won't be triggered.
   */
  public DriveContainer createDriveContainer(final InternalModelElement ime) {
    return this.createDriveContainer(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public DriveContainer createDriveContainer() {
    return this.createDriveContainer(EcoreUtil.generateUUID());
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
  public PCRAMSlot createPCRAMSlot(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    PCRAMSlot _createPCRAMSlot = super.createPCRAMSlot();
    final Procedure1<PCRAMSlot> _function = (PCRAMSlot it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalPCRAMSlot _createInternalPCRAMSlot = this._internalFactory.createInternalPCRAMSlot();
        _elvis = _createInternalPCRAMSlot;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        PCRAMSlotEContentAdapter _pCRAMSlotEContentAdapter = new PCRAMSlotEContentAdapter();
        _eAdapters.add(_pCRAMSlotEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<PCRAMSlot>operator_doubleArrow(_createPCRAMSlot, _function);
  }
  
  /**
   * This method creates an PCRAMSlot with the given id. Post create hook won't be triggered.
   */
  public PCRAMSlot createPCRAMSlot(final String ID) {
    return this.createPCRAMSlot(ID, null, null, false);
  }
  
  /**
   * This method creates an PCRAMSlot with the given id. Post create hook will be triggered.
   */
  public PCRAMSlot createPCRAMSlot(final InternalModelElementContainer parent) {
    return this.createPCRAMSlot(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an PCRAMSlot with the given id. Post create hook will be triggered.
   */
  public PCRAMSlot createPCRAMSlot(final String ID, final InternalModelElementContainer parent) {
    return this.createPCRAMSlot(ID, null, parent, true);
  }
  
  public PCRAMSlot createPCRAMSlot(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createPCRAMSlot(ID, ime, parent, true);
  }
  
  /**
   * This method creates an PCRAMSlot with the given id. Post create hook won't be triggered.
   */
  public PCRAMSlot createPCRAMSlot(final InternalModelElement ime) {
    return this.createPCRAMSlot(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public PCRAMSlot createPCRAMSlot() {
    return this.createPCRAMSlot(EcoreUtil.generateUUID());
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
  public PCRAMNode createPCRAMNode(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    PCRAMNode _createPCRAMNode = super.createPCRAMNode();
    final Procedure1<PCRAMNode> _function = (PCRAMNode it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalPCRAMNode _createInternalPCRAMNode = this._internalFactory.createInternalPCRAMNode();
        _elvis = _createInternalPCRAMNode;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        PCRAMNodeEContentAdapter _pCRAMNodeEContentAdapter = new PCRAMNodeEContentAdapter();
        _eAdapters.add(_pCRAMNodeEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<PCRAMNode>operator_doubleArrow(_createPCRAMNode, _function);
  }
  
  /**
   * This method creates an PCRAMNode with the given id. Post create hook won't be triggered.
   */
  public PCRAMNode createPCRAMNode(final String ID) {
    return this.createPCRAMNode(ID, null, null, false);
  }
  
  /**
   * This method creates an PCRAMNode with the given id. Post create hook will be triggered.
   */
  public PCRAMNode createPCRAMNode(final InternalModelElementContainer parent) {
    return this.createPCRAMNode(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an PCRAMNode with the given id. Post create hook will be triggered.
   */
  public PCRAMNode createPCRAMNode(final String ID, final InternalModelElementContainer parent) {
    return this.createPCRAMNode(ID, null, parent, true);
  }
  
  public PCRAMNode createPCRAMNode(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createPCRAMNode(ID, ime, parent, true);
  }
  
  /**
   * This method creates an PCRAMNode with the given id. Post create hook won't be triggered.
   */
  public PCRAMNode createPCRAMNode(final InternalModelElement ime) {
    return this.createPCRAMNode(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public PCRAMNode createPCRAMNode() {
    return this.createPCRAMNode(EcoreUtil.generateUUID());
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
  public CaseContainer createCaseContainer(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    CaseContainer _createCaseContainer = super.createCaseContainer();
    final Procedure1<CaseContainer> _function = (CaseContainer it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalCaseContainer _createInternalCaseContainer = this._internalFactory.createInternalCaseContainer();
        _elvis = _createInternalCaseContainer;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        CaseContainerEContentAdapter _caseContainerEContentAdapter = new CaseContainerEContentAdapter();
        _eAdapters.add(_caseContainerEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
      if (hook) {
        this.postCreates(it);
      }
    };
    return ObjectExtensions.<CaseContainer>operator_doubleArrow(_createCaseContainer, _function);
  }
  
  /**
   * This method creates an CaseContainer with the given id. Post create hook won't be triggered.
   */
  public CaseContainer createCaseContainer(final String ID) {
    return this.createCaseContainer(ID, null, null, false);
  }
  
  /**
   * This method creates an CaseContainer with the given id. Post create hook will be triggered.
   */
  public CaseContainer createCaseContainer(final InternalModelElementContainer parent) {
    return this.createCaseContainer(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an CaseContainer with the given id. Post create hook will be triggered.
   */
  public CaseContainer createCaseContainer(final String ID, final InternalModelElementContainer parent) {
    return this.createCaseContainer(ID, null, parent, true);
  }
  
  public CaseContainer createCaseContainer(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createCaseContainer(ID, ime, parent, true);
  }
  
  /**
   * This method creates an CaseContainer with the given id. Post create hook won't be triggered.
   */
  public CaseContainer createCaseContainer(final InternalModelElement ime) {
    return this.createCaseContainer(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public CaseContainer createCaseContainer() {
    return this.createCaseContainer(EcoreUtil.generateUUID());
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
  public PCMainboardContainer createPCMainboardContainer(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    PCMainboardContainer _createPCMainboardContainer = super.createPCMainboardContainer();
    final Procedure1<PCMainboardContainer> _function = (PCMainboardContainer it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalPCMainboardContainer _createInternalPCMainboardContainer = this._internalFactory.createInternalPCMainboardContainer();
        _elvis = _createInternalPCMainboardContainer;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        PCMainboardContainerEContentAdapter _pCMainboardContainerEContentAdapter = new PCMainboardContainerEContentAdapter();
        _eAdapters.add(_pCMainboardContainerEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<PCMainboardContainer>operator_doubleArrow(_createPCMainboardContainer, _function);
  }
  
  /**
   * This method creates an PCMainboardContainer with the given id. Post create hook won't be triggered.
   */
  public PCMainboardContainer createPCMainboardContainer(final String ID) {
    return this.createPCMainboardContainer(ID, null, null, false);
  }
  
  /**
   * This method creates an PCMainboardContainer with the given id. Post create hook will be triggered.
   */
  public PCMainboardContainer createPCMainboardContainer(final InternalModelElementContainer parent) {
    return this.createPCMainboardContainer(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an PCMainboardContainer with the given id. Post create hook will be triggered.
   */
  public PCMainboardContainer createPCMainboardContainer(final String ID, final InternalModelElementContainer parent) {
    return this.createPCMainboardContainer(ID, null, parent, true);
  }
  
  public PCMainboardContainer createPCMainboardContainer(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createPCMainboardContainer(ID, ime, parent, true);
  }
  
  /**
   * This method creates an PCMainboardContainer with the given id. Post create hook won't be triggered.
   */
  public PCMainboardContainer createPCMainboardContainer(final InternalModelElement ime) {
    return this.createPCMainboardContainer(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public PCMainboardContainer createPCMainboardContainer() {
    return this.createPCMainboardContainer(EcoreUtil.generateUUID());
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
  public MainboardNode createMainboardNode(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    MainboardNode _createMainboardNode = super.createMainboardNode();
    final Procedure1<MainboardNode> _function = (MainboardNode it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalMainboardNode _createInternalMainboardNode = this._internalFactory.createInternalMainboardNode();
        _elvis = _createInternalMainboardNode;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        MainboardNodeEContentAdapter _mainboardNodeEContentAdapter = new MainboardNodeEContentAdapter();
        _eAdapters.add(_mainboardNodeEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
      if (hook) {
        this.postCreates(it);
      }
    };
    return ObjectExtensions.<MainboardNode>operator_doubleArrow(_createMainboardNode, _function);
  }
  
  /**
   * This method creates an MainboardNode with the given id. Post create hook won't be triggered.
   */
  public MainboardNode createMainboardNode(final String ID) {
    return this.createMainboardNode(ID, null, null, false);
  }
  
  /**
   * This method creates an MainboardNode with the given id. Post create hook will be triggered.
   */
  public MainboardNode createMainboardNode(final InternalModelElementContainer parent) {
    return this.createMainboardNode(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an MainboardNode with the given id. Post create hook will be triggered.
   */
  public MainboardNode createMainboardNode(final String ID, final InternalModelElementContainer parent) {
    return this.createMainboardNode(ID, null, parent, true);
  }
  
  public MainboardNode createMainboardNode(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createMainboardNode(ID, ime, parent, true);
  }
  
  /**
   * This method creates an MainboardNode with the given id. Post create hook won't be triggered.
   */
  public MainboardNode createMainboardNode(final InternalModelElement ime) {
    return this.createMainboardNode(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public MainboardNode createMainboardNode() {
    return this.createMainboardNode(EcoreUtil.generateUUID());
  }
  
  private <T extends IdentifiableElement> T setInternal(final T elm, final InternalIdentifiableElement internal) {
    final Procedure1<T> _function = (T it) -> {
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(it.getId());
      if (_isNullOrEmpty) {
        EcoreUtil.setID(it, EcoreUtil.generateUUID());
      }
      boolean _matched = false;
      if (elm instanceof GraphModel) {
        _matched=true;
        ((GraphModel)elm).setInternalElement(((InternalGraphModel) internal));
      }
      if (!_matched) {
        if (elm instanceof ModelElement) {
          _matched=true;
          ((ModelElement)elm).setInternalElement(((InternalModelElement) internal));
        }
      }
      if (!_matched) {
        if (elm instanceof Type) {
          _matched=true;
          ((Type)elm).setInternalElement(((InternalType) internal));
        }
      }
    };
    return ObjectExtensions.<T>operator_doubleArrow(elm, _function);
  }
  
  /**
   * This method creates a new PC object with an underlying org.eclipse.emf.ecore.resource.Resource. Thus you can
   * simply call the PC's save method to save your changes.
   */
  public PC createPC(final String path, final String fileName) {
    IPath filePath = new Path(path).append(fileName).addFileExtension("pc");
    URI uri = URI.createPlatformResourceURI(filePath.toOSString(), true);
    Resource res = new ResourceSetImpl().createResource(uri);
    PC graph = PCFactory.eINSTANCE.createPC();
    EcoreUtil.setID(graph, EcoreUtil.generateUUID());
    res.getContents().add(graph.getInternalElement());
    try {
      res.save(null);
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return graph;
  }
  
  public void postCreates(final CaseContainer me) {
    final Runnable _function = () -> {
      new CaseContainerPostCreate().postCreate(me);
    };
    this._workbenchExtension.transact(me, _function);
  }
  
  public void postCreates(final DriveNode me) {
    final Runnable _function = () -> {
      new DriveNodePostCreate().postCreate(me);
    };
    this._workbenchExtension.transact(me, _function);
  }
  
  public void postCreates(final PSUNode me) {
    final Runnable _function = () -> {
      new PSUNodePostCreate().postCreate(me);
    };
    this._workbenchExtension.transact(me, _function);
  }
  
  public void postCreates(final MainboardNode me) {
    final Runnable _function = () -> {
      new MainboardNodePostCreate().postCreate(me);
    };
    this._workbenchExtension.transact(me, _function);
  }
  
  public void postCreates(final MainboardContainer me) {
    final Runnable _function = () -> {
      new MainboardContainerPostCreate().postCreate(me);
    };
    this._workbenchExtension.transact(me, _function);
  }
  
  public void postCreates(final CPUNode me) {
    final Runnable _function = () -> {
      new CPUNodePostCreate().postCreate(me);
    };
    this._workbenchExtension.transact(me, _function);
  }
  
  public void postCreates(final RAMNode me) {
    final Runnable _function = () -> {
      new RAMNodePostCreate().postCreate(me);
    };
    this._workbenchExtension.transact(me, _function);
  }
  
  public void postCreates(final GPUNode me) {
    final Runnable _function = () -> {
      new GPUNodePostCreate().postCreate(me);
    };
    this._workbenchExtension.transact(me, _function);
  }
}
