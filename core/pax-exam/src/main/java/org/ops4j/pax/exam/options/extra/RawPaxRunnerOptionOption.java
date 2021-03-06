package org.ops4j.pax.exam.options.extra;

import org.ops4j.pax.exam.Option;

/**
 * @deprecated Only supported by Pax Runner Container which will be removed in Pax Exam 3.0.
 * @author Toni Menzel (tonit)
 * @since Apr 21, 2009
 */
@Deprecated
public class RawPaxRunnerOptionOption implements Option
{

    private String m_option;

    public RawPaxRunnerOptionOption( String key, String value )
    {
        if( !key.startsWith( "--" ) )
        {
            key = "--" + key;
        }
        m_option = key + "=" + value;
    }

    public RawPaxRunnerOptionOption( String option )
    {
        if( !option.startsWith( "--" ) )
        {
            m_option = "--" + option;
        }
        else
        {
            m_option = option;
        }
    }

    public String getOption()
    {
        return m_option;
    }
}
