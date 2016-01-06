/**
 * Copyright 2016 Novartis Institutes for BioMedical Research Inc.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.novartis.opensource.yada.adaptor;

import org.apache.log4j.Logger;

import com.novartis.opensource.yada.YADARequest;

/**
 * For connecting to MySQL databases via JDBC.
 * 
 * @author David Varon
 * @since 0.3.0.0
 */
public class MySQLAdaptor extends JDBCAdaptor {
	
	/**
   * Local logger handle
   */
	private static Logger l = Logger.getLogger(MySQLAdaptor.class);
	
	/**
	 * Default subclass constructor (calls {@code super()}
	 */
	public MySQLAdaptor() {
		super();
		l.debug("Initializing");
	}
	
	/**
	 * Subclass constructor, calls {@code super(yadaReq)}
	 * @param yadaReq YADA request configuration
	 */
	public MySQLAdaptor(YADARequest yadaReq)
	{
		super(yadaReq);
	}
}
