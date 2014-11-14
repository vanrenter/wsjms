package org.jhe.jms.client;

import javax.jms.Connection;
import javax.jms.JMSContext;
import javax.jms.JMSException;


public class ConnectionFactory implements javax.jms.ConnectionFactory {

	@Override
	public Connection createConnection() throws JMSException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Connection createConnection(String arg0, String arg1)
			throws JMSException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JMSContext createContext() {
		return new org.jhe.jms.client.JMSContext();
	}

	@Override
	public JMSContext createContext(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JMSContext createContext(String arg0, String arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JMSContext createContext(String arg0, String arg1, int arg2) {
		// TODO Auto-generated method stub
		return null;
	}

}
