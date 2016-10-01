package it.albertus.jface.preference.field;

import it.albertus.jface.JFaceMessages;
import it.albertus.jface.TextFormatter;
import it.albertus.util.Localized;

import java.io.File;

import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;

public class EnhancedDirectoryFieldEditor extends DirectoryFieldEditor implements FieldEditorDefault {

	public static final int MAX_PATH = 255;

	private boolean localized; // Do not set any value here!

	private File filterPath = null;
	private Localized dialogMessage;

	private boolean defaultToolTip = true;
	private boolean boldCustomValues = true;

	public EnhancedDirectoryFieldEditor(final String name, final String labelText, final Composite parent) {
		super(name, labelText, parent);
		setErrorMessage(JFaceMessages.get("err.preferences.directory"));
		setTextLimit(MAX_PATH);
	}

	@Override
	protected Button getChangeControl(final Composite parent) {
		final Button browseButton = super.getChangeControl(parent);
		if (!localized) {
			browseButton.setText(JFaceMessages.get("lbl.button.browse"));
			localized = true;
		}
		return browseButton;
	}

	@Override
	protected void doLoad() {
		super.doLoad();
		setToolTipText();
		updateFontStyle();
	}

	@Override
	protected void valueChanged() {
		super.valueChanged();
		updateFontStyle();
	}

	@Override
	protected String changePressed() {
		File f = new File(getTextControl().getText());
		if (!f.exists()) {
			f = null;
		}
		File d = getDirectory(f);
		if (d == null) {
			return null;
		}
		return d.getAbsolutePath();
	}

	@Override
	public void setFilterPath(final File filterPath) {
		super.setFilterPath(filterPath);
		this.filterPath = filterPath;
	}

	public File getFilterPath() {
		return filterPath;
	}

	protected String getDefaultValue() {
		return getPreferenceStore().getDefaultString(getPreferenceName());
	}

	protected void setToolTipText() {
		if (defaultToolTip) {
			final String defaultValue = getDefaultValue();
			if (getTextControl() != null && !getTextControl().isDisposed() && defaultValue != null && !defaultValue.isEmpty()) {
				getTextControl().setToolTipText(JFaceMessages.get("lbl.preferences.default.value", defaultValue));
			}
		}
	}

	protected void updateFontStyle() {
		if (boldCustomValues) {
			final String defaultValue = getDefaultValue();
			if (defaultValue != null && !defaultValue.isEmpty()) {
				TextFormatter.updateFontStyle(getTextControl(), defaultValue);
			}
		}
	}

	protected File getDirectory(final File startingDirectory) {
		final DirectoryDialog fileDialog = new DirectoryDialog(getShell(), SWT.OPEN | SWT.SHEET);
		if (dialogMessage != null && dialogMessage.getString() != null) {
			fileDialog.setMessage(dialogMessage.getString());
		}
		if (startingDirectory != null) {
			fileDialog.setFilterPath(startingDirectory.getPath());
		}
		else if (filterPath != null) {
			fileDialog.setFilterPath(filterPath.getPath());
		}
		String dir = fileDialog.open();
		if (dir != null) {
			dir = dir.trim();
			if (dir.length() > 0) {
				return new File(dir);
			}
		}
		return null;
	}

	public Localized getDialogMessage() {
		return dialogMessage;
	}

	public void setDialogMessage(final Localized dialogMessage) {
		this.dialogMessage = dialogMessage;
	}

	@Override
	public boolean isDefaultToolTip() {
		return defaultToolTip;
	}

	@Override
	public void setDefaultToolTip(final boolean defaultToolTip) {
		this.defaultToolTip = defaultToolTip;
	}

	@Override
	public boolean isBoldCustomValues() {
		return boldCustomValues;
	}

	@Override
	public void setBoldCustomValues(final boolean boldCustomValues) {
		this.boldCustomValues = boldCustomValues;
	}

}