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

  val CtWalesPostcodeSearchJson: String =
    """
      |{
      |  "request": {
      |    "method": "GET",
      |    "urlPath": "/bridge-integration-stub/hip/voa/v1/search",
      |    "queryParameters": {
      |      "postcode": {
      |        "equalTo": "SY231NZ"
      |      },
      |      "listType": {
      |        "equalTo": "CVW"
      |      }
      |    }
      |  },
      |  "response": {
      |    "status": 200,
      |    "jsonBody": {
      |      "results": {
      |        "current_page": 1,
      |        "page_size": 1,
      |        "total_results": 102,
      |        "total_pages": 102,
      |        "has_next": true,
      |        "has_previous": false,
      |        "self": "https://example.com/ct-wales-searches?page=1&page_size=1",
      |        "next": "https://example.com/ct-wales-searches?page=2&page_size=1",
      |        "prev": null,
      |        "first": "https://example.com/ct-wales-searches?page=1&page_size=1",
      |        "last": "https://example.com/ct-wales-searches?page=102&page_size=1",
      |        "records": [
      |          {
      |            "list": {
      |              "id": "35438729-ccc6-4977-915a-65424dc56f4a",
      |              "classification": {
      |                "code": "CVW",
      |                "label": "Council tax valuation list for a billing authority in Wales (LGFA92s22B2(b)to3A)"
      |              },
      |              "collection_authority": {
      |                "ons_code": "W07000064",
      |                "ons_code_label": "Ceredigion | Ceredigion"
      |              }
      |            },
      |            "list_entry": {
      |              "relevant_property": {
      |                "id": "5d3bd996-d0df-4688-b8ad-36487dab6d27"
      |              },
      |              "addresses": {
      |                "property_full_address": "30 CAMBRIAN STREET, ABERYSTWYTH, SY23 1NZ"
      |              },
      |              "valuation": {
      |                "value": "D"
      |              }
      |            }
      |          }
      |        ]
      |      }
      |    },
      |    "headers": {
      |      "Content-Type": "application/json"
      |    }
      |  }
      |}
      |""".stripMargin
}
