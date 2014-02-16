package com.toddfast.util.preconditions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 *
 *
 */
public class PreconditionsTest {

	public PreconditionsTest() {
		super();
	}


	/**
	 * Test of isNotNull method, of class Preconditions.
	 */
	@Test
	public void testIsNotNull() {
		assertTrue(Preconditions.isNotNull("notNull)"));
		assertFalse(Preconditions.isNotNull(null));
	}


	/**
	 * Test of isValue method, of class Preconditions.
	 */
	@Test
	public void testIsValue() {
		assertTrue(Preconditions.isValue("value"));
		assertFalse(Preconditions.isValue(null));
		assertFalse(Preconditions.isValue(""));
	}


	/**
	 * Test of argumentNotNull method, of class Preconditions.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testArgumentNotNull() {
		Preconditions.argumentNotNull("notNull","foo");
		Preconditions.argumentNotNull(null,"foo");
	}


	/**
	 * Test of argumentIsValue method, of class Preconditions.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testArgumentIsValueEmptyString() {
		Preconditions.argumentIsValue("value","foo");
		Preconditions.argumentIsValue("","foo");
	}


	/**
	 * Test of argumentIsValue method, of class Preconditions.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testArgumentIsValueNull() {
		Preconditions.argumentIsValue(null,"foo");
	}


	/**
	 * Test of lengthGreaterThan method, of class Preconditions.
	 */
	@Test
	public void testLengthGreaterThan1() {
		Preconditions.lengthGreaterThan("abc",2,"foo");
	}


	/**
	 * Test of lengthGreaterThan method, of class Preconditions.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testLengthGreaterThan2() {
		Preconditions.lengthGreaterThan("aa",2,"foo");
	}


	/**
	 * Test of lengthGreaterThanOrEqual method, of class Preconditions.
	 */
	@Test
	public void testLengthGreaterThanOrEqual1() {
		Preconditions.lengthGreaterThanOrEqual("abc",2,"foo");
		Preconditions.lengthGreaterThanOrEqual("aa",2,"foo");
	}


	/**
	 * Test of lengthGreaterThanOrEqual method, of class Preconditions.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testLengthGreaterThanOrEqual2() {
		Preconditions.lengthGreaterThanOrEqual("a",2,"foo");
	}


	/**
	 * Test of lengthLessThan method, of class Preconditions.
	 */
	@Test
	public void testLengthLessThan() {
		Preconditions.lengthLessThan("a",2,"foo");
	}


	/**
	 * Test of lengthLessThan method, of class Preconditions.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testLengthLessThan2() {
		Preconditions.lengthLessThan("aa",2,"foo");
	}


	/**
	 * Test of lengthLessThanOrEqual method, of class Preconditions.
	 */
	@Test
	public void testLengthLessThanOrEqual() {
		Preconditions.lengthLessThanOrEqual("a",2,"foo");
		Preconditions.lengthLessThanOrEqual("aa",2,"foo");
	}


	/**
	 * Test of lengthLessThanOrEqual method, of class Preconditions.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testLengthLessThanOrEqual2() {
		Preconditions.lengthLessThanOrEqual("aaa",2,"foo");
	}


	/**
	 * Test of collectionNotEmpty method, of class Preconditions.
	 */
	@Test
	public void testCollectionNotEmpty() {
		Preconditions.collectionNotEmpty(Arrays.asList("value"),"foo");
	}


	/**
	 * Test of collectionNotEmpty method, of class Preconditions.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testCollectionNotEmpty2() {
		Preconditions.collectionNotEmpty(Arrays.asList(),"foo");
	}


	/**
	 * Test of collectionItemsNotNull method, of class Preconditions.
	 */
	@Test
	public void testCollectionItemsNotNull() {
		Preconditions.collectionItemsNotNull(Arrays.asList("value"),"foo");
	}


	/**
	 * Test of collectionItemsNotNull method, of class Preconditions.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testCollectionItemsNotNull2() {

		List list=new ArrayList();
		list.add("1");
		list.add(null);

		Preconditions.collectionItemsNotNull(list,"foo");
	}


	/**
	 * Test of collectionItemsAreValues method, of class Preconditions.
	 */
	@Test
	public void testCollectionItemsAreValues() {
		Preconditions.collectionItemsAreValues(Arrays.asList("value"),"foo");
	}


	/**
	 * Test of collectionItemsAreValues method, of class Preconditions.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testCollectionItemsAreValues2() {
		Preconditions.collectionItemsAreValues(Arrays.asList("",null),"foo");
	}


	/**
	 * Test of valueGreaterThan method, of class Preconditions.
	 */
	@Test
	public void testValueGreaterThan_3args_1() {
		Preconditions.valueGreaterThan((byte)3,(byte)2,"foo");
	}


	/**
	 * Test of valueGreaterThan method, of class Preconditions.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testValueGreaterThan_3args_12() {
		Preconditions.valueGreaterThan((byte)2,(byte)2,"foo");
	}


	/**
	 * Test of valueGreaterThan method, of class Preconditions.
	 */
	@Test
	public void testValueGreaterThan_3args_2() {
		Preconditions.valueGreaterThan((double)3,(double)2,"foo");
	}


	/**
	 * Test of valueGreaterThan method, of class Preconditions.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testValueGreaterThan_3args_22() {
		Preconditions.valueGreaterThan((double)2,(double)2,"foo");
	}


	/**
	 * Test of valueGreaterThan method, of class Preconditions.
	 */
	@Test
	public void testValueGreaterThan_3args_3() {
		Preconditions.valueGreaterThan((float)3,(float)2,"foo");
	}


	/**
	 * Test of valueGreaterThan method, of class Preconditions.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testValueGreaterThan_3args_32() {
		Preconditions.valueGreaterThan((float)2,(float)2,"foo");
	}


	/**
	 * Test of valueGreaterThan method, of class Preconditions.
	 */
	@Test
	public void testValueGreaterThan_3args_4() {
		Preconditions.valueGreaterThan((int)3,(int)2,"foo");
	}


	/**
	 * Test of valueGreaterThan method, of class Preconditions.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testValueGreaterThan_3args_42() {
		Preconditions.valueGreaterThan((int)2,(int)2,"foo");
	}


	/**
	 * Test of valueGreaterThan method, of class Preconditions.
	 */
	@Test
	public void testValueGreaterThan_3args_5() {
		Preconditions.valueGreaterThan((long)3,(long)2,"foo");
	}


	/**
	 * Test of valueGreaterThan method, of class Preconditions.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testValueGreaterThan_3args_52() {
		Preconditions.valueGreaterThan((long)2,(long)2,"foo");
	}


	/**
	 * Test of valueGreaterThan method, of class Preconditions.
	 */
	@Test
	public void testValueGreaterThan_3args_6() {
		Preconditions.valueGreaterThan((short)3,(short)2,"foo");
	}


	/**
	 * Test of valueGreaterThan method, of class Preconditions.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testValueGreaterThan_3args_62() {
		Preconditions.valueGreaterThan((short)2,(short)2,"foo");
	}


	/**
	 * Test of valueGreaterThanOrEqual method, of class Preconditions.
	 */
	@Test
	public void testValueGreaterThanOrEqual_3args_1() {
		Preconditions.valueGreaterThanOrEqual((byte)3,(byte)2,"foo");
		Preconditions.valueGreaterThanOrEqual((byte)2,(byte)2,"foo");
	}


	/**
	 * Test of valueGreaterThanOrEqual method, of class Preconditions.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testValueGreaterThanOrEqual_3args_12() {
		Preconditions.valueGreaterThanOrEqual((byte)1,(byte)2,"foo");
	}


	/**
	 * Test of valueGreaterThanOrEqual method, of class Preconditions.
	 */
	@Test
	public void testValueGreaterThanOrEqual_3args_2() {
		Preconditions.valueGreaterThanOrEqual((double)3,(double)2,"foo");
		Preconditions.valueGreaterThanOrEqual((double)2,(double)2,"foo");
	}


	/**
	 * Test of valueGreaterThanOrEqual method, of class Preconditions.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testValueGreaterThanOrEqual_3args_22() {
		Preconditions.valueGreaterThanOrEqual((double)1,(double)2,"foo");
	}


	/**
	 * Test of valueGreaterThanOrEqual method, of class Preconditions.
	 */
	@Test
	public void testValueGreaterThanOrEqual_3args_3() {
		Preconditions.valueGreaterThanOrEqual((float)3,(float)2,"foo");
		Preconditions.valueGreaterThanOrEqual((float)2,(float)2,"foo");
	}


	/**
	 * Test of valueGreaterThanOrEqual method, of class Preconditions.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testValueGreaterThanOrEqual_3args_32() {
		Preconditions.valueGreaterThanOrEqual((float)1,(float)2,"foo");
	}


	/**
	 * Test of valueGreaterThanOrEqual method, of class Preconditions.
	 */
	@Test
	public void testValueGreaterThanOrEqual_3args_4() {
		Preconditions.valueGreaterThanOrEqual((int)3,(int)2,"foo");
		Preconditions.valueGreaterThanOrEqual((int)2,(int)2,"foo");
	}


	/**
	 * Test of valueGreaterThanOrEqual method, of class Preconditions.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testValueGreaterThanOrEqual_3args_42() {
		Preconditions.valueGreaterThanOrEqual((int)1,(int)2,"foo");
	}


	/**
	 * Test of valueGreaterThanOrEqual method, of class Preconditions.
	 */
	@Test
	public void testValueGreaterThanOrEqual_3args_5() {
		Preconditions.valueGreaterThanOrEqual((long)3,(long)2,"foo");
		Preconditions.valueGreaterThanOrEqual((long)2,(long)2,"foo");
	}


	/**
	 * Test of valueGreaterThanOrEqual method, of class Preconditions.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testValueGreaterThanOrEqual_3args_52() {
		Preconditions.valueGreaterThanOrEqual((long)1,(long)2,"foo");
	}


	/**
	 * Test of valueGreaterThanOrEqual method, of class Preconditions.
	 */
	@Test
	public void testValueGreaterThanOrEqual_3args_6() {
		Preconditions.valueGreaterThanOrEqual((short)3,(short)2,"foo");
		Preconditions.valueGreaterThanOrEqual((short)2,(short)2,"foo");
	}


	/**
	 * Test of valueGreaterThanOrEqual method, of class Preconditions.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testValueGreaterThanOrEqual_3args_62() {
		Preconditions.valueGreaterThanOrEqual((short)1,(short)2,"foo");
	}


	/**
	 * Test of valueLessThan method, of class Preconditions.
	 */
	@Test
	public void testValueLessThan_3args_1() {
		Preconditions.valueLessThan((byte)1,(byte)2,"foo");
	}


	/**
	 * Test of valueLessThan method, of class Preconditions.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testValueLessThan_3args_12() {
		Preconditions.valueLessThan((byte)2,(byte)2,"foo");
	}


	/**
	 * Test of valueLessThan method, of class Preconditions.
	 */
	@Test
	public void testValueLessThan_3args_2() {
		Preconditions.valueLessThan((double)1,(double)2,"foo");
	}


	/**
	 * Test of valueLessThan method, of class Preconditions.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testValueLessThan_3args_22() {
		Preconditions.valueLessThan((double)2,(double)2,"foo");
	}


	/**
	 * Test of valueLessThan method, of class Preconditions.
	 */
	@Test
	public void testValueLessThan_3args_3() {
		Preconditions.valueLessThan((float)1,(float)2,"foo");
	}


	/**
	 * Test of valueLessThan method, of class Preconditions.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testValueLessThan_3args_32() {
		Preconditions.valueLessThan((float)2,(float)2,"foo");
	}


	/**
	 * Test of valueLessThan method, of class Preconditions.
	 */
	@Test
	public void testValueLessThan_3args_4() {
		Preconditions.valueLessThan((int)1,(int)2,"foo");
	}


	/**
	 * Test of valueLessThan method, of class Preconditions.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testValueLessThan_3args_42() {
		Preconditions.valueLessThan((int)2,(int)2,"foo");
	}


	/**
	 * Test of valueLessThan method, of class Preconditions.
	 */
	@Test
	public void testValueLessThan_3args_5() {
		Preconditions.valueLessThan((long)1,(long)2,"foo");
	}


	/**
	 * Test of valueLessThan method, of class Preconditions.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testValueLessThan_3args_52() {
		Preconditions.valueLessThan((long)2,(long)2,"foo");
	}


	/**
	 * Test of valueLessThan method, of class Preconditions.
	 */
	@Test
	public void testValueLessThan_3args_6() {
		Preconditions.valueLessThan((short)1,(short)2,"foo");
	}


	/**
	 * Test of valueLessThan method, of class Preconditions.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testValueLessThan_3args_62() {
		Preconditions.valueLessThan((short)3,(short)2,"foo");
	}


	/**
	 * Test of valueLessThanOrEqual method, of class Preconditions.
	 */
	@Test
	public void testValueLessThanOrEqual_3args_1() {
		Preconditions.valueLessThanOrEqual((byte)1,(byte)2,"foo");
		Preconditions.valueLessThanOrEqual((byte)2,(byte)2,"foo");
	}


	/**
	 * Test of valueLessThanOrEqual method, of class Preconditions.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testValueLessThanOrEqual_3args_12() {
		Preconditions.valueLessThanOrEqual((byte)3,(byte)2,"foo");
	}


	/**
	 * Test of valueLessThanOrEqual method, of class Preconditions.
	 */
	@Test
	public void testValueLessThanOrEqual_3args_2() {
		Preconditions.valueLessThanOrEqual((double)1,(double)2,"foo");
		Preconditions.valueLessThanOrEqual((double)2,(double)2,"foo");
	}


	/**
	 * Test of valueLessThanOrEqual method, of class Preconditions.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testValueLessThanOrEqual_3args_22() {
		Preconditions.valueLessThanOrEqual((double)3,(double)2,"foo");
	}


	/**
	 * Test of valueLessThanOrEqual method, of class Preconditions.
	 */
	@Test
	public void testValueLessThanOrEqual_3args_3() {
		Preconditions.valueLessThanOrEqual((float)1,(float)2,"foo");
		Preconditions.valueLessThanOrEqual((float)2,(float)2,"foo");
	}


	/**
	 * Test of valueLessThanOrEqual method, of class Preconditions.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testValueLessThanOrEqual_3args_32() {
		Preconditions.valueLessThanOrEqual((float)3,(float)2,"foo");
	}


	/**
	 * Test of valueLessThanOrEqual method, of class Preconditions.
	 */
	@Test
	public void testValueLessThanOrEqual_3args_4() {
		Preconditions.valueLessThanOrEqual((int)1,(int)2,"foo");
		Preconditions.valueLessThanOrEqual((int)2,(int)2,"foo");
	}


	/**
	 * Test of valueLessThanOrEqual method, of class Preconditions.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testValueLessThanOrEqual_3args_42() {
		Preconditions.valueLessThanOrEqual((int)3,(int)2,"foo");
	}


	/**
	 * Test of valueLessThanOrEqual method, of class Preconditions.
	 */
	@Test
	public void testValueLessThanOrEqual_3args_5() {
		Preconditions.valueLessThanOrEqual((long)1,(long)2,"foo");
		Preconditions.valueLessThanOrEqual((long)2,(long)2,"foo");
	}


	/**
	 * Test of valueLessThanOrEqual method, of class Preconditions.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testValueLessThanOrEqual_3args_52() {
		Preconditions.valueLessThanOrEqual((long)3,(long)2,"foo");
	}


	/**
	 * Test of valueLessThanOrEqual method, of class Preconditions.
	 */
	@Test
	public void testValueLessThanOrEqual_3args_6() {
		Preconditions.valueLessThanOrEqual((short)1,(short)2,"foo");
		Preconditions.valueLessThanOrEqual((short)2,(short)2,"foo");
	}


	/**
	 * Test of valueLessThanOrEqual method, of class Preconditions.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testValueLessThanOrEqual_3args_62() {
		Preconditions.valueLessThanOrEqual((short)3,(short)2,"foo");
	}

}
