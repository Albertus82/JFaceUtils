package it.albertus.jface.preference;

import it.albertus.jface.JFaceMessages;
import it.albertus.jface.preference.field.BigDecimalComboFieldEditor;
import it.albertus.jface.preference.field.BigDecimalFieldEditor;
import it.albertus.jface.preference.field.BigIntegerComboFieldEditor;
import it.albertus.jface.preference.field.BigIntegerFieldEditor;
import it.albertus.jface.preference.field.DateFieldEditor;
import it.albertus.jface.preference.field.DefaultBigDecimalFieldEditor;
import it.albertus.jface.preference.field.DefaultBigIntegerFieldEditor;
import it.albertus.jface.preference.field.DefaultBooleanFieldEditor;
import it.albertus.jface.preference.field.DefaultComboFieldEditor;
import it.albertus.jface.preference.field.DefaultDateFieldEditor;
import it.albertus.jface.preference.field.DefaultDirectoryFieldEditor;
import it.albertus.jface.preference.field.DefaultDoubleFieldEditor;
import it.albertus.jface.preference.field.DefaultFileFieldEditor;
import it.albertus.jface.preference.field.DefaultFloatFieldEditor;
import it.albertus.jface.preference.field.DefaultIntegerFieldEditor;
import it.albertus.jface.preference.field.DefaultLongFieldEditor;
import it.albertus.jface.preference.field.DefaultRadioGroupFieldEditor;
import it.albertus.jface.preference.field.DefaultStringFieldEditor;
import it.albertus.jface.preference.field.DelimiterComboFieldEditor;
import it.albertus.jface.preference.field.DoubleComboFieldEditor;
import it.albertus.jface.preference.field.DoubleFieldEditor;
import it.albertus.jface.preference.field.EditableComboFieldEditor;
import it.albertus.jface.preference.field.EmailAddressesListEditor;
import it.albertus.jface.preference.field.FloatComboFieldEditor;
import it.albertus.jface.preference.field.FloatFieldEditor;
import it.albertus.jface.preference.field.IntegerComboFieldEditor;
import it.albertus.jface.preference.field.LocalizedPathEditor;
import it.albertus.jface.preference.field.LongComboFieldEditor;
import it.albertus.jface.preference.field.LongFieldEditor;
import it.albertus.jface.preference.field.PasswordFieldEditor;
import it.albertus.jface.preference.field.ScaleIntegerFieldEditor;
import it.albertus.jface.preference.field.UriListEditor;
import it.albertus.jface.preference.field.ValidatedComboFieldEditor;
import it.albertus.jface.preference.field.WrapStringFieldEditor;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.preference.FontFieldEditor;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.jface.preference.PathEditor;
import org.eclipse.jface.preference.RadioGroupFieldEditor;
import org.eclipse.jface.preference.ScaleFieldEditor;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.swt.widgets.Composite;

public class FieldEditorFactory {

	public FieldEditor createFieldEditor(final String name, final String label, final Composite parent, final FieldEditorDetails details) {
		final Class<? extends FieldEditor> type = details.getFieldEditorClass();

		if (BigIntegerComboFieldEditor.class.equals(type)) {
			return createBigIntegerComboFieldEditor(name, label, parent, details);
		}
		if (BigDecimalComboFieldEditor.class.equals(type)) {
			return createBigDecimalComboFieldEditor(name, label, parent, details);
		}
		if (BigDecimalFieldEditor.class.equals(type)) {
			return createBigDecimalFieldEditor(name, label, parent, details);
		}
		if (BigIntegerFieldEditor.class.equals(type)) {
			return createBigIntegerFieldEditor(name, label, parent, details);
		}
		if (BooleanFieldEditor.class.equals(type)) {
			return new BooleanFieldEditor(name, label, parent);
		}
		if (ColorFieldEditor.class.equals(type)) {
			return new ColorFieldEditor(name, label, parent);
		}
		if (org.eclipse.jface.preference.ComboFieldEditor.class.equals(type)) {
			return new org.eclipse.jface.preference.ComboFieldEditor(name, label, details.getLabelsAndValues().toArray(), parent);
		}
		if (it.albertus.jface.preference.field.ComboFieldEditor.class.equals(type)) {
			return new it.albertus.jface.preference.field.ComboFieldEditor(name, label, details.getLabelsAndValues().toArray(), parent);
		}
		if (DateFieldEditor.class.equals(type)) {
			return createDateFieldEditor(name, label, parent, details);
		}
		if (DefaultBigDecimalFieldEditor.class.equals(type)) {
			return createDefaultBigDecimalFieldEditor(name, label, parent, details);
		}
		if (DefaultBigIntegerFieldEditor.class.equals(type)) {
			return createDefaultBigIntegerFieldEditor(name, label, parent, details);
		}
		if (DefaultBooleanFieldEditor.class.equals(type)) {
			return new DefaultBooleanFieldEditor(name, label, parent);
		}
		if (DefaultComboFieldEditor.class.equals(type)) {
			return new DefaultComboFieldEditor(name, label, details.getLabelsAndValues().toArray(), parent);
		}
		if (DefaultDateFieldEditor.class.equals(type)) {
			return createDefaultDateFieldEditor(name, label, parent, details);
		}
		if (DefaultDirectoryFieldEditor.class.equals(type)) {
			return createDefaultDirectoryFieldEditor(name, label, parent, details);
		}
		if (DefaultDoubleFieldEditor.class.equals(type)) {
			return createDefaultDoubleFieldEditor(name, label, parent, details);
		}
		if (DefaultFileFieldEditor.class.equals(type)) {
			return createDefaultFileFieldEditor(name, label, parent, details);
		}
		if (DefaultFloatFieldEditor.class.equals(type)) {
			return createDefaultFloatFieldEditor(name, label, parent, details);
		}
		if (DefaultIntegerFieldEditor.class.equals(type)) {
			return createDefaultIntegerFieldEditor(name, label, parent, details);
		}
		if (DefaultLongFieldEditor.class.equals(type)) {
			return createDefaultLongFieldEditor(name, label, parent, details);
		}
		if (DefaultRadioGroupFieldEditor.class.equals(type)) {
			return createDefaultRadioGroupFieldEditor(name, label, parent, details);
		}
		if (DefaultStringFieldEditor.class.equals(type)) {
			return createDefaultStringFieldEditor(name, label, parent, details);
		}
		if (DelimiterComboFieldEditor.class.equals(type)) {
			return createDelimiterComboFieldEditor(name, label, parent, details);
		}
		if (DirectoryFieldEditor.class.equals(type)) {
			return createDirectoryFieldEditor(name, label, parent, details);
		}
		if (DoubleComboFieldEditor.class.equals(type)) {
			return createDoubleComboFieldEditor(name, label, parent, details);
		}
		if (DoubleFieldEditor.class.equals(type)) {
			return createDoubleFieldEditor(name, label, parent, details);
		}
		if (EditableComboFieldEditor.class.equals(type)) {
			return new EditableComboFieldEditor(name, label, details.getLabelsAndValues().toArray(), parent);
		}
		if (EmailAddressesListEditor.class.equals(type)) {
			return createEmailAddressesListEditor(name, label, parent, details);
		}
		if (FileFieldEditor.class.equals(type)) {
			return createFileFieldEditor(name, label, parent, details);
		}
		if (FloatComboFieldEditor.class.equals(type)) {
			return createFloatComboFieldEditor(name, label, parent, details);
		}
		if (FloatFieldEditor.class.equals(type)) {
			return createFloatFieldEditor(name, label, parent, details);
		}
		if (FontFieldEditor.class.equals(type)) {
			return createFontFieldEditor(name, label, parent, details);
		}
		if (IntegerFieldEditor.class.equals(type)) {
			return createIntegerFieldEditor(name, label, parent, details);
		}
		if (IntegerComboFieldEditor.class.equals(type)) {
			return createIntegerComboFieldEditor(name, label, parent, details);
		}
		if (LocalizedPathEditor.class.equals(type)) {
			return createLocalizedPathEditor(name, label, parent, details);
		}
		if (LongComboFieldEditor.class.equals(type)) {
			return createLongComboFieldEditor(name, label, parent, details);
		}
		if (LongFieldEditor.class.equals(type)) {
			return createLongFieldEditor(name, label, parent, details);
		}
		if (PasswordFieldEditor.class.equals(type)) {
			return createPasswordFieldEditor(name, label, parent, details);
		}
		if (PathEditor.class.equals(type)) {
			return new PathEditor(name, label, details != null && details.getDirectoryDialogMessage() != null ? details.getDirectoryDialogMessage().toString() : null, parent);
		}
		if (RadioGroupFieldEditor.class.equals(type)) {
			return createRadioGroupFieldEditor(name, label, parent, details);
		}
		if (ScaleFieldEditor.class.equals(type)) {
			return createScaleFieldEditor(name, label, parent, details);
		}
		if (ScaleIntegerFieldEditor.class.equals(type)) {
			return createScaleIntegerFieldEditor(name, label, parent, details);
		}
		if (StringFieldEditor.class.equals(type)) {
			return createStringFieldEditor(name, label, parent, details);
		}
		if (UriListEditor.class.equals(type)) {
			return createUriListEditor(name, label, parent, details);
		}
		if (ValidatedComboFieldEditor.class.equals(type)) {
			return createValidatedComboFieldEditor(name, label, parent, details);
		}
		if (WrapStringFieldEditor.class.equals(type)) {
			return createWrapStringFieldEditor(name, label, parent, details);
		}
		throw new IllegalStateException("Unsupported FieldEditor: " + type);
	}

	protected BigIntegerComboFieldEditor createBigIntegerComboFieldEditor(final String name, final String label, final Composite parent, final FieldEditorDetails data) {
		final BigIntegerComboFieldEditor bigIntegerComboFieldEditor = new BigIntegerComboFieldEditor(name, label, data.getLabelsAndValues().toArray(), parent);
		if (data.getEmptyStringAllowed() != null) {
			bigIntegerComboFieldEditor.setEmptyStringAllowed(data.getEmptyStringAllowed());
		}
		bigIntegerComboFieldEditor.setMinValidValue(data.getNumberMinimum());
		bigIntegerComboFieldEditor.setMaxValidValue(data.getNumberMaximum());
		if (data.getTextLimit() != null) {
			bigIntegerComboFieldEditor.setTextLimit(data.getTextLimit());
		}
		return bigIntegerComboFieldEditor;
	}

	protected BigDecimalComboFieldEditor createBigDecimalComboFieldEditor(final String name, final String label, final Composite parent, final FieldEditorDetails data) {
		final BigDecimalComboFieldEditor bigDecimalComboFieldEditor = new BigDecimalComboFieldEditor(name, label, data.getLabelsAndValues().toArray(), parent);
		if (data.getEmptyStringAllowed() != null) {
			bigDecimalComboFieldEditor.setEmptyStringAllowed(data.getEmptyStringAllowed());
		}
		bigDecimalComboFieldEditor.setMinValidValue(data.getNumberMinimum());
		bigDecimalComboFieldEditor.setMaxValidValue(data.getNumberMaximum());
		if (data.getTextLimit() != null) {
			bigDecimalComboFieldEditor.setTextLimit(data.getTextLimit());
		}
		return bigDecimalComboFieldEditor;
	}

	protected BigDecimalFieldEditor createBigDecimalFieldEditor(final String name, final String label, final Composite parent, final FieldEditorDetails data) {
		final BigDecimalFieldEditor bigDecimalFieldEditor = new BigDecimalFieldEditor(name, label, parent);
		if (data != null) {
			if (data.getEmptyStringAllowed() != null) {
				bigDecimalFieldEditor.setEmptyStringAllowed(data.getEmptyStringAllowed());
			}
			if (data.getNumberMinimum() != null && data.getNumberMaximum() != null) {
				bigDecimalFieldEditor.setValidRange(data.getNumberMinimum(), data.getNumberMaximum());
			}
			if (data.getTextLimit() != null) {
				bigDecimalFieldEditor.setTextLimit(data.getTextLimit());
			}
		}
		return bigDecimalFieldEditor;
	}

	protected BigIntegerFieldEditor createBigIntegerFieldEditor(final String name, final String label, final Composite parent, final FieldEditorDetails data) {
		final BigIntegerFieldEditor bigDecimalFieldEditor = new BigIntegerFieldEditor(name, label, parent);
		if (data != null) {
			if (data.getEmptyStringAllowed() != null) {
				bigDecimalFieldEditor.setEmptyStringAllowed(data.getEmptyStringAllowed());
			}
			if (data.getNumberMinimum() != null && data.getNumberMaximum() != null) {
				bigDecimalFieldEditor.setValidRange(data.getNumberMinimum(), data.getNumberMaximum());
			}
			if (data.getTextLimit() != null) {
				bigDecimalFieldEditor.setTextLimit(data.getTextLimit());
			}
		}
		return bigDecimalFieldEditor;
	}

	protected DateFieldEditor createDateFieldEditor(final String name, final String label, final Composite parent, final FieldEditorDetails data) {
		final DateFieldEditor dateFieldEditor;
		if (data.getTextWidth() != null && data.getTextValidateStrategy() != null) {
			dateFieldEditor = new DateFieldEditor(name, label, data.getDatePattern(), data.getTextWidth(), data.getTextValidateStrategy(), parent);
		}
		else if (data.getTextValidateStrategy() != null) {
			dateFieldEditor = new DateFieldEditor(name, label, data.getDatePattern(), StringFieldEditor.UNLIMITED, data.getTextValidateStrategy(), parent);
		}
		else if (data.getTextWidth() != null) {
			dateFieldEditor = new DateFieldEditor(name, label, data.getDatePattern(), data.getTextWidth(), parent);
		}
		else {
			dateFieldEditor = new DateFieldEditor(name, label, data.getDatePattern(), parent);
		}
		if (data.getEmptyStringAllowed() != null) {
			dateFieldEditor.setEmptyStringAllowed(data.getEmptyStringAllowed());
		}
		dateFieldEditor.setMinValidValue(data.getDateFrom());
		dateFieldEditor.setMaxValidValue(data.getDateTo());
		if (data.getTextLimit() != null) {
			dateFieldEditor.setTextLimit(data.getTextLimit());
		}
		return dateFieldEditor;
	}

	protected DefaultBigDecimalFieldEditor createDefaultBigDecimalFieldEditor(final String name, final String label, final Composite parent, final FieldEditorDetails data) {
		final DefaultBigDecimalFieldEditor defaultBigDecimalFieldEditor = new DefaultBigDecimalFieldEditor(name, label, parent);
		if (data != null) {
			if (data.getEmptyStringAllowed() != null) {
				defaultBigDecimalFieldEditor.setEmptyStringAllowed(data.getEmptyStringAllowed());
			}
			if (data.getNumberMinimum() != null && data.getNumberMaximum() != null) {
				defaultBigDecimalFieldEditor.setValidRange(data.getNumberMinimum(), data.getNumberMaximum());
			}
			if (data.getTextLimit() != null) {
				defaultBigDecimalFieldEditor.setTextLimit(data.getTextLimit());
			}
		}
		return defaultBigDecimalFieldEditor;
	}

	protected DefaultBigIntegerFieldEditor createDefaultBigIntegerFieldEditor(final String name, final String label, final Composite parent, final FieldEditorDetails data) {
		final DefaultBigIntegerFieldEditor defaultBigDecimalFieldEditor = new DefaultBigIntegerFieldEditor(name, label, parent);
		if (data != null) {
			if (data.getEmptyStringAllowed() != null) {
				defaultBigDecimalFieldEditor.setEmptyStringAllowed(data.getEmptyStringAllowed());
			}
			if (data.getNumberMinimum() != null && data.getNumberMaximum() != null) {
				defaultBigDecimalFieldEditor.setValidRange(data.getNumberMinimum(), data.getNumberMaximum());
			}
			if (data.getTextLimit() != null) {
				defaultBigDecimalFieldEditor.setTextLimit(data.getTextLimit());
			}
		}
		return defaultBigDecimalFieldEditor;
	}

	protected DefaultDateFieldEditor createDefaultDateFieldEditor(final String name, final String label, final Composite parent, final FieldEditorDetails data) {
		final DefaultDateFieldEditor formattedDateFieldEditor;
		if (data.getTextWidth() != null && data.getTextValidateStrategy() != null) {
			formattedDateFieldEditor = new DefaultDateFieldEditor(name, label, data.getDatePattern(), data.getTextWidth(), data.getTextValidateStrategy(), parent);
		}
		else if (data.getTextValidateStrategy() != null) {
			formattedDateFieldEditor = new DefaultDateFieldEditor(name, label, data.getDatePattern(), StringFieldEditor.UNLIMITED, data.getTextValidateStrategy(), parent);
		}
		else if (data.getTextWidth() != null) {
			formattedDateFieldEditor = new DefaultDateFieldEditor(name, label, data.getDatePattern(), data.getTextWidth(), parent);
		}
		else {
			formattedDateFieldEditor = new DefaultDateFieldEditor(name, label, data.getDatePattern(), parent);
		}
		if (data.getEmptyStringAllowed() != null) {
			formattedDateFieldEditor.setEmptyStringAllowed(data.getEmptyStringAllowed());
		}
		formattedDateFieldEditor.setMinValidValue(data.getDateFrom());
		formattedDateFieldEditor.setMaxValidValue(data.getDateTo());
		if (data.getTextLimit() != null) {
			formattedDateFieldEditor.setTextLimit(data.getTextLimit());
		}
		return formattedDateFieldEditor;
	}

	protected DefaultDirectoryFieldEditor createDefaultDirectoryFieldEditor(final String name, final String label, final Composite parent, final FieldEditorDetails data) {
		final DefaultDirectoryFieldEditor formattedDirectoryFieldEditor = new DefaultDirectoryFieldEditor(name, label, parent);
		if (data != null) {
			if (data.getTextLimit() != null) {
				formattedDirectoryFieldEditor.setTextLimit(data.getTextLimit());
			}
			if (data.getEmptyStringAllowed() != null) {
				formattedDirectoryFieldEditor.setEmptyStringAllowed(data.getEmptyStringAllowed());
			}
			if (data.getDirectoryDialogMessage() != null) {
				formattedDirectoryFieldEditor.setDialogMessage(data.getDirectoryDialogMessage());
			}
		}
		return formattedDirectoryFieldEditor;
	}

	protected DefaultDoubleFieldEditor createDefaultDoubleFieldEditor(final String name, final String label, final Composite parent, final FieldEditorDetails data) {
		final DefaultDoubleFieldEditor defaultDoubleFieldEditor = new DefaultDoubleFieldEditor(name, label, parent);
		if (data != null) {
			if (data.getEmptyStringAllowed() != null) {
				defaultDoubleFieldEditor.setEmptyStringAllowed(data.getEmptyStringAllowed());
			}
			if (data.getNumberMinimum() != null && data.getNumberMaximum() != null) {
				defaultDoubleFieldEditor.setValidRange(data.getNumberMinimum().doubleValue(), data.getNumberMaximum().doubleValue());
			}
			if (data.getTextLimit() != null) {
				defaultDoubleFieldEditor.setTextLimit(data.getTextLimit());
			}
		}
		return defaultDoubleFieldEditor;
	}

	protected DefaultFileFieldEditor createDefaultFileFieldEditor(final String name, final String label, final Composite parent, final FieldEditorDetails data) {
		final DefaultFileFieldEditor formattedFileFieldEditor;
		if (data != null && data.getFileEnforceAbsolute() != null) {
			formattedFileFieldEditor = new DefaultFileFieldEditor(name, label, data.getFileEnforceAbsolute(), parent);
		}
		else {
			formattedFileFieldEditor = new DefaultFileFieldEditor(name, label, parent);
		}
		if (data != null) {
			if (data.getTextLimit() != null) {
				formattedFileFieldEditor.setTextLimit(data.getTextLimit());
			}
			if (data.getEmptyStringAllowed() != null) {
				formattedFileFieldEditor.setEmptyStringAllowed(data.getEmptyStringAllowed());
			}
			if (data.getFileExtensions() != null && data.getFileExtensions().length != 0) {
				formattedFileFieldEditor.setFileExtensions(data.getFileExtensions());
			}
		}
		return formattedFileFieldEditor;
	}

	protected DefaultFloatFieldEditor createDefaultFloatFieldEditor(final String name, final String label, final Composite parent, final FieldEditorDetails data) {
		final DefaultFloatFieldEditor defaultFloatFieldEditor = new DefaultFloatFieldEditor(name, label, parent);
		if (data != null) {
			if (data.getEmptyStringAllowed() != null) {
				defaultFloatFieldEditor.setEmptyStringAllowed(data.getEmptyStringAllowed());
			}
			if (data.getNumberMinimum() != null && data.getNumberMaximum() != null) {
				defaultFloatFieldEditor.setValidRange(data.getNumberMinimum().floatValue(), data.getNumberMaximum().floatValue());
			}
			if (data.getTextLimit() != null) {
				defaultFloatFieldEditor.setTextLimit(data.getTextLimit());
			}
		}
		return defaultFloatFieldEditor;
	}

	protected DefaultIntegerFieldEditor createDefaultIntegerFieldEditor(final String name, final String label, final Composite parent, final FieldEditorDetails data) {
		final DefaultIntegerFieldEditor defaultIntegerFieldEditor = new DefaultIntegerFieldEditor(name, label, parent);
		if (data != null) {
			if (data.getEmptyStringAllowed() != null) {
				defaultIntegerFieldEditor.setEmptyStringAllowed(data.getEmptyStringAllowed());
			}
			if (data.getNumberMinimum() != null && data.getNumberMaximum() != null) {
				defaultIntegerFieldEditor.setValidRange(data.getNumberMinimum().intValue(), data.getNumberMaximum().intValue());
				defaultIntegerFieldEditor.setTextLimit(Math.max(Integer.valueOf(data.getNumberMaximum().intValue()).toString().length(), Integer.valueOf(data.getNumberMinimum().intValue()).toString().length()));
			}
			if (data.getTextLimit() != null) {
				defaultIntegerFieldEditor.setTextLimit(data.getTextLimit());
			}
		}
		return defaultIntegerFieldEditor;
	}

	protected DefaultLongFieldEditor createDefaultLongFieldEditor(final String name, final String label, final Composite parent, final FieldEditorDetails data) {
		final DefaultLongFieldEditor defaultLongFieldEditor = new DefaultLongFieldEditor(name, label, parent);
		if (data != null) {
			if (data.getEmptyStringAllowed() != null) {
				defaultLongFieldEditor.setEmptyStringAllowed(data.getEmptyStringAllowed());
			}
			if (data.getNumberMinimum() != null && data.getNumberMaximum() != null) {
				defaultLongFieldEditor.setValidRange(data.getNumberMinimum().longValue(), data.getNumberMaximum().longValue());
				defaultLongFieldEditor.setTextLimit(Math.max(Long.valueOf(data.getNumberMaximum().longValue()).toString().length(), Long.valueOf(data.getNumberMinimum().longValue()).toString().length()));
			}
			if (data.getTextLimit() != null) {
				defaultLongFieldEditor.setTextLimit(data.getTextLimit());
			}
		}
		return defaultLongFieldEditor;
	}

	protected DefaultRadioGroupFieldEditor createDefaultRadioGroupFieldEditor(final String name, final String label, final Composite parent, final FieldEditorDetails data) {
		if (data.getRadioUseGroup() != null) {
			return new DefaultRadioGroupFieldEditor(name, label, data.getRadioNumColumns(), data.getLabelsAndValues().toArray(), parent, data.getRadioUseGroup());
		}
		else {
			return new DefaultRadioGroupFieldEditor(name, label, data.getRadioNumColumns(), data.getLabelsAndValues().toArray(), parent);
		}
	}

	protected DefaultStringFieldEditor createDefaultStringFieldEditor(final String name, final String label, final Composite parent, final FieldEditorDetails data) {
		final DefaultStringFieldEditor formattedStringFieldEditor;
		if (data != null && data.getTextWidth() != null && data.getTextValidateStrategy() != null) {
			formattedStringFieldEditor = new DefaultStringFieldEditor(name, label, data.getTextWidth(), data.getTextValidateStrategy(), parent);
		}
		else if (data != null && data.getTextValidateStrategy() != null) {
			formattedStringFieldEditor = new DefaultStringFieldEditor(name, label, StringFieldEditor.UNLIMITED, data.getTextValidateStrategy(), parent);
		}
		else if (data != null && data.getTextWidth() != null) {
			formattedStringFieldEditor = new DefaultStringFieldEditor(name, label, data.getTextWidth(), parent);
		}
		else {
			formattedStringFieldEditor = new DefaultStringFieldEditor(name, label, parent);
		}
		if (data != null) {
			if (data.getEmptyStringAllowed() != null) {
				formattedStringFieldEditor.setEmptyStringAllowed(data.getEmptyStringAllowed());
			}
			if (data.getTextLimit() != null) {
				formattedStringFieldEditor.setTextLimit(data.getTextLimit());
			}
		}
		return formattedStringFieldEditor;
	}

	protected DelimiterComboFieldEditor createDelimiterComboFieldEditor(final String name, final String label, final Composite parent, final FieldEditorDetails data) {
		final DelimiterComboFieldEditor delimiterComboFieldEditor = new DelimiterComboFieldEditor(name, label, data.getLabelsAndValues().toArray(), parent);
		if (data.getEmptyStringAllowed() != null) {
			delimiterComboFieldEditor.setEmptyStringAllowed(data.getEmptyStringAllowed());
		}
		return delimiterComboFieldEditor;
	}

	protected DirectoryFieldEditor createDirectoryFieldEditor(final String name, final String label, final Composite parent, final FieldEditorDetails data) {
		final DirectoryFieldEditor directoryFieldEditor = new DirectoryFieldEditor(name, label, parent);
		if (data != null) {
			if (data.getTextLimit() != null) {
				directoryFieldEditor.setTextLimit(data.getTextLimit());
			}
			if (data.getEmptyStringAllowed() != null) {
				directoryFieldEditor.setEmptyStringAllowed(data.getEmptyStringAllowed());
			}
		}
		return directoryFieldEditor;
	}

	protected DoubleComboFieldEditor createDoubleComboFieldEditor(final String name, final String label, final Composite parent, final FieldEditorDetails data) {
		final DoubleComboFieldEditor doubleComboFieldEditor = new DoubleComboFieldEditor(name, label, data.getLabelsAndValues().toArray(), parent);
		if (data.getEmptyStringAllowed() != null) {
			doubleComboFieldEditor.setEmptyStringAllowed(data.getEmptyStringAllowed());
		}
		doubleComboFieldEditor.setMinValidValue(data.getNumberMinimum());
		doubleComboFieldEditor.setMaxValidValue(data.getNumberMaximum());
		if (data.getTextLimit() != null) {
			doubleComboFieldEditor.setTextLimit(data.getTextLimit());
		}
		return doubleComboFieldEditor;
	}

	protected DoubleFieldEditor createDoubleFieldEditor(final String name, final String label, final Composite parent, final FieldEditorDetails data) {
		final DoubleFieldEditor doubleFieldEditor = new DoubleFieldEditor(name, label, parent);
		if (data != null) {
			if (data.getEmptyStringAllowed() != null) {
				doubleFieldEditor.setEmptyStringAllowed(data.getEmptyStringAllowed());
			}
			if (data.getNumberMinimum() != null && data.getNumberMaximum() != null) {
				doubleFieldEditor.setValidRange(data.getNumberMinimum().doubleValue(), data.getNumberMaximum().doubleValue());
			}
			if (data.getTextLimit() != null) {
				doubleFieldEditor.setTextLimit(data.getTextLimit());
			}
		}
		return doubleFieldEditor;
	}

	protected EmailAddressesListEditor createEmailAddressesListEditor(final String name, final String label, final Composite parent, final FieldEditorDetails data) {
		if (data != null) {
			return new EmailAddressesListEditor(name, label, parent, data.getHorizontalSpan(), data.getIcons());
		}
		else {
			return new EmailAddressesListEditor(name, label, parent, null, null);
		}
	}

	protected FileFieldEditor createFileFieldEditor(final String name, final String label, final Composite parent, final FieldEditorDetails data) {
		final FileFieldEditor fileFieldEditor;
		if (data != null && data.getFileEnforceAbsolute() != null) {
			fileFieldEditor = new FileFieldEditor(name, label, data.getFileEnforceAbsolute(), parent);
		}
		else {
			fileFieldEditor = new FileFieldEditor(name, label, parent);
		}
		if (data != null) {
			if (data.getTextLimit() != null) {
				fileFieldEditor.setTextLimit(data.getTextLimit());
			}
			if (data.getEmptyStringAllowed() != null) {
				fileFieldEditor.setEmptyStringAllowed(data.getEmptyStringAllowed());
			}
			if (data.getFileExtensions() != null && data.getFileExtensions().length != 0) {
				fileFieldEditor.setFileExtensions(data.getFileExtensions());
			}
		}
		return fileFieldEditor;
	}

	protected FloatComboFieldEditor createFloatComboFieldEditor(final String name, final String label, final Composite parent, final FieldEditorDetails data) {
		final FloatComboFieldEditor floatComboFieldEditor = new FloatComboFieldEditor(name, label, data.getLabelsAndValues().toArray(), parent);
		if (data.getEmptyStringAllowed() != null) {
			floatComboFieldEditor.setEmptyStringAllowed(data.getEmptyStringAllowed());
		}
		floatComboFieldEditor.setMinValidValue(data.getNumberMinimum());
		floatComboFieldEditor.setMaxValidValue(data.getNumberMaximum());
		if (data.getTextLimit() != null) {
			floatComboFieldEditor.setTextLimit(data.getTextLimit());
		}
		return floatComboFieldEditor;
	}

	protected FloatFieldEditor createFloatFieldEditor(final String name, final String label, final Composite parent, final FieldEditorDetails data) {
		final FloatFieldEditor floatFieldEditor = new FloatFieldEditor(name, label, parent);
		if (data != null) {
			if (data.getEmptyStringAllowed() != null) {
				floatFieldEditor.setEmptyStringAllowed(data.getEmptyStringAllowed());
			}
			if (data.getNumberMinimum() != null && data.getNumberMaximum() != null) {
				floatFieldEditor.setValidRange(data.getNumberMinimum().floatValue(), data.getNumberMaximum().floatValue());
			}
			if (data.getTextLimit() != null) {
				floatFieldEditor.setTextLimit(data.getTextLimit());
			}
		}
		return floatFieldEditor;
	}

	protected FontFieldEditor createFontFieldEditor(final String name, final String label, final Composite parent, final FieldEditorDetails data) {
		final FontFieldEditor fontFieldEditor;
		if (data != null && data.getFontPreviewAreaText() != null) {
			fontFieldEditor = new FontFieldEditor(name, label, data.getFontPreviewAreaText().getString(), parent);
		}
		else {
			fontFieldEditor = new FontFieldEditor(name, label, parent);
		}
		if (data != null && data.getFontChangeButtonText() != null) {
			fontFieldEditor.setChangeButtonText(data.getFontChangeButtonText().getString());
		}
		else {
			fontFieldEditor.setChangeButtonText(JFaceMessages.get("lbl.button.change"));
		}
		return fontFieldEditor;
	}

	protected IntegerComboFieldEditor createIntegerComboFieldEditor(final String name, final String label, final Composite parent, final FieldEditorDetails data) {
		final IntegerComboFieldEditor integerComboFieldEditor = new IntegerComboFieldEditor(name, label, data.getLabelsAndValues().toArray(), parent);
		if (data.getEmptyStringAllowed() != null) {
			integerComboFieldEditor.setEmptyStringAllowed(data.getEmptyStringAllowed());
		}
		integerComboFieldEditor.setMinValidValue(data.getNumberMinimum());
		integerComboFieldEditor.setMaxValidValue(data.getNumberMaximum());
		if (data.getTextLimit() != null) {
			integerComboFieldEditor.setTextLimit(data.getTextLimit());
		}
		return integerComboFieldEditor;
	}

	protected IntegerFieldEditor createIntegerFieldEditor(final String name, final String label, final Composite parent, final FieldEditorDetails data) {
		final IntegerFieldEditor integerFieldEditor = new IntegerFieldEditor(name, label, parent);
		if (data != null) {
			if (data.getEmptyStringAllowed() != null) {
				integerFieldEditor.setEmptyStringAllowed(data.getEmptyStringAllowed());
			}
			if (data.getNumberMinimum() != null && data.getNumberMaximum() != null) {
				integerFieldEditor.setValidRange(data.getNumberMinimum().intValue(), data.getNumberMaximum().intValue());
				integerFieldEditor.setTextLimit(Math.max(Integer.valueOf(data.getNumberMaximum().intValue()).toString().length(), Integer.valueOf(data.getNumberMinimum().intValue()).toString().length()));
			}
			if (data.getTextLimit() != null) {
				integerFieldEditor.setTextLimit(data.getTextLimit());
			}
		}
		return integerFieldEditor;
	}

	protected LongFieldEditor createLongFieldEditor(final String name, final String label, final Composite parent, final FieldEditorDetails data) {
		final LongFieldEditor longFieldEditor = new LongFieldEditor(name, label, parent);
		if (data != null) {
			if (data.getEmptyStringAllowed() != null) {
				longFieldEditor.setEmptyStringAllowed(data.getEmptyStringAllowed());
			}
			if (data.getNumberMinimum() != null && data.getNumberMaximum() != null) {
				longFieldEditor.setValidRange(data.getNumberMinimum().longValue(), data.getNumberMaximum().longValue());
				longFieldEditor.setTextLimit(Math.max(Long.valueOf(data.getNumberMaximum().longValue()).toString().length(), Long.valueOf(data.getNumberMinimum().longValue()).toString().length()));
			}
			if (data.getTextLimit() != null) {
				longFieldEditor.setTextLimit(data.getTextLimit());
			}
		}
		return longFieldEditor;
	}

	protected LocalizedPathEditor createLocalizedPathEditor(final String name, final String label, final Composite parent, final FieldEditorDetails data) {
		final LocalizedPathEditor localizedPathEditor;
		if (data != null) {
			localizedPathEditor = new LocalizedPathEditor(name, label, data.getDirectoryDialogMessage(), parent, data.getHorizontalSpan());
		}
		else {
			localizedPathEditor = new LocalizedPathEditor(name, label, null, parent);
		}
		return localizedPathEditor;
	}

	protected LongComboFieldEditor createLongComboFieldEditor(final String name, final String label, final Composite parent, final FieldEditorDetails data) {
		final LongComboFieldEditor longComboFieldEditor = new LongComboFieldEditor(name, label, data.getLabelsAndValues().toArray(), parent);
		if (data.getEmptyStringAllowed() != null) {
			longComboFieldEditor.setEmptyStringAllowed(data.getEmptyStringAllowed());
		}
		longComboFieldEditor.setMinValidValue(data.getNumberMinimum());
		longComboFieldEditor.setMaxValidValue(data.getNumberMaximum());
		if (data.getTextLimit() != null) {
			longComboFieldEditor.setTextLimit(data.getTextLimit());
		}
		return longComboFieldEditor;
	}

	protected PasswordFieldEditor createPasswordFieldEditor(final String name, final String label, final Composite parent, final FieldEditorDetails data) {
		final PasswordFieldEditor passwordFieldEditor;
		if (data != null && data.getTextWidth() != null) {
			passwordFieldEditor = new PasswordFieldEditor(name, label, data.getTextWidth(), parent);
		}
		else {
			passwordFieldEditor = new PasswordFieldEditor(name, label, parent);
		}
		if (data != null) {
			if (data.getEmptyStringAllowed() != null) {
				passwordFieldEditor.setEmptyStringAllowed(data.getEmptyStringAllowed());
			}
			if (data.getTextLimit() != null) {
				passwordFieldEditor.setTextLimit(data.getTextLimit());
			}
		}
		return passwordFieldEditor;
	}

	protected RadioGroupFieldEditor createRadioGroupFieldEditor(final String name, final String label, final Composite parent, final FieldEditorDetails data) {
		if (data.getRadioUseGroup() != null) {
			return new RadioGroupFieldEditor(name, label, data.getRadioNumColumns(), data.getLabelsAndValues().toArray(), parent, data.getRadioUseGroup());
		}
		else {
			return new RadioGroupFieldEditor(name, label, data.getRadioNumColumns(), data.getLabelsAndValues().toArray(), parent);
		}
	}

	protected ScaleFieldEditor createScaleFieldEditor(final String name, final String label, final Composite parent, final FieldEditorDetails data) {
		final ScaleFieldEditor scaleFieldEditor = new ScaleFieldEditor(name, label, parent);
		if (data != null) {
			if (data.getScaleMinimum() != null) {
				scaleFieldEditor.setMinimum(data.getScaleMinimum());
			}
			if (data.getScaleMaximum() != null) {
				scaleFieldEditor.setMaximum(data.getScaleMaximum());
			}
			if (data.getScaleIncrement() != null) {
				scaleFieldEditor.setIncrement(data.getScaleIncrement());
			}
			if (data.getScalePageIncrement() != null) {
				scaleFieldEditor.setPageIncrement(data.getScalePageIncrement());
			}
		}
		return scaleFieldEditor;
	}

	protected ScaleIntegerFieldEditor createScaleIntegerFieldEditor(final String name, final String label, final Composite parent, final FieldEditorDetails data) {
		int min = 0;
		int max = 10;
		int increment = 1;
		int pageIncrement = 1;

		if (data != null) {
			if (data.getScaleMinimum() != null) {
				min = data.getScaleMinimum();
			}
			if (data.getScaleMaximum() != null) {
				max = data.getScaleMaximum();
			}
			if (data.getScaleIncrement() != null) {
				increment = data.getScaleIncrement();
			}
			if (data.getScalePageIncrement() != null) {
				pageIncrement = data.getScalePageIncrement();
			}
		}
		return new ScaleIntegerFieldEditor(name, label, parent, min, max, increment, pageIncrement);
	}

	protected StringFieldEditor createStringFieldEditor(final String name, final String label, final Composite parent, final FieldEditorDetails data) {
		final StringFieldEditor stringFieldEditor;
		if (data != null && data.getTextWidth() != null && data.getTextValidateStrategy() != null) {
			stringFieldEditor = new StringFieldEditor(name, label, data.getTextWidth(), data.getTextValidateStrategy(), parent);
		}
		else if (data != null && data.getTextValidateStrategy() != null) {
			stringFieldEditor = new StringFieldEditor(name, label, StringFieldEditor.UNLIMITED, data.getTextValidateStrategy(), parent);
		}
		else if (data != null && data.getTextWidth() != null) {
			stringFieldEditor = new StringFieldEditor(name, label, data.getTextWidth(), parent);
		}
		else {
			stringFieldEditor = new StringFieldEditor(name, label, parent);
		}
		if (data != null) {
			if (data.getEmptyStringAllowed() != null) {
				stringFieldEditor.setEmptyStringAllowed(data.getEmptyStringAllowed());
			}
			if (data.getTextLimit() != null) {
				stringFieldEditor.setTextLimit(data.getTextLimit());
			}
		}
		return stringFieldEditor;
	}

	protected UriListEditor createUriListEditor(final String name, final String label, final Composite parent, final FieldEditorDetails data) {
		if (data != null) {
			return new UriListEditor(name, label, parent, data.getHorizontalSpan(), data.getIcons());
		}
		else {
			return new UriListEditor(name, label, parent, null, null);
		}
	}

	protected ValidatedComboFieldEditor createValidatedComboFieldEditor(final String name, final String label, final Composite parent, final FieldEditorDetails data) {
		final ValidatedComboFieldEditor validatedComboFieldEditor = new ValidatedComboFieldEditor(name, label, data.getLabelsAndValues().toArray(), parent);
		if (data.getEmptyStringAllowed() != null) {
			validatedComboFieldEditor.setEmptyStringAllowed(data.getEmptyStringAllowed());
		}
		return validatedComboFieldEditor;
	}

	protected WrapStringFieldEditor createWrapStringFieldEditor(final String name, final String label, final Composite parent, final FieldEditorDetails data) {
		final WrapStringFieldEditor wrapStringFieldEditor;
		if (data != null && data.getTextHeight() != null) {
			wrapStringFieldEditor = new WrapStringFieldEditor(name, label, parent, data.getTextHeight());
		}
		else {
			wrapStringFieldEditor = new WrapStringFieldEditor(name, label, parent);
		}
		if (data != null && data.getTextLimit() != null) {
			wrapStringFieldEditor.setTextLimit(data.getTextLimit());
		}
		return wrapStringFieldEditor;
	}

}
