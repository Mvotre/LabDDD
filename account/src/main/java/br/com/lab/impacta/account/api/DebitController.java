package br.com.lab.impacta.account.api;

import br.com.lab.impacta.account.application.AccountApplication;
import br.com.lab.impacta.account.application.dto.response.DebitAccountResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/accounts")

public class DebitController {
    @Autowired
    private AccountApplication accountApplication;

    public ResponseEntity<DebitAccountResponse> debit (

        @PathVariable long accountId,
        @RequestBody DebitAccountRequest debitAccountRequest) {

        DebitAccountResponse debitAccountResponse =
                accountApplication.debit(accountId, debitAccountRequest);

        return ResponseEntity.ok(debitAccountResponse);
    }

}
