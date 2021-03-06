/*******************************************************************************
 * Copyright (c) 2000, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package org.eclipse.dltk.internal.testing.model;

import org.eclipse.core.runtime.Assert;

import org.eclipse.dltk.testing.model.ITestCaseElement;

public class TestCaseElement extends TestElement implements ITestCaseElement {

	private boolean fIgnored;

	public TestCaseElement(TestContainerElement parent, String id, String testName) {
		super(parent, id, testName);
		Assert.isNotNull(parent);
	}

	public void setIgnored(boolean ignored) {
		fIgnored = ignored;
	}

	public boolean isIgnored() {
		return fIgnored;
	}

	public String toString() {
		return "TestCase: " + getTestName() + " : " + super.toString(); //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * @param value
	 */
	public void setTestName(String value) {
		super.setTestName(value);
	}
}
