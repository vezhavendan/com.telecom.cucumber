$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/resources/AddCustomerSteps.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag1"
    },
    {
      "name": "@tagname"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "launch telecom website",
  "keyword": "Given "
});
formatter.match({
  "location": "AddCustomerDetails.launch_telecom_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click add customer details",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerDetails.click_add_customer_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "fill all details in repective box",
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomerDetails.fill_all_details_in_repective_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click submit",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerDetails.click_submit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "check customer id is generated",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomerDetails.check_customer_id_is_generated()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});