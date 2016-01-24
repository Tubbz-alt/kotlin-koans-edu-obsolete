package lesson3.task10.tests

import lesson3.task10.*
import org.junit.Assert
import org.junit.Test

class TestFold {
    @Test fun testGetProductsOrderedByAllCustomers() {
        val testShop = shop("test shop for 'fold'",
                customer(lucas, Canberra,
                        order(idea),
                        order(webStorm)
                ),
                customer(reka, Budapest,
                        order(idea),
                        order(youTrack)
                )
        )
        Assert.assertEquals(setOf(idea), testShop.getSetOfProductsOrderedByEveryCustomer())
    }
}
