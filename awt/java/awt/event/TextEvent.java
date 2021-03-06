/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
/**
 * @author Michael Danilov
 * @version $Revision$
 */
package java.awt.event;

import java.awt.AWTEvent;

/**
 * This class is not supported in Android 1.0. It is merely provided to maintain
 * interface compatibility with desktop Java implementations.
 * 
 * @since Android 1.0
 */
public class TextEvent extends AWTEvent {

    private static final long serialVersionUID = 6269902291250941179L;

    public static final int TEXT_FIRST = 900;

    public static final int TEXT_LAST = 900;

    public static final int TEXT_VALUE_CHANGED = 900;

    public TextEvent(Object src, int id) {
        super(src, id);
    }

    @Override
    public String paramString() {
        /* The format is based on 1.5 release behavior 
         * which can be revealed by the following code:
         * 
         * TextEvent e = new TextEvent(new Component(){}, 
         *          TextEvent.TEXT_VALUE_CHANGED); 
         * System.out.println(e);
         */

        return (id == TEXT_VALUE_CHANGED) ? 
                "TEXT_VALUE_CHANGED" : "unknown type"; //$NON-NLS-1$ //$NON-NLS-2$
    }

}
