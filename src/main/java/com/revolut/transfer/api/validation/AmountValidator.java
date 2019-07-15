package com.revolut.transfer.api.validation;

import java.math.BigDecimal;

import com.revolut.transfer.api.request.TransferDTO;

public class AmountValidator implements TransferValidator{
    public boolean validate(final TransferDTO transferPOJO) {
        return transferPOJO.getAmount().compareTo(BigDecimal.ZERO) > 0;
    }
}
