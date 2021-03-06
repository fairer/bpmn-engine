/**
 * *******************************************************
 * Copyright (C) 2013 catify <info@catify.com>
 * *******************************************************
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * 
 */
package com.catify.processengine.core.data.services;

import org.springframework.stereotype.Component;

import com.catify.processengine.core.data.model.entities.FlowNode;
import com.catify.processengine.core.data.model.entities.RootNode;

/**
 * The Interface RootNodeRepositoryService.
 *
 * @author christopher köster
 * 
 */
@Component
public interface RootNodeRepositoryService {

	/**
	 * Find a flow node by flow node id.
	 * 
	 * @param uniqueRootId
	 *            the flow node id
	 * @return the flow node
	 */
	RootNode findByUniqueRootId(String uniqueRootNodeId);

	/**
	 * delete a flow node by id.
	 * 
	 * @param uniqueRootId
	 *            the flow node id
	 * @return true, if successful, false if no process with given id found
	 */
	boolean delete(String uniqueRootNodeId);

	/**
	 * Save a process to the database.
	 * 
	 * @param flowNode
	 *            the flow node
	 * @return the process
	 */
	RootNode save(RootNode rootNode);

	/**
	 * Save flow node or retrieve it from the db if it already exists.
	 * 
	 * @param flowNodeJaxb
	 *            the jaxb flow node
	 * @return {@link FlowNode}
	 */
	RootNode getOrCreateRootNode(String uniqueRootNodeId);
	
}
