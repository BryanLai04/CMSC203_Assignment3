
import static org.junit.Assert.*;
import org.junit.Test;

public class CryptoManagerTestStudent {

    @Test
    public void testCaesarEncryption() {
        assertEquals("KHOOR", CryptoManager.caesarEncryption("HELLO", 3));
    }

    @Test
    public void testBellasoEncryption() {
        assertEquals("Z\\%OG", CryptoManager.bellasoEncryption("WORLD", "CMSC"));
    }

    @Test
    public void testCaesarEncryptionOutOfBounds() {
        assertEquals("The selected string is not in bounds. Try again.",
                CryptoManager.caesarEncryption("Hello123", 4));
    }

    @Test
    public void testBellasoDecryption() {
        assertEquals("MONTGOMERY", CryptoManager.bellasoDecryption("P\\!WJ\\ HU&", "CMSC"));
    }
}
