#!/usr/bin/env groovy

def call(String goal = 'clean') {
  echo "mvn ${goal}"
}
