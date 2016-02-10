import org.junit.Assert
import org.junit.Test
import koans.util.errorMessage

class TestSum {
    @Test fun testGetTotalOrderPrice() {
        Assert.assertTrue(errorMessage("getTotalOrderPrice"), 148.0 == customers[nathan]!!.getTotalOrderPrice(), 0.1)
    }
}
