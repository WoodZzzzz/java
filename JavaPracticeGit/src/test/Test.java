package test;

import java.math.BigInteger;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Random;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Gender.getFemale().getDescription());
		System.out.println(Gender.getMale().getDescription());
		Random ran = new Random();
		System.out.println(BigInteger.probablePrime(5, ran)); //返回bitLength为幂的素数
		
	
	}
	
    void a() {}
}
