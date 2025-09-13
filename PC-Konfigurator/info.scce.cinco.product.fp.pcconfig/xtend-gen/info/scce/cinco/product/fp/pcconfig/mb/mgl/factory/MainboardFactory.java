package info.scce.cinco.product.fp.pcconfig.mb.mgl.factory;

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
import info.scce.cinco.product.fp.pcconfig.mb.mgl.adapter.CPUNodeEContentAdapter;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.adapter.CPUSlotEContentAdapter;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.adapter.GPUNodeEContentAdapter;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.adapter.GPUSlotEContentAdapter;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.adapter.MainboardContainerEContentAdapter;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.adapter.MainboardEContentAdapter;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.adapter.RAMNodeEContentAdapter;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.adapter.RAMSlotEContentAdapter;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardPackage;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.impl.MainboardFactoryImpl;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalCPUNode;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalCPUSlot;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalFactory;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalGPUNode;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalGPUSlot;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalMainboard;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalMainboardContainer;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalRAMNode;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalRAMSlot;
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
public class MainboardFactory extends MainboardFactoryImpl {
  @Extension
  private final InternalFactory _internalFactory = InternalFactory.eINSTANCE;
  
  public static MainboardFactory eINSTANCE = MainboardFactory.init();
  
  @Extension
  private WorkbenchExtension _workbenchExtension = new WorkbenchExtension();
  
  public static MainboardFactory init() {
    MainboardFactory _xblockexpression = null;
    {
      try {
        EFactory _eFactory = EPackage.Registry.INSTANCE.getEFactory(MainboardPackage.eNS_URI);
        final MainboardFactory fct = ((MainboardFactory) _eFactory);
        boolean _notEquals = (!Objects.equal(fct, null));
        if (_notEquals) {
          return ((MainboardFactory) fct);
        }
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
          final Exception exception = (Exception)_t;
          EcorePlugin.INSTANCE.log(exception);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      _xblockexpression = new MainboardFactory();
    }
    return _xblockexpression;
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
  public Mainboard createMainboard(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    Mainboard _createMainboard = super.createMainboard();
    final Procedure1<Mainboard> _function = (Mainboard it) -> {
      EcoreUtil.setID(it, ID);
      InternalIdentifiableElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalMainboard _createInternalMainboard = this._internalFactory.createInternalMainboard();
        _elvis = _createInternalMainboard;
      }
      final Procedure1<InternalIdentifiableElement> _function_1 = (InternalIdentifiableElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        EList<Adapter> _eAdapters = it_1.eAdapters();
        MainboardEContentAdapter _mainboardEContentAdapter = new MainboardEContentAdapter();
        _eAdapters.add(_mainboardEContentAdapter);
      };
      InternalIdentifiableElement _doubleArrow = ObjectExtensions.<InternalIdentifiableElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<Mainboard>operator_doubleArrow(_createMainboard, _function);
  }
  
  /**
   * This method creates an Mainboard with the given id. Post create hook won't be triggered.
   */
  public Mainboard createMainboard(final String ID) {
    return this.createMainboard(ID, null, null, false);
  }
  
  /**
   * This method creates an Mainboard with the given id. Post create hook will be triggered.
   */
  public Mainboard createMainboard(final InternalModelElementContainer parent) {
    return this.createMainboard(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an Mainboard with the given id. Post create hook will be triggered.
   */
  public Mainboard createMainboard(final String ID, final InternalModelElementContainer parent) {
    return this.createMainboard(ID, null, parent, true);
  }
  
  public Mainboard createMainboard(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createMainboard(ID, ime, parent, true);
  }
  
  /**
   * This method creates an Mainboard with the given id. Post create hook won't be triggered.
   */
  public Mainboard createMainboard(final InternalModelElement ime) {
    return this.createMainboard(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public Mainboard createMainboard() {
    return this.createMainboard(EcoreUtil.generateUUID());
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
  public CPUNode createCPUNode(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    CPUNode _createCPUNode = super.createCPUNode();
    final Procedure1<CPUNode> _function = (CPUNode it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalCPUNode _createInternalCPUNode = this._internalFactory.createInternalCPUNode();
        _elvis = _createInternalCPUNode;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        CPUNodeEContentAdapter _cPUNodeEContentAdapter = new CPUNodeEContentAdapter();
        _eAdapters.add(_cPUNodeEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
      if (hook) {
        this.postCreates(it);
      }
    };
    return ObjectExtensions.<CPUNode>operator_doubleArrow(_createCPUNode, _function);
  }
  
  /**
   * This method creates an CPUNode with the given id. Post create hook won't be triggered.
   */
  public CPUNode createCPUNode(final String ID) {
    return this.createCPUNode(ID, null, null, false);
  }
  
  /**
   * This method creates an CPUNode with the given id. Post create hook will be triggered.
   */
  public CPUNode createCPUNode(final InternalModelElementContainer parent) {
    return this.createCPUNode(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an CPUNode with the given id. Post create hook will be triggered.
   */
  public CPUNode createCPUNode(final String ID, final InternalModelElementContainer parent) {
    return this.createCPUNode(ID, null, parent, true);
  }
  
  public CPUNode createCPUNode(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createCPUNode(ID, ime, parent, true);
  }
  
  /**
   * This method creates an CPUNode with the given id. Post create hook won't be triggered.
   */
  public CPUNode createCPUNode(final InternalModelElement ime) {
    return this.createCPUNode(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public CPUNode createCPUNode() {
    return this.createCPUNode(EcoreUtil.generateUUID());
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
  public GPUNode createGPUNode(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    GPUNode _createGPUNode = super.createGPUNode();
    final Procedure1<GPUNode> _function = (GPUNode it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalGPUNode _createInternalGPUNode = this._internalFactory.createInternalGPUNode();
        _elvis = _createInternalGPUNode;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        GPUNodeEContentAdapter _gPUNodeEContentAdapter = new GPUNodeEContentAdapter();
        _eAdapters.add(_gPUNodeEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
      if (hook) {
        this.postCreates(it);
      }
    };
    return ObjectExtensions.<GPUNode>operator_doubleArrow(_createGPUNode, _function);
  }
  
  /**
   * This method creates an GPUNode with the given id. Post create hook won't be triggered.
   */
  public GPUNode createGPUNode(final String ID) {
    return this.createGPUNode(ID, null, null, false);
  }
  
  /**
   * This method creates an GPUNode with the given id. Post create hook will be triggered.
   */
  public GPUNode createGPUNode(final InternalModelElementContainer parent) {
    return this.createGPUNode(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an GPUNode with the given id. Post create hook will be triggered.
   */
  public GPUNode createGPUNode(final String ID, final InternalModelElementContainer parent) {
    return this.createGPUNode(ID, null, parent, true);
  }
  
  public GPUNode createGPUNode(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createGPUNode(ID, ime, parent, true);
  }
  
  /**
   * This method creates an GPUNode with the given id. Post create hook won't be triggered.
   */
  public GPUNode createGPUNode(final InternalModelElement ime) {
    return this.createGPUNode(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public GPUNode createGPUNode() {
    return this.createGPUNode(EcoreUtil.generateUUID());
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
  public MainboardContainer createMainboardContainer(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    MainboardContainer _createMainboardContainer = super.createMainboardContainer();
    final Procedure1<MainboardContainer> _function = (MainboardContainer it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalMainboardContainer _createInternalMainboardContainer = this._internalFactory.createInternalMainboardContainer();
        _elvis = _createInternalMainboardContainer;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        MainboardContainerEContentAdapter _mainboardContainerEContentAdapter = new MainboardContainerEContentAdapter();
        _eAdapters.add(_mainboardContainerEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
      if (hook) {
        this.postCreates(it);
      }
    };
    return ObjectExtensions.<MainboardContainer>operator_doubleArrow(_createMainboardContainer, _function);
  }
  
  /**
   * This method creates an MainboardContainer with the given id. Post create hook won't be triggered.
   */
  public MainboardContainer createMainboardContainer(final String ID) {
    return this.createMainboardContainer(ID, null, null, false);
  }
  
  /**
   * This method creates an MainboardContainer with the given id. Post create hook will be triggered.
   */
  public MainboardContainer createMainboardContainer(final InternalModelElementContainer parent) {
    return this.createMainboardContainer(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an MainboardContainer with the given id. Post create hook will be triggered.
   */
  public MainboardContainer createMainboardContainer(final String ID, final InternalModelElementContainer parent) {
    return this.createMainboardContainer(ID, null, parent, true);
  }
  
  public MainboardContainer createMainboardContainer(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createMainboardContainer(ID, ime, parent, true);
  }
  
  /**
   * This method creates an MainboardContainer with the given id. Post create hook won't be triggered.
   */
  public MainboardContainer createMainboardContainer(final InternalModelElement ime) {
    return this.createMainboardContainer(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public MainboardContainer createMainboardContainer() {
    return this.createMainboardContainer(EcoreUtil.generateUUID());
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
  public CPUSlot createCPUSlot(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    CPUSlot _createCPUSlot = super.createCPUSlot();
    final Procedure1<CPUSlot> _function = (CPUSlot it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalCPUSlot _createInternalCPUSlot = this._internalFactory.createInternalCPUSlot();
        _elvis = _createInternalCPUSlot;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        CPUSlotEContentAdapter _cPUSlotEContentAdapter = new CPUSlotEContentAdapter();
        _eAdapters.add(_cPUSlotEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<CPUSlot>operator_doubleArrow(_createCPUSlot, _function);
  }
  
  /**
   * This method creates an CPUSlot with the given id. Post create hook won't be triggered.
   */
  public CPUSlot createCPUSlot(final String ID) {
    return this.createCPUSlot(ID, null, null, false);
  }
  
  /**
   * This method creates an CPUSlot with the given id. Post create hook will be triggered.
   */
  public CPUSlot createCPUSlot(final InternalModelElementContainer parent) {
    return this.createCPUSlot(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an CPUSlot with the given id. Post create hook will be triggered.
   */
  public CPUSlot createCPUSlot(final String ID, final InternalModelElementContainer parent) {
    return this.createCPUSlot(ID, null, parent, true);
  }
  
  public CPUSlot createCPUSlot(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createCPUSlot(ID, ime, parent, true);
  }
  
  /**
   * This method creates an CPUSlot with the given id. Post create hook won't be triggered.
   */
  public CPUSlot createCPUSlot(final InternalModelElement ime) {
    return this.createCPUSlot(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public CPUSlot createCPUSlot() {
    return this.createCPUSlot(EcoreUtil.generateUUID());
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
  public GPUSlot createGPUSlot(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    GPUSlot _createGPUSlot = super.createGPUSlot();
    final Procedure1<GPUSlot> _function = (GPUSlot it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalGPUSlot _createInternalGPUSlot = this._internalFactory.createInternalGPUSlot();
        _elvis = _createInternalGPUSlot;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        GPUSlotEContentAdapter _gPUSlotEContentAdapter = new GPUSlotEContentAdapter();
        _eAdapters.add(_gPUSlotEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<GPUSlot>operator_doubleArrow(_createGPUSlot, _function);
  }
  
  /**
   * This method creates an GPUSlot with the given id. Post create hook won't be triggered.
   */
  public GPUSlot createGPUSlot(final String ID) {
    return this.createGPUSlot(ID, null, null, false);
  }
  
  /**
   * This method creates an GPUSlot with the given id. Post create hook will be triggered.
   */
  public GPUSlot createGPUSlot(final InternalModelElementContainer parent) {
    return this.createGPUSlot(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an GPUSlot with the given id. Post create hook will be triggered.
   */
  public GPUSlot createGPUSlot(final String ID, final InternalModelElementContainer parent) {
    return this.createGPUSlot(ID, null, parent, true);
  }
  
  public GPUSlot createGPUSlot(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createGPUSlot(ID, ime, parent, true);
  }
  
  /**
   * This method creates an GPUSlot with the given id. Post create hook won't be triggered.
   */
  public GPUSlot createGPUSlot(final InternalModelElement ime) {
    return this.createGPUSlot(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public GPUSlot createGPUSlot() {
    return this.createGPUSlot(EcoreUtil.generateUUID());
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
  public RAMSlot createRAMSlot(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    RAMSlot _createRAMSlot = super.createRAMSlot();
    final Procedure1<RAMSlot> _function = (RAMSlot it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalRAMSlot _createInternalRAMSlot = this._internalFactory.createInternalRAMSlot();
        _elvis = _createInternalRAMSlot;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        RAMSlotEContentAdapter _rAMSlotEContentAdapter = new RAMSlotEContentAdapter();
        _eAdapters.add(_rAMSlotEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<RAMSlot>operator_doubleArrow(_createRAMSlot, _function);
  }
  
  /**
   * This method creates an RAMSlot with the given id. Post create hook won't be triggered.
   */
  public RAMSlot createRAMSlot(final String ID) {
    return this.createRAMSlot(ID, null, null, false);
  }
  
  /**
   * This method creates an RAMSlot with the given id. Post create hook will be triggered.
   */
  public RAMSlot createRAMSlot(final InternalModelElementContainer parent) {
    return this.createRAMSlot(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an RAMSlot with the given id. Post create hook will be triggered.
   */
  public RAMSlot createRAMSlot(final String ID, final InternalModelElementContainer parent) {
    return this.createRAMSlot(ID, null, parent, true);
  }
  
  public RAMSlot createRAMSlot(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createRAMSlot(ID, ime, parent, true);
  }
  
  /**
   * This method creates an RAMSlot with the given id. Post create hook won't be triggered.
   */
  public RAMSlot createRAMSlot(final InternalModelElement ime) {
    return this.createRAMSlot(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public RAMSlot createRAMSlot() {
    return this.createRAMSlot(EcoreUtil.generateUUID());
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
  public RAMNode createRAMNode(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    RAMNode _createRAMNode = super.createRAMNode();
    final Procedure1<RAMNode> _function = (RAMNode it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalRAMNode _createInternalRAMNode = this._internalFactory.createInternalRAMNode();
        _elvis = _createInternalRAMNode;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        RAMNodeEContentAdapter _rAMNodeEContentAdapter = new RAMNodeEContentAdapter();
        _eAdapters.add(_rAMNodeEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
      if (hook) {
        this.postCreates(it);
      }
    };
    return ObjectExtensions.<RAMNode>operator_doubleArrow(_createRAMNode, _function);
  }
  
  /**
   * This method creates an RAMNode with the given id. Post create hook won't be triggered.
   */
  public RAMNode createRAMNode(final String ID) {
    return this.createRAMNode(ID, null, null, false);
  }
  
  /**
   * This method creates an RAMNode with the given id. Post create hook will be triggered.
   */
  public RAMNode createRAMNode(final InternalModelElementContainer parent) {
    return this.createRAMNode(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an RAMNode with the given id. Post create hook will be triggered.
   */
  public RAMNode createRAMNode(final String ID, final InternalModelElementContainer parent) {
    return this.createRAMNode(ID, null, parent, true);
  }
  
  public RAMNode createRAMNode(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createRAMNode(ID, ime, parent, true);
  }
  
  /**
   * This method creates an RAMNode with the given id. Post create hook won't be triggered.
   */
  public RAMNode createRAMNode(final InternalModelElement ime) {
    return this.createRAMNode(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public RAMNode createRAMNode() {
    return this.createRAMNode(EcoreUtil.generateUUID());
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
   * This method creates a new Mainboard object with an underlying org.eclipse.emf.ecore.resource.Resource. Thus you can
   * simply call the Mainboard's save method to save your changes.
   */
  public Mainboard createMainboard(final String path, final String fileName) {
    IPath filePath = new Path(path).append(fileName).addFileExtension("mainboard");
    URI uri = URI.createPlatformResourceURI(filePath.toOSString(), true);
    Resource res = new ResourceSetImpl().createResource(uri);
    Mainboard graph = MainboardFactory.eINSTANCE.createMainboard();
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
