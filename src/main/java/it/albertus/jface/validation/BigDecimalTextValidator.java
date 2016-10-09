package it.albertus.jface.validation;

import java.math.BigDecimal;

import org.eclipse.swt.widgets.Text;

public class BigDecimalTextValidator extends NumberTextValidator<BigDecimal> {

	public BigDecimalTextValidator(final Text text) {
		super(text);
	}

	public BigDecimalTextValidator(final Text text, final BigDecimal minValidValue, final BigDecimal maxValidValue, final boolean emptyStringAllowed) {
		super(text, minValidValue, maxValidValue, emptyStringAllowed);
	}

	@Override
	protected BigDecimal toNumber(final String value) throws NumberFormatException {
		return new BigDecimal(value);
	}

}