package com.demo.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.demo.web.Adder;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAdder {

	private Adder adder;

	@Before
	public void setUp() {
		adder = new Adder();
	}

	@Test
	public void testAdd() {

		assertEquals(2, adder.add(1, 1));
	}
}
