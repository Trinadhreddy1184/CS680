package umbcs680.prime;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class PrimeGeneratorTest{

    //Testcase 1 : Positive testcase generating prime numbers  from 5 to 20
    @Test
     public void generatePrimesFrom5To20(){
        PrimeGenerator gen = new PrimeGenerator(5,20);
        gen.generatePrimes();
        Long[] expectedPrimes= {5L,7L,11L,13L,17L,19L};
        LinkedList<Long> actualPrimes=gen.getPrimes();
        assertArrayEquals(expectedPrimes,actualPrimes.toArray());
    }

    //Testcase 2 : Positive testcase generating prime numbers  from 1000 to 1010 
    @Test
    public void generatePrimesFrom1000To1010(){
        PrimeGenerator gen = new PrimeGenerator(1000,1010);
        gen.generatePrimes();
        Long[] expectedPrimes={1009L};
        LinkedList<Long> actualPrimes=gen.getPrimes();
        assertIterableEquals(Arrays.asList(expectedPrimes),actualPrimes);
    }


    //Testcase 3 : Positive testcase generating prime numbers  from 250 to 300 
    @Test
    public void generatePrimesFrom250To300(){
        PrimeGenerator gen = new PrimeGenerator(250,300);
        gen.generatePrimes();
        Long[] expectedPrimes= {251L, 257L, 263L, 269L, 271L, 277L, 281L, 283L, 293L};
        LinkedList<Long> actualPrimes=gen.getPrimes();
        assertArrayEquals(expectedPrimes,actualPrimes.toArray());
    }

    //Testcase 4 : Positive testcase not generating  prime numbers  form 25 to 27
    @Test
    public void generatePrimesFrom25To27(){
        PrimeGenerator gen = new PrimeGenerator(25,27);
        gen.generatePrimes();
        Long[] expectedPrimes= {};
        LinkedList<Long> actualPrimes=gen.getPrimes();
        assertArrayEquals(expectedPrimes,actualPrimes.toArray());
    }


    //Testcase 5 : Positive testcase without generating  prime numbers  form 29000 to 29700 
    @Test
    public void generatePrimesFrom29000To29700(){
        PrimeGenerator gen = new PrimeGenerator(29000,29700);
        LinkedList<Long> actualPrimes=gen.getPrimes();
        assertNotNull(actualPrimes.toArray());
    }


    //Testcase 6 : Negitive testcase with wrong input from 50 to 0
    @Test
    public void primeGeneratorConstructorFrom50To0withTryCatch(){
        try {
            PrimeGenerator gen = new PrimeGenerator(50, 0);
            fail("Wrong input values: from=" + 50 + " to=" + 0);
        }catch (RuntimeException ex){
            assertEquals("Wrong input values: from=" + 50 + " to=" + 0,ex.getMessage());
        }
    }


    //Testcase 7 : Negitive testcase with wrong input from -5 to -10
    @Test
    public void primeGeneratorConstructorFromMinus5ToMinus10withTryCatch(){
        try {
            PrimeGenerator gen = new PrimeGenerator(-5, -10);
            fail("Wrong input values: from=" + -5 + " to=" + -10);
        }catch (RuntimeException ex){
            assertEquals("Wrong input values: from=" + -5 + " to=" + -10,ex.getMessage());
        }
    }


    //Testcase 8 : Negitive testcase with wrong input from 30 to 30
    @Test
    public void primeGeneratorConstructorFrom30To30WithTryCatch(){
        try {
            PrimeGenerator gen = new PrimeGenerator(30, 30);
            fail("Wrong input values: from=" + 30 + " to=" + 30);
        }catch (RuntimeException ex){
            assertEquals("Wrong input values: from=" + 30 + " to=" + 30,ex.getMessage());
        }
    }


    //Testcase 9 : Negitive testcase with wrong input from -10 to 500 (Using Exception)
    @Test
    public void primeGeneratorConstructorFromMinus10To500WithTryCatch(){
        try {
            PrimeGenerator gen = new PrimeGenerator(-10, 500);
            fail("Wrong input values: from=" + -10 + " to=" + 500);
        }catch (Exception ex){
            assertEquals("Wrong input values: from=" + -10 + " to=" + 500,ex.getMessage());
        }
    }


    //Testcase 10 : Negitive testcase with wrong input from -100 to 500 (Multiplte Catch blocks)
    @Test
    public void primeGeneratorConstructorFromMinus100To500WithTryCatch(){
        try {
            PrimeGenerator gen = new PrimeGenerator(-100, 500);
            fail("Wrong input values: from=" + -100 + " to=" + 500);
        }catch (IllegalArgumentException ex){
            assertEquals("Wrong input values: from=" + -100 + " to=" + 500,ex.getMessage());
        }catch (RuntimeException ex){
            assertEquals("Wrong input values: from=" + -100 + " to=" + 500,ex.getMessage());
        }
    }


    //Testcase 11 : Positive testcase checking Prime number on not
    @Test
    public  void isPrimeWith23(){
        PrimeGenerator gen = new PrimeGenerator(100, 500);
        assertTrue(gen.isPrime(23));
    }

    //Testcase 12 : Negitive testcase checking Prime number on not
    @Test
    public  void isPrimeWith72(){
        PrimeGenerator gen = new PrimeGenerator(100, 500);
        assertFalse(gen.isPrime(72));
    }


    //Testcase 13 : Negitive testcase checking Prime number on not
    @Test
    public  void isPrimeWithMinus31(){
        PrimeGenerator gen = new PrimeGenerator(100, 500);
        assertFalse(gen.isPrime(-31));
    }

    //Testcase 14 : Positive testcase checking Even number on not
    @Test
    public void isEvenWith88(){
        PrimeGenerator gen = new PrimeGenerator(100, 500);
        assertTrue(gen.isEven(88));
    }

    //Testcase 15 : Negitive testcase checking Even number on not
    @Test
    public void isEvenWith71(){
        PrimeGenerator gen = new PrimeGenerator(100, 500);
        assertFalse(gen.isEven(71));
    }


    //Testcase 16 : Negitive testcase checking Even number on not
    @Test
    public void isEvenWithMinus42(){
        PrimeGenerator gen = new PrimeGenerator(100, 500);
        assertTrue(gen.isEven(-42));
    }
}