package DZ12.Task1;

import org.junit.jupiter.api.BeforeEach;

public class EntityManagerSetUp {
    protected EntityManager<Entity> entityManager;
    @BeforeEach
    public void setUp() {
        this.entityManager = new EntityManager<>();
    }
}
