package org.mjavint.plugins.odootemplates.templates;

import com.intellij.codeInsight.template.TemplateActionContext;
import com.intellij.codeInsight.template.TemplateContextType;
import org.jetbrains.annotations.NotNull;

public class OdooPythonContext extends TemplateContextType {

    protected OdooPythonContext() {
        super("Python", "Python");
    }

    @Override
    public boolean isInContext(@NotNull TemplateActionContext templateActionContext) {
        return templateActionContext.getFile().getName().endsWith(".py");
    }
}
