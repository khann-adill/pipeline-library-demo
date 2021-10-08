#!/usr/bin/env groovy

def call(String goal = 'clean') {
  sh "mvn ${goal}"
}
