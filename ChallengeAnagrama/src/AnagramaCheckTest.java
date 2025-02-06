import static org.junit.jupiter.api.Assertions.*;

class AnagramaCheckTest {

    @Test
    public void testIsAnagrama(){
        AssertTrue(AnagramaCheck.isAnagram("espada", "pesada"));
        AsertFase(AnagramaCheck.isAnagram("hola", "cola"));
        AseerTrue(AnagramaCheck.isAnagram("amor", "coma"));
    }

}