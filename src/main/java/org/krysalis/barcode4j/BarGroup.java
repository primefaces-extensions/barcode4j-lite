/*
 * Copyright 2002-2004 Jeremias Maerki.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.krysalis.barcode4j;

import java.util.Map;

/**
 * Enumeration type for bar groups.
 *
 * @author Jeremias Maerki
 * @version $Id: BarGroup.java,v 1.3 2004-10-02 14:53:22 jmaerki Exp $
 */
public class BarGroup {

    public static final Map<String, BarGroup> MAP = new java.util.HashMap<>();

    /**
     * Bar group is represents a start character
     */
    public static final BarGroup START_CHARACTER = new BarGroup("start-char");
    /**
     * Bar group is represents a stop character
     */
    public static final BarGroup STOP_CHARACTER = new BarGroup("stop-char");
    /**
     * Bar group is represents a message character or a part of the message
     */
    public static final BarGroup MSG_CHARACTER = new BarGroup("msg-char");
    /**
     * Bar group is represents a UPC/EAN guard
     */
    public static final BarGroup UPC_EAN_GUARD = new BarGroup("upc-ean-guard");
    /**
     * Bar group is represents a UPC/EAN lead
     */
    public static final BarGroup UPC_EAN_LEAD = new BarGroup("upc-ean-lead");
    /**
     * Bar group is represents a UPC/EAN character group
     */
    public static final BarGroup UPC_EAN_GROUP = new BarGroup("upc-ean-group");
    /**
     * Bar group is represents a UPC/EAN check character
     */
    public static final BarGroup UPC_EAN_CHECK = new BarGroup("upc-ean-check");
    /**
     * Bar group is represents a UPC/EAN supplemental
     */
    public static final BarGroup UPC_EAN_SUPP = new BarGroup("upc-ean-supp");

    private final String name;

    /**
     * Creates a new BarGroup instance.
     *
     * @param name name of the BarGroup
     */
    protected BarGroup(String name) {
        this.name = name;
        MAP.put(name, this);
    }

    /**
     * Returns a BarGroup instance by name.
     *
     * @param name the name of the desired BarGroup
     * @return the requested BarGroup instance
     */
    public static BarGroup byName(String name) {
        final BarGroup bg = MAP.get(name);
        if (bg == null) {
            throw new IllegalArgumentException("Invalid BarGroup: " + name);
        }
        return bg;
    }

    /**
     * @return the name of the instance.
     */
    public String getName() {
        return this.name;
    }

}
