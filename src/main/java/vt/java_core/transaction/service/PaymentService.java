package vt.java_core.transaction.service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vt.java_core.transaction.entity.TransactionLog;
import vt.java_core.transaction.entity.User;
import vt.java_core.transaction.repository.TransactionLogRepository;
import vt.java_core.transaction.repository.UserRepository;

@Service
public class PaymentService {

    private final UserRepository userRepository;
    private final TransactionLogRepository logRepository;

    public PaymentService(UserRepository userRepository,
                          TransactionLogRepository logRepository) {
        this.userRepository = userRepository;
        this.logRepository = logRepository;
    }

    @Transactional
    public void createUserAndFailRuntime() {

        User user = new User();
        user.setName("An");
        user.setBalance(1000);

        userRepository.save(user);

        logRepository.save(
                new TransactionLog("Create user An")
        );

        // RuntimeException -> rollback
        throw new RuntimeException("Something went wrong");
    }

    @Transactional
    public void createUserAndFailChecked() throws Exception {

        User user = new User();
        user.setName("Binh");
        user.setBalance(2000);

        userRepository.save(user);

        logRepository.save(
                new TransactionLog("Create user Binh")
        );

        // Checked Exception
        throw new Exception("Checked exception happened");
    }

    @Transactional(rollbackFor = Exception.class)
    public void createUserAndForceRollback() throws Exception {

        User user = new User();
        user.setName("Cuong");
        user.setBalance(3000);

        userRepository.save(user);

        logRepository.save(
                new TransactionLog("Create user Cuong")
        );

        throw new Exception("Force rollback");
    }

    @Transactional(noRollbackFor = IllegalArgumentException.class)
    public void noRollbackExample() {

        User user = new User();
        user.setName("Vinh");
        user.setBalance(4000);

        userRepository.save(user);

        logRepository.save(
                new TransactionLog("Create user Vinh")
        );

        throw new IllegalArgumentException("No rollback");
    }


}

