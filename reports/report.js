$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/F04_DeleteLead.feature");
formatter.feature({
  "name": "Edit Lead Functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@functional"
    }
  ]
});
formatter.scenarioOutline({
  "name": "To check the functionality of Edit Lead page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Enter the username as demosalesmanager",
  "keyword": "Given "
});
formatter.step({
  "name": "Enter the password as crmsfa",
  "keyword": "And "
});
formatter.step({
  "name": "Click on the login button",
  "keyword": "When "
});
formatter.step({
  "name": "Homepage should be displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "click on crmsfa link",
  "keyword": "When "
});
formatter.step({
  "name": "MyHome page should be displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "click on the leads link",
  "keyword": "When "
});
formatter.step({
  "name": "My Leads should be displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "click on the link find leads",
  "keyword": "When "
});
formatter.step({
  "name": "Find Lead page should be displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "Click on the link phone",
  "keyword": "When "
});
formatter.step({
  "name": "Enter the phone number as \u003cPhoneNum\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "click on the button FindLeads",
  "keyword": "When "
});
formatter.step({
  "name": "click on the first lead link from the displayed",
  "keyword": "When "
});
formatter.step({
  "name": "View Lead Page should be displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "Click on the button delete",
  "keyword": "When "
});
formatter.step({
  "name": "My Leads should be displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "click on the link find leads",
  "keyword": "When "
});
formatter.step({
  "name": "Find Lead page should be displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "Give the LeadID as \u003cLeadID\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "click on the button FindLeads",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "PhoneNum",
        "LeadID"
      ]
    },
    {
      "cells": [
        "9",
        "14257"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To check the functionality of Edit Lead page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@functional"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Enter the username as demosalesmanager",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.enterTheUsernameAsDemosalesmanager(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "Login.enterThePasswordAsCrmsfa(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the login button",
  "keyword": "When "
});
formatter.match({
  "location": "Login.clickOnTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Homepage should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.homepageShouldBeDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on crmsfa link",
  "keyword": "When "
});
formatter.match({
  "location": "TCCreateLead.clickCrmsfaLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "MyHome page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "TCCreateLead.verifyMyHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the leads link",
  "keyword": "When "
});
formatter.match({
  "location": "TCCreateLead.clickOnTheLeadsLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "My Leads should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "TCCreateLead.myLeadsShouldBeDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the link find leads",
  "keyword": "When "
});
formatter.match({
  "location": "EditLead.clickOnTheLinkFindLeads()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Find Lead page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "EditLead.findLeadPageShouldBeDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the link phone",
  "keyword": "When "
});
formatter.match({
  "location": "EditLead.clickOnTheLinkPhone()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the phone number as 9",
  "keyword": "Given "
});
formatter.match({
  "location": "EditLead.enterThePhoneNumberAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the button FindLeads",
  "keyword": "When "
});
formatter.match({
  "location": "EditLead.clickOnTheButtonFindLeads()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the first lead link from the displayed",
  "keyword": "When "
});
formatter.match({
  "location": "EditLead.clickOnTheFirstLeadLinkFromTheDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "View Lead Page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "TCCreateLead.viewLeadPageDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the button delete",
  "keyword": "When "
});
formatter.match({
  "location": "DeleteLead.clickOnTheButtonDelete()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "My Leads should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "TCCreateLead.myLeadsShouldBeDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the link find leads",
  "keyword": "When "
});
formatter.match({
  "location": "EditLead.clickOnTheLinkFindLeads()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Find Lead page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "EditLead.findLeadPageShouldBeDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Give the LeadID as 14257",
  "keyword": "When "
});
formatter.match({
  "location": "DeleteLead.giveTheLeadID(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the button FindLeads",
  "keyword": "And "
});
formatter.match({
  "location": "EditLead.clickOnTheButtonFindLeads()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});