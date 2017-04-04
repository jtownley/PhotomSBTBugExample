package com.livesafe.data.cassandra

import scala.concurrent.duration._
import com.outworkers.phantom.connectors.{ CassandraConnection, ContactPoint }
import com.outworkers.phantom.dsl.Database
import org.scalatest._
import org.scalatest.concurrent.ScalaFutures
import org.scalatest.time.{ Millis, Seconds, Span }

import org.slf4j.Logger
import org.slf4j.LoggerFactory

/**
  * Common trait used to define specifications related to Cassandra access.
  */
// trait RootCassandraSpec
//   extends EmbeddedCassandraDatabaseProvider
//     with Matchers
//     with BeforeAndAfterAll
//     with ScalaFutures { this: Suite =>

//   implicit override val patienceConfig = PatienceConfig(timeout = Span(5, Seconds), interval = Span(100, Millis))

//   override def beforeAll(): Unit = {
//     // We want to test against real production schema rather than the Phantom-generated schema
//     // embeddedCass.create(5.seconds)(com.outworkers.phantom.dsl.context)
//   }

//   override def afterAll(): Unit = {
//     embeddedCass.drop(5.seconds)(com.outworkers.phantom.dsl.context)
//   }
// }

// case class Fork(tines: Int)

// object EmbeddedCassandraDatabaseFactory{

//   def database(namesake: Any): Database[Fork] = {
//     val embeddedConnector: CassandraConnection = ContactPoint.embedded.noHeartbeat().keySpace("ASDF")

//     embeddedConnector.session.execute(s"use ${embeddedConnector.provider.space.name};")

//     new Database[Fork](embeddedConnector){

//     }
//   }
// }

// trait EmbeddedCassandraDatabaseProvider {
//   val embeddedCass: Database[Fork] = EmbeddedCassandraDatabaseFactory.database(this.getClass.getSimpleName)
// }


class UserDatabaseServiceTest extends FreeSpec {
  val LOG = LoggerFactory.getLogger("UserDatabaseServiceTest")


  "register a user from a model" in {
    LOG.trace(" TESTING LEVEL: trace")
    LOG.debug(" TESTING LEVEL: debug")
    LOG.info(" TESTING LEVEL: info")
    LOG.warn(" TESTING LEVEL: warn")
    LOG.error(" TESTING LEVEL: error")
    assert(1 == 4)
  }
}