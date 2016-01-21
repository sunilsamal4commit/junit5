/*
 * Copyright 2015-2016 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.junit.gen5.engine.junit5.resolver;

public abstract class JUnit5TestResolver implements TestResolver {
	private TestResolverRegistry testResolverRegistry;

	public TestResolverRegistry getTestResolverRegistry() {
		return testResolverRegistry;
	}

	@Override
	public void bindTestResolveryRegistry(TestResolverRegistry testResolverRegistry) {
		this.testResolverRegistry = testResolverRegistry;
	}
}
