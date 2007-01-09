/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.jackrabbit.name;

import javax.jcr.NamespaceException;

/**
 * Resolver for JCR paths.
 */
public interface PathResolver {

    /**
     * Returns the qualified path for the given prefixed JCR path.
     *
     * @param path prefixed JCR path
     * @return qualified path
     * @throws NameException if the JCR path format is invalid
     * @throws NamespaceException if a namespace prefix can not be resolved
     */
    Path getQPath(String path) throws NameException, NamespaceException;

    /**
     * Returns the prefixed JCR path for the given qualified path.
     *
     * @param path qualified path
     * @return prefixed JCR path
     * @throws NamespaceException if a namespace URI can not be resolved
     */
    String getJCRPath(Path path) throws NamespaceException;

}
