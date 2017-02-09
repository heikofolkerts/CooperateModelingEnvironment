package de.cooperateproject.ui.focus.connection;

import org.apache.activemq.ActiveMQConnection;
import org.eclipse.core.resources.IFile;

import java.net.URISyntaxException;

import javax.jms.JMSException;
import javax.jms.TopicConnection;

public class ConnectionManager{
	
	private static ConnectionManager instance = null;
	private IFile currentFile = null;
	private final String address = "tcp://localhost:61616";
	private TopicConnection connection = null;
	
	public static ConnectionManager getInstance(){
		if(instance == null){
			instance = new ConnectionManager();
		}
		return instance;
	}

	public void connect(IFile file){
		
		try {
			if(currentFile == null){
				connection = ActiveMQConnection.makeConnection(address);
				SubscriberManager.getInstance().initialize(connection, file.getName());
				SubscriberManager.getInstance().subscribe();
				connection.start();
			}else if(currentFile != file){
				SubscriberManager.getInstance().unsubscribe();
				SubscriberManager.getInstance().initialize(connection, file.getName());
				SubscriberManager.getInstance().subscribe();
			}
		} catch (JMSException | URISyntaxException e) {
				e.printStackTrace();	
		 	}
		
		currentFile = file;
		
	}
	
	public void disconnect(){
		currentFile = null;
		if(connection != null){
			try {
				SubscriberManager.getInstance().disconnect();
				connection.close();
			} catch (JMSException e) {
				e.printStackTrace();
			}
		}
	}
	
	public IFile getFile(){
		return currentFile;
	}

}