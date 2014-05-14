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
package org.cruxframework.mediamanager.core.service;

import java.util.List;

import org.cruxframework.crux.core.server.rest.annotation.RestService;
import org.cruxframework.crux.core.shared.rest.RestException;
import org.cruxframework.crux.core.shared.rest.annotation.GET;
import org.cruxframework.crux.core.shared.rest.annotation.Path;
import org.cruxframework.crux.core.shared.rest.annotation.QueryParam;
import org.cruxframework.mediamanager.core.client.dto.MediaDTO;
import org.cruxframework.mediamanager.core.client.enums.MediaType;
import org.cruxframework.mediamanager.core.reuse.IRestService;
import org.cruxframework.mediamanager.core.reuse.AbstractEntity;

/**
 * Class description: 
 * @author alexandre.costa
 */
@RestService("mediaService")
@Path("media")
public interface MediaRestService extends IRestService<MediaDTO, AbstractEntity<MediaDTO>>
{
	@GET
	@Path("search")
	public List<MediaDTO> search(
		@QueryParam("type") MediaType type, 
		@QueryParam("name") String name, 
		@QueryParam("person")String person) throws RestException;

}
