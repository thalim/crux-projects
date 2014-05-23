package org.cruxframework.crossdeviceshowcase.client.controller.samples.messagebox;

import org.cruxframework.crux.core.client.controller.Controller;
import org.cruxframework.crux.core.client.controller.Expose;
import org.cruxframework.crux.widgets.client.dialog.FlatMessageBox;
import org.cruxframework.crux.widgets.client.dialog.FlatMessageBox.MessageType;

@Controller("messageBoxController")
public class MessageBoxController 
{
	
	private String MESSAGE_TYPE = "This is a message from kind: ";
	
	@Expose
	public void showInfo()
	{
		showMessage(MessageType.INFO);
	}
	
	@Expose
	public void showSuccess()
	{
		showMessage(MessageType.SUCCESS);
	}
	
	@Expose
	public void showWarn()
	{
		showMessage(MessageType.WARN);
	}
	
	@Expose
	public void showError()
	{
		showMessage(MessageType.ERROR);
	}
	
	private void showMessage(MessageType type)
	{
		FlatMessageBox.show(MESSAGE_TYPE + type.name(), type);
	}
}
