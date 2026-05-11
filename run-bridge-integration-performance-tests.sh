#!/usr/bin/env bash

isLocal=true
if [ $# -eq 1  ];
then
  isLocal=$1
fi

isSmokeTest=true
if [ $# -eq 2  ];
then
  isSmokeTest=$2
fi

echo "*** Running locally: $isLocal. Smoke-test mode: $isSmokeTest ***"

INTERNAL_AUTH_TOKEN=valid-auth-token \
sbt -Dperftest.runSmokeTest=true -DrunLocal=true -Dperftest.labels=dashboard clean gatling:test
