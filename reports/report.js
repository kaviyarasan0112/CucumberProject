$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/F01_Login.feature");
formatter.feature({
  "name": "Leaftaps Login Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login into the application using DataTable",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Enter the credentials to login to the application",
  "rows": [
    {
      "cells": [
        "Demosalesmanager",
        "",
        "crmsfa"
      ]
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "LoginUsingDataTable.enter_the_credentials_to_login_to_the_application(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the login button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginUsingDataTable.click_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
});