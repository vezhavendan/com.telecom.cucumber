$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/resources/AddTarrif1.Feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "click add tarrif details",
  "keyword": "And "
});
formatter.match({
  "location": "AddTariffSteps.click_add_tarrif_details()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Title of your scenarios",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@vezha"
    }
  ]
});
formatter.step({
  "name": "fill all details in 1D list",
  "rows": [
    {
      "cells": [
        "12345",
        "12345",
        "45689",
        "32146",
        "123",
        "123",
        "123"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddTariffSteps.fill_all_details_in_D_list(Integer,DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click submit button",
  "keyword": "And "
});
formatter.match({
  "location": "AddTariffSteps.click_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate details entered succssfully",
  "keyword": "Then "
});
formatter.match({
  "location": "AddTariffSteps.validate_details_entered_succssfully()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "click add tarrif details",
  "keyword": "And "
});
formatter.match({
  "location": "AddTariffSteps.click_add_tarrif_details()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Again Testing",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@vendan"
    }
  ]
});
formatter.step({
  "name": "fill all details in 1D map",
  "rows": [
    {
      "cells": [
        "customer id",
        "123456789"
      ]
    },
    {
      "cells": [
        "Monthly",
        "12345"
      ]
    },
    {
      "cells": [
        "Free",
        "1234"
      ]
    },
    {
      "cells": [
        "Free1",
        "45689"
      ]
    },
    {
      "cells": [
        "Free_SMS",
        "32146"
      ]
    },
    {
      "cells": [
        "Local",
        "123"
      ]
    },
    {
      "cells": [
        "International",
        "123"
      ]
    },
    {
      "cells": [
        "SMS",
        "123"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddTariffSteps.fill_all_details_in_D_map(Integer,DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click submit buttons",
  "keyword": "And "
});
formatter.match({
  "location": "AddTariffSteps.click_submit_buttons()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate details entered succssfullys",
  "keyword": "Then "
});
formatter.match({
  "location": "AddTariffSteps.validate_details_entered_succssfullys()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "status": "passed"
});
});