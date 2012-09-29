/*
 * Copyright 2012 Harald Wellmann
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
package org.ops4j.pax.exam.regression.multi.inject;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assume.assumeThat;
import static org.ops4j.pax.exam.regression.multi.RegressionConfiguration.isPaxRunnerContainer;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

/**
 * Check that tests get invoked once per configuration.
 * 
 * Regression test for PAXEXAM-427.
 * 
 * @author Harald Wellmann
 */
public class MultiConfigurationInvokerTest
{
    @Test
    public void invokeMultiConfigurationTest()
    {
        assumeThat( isPaxRunnerContainer(), is(false) );

        JUnitCore junit = new JUnitCore();
        Result result = junit.run( MultiConfigurationTest.class );
        assertThat( result.getRunCount(), is( ( 2 ) ) );
        assertThat( result.getFailureCount(), is( ( 0 ) ) );
    }
}
