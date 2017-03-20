import org.junit.Assert
import org.junit.Test
import koans.util.toMessage

class TestPartition {
    @Test fun testGetCustomersWhoHaveMoreUndeliveredOrdersThanDelivered() {
        Assert.assertEquals("getCustomerWithMaximumNumberOfOrders".toMessage(),
                setOf(customers[reka]), shop.getCustomersWithMoreUndeliveredOrdersThanDelivered())
    }
}
