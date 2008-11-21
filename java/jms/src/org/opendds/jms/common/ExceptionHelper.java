/*
 * $
 */

package org.opendds.jms.common;

import javax.jms.JMSException;

import org.opendds.jms.resource.ManagedConnectionImpl;

/**
 * @author Steven Stallion
 * @version $Revision$
 */
public class ExceptionHelper {

    public static JMSException notify(ManagedConnectionImpl connection, Exception cause) {
        connection.notifyError(cause);

        if (cause instanceof JMSException) {
            return (JMSException) cause;

        } else {
            return wrap(cause);
        }
    }

    public static JMSException wrap(Exception cause) {
        JMSException e = new JMSException(cause.getMessage());
        e.setLinkedException(cause);
        return e;
    }

    //

    private ExceptionHelper() {}
}
