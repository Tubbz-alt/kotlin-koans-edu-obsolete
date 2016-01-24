package lesson5.task4.tests

import lesson5.task4.*
import org.junit.Assert
import org.junit.Test

class TestHtmlBuilders {
    @Test fun productTableIsFilled() {
        val result = renderProductTable()
        Assert.assertTrue("Product table should contain the corresponding data", result.contains("cactus"))
    }

    @Test fun productTableIsColored() {
        val result = renderProductTable()
        Assert.assertTrue("Product table should be colored", result.contains("bgcolor"))
    }
}
