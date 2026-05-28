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

package uk.gov.hmrc.perftests.utils

object Payloads {

  val registerRatepayerJson: String =
    """
      |{
      |  "userType": "INDIVIDUAL",
      |  "agentStatus": "AUTONOMOUS",
      |  "name": "Michael J Doe",
      |  "tradingName": { "value": "MJConsulting" },
      |  "email": "michalj@example.com",
      |  "nino": { "value": "AB123456C" },
      |  "contactNumber": "07123456789",
      |  "secondaryNumber": "07000000000",
      |  "address": "10 Test Street, Test Town, Test County, TE57 1NG",
      |  "trnReferenceNumber": {
      |    "referenceType": "TRN",
      |    "value": "1234567890"
      |  },
      |  "isRegistered": false,
      |  "recoveryId": "rec-12345"
      |}
      |""".stripMargin

  val linkPropertyJobJson: String =
    """
      |{
      |  "id": null,
      |  "idx": "IDX-1",
      |  "name": "Relationship Name",
      |  "label": "Label",
      |  "description": "Description",
      |  "origination": null,
      |  "termination": null,
      |  "category": {
      |    "code": "CAT",
      |    "meaning": "Category Meaning"
      |  },
      |  "type": {
      |    "code": "TYPE",
      |    "meaning": "Type Meaning"
      |  },
      |  "class": {
      |    "code": "CLASS",
      |    "meaning": "Class Meaning"
      |  },
      |  "data": {
      |    "foreign_ids": [],
      |    "foreign_names": [],
      |    "foreign_labels": [],
      |    "manifestations": []
      |  },
      |  "protodata": [],
      |  "metadata": {
      |    "source": "perf-test",
      |    "timestamp": "2024-01-01T00:00:00Z"
      |  },
      |  "compartments": {},
      |  "items": []
      |}
      |""".stripMargin

  val propertyAssessmentJson: String =
    """
      |{
      |  "properties": [
      |    {
      |      "label": "Perf Test Property",
      |      "description": "Performance Test Submission",
      |      "data": {
      |        "foreign_ids": [],
      |        "foreign_names": [],
      |        "foreign_labels": [],
      |        "addresses": {
      |          "property_full_address": "13, NEW GEORGE STREET, PLYMOUTH, PL1 1RL",
      |          "address_line_1": "13",
      |          "address_postcode": "PL1 1RL",
      |          "known_as": "Perf Test"
      |        },
      |        "location": null,
      |        "assessments": null
      |      }
      |    }
      |  ]
      |}
      |""".stripMargin



}
