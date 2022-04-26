package com.example.tdd;

import com.example.tdd.domain.Dollar;
import com.example.tdd.domain.Franc;
import com.example.tdd.domain.Money;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;

//@SpringBootTest
class TddApplicationTests {

	@Test
	@DisplayName("testMultiplication")
	public void testMultiplication() {
		Money five = Money.dollar(5);
		assertThat(five.times(2)).isEqualTo(Money.dollar(10));
		assertThat(five.times(3)).isEqualTo(Money.dollar(15));
	}

	@Test
	@DisplayName("testFrancMultiplication")
	public void testFrancMultiplication() {
		Franc five = new Franc(5);
		assertThat(five.times(2)).isEqualTo(new Franc(10));
		assertThat(five.times(3)).isEqualTo(new Franc(15));
	}

	@Test
	@DisplayName("testEquality")
	public void testEquality() {
		assertThat(Money.dollar(5).equals(Money.dollar(5))).isTrue();
		assertThat(Money.dollar(5).equals(Money.dollar(6))).isFalse();
		assertThat(new Franc(5).equals(new Franc(5))).isTrue();
		assertThat(new Franc(5).equals(new Franc(6))).isFalse();
		assertThat(new Franc(5).equals(Money.dollar(5))).isFalse();
	}

}
