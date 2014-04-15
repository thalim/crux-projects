package org.cruxframework.cruxdevtools.crudgenerator.templates;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.cruxframework.crux.core.client.formatter.Formatter;
import org.cruxframework.crux.core.client.formatter.InvalidFormatException;
import org.cruxframework.crux.core.client.formatter.annotation.FormatterName;
import org.cruxframework.cruxdevtools.crudgenerator.Template;
import org.cruxframework.cruxdevtools.crudgenerator.metadata.EntityMetadata;

public class BooleanFormatterTemplate extends Template
{
	protected final String packageName;
	protected final String formatterName;
	protected List<String> imports = new ArrayList<String>();

	public BooleanFormatterTemplate(EntityMetadata entity, File outputDir, String packageName, String formatterName)
	{
		super(entity, outputDir);
		this.packageName = packageName;
		this.formatterName = formatterName;

	}

	@Override
	protected File getOutputFile()
	{
		return new File(getOutputDir()+"/"+packageName.replace('.', '/'), formatterName+".java");
	}

	@Override
	protected String getTemplateFile()
	{
		return "/"+BooleanFormatterTemplate.class.getPackage().getName().replace('.', '/')+"/boolean-formatter-template.vm";
	}

	@Override
	protected Map<String, Object> getContextMap()
	{
		imports.add(Formatter.class.getCanonicalName());
		imports.add(InvalidFormatException.class.getCanonicalName());
		imports.add(FormatterName.class.getCanonicalName());
		
		Map<String, Object> contextMap = new HashMap<String, Object>();

		contextMap.put("imports", imports);
		contextMap.put("packageName", packageName);
		
		return contextMap;
	}

}
