import kvstore.InvalidPathException;
import kvstore.KeyValueStore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeystoreCreationWithValidPathTest {
    @Test
    public void createWithPathSpecified() throws InvalidPathException
    {
        KeyValueStore kv = new KeyValueStore("/");
    }
}
