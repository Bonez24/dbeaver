/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2022 DBeaver Corp and others
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/*
 * Created on Jul 14, 2004
 */
package org.jkiss.dbeaver.erd.ui.dnd;

import org.eclipse.gef3.requests.CreationFactory;

/**
 * Factory for creating instances of new objects from a palette
 * @author Serge Rider
 */
public class DataElementFactory implements CreationFactory
{

	private Object template;

	/**
	 * Creates a new FlowElementFactory with the given template object
	 * 
	 * @param o
	 *            the template
	 */
	public DataElementFactory(Object o)
	{
		template = o;
	}

	/**
	 * @see org.eclipse.gef3.requests.CreationFactory#getNewObject()
	 */
	@Override
    public Object getNewObject()
	{
		try
		{
			return ((Class<?>) template).newInstance();
		}
		catch (Exception e)
		{
			return null;
		}
	}

	/**
	 * @see org.eclipse.gef3.requests.CreationFactory#getObjectType()
	 */
	@Override
    public Object getObjectType()
	{
		return template;
	}

}