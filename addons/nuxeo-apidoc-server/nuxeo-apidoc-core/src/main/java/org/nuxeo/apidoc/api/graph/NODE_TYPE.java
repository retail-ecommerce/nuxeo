/*
 * (C) Copyright 2020 Nuxeo (http://nuxeo.com/) and others.
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
 *
 * Contributors:
 *     Anahide Tchertchian
 */
package org.nuxeo.apidoc.api.graph;

import org.apache.commons.lang3.StringUtils;

/**
 * @since 11.1
 */
public enum NODE_TYPE {

    BUNDLE(0), COMPONENT(1), SERVICE(2), EXTENSION_POINT(3), CONTRIBUTION(4), OPERATION(5), SEAMCOMPONENT(6);

    private NODE_TYPE(int index) {
        this.index = index;
    }

    private int index;

    public String toString() {
        return name();
    }

    public String getLabel() {
        return StringUtils.capitalize(name().toLowerCase());
    }

    public int getIndex() {
        return index;
    }

}