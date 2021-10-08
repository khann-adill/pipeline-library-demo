#!/usr/bin/env groovy

def call(String goal = 'clean') {
  mvn "${goal}"
}
