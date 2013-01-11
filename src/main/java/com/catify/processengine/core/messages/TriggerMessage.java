/**
 * -------------------------------------------------------
 * Copyright (C) 2013 catify <info@catify.com>
 * -------------------------------------------------------
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
package com.catify.processengine.core.messages;

/**
 * The trigger message is a signal to a process instance on a given node that
 * triggers further actions based on the implemented message reaction. Trigger
 * messages are usually generated by services (eg. message integration) and used
 * by catching events.
 * 
 * @author chris
 * 
 */
public class TriggerMessage extends Message {

	private static final long serialVersionUID = 1L;
	
	/** The payload. */
	private Object payload;

	/**
	 * Instantiates a new trigger message.
	 */
	public TriggerMessage() {
	}
	
	/**
	 * Instantiates a new trigger message.
	 *
	 * @param processInstanceId the process instance id
	 * @param data the data
	 */
	public TriggerMessage(String processInstanceId, Object data) {
		this.processInstanceId = processInstanceId;
		this.payload = data;
	}

	/**
	 * Gets the payload.
	 *
	 * @return the payload
	 */
	public Object getPayload() {
		return payload;
	}

	/**
	 * Sets the payload.
	 *
	 * @param payload the new payload
	 */
	public void setPayload(Object payload) {
		this.payload = payload;
	}
}
