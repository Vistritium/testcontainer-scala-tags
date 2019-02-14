package testcontainer.scala.tags

import com.dimafeng.testcontainers.{Container, ForAllTestContainer, PostgreSQLContainer}
import org.scalatest.FunSuite


@IgnoreTag
class TheTest extends FunSuite with ForAllTestContainer {
  override val container: Container = PostgreSQLContainer("mdillon/postgis")

  test("will be ignored") {
    assert(false)
  }
}
