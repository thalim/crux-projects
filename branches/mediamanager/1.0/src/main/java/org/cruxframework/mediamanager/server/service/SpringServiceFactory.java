/*
 * Copyright 2011 cruxframework.org.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.cruxframework.mediamanager.server.service;

import javax.servlet.ServletContext;

import org.cruxframework.crux.core.server.rest.core.registry.RestServiceFactoryImpl;

/**
 * Class description: Crux -> Springframework integration.
 * @author alexandre.costa
 */
public class SpringServiceFactory extends RestServiceFactoryImpl
{
	@Override
	public Object getService(Class<?> serviceClass)
	{
		return  SpringUtils.get().getBean(serviceClass);
	}

	@Override
	public void initialize(ServletContext context)
	{
		super.initialize(context);
		if (context != null)
		{
			SpringUtils.get();
		}
	}
}
