/*******************************************************************************
 * Copyright (c) 2009, 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.acceleo.engine;

/**
 * This will be thrown by the engine whenever the user cancels the evaluation of an Acceleo template.
 * 
 * @author <a href="mailto:laurent.goubet@obeo.fr">Laurent Goubet</a>
 * @since 0.8
 */
public class AcceleoEvaluationCancelledException extends AcceleoEvaluationException {
	/** Generated SUID. */
	private static final long serialVersionUID = 1413834134934770280L;

	/**
	 * Simply delegates to the super constructor.
	 * 
	 * @param message
	 *            The exception details' message.
	 */
	public AcceleoEvaluationCancelledException(String message) {
		super(message);
	}
}
