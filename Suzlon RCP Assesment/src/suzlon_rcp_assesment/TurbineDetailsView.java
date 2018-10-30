package suzlon_rcp_assesment;

import javax.inject.Inject;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;

import com.suzlon.assesment.model.Turbine;
import com.suzlon.assesment.model.TurbineDAO;


public class TurbineDetailsView extends ViewPart implements ISelectionListener {
	public static final String ID = "Suzlon_RCP_Assesment.turbinedetailsview";

	@Inject IWorkbench workbench;
	
	private Text modelText;
	private Text powerText;
	private Text cutInWindSpeedtext;
	private Text ratedWindSpeedtext;
	private Text cutOutWindSpeedtext;
	

	@Override
	public void createPartControl(Composite parent) {
		
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new GridLayout(2, false));
		
		Label modelLabel = new Label(container, SWT.NONE);
		modelLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		modelLabel.setText("Model:");
		
		modelText = new Text(container, SWT.BORDER);
		modelText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label powerLabel = new Label(container, SWT.NONE);
		powerLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		powerLabel.setText("Rated Power");
		
		powerText = new Text(container, SWT.BORDER);
		powerText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label cutInWindSpeedLabel = new Label(container, SWT.NONE);
		cutInWindSpeedLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		cutInWindSpeedLabel.setText("Cut In Wind Speed");
		
		cutInWindSpeedtext = new Text(container, SWT.BORDER);
		cutInWindSpeedtext.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label ratedWindSpeed = new Label(container, SWT.NONE);
		ratedWindSpeed.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		ratedWindSpeed.setText("Rated Wind Speed");
		
		ratedWindSpeedtext = new Text(container, SWT.BORDER);
		ratedWindSpeedtext.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label cutOutWindSpeed = new Label(container, SWT.NONE);
		cutOutWindSpeed.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		cutOutWindSpeed.setText("Cut Out Wind Speed");
		
		cutOutWindSpeedtext = new Text(container, SWT.BORDER);
		cutOutWindSpeedtext.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		
		getSite().getWorkbenchWindow().getSelectionService().addSelectionListener(this);
		
	 
		// Provide the input to the ContentProvider
		//viewer.setInput(createInitialDataModel());
	}


	@Override
	public void setFocus() {
		 
	}


	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		
		if(!selection.isEmpty() && selection instanceof IStructuredSelection) {
		Turbine selectedItem =  (Turbine) ((IStructuredSelection) selection).getFirstElement()	;
		
		modelText.setText(selectedItem.getModel());
		powerText.setText(selectedItem.getRatedPower());
		cutInWindSpeedtext.setText(selectedItem.getCutInWindSpeed());
		ratedWindSpeedtext.setText(selectedItem.getRatedWindSpeed());
		cutOutWindSpeedtext.setText(selectedItem.getCutOutWindSpeed());
		
		
		}
	}
	
	
}