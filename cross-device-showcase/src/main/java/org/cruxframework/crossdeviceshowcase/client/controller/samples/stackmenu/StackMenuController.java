package org.cruxframework.crossdeviceshowcase.client.controller.samples.stackmenu;

import org.cruxframework.crux.core.client.controller.Controller;
import org.cruxframework.crux.core.client.controller.Expose;
import org.cruxframework.crux.core.client.ioc.Inject;
import org.cruxframework.crux.core.client.screen.views.BindView;
import org.cruxframework.crux.core.client.screen.views.WidgetAccessor;
import org.cruxframework.crux.widgets.client.dialog.FlatMessageBox;
import org.cruxframework.crux.widgets.client.dialog.FlatMessageBox.MessageType;
import org.cruxframework.crux.widgets.client.stackmenu.StackMenu;
import org.cruxframework.crux.widgets.client.stackmenu.StackMenuItem;

import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.user.client.ui.TextBox;

@Controller("stackMenuController")
public class StackMenuController 
{
	@Inject
	private MyWidgetAccessor myWidgetAccessor;

	@Inject
	private StackMenuMessages messages;

	@Expose
	public void onLoad()
	{	
		loadItems();
	}	

	private void loadItems()
	{
		for (StackMenuItem listParentItems : myWidgetAccessor.menu().getItems())
		{
			if(listParentItems.getLabel().equals("DVD"))
			{
				listParentItems.add(new StackMenuItem("romance","Romance"));
				listParentItems.add(new StackMenuItem("terror","Terror"));
				for(StackMenuItem listItems : listParentItems.getSubItems())
				{
					if (listItems.getLabel().equals("Romance"))
					{
						listItems.add(new StackMenuItem("orgulhoEPreconceito","Orgulho e Preconceito"));
						listItems.add(new StackMenuItem("titanic","Titanic"));
					}
					else if(listItems.getLabel().equals("Terror"))
					{
						listItems.add(new StackMenuItem("constantine","Constantine"));
						listItems.add(new StackMenuItem("aOrfa","A Órfã"));
					}
				}
			}
		}
	}

	@Expose
	public void selectedItem(SelectionEvent<StackMenuItem> evt)
	{
		StackMenuItem item = evt.getSelectedItem();
		String nameItem = item.getLabel();
		String nameParentItem = item.getParentItem().getLabel();

		if (nameParentItem == null || nameParentItem.equals(""))
		{
			FlatMessageBox.show(messages.info()+nameItem, MessageType.INFO);
		}
		else
		{
			FlatMessageBox.show(messages.info()+nameItem+" "+messages.complementInfo()+" "+nameParentItem, MessageType.INFO);
		}	
	}

	@Expose
	public void addItemMenu()
	{
		String label = myWidgetAccessor.textBoxItem().getText();
		String key = myWidgetAccessor.textBoxItem().getText();
		if(label == null || label.equals(""))
		{
			FlatMessageBox.show(messages.errorAdd(), MessageType.ERROR);
		}
		else
		{
			StackMenuItem addItem = new StackMenuItem(key,label);
			myWidgetAccessor.menu().add(addItem);
		}
	}

	@Expose
	public void removeItemMenu()
	{
		String label = myWidgetAccessor.textBoxItem().getText();

		for (StackMenuItem listParentItems : myWidgetAccessor.menu().getItems())
		{
			if(listParentItems.getLabel().equals(label))
			{
				listParentItems.removeFromParent();
			}		

			for (StackMenuItem listItems : listParentItems.getSubItems())
			{
				if (listItems.getLabel().equals(label))
				{
					listItems.removeFromParent();
				}

				for (StackMenuItem listSubitems : listItems.getSubItems())
				{
					if (listSubitems.getLabel().equals(label))
					{
						listSubitems.removeFromParent();
					}
				}
			}
		}
	}

	@BindView("stackMenu")
	public static interface MyWidgetAccessor extends WidgetAccessor
	{
		StackMenu menu();
		TextBox textBoxItem();
	}

	public void setMyWidgetAccessor(MyWidgetAccessor myWidgetAccessor) 
	{
		this.myWidgetAccessor = myWidgetAccessor;
	}

	public void setMessages(StackMenuMessages messages) {
		this.messages = messages;
	}
}