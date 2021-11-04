package br.com.lab.impacta.account.application.adapter;

import br.com.lab.impacta.account.application.dto.response.AccountBalanceResponse;

public class AccountAdapter {

    public static AccountBalanceResponse toDtoBalance(Account account) {
        return new AccountBalanceResponse(account.getId(), account.getBalance());
    }
}
