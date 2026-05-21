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
import uk.gov.hmrc.perftests.utils.Payloads._
import uk.gov.hmrc.performance.simulation.PerformanceTestRunner
import uk.gov.hmrc.perftests.requests.AuthLoginApiConnector.{createBearerToken}
import uk.gov.hmrc.perftests.utils.BaseUrls.bridgeIntegrationBaseUrl

import java.util.UUID
import scala.concurrent.Await
import scala.concurrent.duration._

class Simulation extends PerformanceTestRunner {

  val baseUrl: String = bridgeIntegrationBaseUrl

  val bearerToken = createBearerToken("123456789567")

  def requestHeaders: Map[String, String] =
    Map(
      "Accept"        -> "application/vnd.hmrc.1.0+json",
      "Content-Type"  -> "application/json",
      "Authorization" -> s"Bearer $bearerToken"
    )

  setup("dashboard", "Dashboard call") withRequests
    http("Dashboard")
      .get(s"$baseUrl/bridge-integration/dashboard/123456789567")
      .headers(requestHeaders)
      .check(status.is(200))

  setup("getRatepayerProperties", "Explore Ratepayer Properties call") withRequests
    http("GetRatepayerProperties")
      .get(s"$baseUrl/bridge-integration/ratepayer-properties/123456789567")
      .headers(requestHeaders)
      .check(status.is(200))

  setup("exploreRatepayer", "Explore Ratepayer call") withRequests
    http("ExploreRatepayer")
      .get(s"$baseUrl/bridge-integration/explore-ratepayer/123456789567")
      .headers(requestHeaders)
      .check(status.is(200))

  setup("registerRatepayer", "Register Ratepayer call") withRequests
    http("RegisterRatepayer")
      .post(s"$baseUrl/bridge-integration/register-ratepayer/123456789567")
      .headers(requestHeaders)
      .body(StringBody(registerRatepayerJson))
      .check(status.in(200, 400, 404, 502, 500))

  setup("linkPropertyJob", "Property Linking Relationship Change call") withRequests
    http("LinkPropertyJob")
      .post(s"$baseUrl/bridge-integration/property-linking/123456789567/relationship-change/999999")
      .headers(requestHeaders)
      .body(StringBody(linkPropertyJobJson))
      .check(status.in(200, 400, 404, 502, 500))

  setup("ratePayerProperties", "Ratepayer Properties call") withRequests
    http("RatePayerProperties")
      .get(s"$baseUrl/bridge-integration/ratepayer-properties/123456789567")
      .headers(requestHeaders)
      .check(status.is(200))

  runSimulation()
}
