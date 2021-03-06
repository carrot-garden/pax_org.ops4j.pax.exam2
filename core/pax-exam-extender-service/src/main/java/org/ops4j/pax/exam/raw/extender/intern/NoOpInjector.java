/*
 * Copyright 2011 Harald Wellmann.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ops4j.pax.exam.raw.extender.intern;

import org.ops4j.pax.exam.util.Injector;
import org.osgi.framework.BundleContext;

/**
 * A no-op injector to be used when service injection is not required.
 * 
 * @author Harald Wellmann
 * @since 2.3.0, August 2011
 */
public class NoOpInjector implements Injector
{

    public void injectFields( BundleContext bc, Object target )
    {
        // empty
    }
}
