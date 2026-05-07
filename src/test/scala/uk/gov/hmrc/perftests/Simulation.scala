/*
 * Copyright 2026 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import uk.gov.hmrc.performance.simulation.PerformanceTestRunner
import uk.gov.hmrc.perftests.requests.AuthLoginApiConnector.getBearerToken
import uk.gov.hmrc.perftests.utils.BaseUrls.bridgeIntegrationBaseUrl

import java.util.UUID
import scala.concurrent.Await
import scala.concurrent.duration._

class Simulation extends PerformanceTestRunner {

  val baseUrl: String = bridgeIntegrationBaseUrl

  lazy val authToken: String = {
    Await.result(
      getBearerToken(
        UUID.randomUUID().toString,
        UUID.randomUUID().toString
      ),
      10.seconds
    )
  }

  def requestHeaders: Map[String, String] = {
    Map(
    "Accept"        -> "application/vnd.hmrc.1.0+json",
    "Content-Type"  -> "application/json",
    "Authorization" -> s"$authToken"
  )}

  setup("dashboard", "Dashboard call") withRequests
    http("Dashboard")
      .get(s"$baseUrl/bridge-integration/dashboard/123456789567")
      .headers(requestHeaders)
      .check(status.is(200))


  runSimulation()
}