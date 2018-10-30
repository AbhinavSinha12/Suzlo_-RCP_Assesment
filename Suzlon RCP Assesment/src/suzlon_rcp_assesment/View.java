package suzlon_rcp_assesment;


import javax.inject.Inject;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.part.ViewPart;

import com.suzlon.assesment.model.Turbine;
import com.suzlon.assesment.model.TurbineDAO;

public class View extends ViewPart {
	public static final String ID = "Suzlon_RCP_Assesment.view";

	@Inject IWorkbench workbench;
	
	private TableViewer viewer;
	
	private class StringLabelProvider extends ColumnLabelProvider {
		@Override
		public String getText(Object element) {
			return super.getText(element);
		}

		@Override
		public Image getImage(Object obj) {
			return workbench.getSharedImages().getImage(ISharedImages.IMG_OBJ_ELEMENT);
		}

	}

	@Override
	public void createPartControl(Composite parent) {
		viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		viewer.getTable().setLinesVisible(true);

		TableViewerColumn column = new TableViewerColumn(viewer, SWT.NONE);
		column.setLabelProvider(new StringLabelProvider());

		viewer.getTable().getColumn(0).setWidth(200);
		
		viewer.setContentProvider(ArrayContentProvider.getInstance());
		
		
		viewer.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Turbine p = (Turbine) element;
				return p.getModel();
			}
		});
		
		// Provide the input to the ContentProvider
		viewer.setInput(TurbineDAO.geTurbines());
		getSite().setSelectionProvider(viewer);
	 
		// Provide the input to the ContentProvider
		//viewer.setInput(createInitialDataModel());
	}


	@Override
	public void setFocus() {
		viewer.getControl().setFocus();
	}
	
	
}