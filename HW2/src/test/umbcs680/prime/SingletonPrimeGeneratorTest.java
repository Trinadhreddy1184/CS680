package umbcs680.prime;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;

public class SingletonPrimeGeneratorTest{
    // Testcases

    //Testcase 1 : Positive testcase checking  singletonPrimeGeneratorSingleInstance is not null
    @Test
    public  void  singletonPrimeGeneratorSingleInstance(){
        SingletonPrimeGenerator gen = SingletonPrimeGenerator.getSingletonPrimeGeneratorInstance(201,256);
        assertNotNull(gen);
    }

    //Testcase 2 : Positive testcase checking second  singletonPrimeGeneratorSingleInstance is not null
    @Test
    public  void  singletonPrimeGeneratorTwoInstance(){
        SingletonPrimeGenerator gen = SingletonPrimeGenerator.getSingletonPrimeGeneratorInstance(201,256);
        SingletonPrimeGenerator gen2 = SingletonPrimeGenerator.getSingletonPrimeGeneratorInstance(12,45);
        assertNotNull(gen2);
    }

    //Testcase 3 : Positive testcase comparing  singletonPrimeGeneratorSingleInstances
    @Test
    public  void  singletonPrimeGeneratorInstanceCompareSame(){
        SingletonPrimeGenerator gen = SingletonPrimeGenerator.getSingletonPrimeGeneratorInstance(20,25);
        SingletonPrimeGenerator gen2 = SingletonPrimeGenerator.getSingletonPrimeGeneratorInstance(120,145);
        assertSame(gen,gen2);
    }

    //Testcase 4 : Positive testcase comparing multiple singletonPrimeGeneratorSingleInstances
    @Test
    public  void  singletonPrimeGeneratorMultipleInstancesCompareSame(){
        SingletonPrimeGenerator gen = SingletonPrimeGenerator.getSingletonPrimeGeneratorInstance(20,25);
        SingletonPrimeGenerator gen2 = SingletonPrimeGenerator.getSingletonPrimeGeneratorInstance(120,145);
        SingletonPrimeGenerator gen3 = SingletonPrimeGenerator.getSingletonPrimeGeneratorInstance(1270,1905);
        assertSame(gen2,gen3);
    }

    //Testcase 5 : Positive testcase comparing  singletonPrimeGeneratorSingleInstances with assertEquals()
    @Test
    public  void  singletonPrimeGeneratorInstanceCompareEquals(){
        SingletonPrimeGenerator gen = SingletonPrimeGenerator.getSingletonPrimeGeneratorInstance(290,415);
        SingletonPrimeGenerator gen2 = SingletonPrimeGenerator.getSingletonPrimeGeneratorInstance(128,1005);
        assertEquals(gen,gen2);
    }


    //Testcase 6 : Positive testcase generating primes from 15 to 20
    @Test
    public void generateSingletonPrimesFrom15To20(){
        SingletonPrimeGenerator gen = SingletonPrimeGenerator.getSingletonPrimeGeneratorInstance(5,20);
        SingletonPrimeGenerator gen2 = SingletonPrimeGenerator.getSingletonPrimeGeneratorInstance(15,20);
        gen2.generatePrimes();
        Long[] expectedPrimes= {17L,19L};
        LinkedList<Long> actualPrimes= gen2.getPrimes();
        assertArrayEquals(expectedPrimes,actualPrimes.toArray());
    }


    //Testcase 7 : Positive testcase generating primes from 67 to 90
    @Test
    public void generateSingletonPrimesFrom67To90(){
        SingletonPrimeGenerator gen = SingletonPrimeGenerator.getSingletonPrimeGeneratorInstance(5,20);
        gen.generatePrimes();
        SingletonPrimeGenerator gen2 = SingletonPrimeGenerator.getSingletonPrimeGeneratorInstance(67,90);
        gen2.generatePrimes();
        Long[] expectedPrimes= {67L, 71L, 73L, 79L, 83L, 89L};
        LinkedList<Long> actualPrimes= gen2.getPrimes();
        assertIterableEquals(Arrays.asList(expectedPrimes),actualPrimes);
    }


    //Testcase 8 : Positive testcase generating primes from 898 to 990
    @Test
    public void generateSingletonPrimesFrom898To990(){
        SingletonPrimeGenerator gen = SingletonPrimeGenerator.getSingletonPrimeGeneratorInstance(1,99);
        gen.generatePrimes();
        LinkedList<Long> actualPrimes= gen.getPrimes();
        Long[] expectedPrimes= {907L, 911L, 919L, 929L, 937L, 941L, 947L, 953L, 967L, 971L, 977L, 983L};
        SingletonPrimeGenerator gen2 = SingletonPrimeGenerator.getSingletonPrimeGeneratorInstance(898,990);
        gen2.generatePrimes();
        assertIterableEquals(Arrays.asList(expectedPrimes),actualPrimes);
    }

    //Testcase 9 : Negitive testcase with wrong input from 500 to 0
    @Test
    public void singletonPrimeGeneratorConstructorFrom500To0withTryCatch(){
        try {
            SingletonPrimeGenerator gen = SingletonPrimeGenerator.getSingletonPrimeGeneratorInstance(500,0);
            fail("Wrong input values: from=" + 500 + " to=" + 0);
        }catch (RuntimeException ex){
            assertEquals("Wrong input values: from=" + 500 + " to=" + 0,ex.getMessage());
        }
    }

    //Testcase 10 : Negitive testcase with wrong input from 970 to 970
    @Test
    public void singletonPrimeGeneratorConstructorFrom970To970WithTryCatch(){
        try {
            SingletonPrimeGenerator gen = SingletonPrimeGenerator.getSingletonPrimeGeneratorInstance(970, 970);
            fail("Wrong input values: from=" + 970 + " to=" + 970);
        }catch (RuntimeException ex){
            assertEquals("Wrong input values: from=" + 970 + " to=" + 970,ex.getMessage());
        }
    }
    

    //Testcase 11 : Negitive testcase with wrong input from -700 to 590 (Multiplte Catch blocks)
    @Test
    public void singletonPrimeGeneratorConstructorFromMinus700To590WithTryCatch(){
        try {
            SingletonPrimeGenerator gen = SingletonPrimeGenerator.getSingletonPrimeGeneratorInstance(-700, 590);
            fail("Wrong input values: from=" + -700 + " to=" + 590);
        }catch (IllegalArgumentException ex){
            assertEquals("Wrong input values: from=" + -700 + " to=" + 590,ex.getMessage());
        }catch (RuntimeException ex){
            assertEquals("Wrong input values: from=" + -700 + " to=" + 590,ex.getMessage());
        }
    }


    //Testcase 12 : Negitive testcase with wrong input from 890 to 70 (Multiple instances)
    @Test
    public void singletonPrimeGeneratorConstructorFrom890To70withTryCatch(){
        try {
            SingletonPrimeGenerator gen = SingletonPrimeGenerator.getSingletonPrimeGeneratorInstance(70,89);
            SingletonPrimeGenerator gen2 = SingletonPrimeGenerator.getSingletonPrimeGeneratorInstance(890,70);
            fail("Wrong input values: from=" + 890 + " to=" + 70);
        }catch (RuntimeException ex){
            assertEquals("Wrong input values: from=" + 890 + " to=" + 70,ex.getMessage());
        }
    }


    //Testcase 13 : Negitive testcase checking Prime number or not
    @Test
    public  void isSingletonPrimeWithMinus310(){
        SingletonPrimeGenerator gen = SingletonPrimeGenerator.getSingletonPrimeGeneratorInstance(70,89);
        assertFalse(gen.isPrime(-310));
    }

    //Testcase 14 : Positive testcase checking Even number or not
    @Test
    public void isSingletonEvenWith808(){
        SingletonPrimeGenerator gen = SingletonPrimeGenerator.getSingletonPrimeGeneratorInstance(70,89);
        assertTrue(gen.isEven(808));
    }
    //Testcase 15 : Negitive testcase checking Even number or not
    @Test
    public void isSingletonEvenWithMinus412(){
        SingletonPrimeGenerator gen = SingletonPrimeGenerator.getSingletonPrimeGeneratorInstance(70,89);
        assertTrue(gen.isEven(-412));
    }

}