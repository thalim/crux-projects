package org.cruxframework.crossdeviceshowcase.client.controller.samples;

import org.cruxframework.crux.core.client.i18n.MessageName;

import com.google.gwt.i18n.client.Messages;

@MessageName("messages_showcase")
public interface ShowcaseMessages extends Messages
{
	@DefaultMessage("Bem vindo")
	String shortWelcome();
	
	@DefaultMessage("Site")
	String site();
	
	@DefaultMessage("Projeto")
	String project();
	
	@DefaultMessage("Welcome to Crux 5 Showcase!")
	String welcome();
	
	@DefaultMessage("O Crux Framework 5 provê uma série de componentes cross-device para aplicações Web."
			+ "Neste showcase são apresentados exemplos de uso dos componentes oferecidos pelo Crux.") 
	String info1();
	
	@DefaultMessage("Em cada exemplo é apresentado o componente, como é o seu funcionamento e sua apresentação na tela."
			+ "Também está disponível para consulta o código fonte de cada exemplo.")
	String info2();
	
	@DefaultMessage("Este site está em construção, a cada dia novos exemplos são elaborados e adicionados ao showcase.")
	String info3();
	
	@DefaultMessage("Elementos de Formulário")
	String formElements();
	
	@DefaultMessage("File Uploader")
	String fileUploader();
	
	@DefaultMessage("Masked Label")
	String maskedLabel();
	
	@DefaultMessage("Masked Text Box")
	String maskedTextbox();
	
	@DefaultMessage("Button")
	String button();
	
	@DefaultMessage("Textbox")
	String textBox();
	
	@DefaultMessage("Textarea")
	String textArea();
	
	@DefaultMessage("Datebox")
	String dateBox();
	
	@DefaultMessage("Elementos de Layout")
	String layoutElements();
	
	@DefaultMessage("Styled Panel")
	String styledPanel();
	
	@DefaultMessage("Form Display")
	String formDisplay();
	
	@DefaultMessage("Caixas de Diálogo")
	String dialogBoxes();
	
	@DefaultMessage("Progress Box")
	String progressBox();
	
	@DefaultMessage("Dialog Box")
	String dialogBox();
	
	@DefaultMessage("Message Box")
	String messageBox();
	
	@DefaultMessage("Elementos de Dados")
	String dataElements();
	
	@DefaultMessage("Device Adaptive Grid")
	String deviceAdaptiveGrid();
	
	@DefaultMessage("Elementos de Imagens")
	String imageElements();
	
	@DefaultMessage("PromoBanner")
	String promoBanner();
	
	@DefaultMessage("Slide Show")
	String slideShow();
	
	@DefaultMessage("Story Board")
	String storyBoard();
	
	@DefaultMessage("Elementos de Informação")
	String infoElements();
	
	@DefaultMessage("Scroll Banner")
	String scrollBanner();

	@DefaultMessage("Database não suportada")
	String databaseNotSupportedError();
}