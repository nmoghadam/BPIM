/*
 * Copyright 2015 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

package org.jbpm.persistence;

import org.drools.persistence.map.MapPersistenceContextManager;

public class MapProcessPersistenceContextManager extends MapPersistenceContextManager
    implements
    ProcessPersistenceContextManager {

    private ProcessPersistenceContext persistenceContext;

    public MapProcessPersistenceContextManager(ProcessPersistenceContext persistenceContext) {
        super( persistenceContext );
        this.persistenceContext = persistenceContext;
    }

    public ProcessPersistenceContext getProcessPersistenceContext() {
        return persistenceContext;
    }

}
