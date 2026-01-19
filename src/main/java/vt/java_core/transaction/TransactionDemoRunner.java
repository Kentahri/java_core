package vt.java_core.transaction;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import vt.java_core.transaction.service.PaymentService;

@Component
public class TransactionDemoRunner implements CommandLineRunner {

    private final PaymentService paymentService;

    public TransactionDemoRunner(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @Override
    public void run(String... args) {

        try {
            paymentService.createUserAndFailRuntime();
        } catch (Exception ignored) {}

        try {
            paymentService.createUserAndFailChecked();
        } catch (Exception ignored) {}

        try {
            paymentService.createUserAndForceRollback();
        } catch (Exception ignored) {}

        try {
            paymentService.noRollbackExample();
        } catch (Exception ignored) {}
    }
}
