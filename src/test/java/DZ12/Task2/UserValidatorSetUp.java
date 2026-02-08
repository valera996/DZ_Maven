package DZ12.Task2;

import org.junit.jupiter.api.BeforeEach;

public  class UserValidatorSetUp {
    protected UserValidator userValidator;
    @BeforeEach
    public void setUp(){
        this.userValidator = new UserValidator(true);
    }
}
