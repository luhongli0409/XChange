/**
 * The MIT License
 * Copyright (c) 2012 Xeiam LLC http://xeiam.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.xeiam.xchange.atlasats.services;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import com.xeiam.xchange.ExchangeException;
import com.xeiam.xchange.ExchangeSpecification;
import com.xeiam.xchange.NotAvailableFromExchangeException;
import com.xeiam.xchange.NotYetImplementedForExchangeException;
import com.xeiam.xchange.currency.CurrencyPair;
import com.xeiam.xchange.dto.account.AccountInfo;
import com.xeiam.xchange.service.polling.BasePollingExchangeService;
import com.xeiam.xchange.service.polling.PollingAccountService;

public class AtlasPollingAccountService extends BasePollingExchangeService
		implements PollingAccountService {

	public AtlasPollingAccountService(
			ExchangeSpecification exchangeSpecification) {
		super(exchangeSpecification);

	}

	@Override
	public AccountInfo getAccountInfo() throws ExchangeException,
			NotAvailableFromExchangeException,
			NotYetImplementedForExchangeException, IOException {

		return null;
	}

	@Override
	public String withdrawFunds(String currency, BigDecimal amount,
			String address) throws ExchangeException,
			NotAvailableFromExchangeException,
			NotYetImplementedForExchangeException, IOException {
		throw new NotAvailableFromExchangeException();
	}

	@Override
	public String requestDepositAddress(String currency, String... args)
			throws ExchangeException, NotAvailableFromExchangeException,
			NotYetImplementedForExchangeException, IOException {
		throw new NotAvailableFromExchangeException();
	}

	@Override
	public Collection<CurrencyPair> getExchangeSymbols() throws IOException {
		Collection<CurrencyPair> currencyPairs = new ArrayList<CurrencyPair>();
		return currencyPairs;
	}

}