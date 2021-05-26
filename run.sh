#!/bin/sh
echo "********************************************************"
echo "Starting finance-report-service "
echo "********************************************************"
java -jar -Dspring.profiles.active=dev finance-report-service.jar
