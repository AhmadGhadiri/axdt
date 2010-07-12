package org.axdt.as3.ui.labeling;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.ui.editor.outline.OutlineLabelProvider;
import org.eclipse.xtext.ui.label.DefaultDescriptionLabelProvider;

import com.google.inject.Inject;

public class As3DescriptionLabelProvider extends
		DefaultDescriptionLabelProvider {

	@Inject
	@OutlineLabelProvider
	private ILabelProvider delegateLabelProvider;
	
	@Override
	public Image getImage(Object description) {
		if (description instanceof IEObjectDescription) {
			IEObjectDescription eDesc = (IEObjectDescription) description;
			EObject objectOrProxy = eDesc.getEObjectOrProxy();
			return delegateLabelProvider.getImage(objectOrProxy);
		}
		return super.getImage(description);
	}
}
