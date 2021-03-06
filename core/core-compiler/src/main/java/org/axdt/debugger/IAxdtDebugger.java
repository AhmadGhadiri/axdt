/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.debugger;

import org.axdt.common.IAxdtExtension;
import org.axdt.launch.AxdtLaunchContext;
import org.eclipse.core.runtime.IProgressMonitor;

/**
 * @author nkuebler
 */
public interface IAxdtDebugger extends IAxdtExtension {

	String EXTENSION_ID = "org.axdt.core.compiler.axdtDebugger";

	boolean debug(AxdtLaunchContext context, IProgressMonitor monitor)
			throws Exception;
}
