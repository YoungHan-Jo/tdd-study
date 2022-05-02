package com.example.tdd;

import com.example.tdd.domain.Bank;
import com.example.tdd.domain.Expression;
import com.example.tdd.domain.Money;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
	@DisplayName("testEquality")
	public void testEquality() {
		assertThat(Money.dollar(5).equals(Money.dollar(5))).isTrue();
		assertThat(Money.dollar(5).equals(Money.dollar(6))).isFalse();
		assertThat(new Money(5,"CHF").equals(new Money(5,"USD"))).isFalse();
	}

	@Test
	public void testCurrency() {
		assertThat(Money.dollar(1).currency()).isEqualTo("USD");
		assertThat(Money.franc(1).currency()).isEqualTo("CHF");
	}

	@Test
	public void testSimpleAddition() throws Exception {

		Money five = Money.dollar(5);
		Expression result = five.plus(five);
		Bank bank = new Bank();
		Money reduced = bank.reduce(result, "USD");
		assertThat(reduced).isEqualTo(Money.dollar(10));
	}

}
