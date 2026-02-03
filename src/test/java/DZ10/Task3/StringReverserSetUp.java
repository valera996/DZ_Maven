package DZ10.Task3;

import org.junit.jupiter.api.BeforeEach;

public class StringReverserSetUp {
    protected StringReverser stringReverser;
   @BeforeEach
    protected void setUp(){
        stringReverser = new StringReverser();
    }
}
