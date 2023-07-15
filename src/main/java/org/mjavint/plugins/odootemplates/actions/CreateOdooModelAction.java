package org.mjavint.plugins.odootemplates.actions;

import com.intellij.ide.IdeBundle;
import com.intellij.ide.actions.CreateFileFromTemplateAction;
import com.intellij.ide.actions.CreateFileFromTemplateDialog;
import com.intellij.openapi.project.DumbAware;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiDirectory;
import com.jetbrains.python.PythonFileType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class CreateOdooModelAction extends CreateFileFromTemplateAction implements DumbAware {

    @NonNls
    private static final String DEFAULT_ODOO_MODEL_TEMPLATE_PROPERTY = "DefaultOdooModelFileTemplate";


    public CreateOdooModelAction() {
        super("Odoo Model File", "Creates an Odoo Model Python file from the specified template", PythonFileType.INSTANCE.getIcon());
    }

    @Override
    protected String getDefaultTemplateProperty() {
        return DEFAULT_ODOO_MODEL_TEMPLATE_PROPERTY;
    }

    @Override
    protected void buildDialog(@NotNull Project project, @NotNull PsiDirectory directory, CreateFileFromTemplateDialog.Builder builder) {
        builder
                .setTitle("New Odoo Model File")
                .addKind("Odoo model", PythonFileType.INSTANCE.getIcon(), "OdooModel")
                .addKind("Odoo controller", PythonFileType.INSTANCE.getIcon(), "OdooController");
    }

    @Override
    protected String getActionName(PsiDirectory directory, @NotNull String newName, String templateName) {
        return "Create Odoo Model script " + newName;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @NotNull
    @Override
    protected String getErrorTitle() {
        return IdeBundle.message("title.cannot.create.class");
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof CreateOdooModelAction;
    }
}