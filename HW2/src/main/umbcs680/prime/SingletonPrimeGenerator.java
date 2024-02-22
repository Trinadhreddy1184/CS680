package umbcs680.prime;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;

public class SingletonPrimeGenerator {
	private static long from, to;
	private  LinkedList<Long> primes = new LinkedList<Long>();
	private  static SingletonPrimeGenerator singletonPrimeGeneratorInstance = null; // creating an empty instamce 
	
	private SingletonPrimeGenerator(){ // creating empty constructor
		
	}
	public static SingletonPrimeGenerator getSingletonPrimeGeneratorInstance(long from, long to) { // static factory method for returning instance
		try {
			if (from >= 1 && to > from) { //checking correct range values
				SingletonPrimeGenerator.from = from;
				SingletonPrimeGenerator.to = to;
			} else {
				throw new RuntimeException("Wrong input values: from=" + from + " to=" + to);
			}
			return Objects.requireNonNull(singletonPrimeGeneratorInstance);
		
		}catch(NullPointerException ex){

			singletonPrimeGeneratorInstance = new SingletonPrimeGenerator();
			return singletonPrimeGeneratorInstance;
		}
	}
	
	
	
	public LinkedList<Long> getPrimes(){  return this.primes; };
	
	protected boolean isEven(long n){
		if(n%2 == 0){ return true; }
		else{ return false; }
	}
	
	protected boolean isPrime(long n){
		// 1 or lower numbers are not prime. 
		if(n <= 1){ return false; }
		// Even numbers are not prime, except for 2.  
		if( n > 2 && isEven(n) ){ return false; }
		long i;
		// Find a number "i" that can divide "n" 
        for (i = (long) Math.sqrt(n); n%i != 0 && i >= 1; i--){}
        // If such a number "i" is found, n is not prime. Otherwise, n is prime. 
        if (i == 1){ return true; }
        else{ return false; }
	}

	public void generatePrimes(){
		primes.clear(); // clearing primes list
		for (long n = SingletonPrimeGenerator.from; n <= SingletonPrimeGenerator.to; n++) {
			if( isPrime(n) ){ primes.add(n); }
        }
	}
	
	public static void main(String[] args) {
		SingletonPrimeGenerator gen = SingletonPrimeGenerator.getSingletonPrimeGeneratorInstance(1,100);
		gen.generatePrimes();
		LinkedList<Long> primes = gen.getPrimes();
		Iterator<Long> it = primes.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + ", ");
		}
		System.out.println("\n" + gen.getPrimes().size() + " primes are found.");								
	}	
}