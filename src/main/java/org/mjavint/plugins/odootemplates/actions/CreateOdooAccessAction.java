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
import org.mjavint.plugins.odootemplates.OdooIcons;

public class CreateOdooAccessAction extends CreateFileFromTemplateAction implements DumbAware {

    @NonNls
    private static final String DEFAULT_ODOO_ACCESS_TEMPLATE_PROPERTY = "DefaultOdooAccessFileTemplate";

    public CreateOdooAccessAction() {
        super("Odoo Access File", "Creates an Odoo Access CSV file from the specified template", PythonFileType.INSTANCE.getIcon());
    }

    @Override
    protected String getDefaultTemplateProperty() {
        return DEFAULT_ODOO_ACCESS_TEMPLATE_PROPERTY;
    }

    @Override
    protected void buildDialog(@NotNull Project project, @NotNull PsiDirectory directory, CreateFileFromTemplateDialog.Builder builder) {
        builder
                .setDefaultText("ir.model.access.csv")
                .setTitle("New Odoo Access File (Name It 'ir.model.access.csv')")
                .addKind("ir.model.access.csv file", OdooIcons.CsvIcon, "OdooAccess");
    }

    @Override
    protected String getActionName(PsiDirectory directory, @NotNull String newName, String templateName) {
        return "Create Odoo Access " + newName;
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
        return obj instanceof CreateOdooAccessAction;
    }
}